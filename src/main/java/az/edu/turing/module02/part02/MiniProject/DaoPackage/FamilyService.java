package az.edu.turing.module02.part02.MiniProject.DaoPackage;

import az.edu.turing.module02.part02.MiniProject.*;

import java.nio.channels.ShutdownChannelGroupException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyService familyService;
    private FamilyDao familyDao;


    public ArrayList<Family> getAllfamilies() {
        return (ArrayList<Family>) familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        List<Family> families = getAllfamilies();
        return families.stream().filter(family ->
                        family.countFamily() > numberOfPeople).
                collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        List<Family> families = getAllfamilies();
        return families.stream().filter(family ->
                        family.countFamily() < numberOfPeople).
                collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        int count;
        List<Family> families = getAllfamilies();
        count = (int) families.stream().filter(family ->
                family.countFamily() == numberOfPeople).count();
        return count;
    }

    public void creatNewFamily(Human father, Human mother) {
        Family newFamily = new Family(father, mother);
        familyDao.saveFamily(newFamily);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String manName, String womanName) {
        if (manName != null) {
            Human son = new Man(manName, family.getFather().getSurname());
            family.addChild(son);
        } else if (womanName != null) {
            Human daughter = new Woman(womanName, family.getFather().getSurname());
            family.addChild(daughter);
        } else {
            return null;
        }
        return family;
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        familyDao.saveFamily(family);
        return family;
    }
//    public Family deleteAllChildrenOlderThen(int age) {
//        List<Family> families = (List<Family>) familyDao.getAllFamilies();
//
//    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index) {
        return familyDao.getFamilyByIndex(index).getPet();
    }
    public void addPet(int familyindex,Pet pet){
        familyDao.getFamilyByIndex(familyindex).getPet().add(pet);
    }
}