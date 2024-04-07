public class Booklet extends Book implements Language{
    private int folds;
public Booklet(String bookName, String bookDescription, String language, int folds){
    super(bookName, bookDescription, language);
    this.folds = folds;
}
    public void printNativeLanguage() {
        super.printNativeLanguage();
    }
    public int printFoldsNumber(){
        return this.folds;
//        System.out.println("Here is folds number " + folds);
    }
}
