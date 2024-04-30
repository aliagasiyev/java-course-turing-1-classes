package az.edu.turing.module02.part02.MiniProject.DaoPackage;

import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.human.Man;
import az.edu.turing.module02.part02.MiniProject.entity.human.Woman;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    void saveFamily(Family family);

    void createNewFamily(Woman woman, Man man);
}

