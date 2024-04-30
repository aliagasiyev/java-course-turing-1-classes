package az.edu.turing.module02.part02.MiniProject.entity.human;
import az.edu.turing.module02.part02.MiniProject.entity.DayOfWeek;
import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.human.Human;

import java.util.Map;

public class Woman extends Human {
        Woman() {
            super();
        }

        public Woman(String name, String surname, int year) {
            super(name, surname, year);
        }

        public Woman(String name, String surname, int year, Map<DayOfWeek, String> schedule) {
            super(name, surname, year, schedule);
        }

        Woman(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule) {
            super(name, surname, year, iq, schedule, family);
        }

    public Woman(String womanName, String surname) {
    }

    public void makeUp() {
            System.out.println("Woman likes makeUp");
        }

        @Override
        public void greetPet() {
            System.out.printf("Hello, %s\n", getFamily().getPet().toString());
        }

}
