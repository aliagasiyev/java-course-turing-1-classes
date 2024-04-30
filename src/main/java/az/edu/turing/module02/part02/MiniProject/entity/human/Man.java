package az.edu.turing.module02.part02.MiniProject.entity.human;
import az.edu.turing.module02.part02.MiniProject.entity.DayOfWeek;
import az.edu.turing.module02.part02.MiniProject.entity.Family;

import java.util.Map;


public final class Man extends Human {
    Man() {
        super();
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    Man(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule, family);
    }

    public Man(String name, String surname, int year, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, schedule);
    }

    public Man(String manName, String surname) {
    }

    public void repairCar() {
        System.out.println("Men was washing car");
    }

    @Override
    public void greetPet() {
        System.out.printf("Hello, %s\n", getFamily().getPet().toString());
    }
}
