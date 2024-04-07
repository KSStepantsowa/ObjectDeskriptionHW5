import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
public class CollectionManager {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book book) throws IOException {
        books.add(book);
    }

    public static void saveBooks() throws IOException {
        if (!books.isEmpty()) {
            FileWriter bookWrite = new FileWriter("D:\\Githubreps\\Books_List.txt", false);

            for (Book book : books) {
                bookWrite.write(book.bookName + "," + book.bookDescription + "," + book.language + "\n");
            }

            bookWrite.close();
        }
    }

    public static void readBooks() throws IOException {
        FileReader bookRead = new FileReader("D:\\Githubreps\\Books_List.txt");
        Scanner scanner = new Scanner(bookRead);

        while (scanner.hasNextLine()) {
            String bookInfo = scanner.nextLine();
            String[] information = bookInfo.split(",");
            Book book = new Book(information[0], information[1], information[2]);

            CollectionManager.addBook(book);
        }

        bookRead.close();
    }
}


