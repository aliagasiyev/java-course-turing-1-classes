package az.edu.turing.module02.part02.MiniProject;

import az.edu.turing.module02.part02.MiniProject.DaoPackage.CollectionFamilyDao;
import az.edu.turing.module02.part02.MiniProject.DaoPackage.FamilyDao;
import az.edu.turing.module02.part02.MiniProject.controller.FamilyController;
import az.edu.turing.module02.part02.MiniProject.entity.Family;
import az.edu.turing.module02.part02.MiniProject.entity.human.Human;
import az.edu.turing.module02.part02.MiniProject.entity.human.Man;
import az.edu.turing.module02.part02.MiniProject.entity.human.Woman;
import az.edu.turing.module02.part02.MiniProject.service.FamilyService;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        FamilyDao familyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(familyDao);
        FamilyController familyController = new FamilyController(familyService);

        boolean isrunning=true;
        while (true) {
            printMenu();
            String command = new Scanner(System.in).nextLine().trim();

            try {
                switch (command) {
                    case "1":
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
                        }catch (FamilyOverflowException e){
                            throw new FamilyOverflowException(e.getMessage());
                        }

                        break;
                    case "2":
                        familyController.displayAllFamilies();
                        break;
                    case "3":
                        System.out.println(familyController.getFamiliesBiggerThan(3));
                        ;
                        break;
                    case "4":
                        System.out.println(familyController.getFamiliesLessThan(4));
                        ;
                        break;
                    case "5":
                        System.out.println(familyController.countFamiliesWithMemberNumber(3));
                        ;
                        break;
                    case "6":
                        familyController.creatNewFamily(new Woman("Mia", "Wiliam", 2000), new Man("Tom", "William", 1970));
                        break;
                    case "7":
                        System.out.print("Enter the index of the family to delete: ");
                        int indexToDelete = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                        System.out.println(familyDao.deleteFamily(indexToDelete));
                        break;

                    case "8.1":
                        System.out.println(familyController.bornChild(familyDao.getFamilyByIndex(0), "Oskar", "man"));
                        break;
                    case "8.2":
                        System.out.println(familyController.adoptChild(familyDao.getFamilyByIndex(0), new Human("Aynur", "Eliyeva", 2002)));
                        break;
                    case "9":
                        familyController.deleteAllChildrenOlderThan(18);
                        break;
                    case "exit":
                        System.out.println("Exiting Family Management System. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                break;
            }
        }

        familyDao.createNewFamily(new Woman("Unknown", "Unknown", 123), new Man("sdfsd", "adfsdfs", 1232));
        System.out.println(familyDao.getFamilyByIndex(0).prettyFormat());

    }
    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Fill with test data");
        System.out.println("2. Display the entire list of families");
        System.out.println("3. Display families with more members than specified");
        System.out.println("4. Display families with fewer members than specified");
        System.out.println("5. Calculate number of families by member count");
        System.out.println("6. Create a new family");
        System.out.println("7. Delete a family");
        System.out.println("8.1 Give a birth to family");
        System.out.println("8.2 Adopt a child to family");
        System.out.println("9. Remove all children over a certain age");
        System.out.println("Type 'exit' to quit");
        System.out.print("Enter your choice: ");
    }
    }
