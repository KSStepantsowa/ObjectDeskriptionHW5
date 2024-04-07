import org.testng.Assert;
import org.testng.annotations.*;
import java.lang.AssertionError;
import java.io.IOException;


public class PositiveTest {
    String testBookName = "Book Name";
    String MENU_CONTENT = "1. Add book\n2. Terminate and Save changes.";
    boolean menuIsPrinted = true;

    @BeforeSuite
    public void suiteSetUp() {
        System.out.println("This is a try to use annotation BeforeSuite");
    }

    @AfterSuite
    public void suiteTearDown() {
        System.out.println("This is a try to use annotation AfterSuite");
    }

    @BeforeTest
    public void testSetUp() {
        System.out.println("Before Test method");
    }

    @AfterTest
    public void testTearDown() {
        System.out.println("After Test method");
    }

    @BeforeGroups("positive")
    public void positiveTest() {
        System.out.println("This is positive test group");
    }

    @AfterGroups("negative")
    public void negativeTest() {
        System.out.println("This is negative test group");
    }

    @BeforeClass
    public void classSetUp() {
        System.out.println("This text will be printed before class");
    }

    @AfterClass
    public void classTearDown() {
        System.out.println("This text will be printed after class");
    }

    @BeforeMethod
    public void methodSetUp() {
        System.out.println("This text will be printed before method");
    }

    @AfterMethod
    public void methodTearDown() {
        System.out.println("This text will be printed after method");
    }
    @Test(groups = "positive")
    public void shouldReturnBookName() {
        Book testBook = new Book(testBookName, "Book Name Description", "EN");

        Assert.assertEquals(testBook.getBookNameData(), testBookName);
    }

    @Test(groups = "positive")
    public void shouldPrintMenu(){
        System.out.println(MENU_CONTENT);

        Assert.assertFalse(Boolean.parseBoolean(MENU_CONTENT));
    }

    @Test(groups = "positive")
    public void checkMenuIsVisible() {
        Assert.assertTrue(menuIsPrinted);
    }

}
