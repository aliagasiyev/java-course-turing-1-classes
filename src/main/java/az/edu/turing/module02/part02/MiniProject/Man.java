package az.edu.turing.module02.part02.MiniProject;
import java.util.Map;


public class Man extends Human{
    Man() {
        super();
    }

    Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    Man(String name, String surname, int year, int iq, Family family, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule, family);
    }

    public Man(String name, String surname, int year, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, schedule);
    }

    public void repairCar() {
        System.out.println("Men was washing car");
    }

    @Override
    public void greetPet() {
        System.out.printf("Hello, %s\n", getFamily().getPet().toString());
    }
}
