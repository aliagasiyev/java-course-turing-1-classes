package az.edu.turing.module02.part02.MiniProject;

import java.util.Set;

public class Dog extends Pet {
    Dog() {
        super();
    }

    Dog(String nickname) {
        super(nickname);
        species = Species.DOG;
    }

    Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        species = Species.DOG;
    }

    @Override
    public void respond() {
        System.out.printf("Dog is barking", getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Foul method in Dog class");
    }
}
