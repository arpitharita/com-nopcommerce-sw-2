package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

        String BaseUrl = "https://demo.nopcommerce.com/";


    @Before

    public void setUp()
    {
        openbrowser(BaseUrl);

    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully() {

          //* click on the ‘Computers’ Tab
        WebElement ClickComputer = driver.findElement(By.linkText("Computers"));
        ClickComputer.click();

          //* Verify the text ‘Computers’
        WebElement Verifytext = driver.findElement(By.linkText("Computers"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Computers";
        Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        //* click on the ‘Electronics’ Tab
        WebElement Clickelectronics = driver.findElement(By.linkText("Electronics"));
        Clickelectronics.click();

        //* Verify the text ‘Electronics’
        WebElement Verifytext = driver.findElement(By.linkText("Electronics"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Electronics";
        Assert.assertEquals(actualtext,expectedtext);


    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

               //* click on the ‘Apparel’ Tab
        WebElement Clickapparel = driver.findElement(By.linkText("Apparel"));
        Clickapparel.click();

        // * Verify the text ‘Apparel’
        WebElement Verifytext = driver.findElement(By.linkText("Apparel"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Apparel";
        Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //* click on the ‘Digital downloads’ Tab
        WebElement Clickdigitaldownload = driver.findElement(By.linkText("Digital downloads"));
        Clickdigitaldownload.click();

        //* Verify the text ‘Digital downloads’
        WebElement Verifytext = driver.findElement(By.linkText("Digital downloads"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Digital downloads";
        Assert.assertEquals(actualtext,expectedtext);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        //* click on the ‘Books’ Tab
        WebElement Clickbook = driver.findElement(By.linkText("Books"));
        Clickbook.click();

        //* Verify the text ‘Books’
        WebElement Verifytext = driver.findElement(By.linkText("Books"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Books";
        Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //* click on the ‘Jewelry’ Tab
        WebElement Clickjewelry = driver.findElement(By.linkText("Jewelry"));
        Clickjewelry.click();

        //* Verify the text ‘Jewelry’
        WebElement Verifytext = driver.findElement(By.linkText("Jewelry"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Jewelry";
        Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //* click on the ‘Gift Cards’ Tab
        WebElement Clickgiftcard = driver.findElement(By.linkText("Gift Cards"));
        Clickgiftcard.click();

        //* Verify the text ‘Gift Cards’
        WebElement Verifytext = driver.findElement(By.linkText("Gift Cards"));
        String actualtext = Verifytext.getText();
        String expectedtext = "Gift Cards";
        Assert.assertEquals(actualtext,expectedtext);


    }
    @After
    public void closebrowser(){
        //driver.quit();
    }


    }


