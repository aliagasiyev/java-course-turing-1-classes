package az.edu.turing.module02.part02.lesson02;

import java.util.Arrays;
import java.util.Comparator;

public class SortApp {
    public static void main(String[] args) {
        //String[] names={"Vaqif","Sadiq","Ali","Tofiq","Asif"};
        Person person1 = new Person(23, "Ali",198);
        Person person2 = new Person(21, "Vaqif",198);
        Person person3 = new Person(22, "Asif",189);

        Person[] people = {person1, person2, person3};

        //Arrays.sort(people,personComparatorByIq);
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getAge()-person2.getAge();
            }
        });

        System.out.println(Arrays.toString(people));

//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person person1, Person person2) {
//                return person1.getIq()-person2.getIq();
//            }
//        });
//        System.out.println(Arrays.toString(people));

        Comparator<Person> c=(p1,p2)->p1.getAge()-p2.getAge();

        Arrays.sort(people,c);


    }


}
