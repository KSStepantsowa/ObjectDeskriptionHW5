import java.util.EmptyStackException;
import java.util.Scanner;
public class Book implements Language {
    public String bookName;
    public String bookDescription;
    public Integer numberOfBookPages;
    public String language;


    public Book (String bookName, String bookDescription, String language) {
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.language = language;

    }

    public Book (String bookName, Integer numberOfBookPages) {
        this.bookName = bookName;
        this.numberOfBookPages = numberOfBookPages;
    }
    public Book (String bookSeries, String bookDescription) {
        this.bookDescription = bookDescription;
    }
//    public Book (String language) {
//        this.language = language;
//    }
    public void ConsoleBookInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite book? ");
        String bookName = scanner.nextLine();
//        try {
//            System.out.println(((String) numberOfBookPages).charAt(0));
//        } catch (ExceptionInInitializerError e) {
//            System.out.println("There is no data. No data in the field");
//        }
    }

    public String getBookNameData(){
        return String.format("Here is info about %s. ", bookName);
    }

    @Override
    public void printNativeLanguage() {
        System.out.println("The native language of this book is " + this.language);
    }
}
