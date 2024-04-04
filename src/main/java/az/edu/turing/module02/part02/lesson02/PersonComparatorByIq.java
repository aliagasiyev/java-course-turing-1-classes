package az.edu.turing.module02.part02.lesson02;

import java.util.Comparator;

public class PersonComparatorByIq implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getIq() - person2.getIq() == 0 ?
                person1.getAge() - person2.getAge() :
                person1.getIq() - person2.getIq();
    }
}
