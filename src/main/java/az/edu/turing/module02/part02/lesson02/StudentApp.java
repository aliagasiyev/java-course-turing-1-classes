package az.edu.turing.module02.part02.lesson02;

public class StudentApp {
    public static void main(String[] args) {
        Student<String> names_student=new Student<>("Samir","Vuqar","Arif");
        Student<Integer> ages_student=new Student<>(19,18,19);
        System.out.println(names_student);
        System.out.println(ages_student);
    }
}
