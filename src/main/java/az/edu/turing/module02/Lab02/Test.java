package az.edu.turing.module02.Lab02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    Scanner scanner = null;

    public String inputString() {
        try {
            scanner = new Scanner(new File("input.txt"));
            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found here");
            scanner = new Scanner(System.in);
            return scanner.nextLine();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public int computeSequence(String input) {
        try {
            if (!input.matches("[0-9]+")) {
                throw new IllegalArgumentException("Input contains numbers");
            }
            if (input.length() < 2) {
                throw new IllegalArgumentException("Input length less than 2");
            }
            int sum = 0;
            for (int i = 0; i < input.length() - 1; i++) {
                sum += Character.getNumericValue(input.charAt(i));
            }
            int lastnumber = Character.getNumericValue(input.charAt(input.length() - 1));
            return sum / lastnumber;
        } catch (IllegalArgumentException | ArithmeticException e) {
            return -1;
        }


    }


}