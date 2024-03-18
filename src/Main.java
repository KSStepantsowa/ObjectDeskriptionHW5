import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Author author = new Author("Anjey ", "Sapkowski ", "ABCblabla ");
        Book fantasy = new Book ("The Witcher. The Last Wish", "Watchers are monster hunters given superhuman abilities for the purpose of killing dangerous creatures. ", "Polish");
        BookSeries series = new BookSeries ("The witcher", 8, 878, "Polish");

        Author author1 = new Author("Jacek ", "Piekara ");
        Book darkFantasy = new Book("Inquisitor. Servant of God. ", " ", "Inquisitor ");

        Author author2 = new Author(" Alexey ", "Pehov ", "123AB");
        Book fantasy1 = new Book("Guardian ", 498);
        Book fantasy2 = new Book("Shadow Prowler (Chronicles of Siala)", "This is a short book description");

        System.out.println(fantasy.getBookNameData() + series.getBookSeriesData() + author.getAuthorData());
        fantasy.printNativeLanguage();
        series.printNativeLanguage();

        Booklet cityGuide = new Booklet("", "", "", 23);
        cityGuide.printNativeLanguage();
        cityGuide.printFoldsNumber();
        Book userBookAuthorInput = new Book("", "", "");
        userBookAuthorInput.ConsoleBookInput();
        Author userAuthorNameSurnameInput = new Author("", "");
        userAuthorNameSurnameInput.ConsoleAuthorInput();


//        System.out.printf("Your favorite book is %s and the author is %s %s", userBookAuthorInput.bookName, userAuthorNameSurnameInput.authorName, userAuthorNameSurnameInput.authorSurname);




    }


}
