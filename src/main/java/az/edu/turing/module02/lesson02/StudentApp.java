package az.edu.turing.module02.lesson02;

public class StudentApp {
    public static void main(String[] args) {
        Student student=new Student("Ali",19);
        System.out.println(student.name);

        System.out.println(student.grade);
        System.out.println(student.age);
        System.out.println(student);
        System.out.println(Student.studentCount); //1

        Student.studentCount = 14; //14

        Student student2=new Student("Vaqif",19);
        System.out.println(student2.name);
        System.out.println(student2.grade);
        System.out.println(student2.age);
        System.out.println(student2);
        System.out.println(Student.studentCount); //2

        System.out.println(Student.studentCount); //2
    }
}
