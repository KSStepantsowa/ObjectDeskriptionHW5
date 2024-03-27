import menu.BookMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException{
        // ArrayList<Book> books = new ArrayList<>();

        CollectionManager.readBooks();

        int userChoice = BookMenu.printMenu();

        while (userChoice == 1) {
            Scanner scanner = new Scanner(System.in);
            String bookName = scanner.nextLine();
            String bookDescription = scanner.nextLine();
            String language = scanner.nextLine();

            Book book = new Book(bookName, bookDescription, language);
            CollectionManager.addBook(book);

            userChoice = BookMenu.printMenu();
        }

        CollectionManager.saveBooks();

        //CollectionManager.writeBook();
        //CollectionManager.readBook();


        // books.add(new Book("Harry Potter", "The boy who survived", "EN"));
        // System.out.println(books);

        // Book userBookAuthorInput = new Book("", "", "");
        // userBookAuthorInput.ConsoleBookInput();
    }
}