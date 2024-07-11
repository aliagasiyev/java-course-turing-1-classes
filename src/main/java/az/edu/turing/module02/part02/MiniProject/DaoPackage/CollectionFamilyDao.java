package az.edu.turing.module02.part02.MiniProject.DaoPackage;

import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.human.Man;
import az.edu.turing.module02.part02.MiniProject.entity.human.Woman;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> families;

    public CollectionFamilyDao() {
        this.families=new ArrayList<>();
    }

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index >= 0 && index < families.size()){ ;
            return families.get(index);
        }
        return null;
    }
    @Override
    public boolean deleteFamily(int index) {
        if (index>=0&& index <families.size()){
            families.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
         families.add(family);

    }

    @Override
    public void createNewFamily(Woman woman, Man man) {

    }

}
