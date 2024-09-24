package az.edu.turing.module01.Projects.project1;

import java.util.Random;
import java.util.Scanner;

public class NumbersGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int randomNumber = random.nextInt(101);
        int[] guesses = new int[100];
        int attempts = 0;

        while (true) {
            System.out.print("Enter a number between 0 and 100: ");

            int guess;
            while (true) {
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    break;
                } else {
                    System.out.print("Invalid input. Please enter a number: ");
                    scanner.next();
                }
            }

            guesses[attempts] = guess;
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.print("Your numbers: ");

        sortArrayDesc(guesses, attempts);

        for (int i = 0; i < attempts; i++) {
            System.out.print(guesses[i] + " ");
        }
    }

    public static void sortArrayDesc(int[] array, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
