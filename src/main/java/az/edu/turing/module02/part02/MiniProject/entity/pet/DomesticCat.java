package az.edu.turing.module02.part02.MiniProject.entity.pet;

import az.edu.turing.module02.part02.MiniProject.service.Foul;

import java.util.Set;

public class DomesticCat extends Pet implements Foul {
    DomesticCat() {
        super();
    }

    DomesticCat(String nickname) {
        super(nickname);
        species = Species.DOMESTICCAT;
    }

    DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        species = Species.DOMESTICCAT;
    }

    @Override
    public void respond() {
        System.out.printf("Cat make soung myuuuu", getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Foul method in Domestic Cat class");
    }
}
