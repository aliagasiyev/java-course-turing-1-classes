package az.edu.turing.module02.part02.lesson02;

import java.util.Arrays;
import java.util.Comparator;

public class SortApp {
    public static void main(String[] args) {
        Person person1 = new Person(23, "Ali",198);
        Person person2 = new Person(21, "Vaqif",198);
        Person person3 = new Person(22, "Asif",189);

        Person[] people = {person1, person2, person3};

        System.out.println(Arrays.toString(people));
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getAge()-person2.getAge();
            }
        });
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });


        Arrays.sort(people,(people1,people2)->people1.getAge()-people2.getAge());
        System.out.println(Arrays.toString(people));


    }


}
