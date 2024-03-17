import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Author author = new Author("Anjey ", "Sapkowski ", "ABCblabla ");
        Book fantasy = new Book ("The Witcher. The Last Wish", "\"Witchers\" are monster hunters given superhuman abilities for the purpose of killing dangerous creatures. ", "The Witcher", 321);

        Author author1 = new Author("Jacek ", "Piekara ", "Blablaabc");
        Book darkFantasy = new Book("Inquisitor. Servant of God. ", " ", "Inquisitor ", 448);

        Author author2 = new Author(" Alexey ", "Pehov ", "123AB");
        Book fantasy1 = new Book("Guardian ", "", "Guardian ", 498);

        System.out.println(author.authorName + author.authorSurname + fantasy.bookName);
        System.out.println(author1.authorName + author1.authorSurname + darkFantasy.bookSeries + darkFantasy.numberOfBookPages);
        System.out.println(fantasy1.bookName + fantasy1.numberOfBookPages + author2.authorName + author2.authorSurname);

    }
}
