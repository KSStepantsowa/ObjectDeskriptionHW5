package menu;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BookMenu { static final String MENU_CONTENT = "1. Add book\n2. Terminate and Save changes.";
    public static int printMenu() {
        System.out.println(MENU_CONTENT);

        try {
            Scanner scanner = new Scanner(System.in);
            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1:
                    printAddBookMenu();
                    break;
                case 2:
                    printFinishAndSaveBookMenu();
                    break;
                default:
                    System.out.println("Sorry, unknown menu option");
            }

            return userSelection;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please, type a number");
        }

        return 0;
    }
    private static void printAddBookMenu() {
        System.out.println("Add your fav book. Here is a sample ");
    }
    private static void printFinishAndSaveBookMenu() {
        System.out.println("Program is finished and saved");
    }
}

