package az.edu.turing.module02.part02.lesson06;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John Doe", 85.5);
        student1.writeToFile("student.txt");

        Student student2 = Student.readFromFile("student.txt");
        if (student2 != null) {
            System.out.println(student2);
        }
    }
}