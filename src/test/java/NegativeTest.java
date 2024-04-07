import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class NegativeTest {
    int folds = 10;
    boolean menuIsPrinted = true;

    String userInvalidInput = "blabla";
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

    @Test(groups = "negative")
    public void shouldReturnFoldsNumber(){
        Booklet testNumberOfBookletPages = new Booklet ("", "", "", folds);

        Assert.assertEquals(testNumberOfBookletPages.printFoldsNumber(), folds);
    }

    @Test(groups = "negative")
    public void shouldFinishAndSaveProgram(){
        Assert.assertFalse(menuIsPrinted);

    }

    @Test(groups = "negative")
    public void shouldFailTestBecauseOfException() throws IOException {
        try {
//            throw new IOException();
        } catch (Exception e) {
            Assert.fail("Test failed");
        }
    }

    @Test(groups = "negative")
    public void checkArrayNotEquals() {
        Assert.assertNotEquals(new String[] {"First", "BOOK"}, new String[]{"BOOK", "First"}, "Array Not Equal");
    }

    @Test(groups = "negative")
    public void checkArrayEqualsNoOrder() {
        Assert.assertEqualsNoOrder(new String[] {"Second", "BOOK"}, new String[]{"BOOK", "Second"}, "Array no order Equal");
    }

    @Test(groups = "negative")
    public void checkAssertNotEqual() {
        Assert.assertNotEquals(new String[] {"Third", "BOOK"}, new String[]{"BOOK", "First"}, "Array no order Equal");
    }

}

