public class BookSeries implements Language {
    public String bookSeriesName;
    public Integer numberOfBooks;
    public Integer seriesRating;
    public String language;

    public BookSeries (String bookSeriesName, Integer numberOfBooks,Integer seriesRating, String language) {
        this.bookSeriesName = bookSeriesName;
        this.numberOfBooks = numberOfBooks;
        this.seriesRating = seriesRating;
        this.language = language;
    }
    public BookSeries (String bookSeriesName, Integer numberOfBooks) {
        this.bookSeriesName = bookSeriesName;
        this.numberOfBooks = numberOfBooks;
    }
//    public BookSeries (String language) {
//        this.language = language;
//    }
    public String getBookSeriesData() {
        return String.format("The name of the book series is %s. This book series have %d books. ", bookSeriesName, numberOfBooks);
    }
    public void printNativeLanguage() {
        System.out.println("The native language of this book series is " + this.language);
    }

}
