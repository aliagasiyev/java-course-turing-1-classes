package az.edu.turing.module02.part02.MiniProject.controller;

import az.edu.turing.module02.part02.MiniProject.service.FamilyService;
import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.human.Human;
import az.edu.turing.module02.part02.MiniProject.entity.pet.Pet;

import java.util.List;
import java.util.Set;

public class FamilyController {
    private FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllfamilies();

    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        return familyService.getFamiliesBiggerThan(numberOfPeople);
    }

    public List<Family> getFamiliesLessThan (int numberOfPeople){
        return familyService.getFamiliesLessThan(numberOfPeople);
    }
    public int countFamiliesWithMemberNumber(int numberOfPeople){
        return familyService.countFamiliesWithMemberNumber(numberOfPeople);
    }
    public void creatNewFamily(Human father,Human mother){
        familyService.creatNewFamily(father,mother);
    }
    public boolean deleteFamilyByIndex(int index){
        return familyService.deleteFamilyByIndex(index);
    }
    public Family bornChild(Family family,String manName,String womanName){
       return familyService.bornChild(family,manName,womanName);
    }
    public Family adoptChild(Family family,Human child){
        return familyService.adoptChild(family,child);
    }
    public void deleteAllChildrenOlderThan(int age){
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count(){
        return familyService.count();
    }
    public Family getFamilyById(int index){
        return familyService.getFamilyById(index);
    }
    public Set<Pet> getPets(int index){
        return familyService.getPets(index);
    }
    public void addPet(int familyindex,Pet pet){
        familyService.addPet(familyindex,pet);
    }
}
