package az.edu.turing.module01.Projects;

import java.util.Random;
import java.util.Scanner;

public class NumbersTask {
    public static void main(String[] args) {
        System.out.println("Let the game begin!.");
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Let the game begin!.");
            int randomNumber = rand.nextInt(101);

            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello "+name+ "Your number is " + randomNumber);

            System.out.println("Please enter your number: ");
            int user_number= scanner.nextInt();
        }

    }
}