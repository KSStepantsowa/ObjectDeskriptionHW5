public class Booklet extends Book implements Language{
    private Integer folds;
public Booklet(String bookName, String bookDescription, String language, Integer folds){
    super(bookName, bookDescription, language);
    this.folds = folds;
}
    public void printNativeLanguage() {
        super.printNativeLanguage();
    }
    public void printFoldsNumber(){
        System.out.println("Here is folds number " + folds);
    }
}
