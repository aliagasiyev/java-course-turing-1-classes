package az.edu.turing.module02.part02.MiniProject.entity.human;
import az.edu.turing.module02.part02.MiniProject.entity.DayOfWeek;
import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.pet.Pet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;


public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Family family;
    private Map<DayOfWeek, String> schedule = new HashMap<>();

    public Human() {
    }

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, long birthDate, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.schedule = schedule;
    }

    public Human(String name, String surname, long birthDate, int iq, Map<DayOfWeek, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public void greetPet() {
        System.out.printf("Hello, %s", family.getPet().toString());
    }

    public void describePet() {
        if (family == null || family.getPet() == null) System.out.println("There is no any pets.");
        else {
            for (Pet pets : family.getPet()) {
                System.out.printf("I have a %s, he is %d years old, he is %s.\n",
                        pets.getSpecies(), pets.getAge(), pets.getTrickLevel() > 50 ? "very sly" : "almost not sly");
            }
        }
    }

    public String describeAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(LocalDate.ofEpochDay(birthDate), currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        return "Age: " + years + " years, " + months + " months, " + days + " days";

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return getBirthDate() == human.getBirthDate() &&
                getIq() == human.getIq() &&
                Objects.equals(getName(), human.getName()) &&
                Objects.equals(getSurname(), human.getSurname()) &&
                Objects.equals(getFamily(), human.getFamily()) &&
                Objects.equals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getBirthDate(), getIq(), getFamily(), getSchedule());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + birthDate +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';

    }
}