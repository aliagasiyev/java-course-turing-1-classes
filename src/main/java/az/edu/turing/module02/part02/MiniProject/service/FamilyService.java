package az.edu.turing.module02.part02.MiniProject.service;

import az.edu.turing.module02.part02.MiniProject.DaoPackage.CollectionFamilyDao;
import az.edu.turing.module02.part02.MiniProject.DaoPackage.FamilyDao;
import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.human.Human;
import az.edu.turing.module02.part02.MiniProject.entity.human.Man;
import az.edu.turing.module02.part02.MiniProject.entity.human.Woman;
import az.edu.turing.module02.part02.MiniProject.entity.pet.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyService familyService;
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
    }

    public FamilyService() {

    }

    public List<Family> getAllfamilies() {
        return (ArrayList<Family>) familyDao.getAllFamilies();
    }
    public void displayAllFamilies() {
        getAllfamilies().stream()
                .map(family -> "Familyt: " + family.toString())
                .forEach(System.out::println);
    }
    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        List<Family> families = getAllfamilies();
        return families.stream().filter(family ->
                        family.countFamily() > numberOfPeople).
                collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int numspeople) {
        List<Family> families = getAllfamilies();
        return families.stream().filter(family ->
                        family.countFamily() < numspeople).
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

    public void deleteAllChildrenOlderThan(int age) {
        getAllfamilies().forEach(family ->
                family.getChildren().removeIf(child -> LocalDate.now().getYear() - child.getBirthDate() > age));}
    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index) {
        return familyDao.getFamilyByIndex(index).getPet();
    }

    public void addPet(int familyindex, Pet pet) {
        familyDao.getFamilyByIndex(familyindex).getPet().add(pet);
    }
}