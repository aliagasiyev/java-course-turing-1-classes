package az.edu.turing.module02.part02.MiniProject.DaoPackage;

import az.edu.turing.module02.part02.MiniProject.entity.Family;

import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> families;
    @Override
    public List<Family> getAllFamilies() {
        return null;
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

}
