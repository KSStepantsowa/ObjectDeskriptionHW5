import java.util.Scanner;

public class Author {
    public String authorName;
    public String authorSurname;
    public String publisherHouse;
    public String language;

    public Author (String authorName, String authorSurname, String publisherHouse) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.publisherHouse = publisherHouse;
    }
    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
//    public Author (String language) {
//        this.language = language;
//    }

    public void ConsoleAuthorInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who is your favorite author? ");
        String authorName = scanner.nextLine();
        String authorSurname = scanner.nextLine();
    }
    public String getAuthorData () {
        return String.format("The author of this book is %s %s. ", authorName, authorSurname);
    }
    public String getNativeLanguage(){
        return String.format(language);
    }

}

