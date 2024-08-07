package az.edu.turing.module02.part02.MiniProject.entity.pet;

import az.edu.turing.module02.part02.MiniProject.service.Foul;

import java.util.Set;

public class RoboCat extends Pet implements Foul {
    RoboCat() {
        super();
    }

    RoboCat(String nickname) {
        super(nickname);
        species = Species.ROBOCAT;

    }

    RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        species = Species.ROBOCAT;
    }

    @Override
    public void respond() {
        System.out.println("RoboCat sound :)");
    }

    @Override
    public void foul() {
        System.out.println("Foult method in RoboCat class");
    }
}

