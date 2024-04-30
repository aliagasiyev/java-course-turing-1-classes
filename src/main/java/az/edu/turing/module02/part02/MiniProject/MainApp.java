package az.edu.turing.module02.part02.MiniProject;

import az.edu.turing.module02.part02.MiniProject.DaoPackage.CollectionFamilyDao;
import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.human.Man;
import az.edu.turing.module02.part02.MiniProject.entity.human.Woman;
import az.edu.turing.module02.part02.MiniProject.entity.pet.RoboCat;
import az.edu.turing.module02.part02.MiniProject.service.FamilyService;

import java.util.Scanner;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);

    private static final CollectionFamilyDao familyDao = new CollectionFamilyDao();
     private static final FamilyService familyService = new FamilyService(familyDao);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isrunning = true;
        while (isrunning) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        Man manSmith = new Man("James", "Smith", 1971);
                        manSmith.setIq(88);
                        Woman womanSmith = new Woman("Mia", "Smith", 1973);
                        womanSmith.setIq(80);
                        Family family = new Family(manSmith, womanSmith);

                        Man manRelish = new Man("Henry", "Relish", 1970);
                        manRelish.setIq(89);
                        Woman womanRelish = new Woman("Olive", "Relish", 1977);
                        womanRelish.setIq(77);
                        Family family1 = new Family(manRelish, womanRelish);

                    } catch (FamilyOverflowException e) {
                        throw new FamilyOverflowException(e.getMessage());

                    }

            }


        }
    }

    private static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Fill with test data");
        System.out.println("2. Display entire list of families");
        System.out.println("3. Display families with more members than specified");
        System.out.println("4. Display families with fewer members than specified");
        System.out.println("5. Calculate number of families with specified number of members");
        System.out.println("6. Create a new family");
        System.out.println("7. Delete a family by index");
        System.out.println("8. Edit a family");
        System.out.println("9. Remove all children over the age of majority");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }


}
