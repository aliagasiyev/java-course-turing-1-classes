package az.edu.turing.module02.part02.lesson06;

import java.io.*;

public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void writeToFile(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
            System.out.println("StudentDto data writtening.");
        } catch (IOException e) {
            System.out.println("IO exception is here");
        }
    }
    public static Student readFromFile(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            Student student = (Student) inputStream.readObject();
            System.out.println("StudentDto data reading.");
            return student;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Class not found exception");
            return null;
        }
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}