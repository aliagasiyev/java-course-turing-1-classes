package az.edu.turing.module02.part02.MiniProject;

import java.util.Set;

public class Fish extends Pet implements Foul {
    Fish() {
        super();
    }

    Fish(String nickname) {
        super(nickname);
        species = Species.FISH;
    }

    Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        species = Species.FISH;
    }

    @Override
    public void respond() {
        System.out.printf("Fish meake wuwuwu", getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Foul method in Fish class");
    }
}
