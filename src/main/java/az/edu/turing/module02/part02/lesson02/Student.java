package az.edu.turing.module02.part02.lesson02;

import java.util.Objects;

public class Student<A> {
    private A student_data1;
    private A student_data2;
    private A student_data3;


    public Student(A student_data1, A student_data2, A student_data3) {
        this.student_data1 = student_data1;
        this.student_data2 = student_data2;
        this.student_data3 = student_data3;
    }

    public A getStudent_data1() {
        return student_data1;
    }

    public void setStudent_data1(A student_data1) {
        this.student_data1 = student_data1;
    }

    public A getStudent_data2() {
        return student_data2;
    }

    public void setStudent_data2(A student_data2) {
        this.student_data2 = student_data2;
    }

    public A getStudent_data3() {
        return student_data3;
    }

    public void setStudent_data3(A student_data3) {
        this.student_data3 = student_data3;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                " " + student_data1 +
                " " + student_data2 +
                " " + student_data3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student<?> student = (Student<?>) o;
        return Objects.equals(student_data1, student.student_data1) && Objects.equals(student_data2, student.student_data2) && Objects.equals(student_data3, student.student_data3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_data1, student_data2, student_data3);
    }
}
