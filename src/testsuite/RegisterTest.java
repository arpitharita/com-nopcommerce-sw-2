package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openbrowser(BaseUrl);

    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        //* click on the ‘Register’ link
        WebElement ClickRegister = driver.findElement(By.xpath("//a[@class='ico-register']"));
        ClickRegister.click();

        //* Select gender radio button
        WebElement ClickonMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        ClickonMale.click();

        WebElement ClickonFemale = driver.findElement(By.xpath("//input[@id='gender-female']"));
        ClickonFemale.click();

        //* Enter First name
        WebElement EnterFirstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        EnterFirstname.sendKeys("webdrive");

        //* Enter Last name
        WebElement EnterLastname= driver.findElement(By.xpath("//input[@id='LastName']"));
        EnterLastname.sendKeys("xyzp");

        //* Select Day Month and Year
        WebElement Selectday = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Selectday.sendKeys("11");

        WebElement SelectMonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        SelectMonth.sendKeys("Jun");

        WebElement SelectYear= driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        SelectYear.sendKeys("1925");

        //* Enter Email address
        WebElement EnteeEmail= driver.findElement(By.xpath("//input[@id='Email']"));
        EnteeEmail.sendKeys("web11@gmail.com");

        //* Enter Password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='Password']"));
        EnterPassword.sendKeys("12345@");

        //* Enter Confirm password
        WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        ConfirmPassword.sendKeys("12345@");

        //click on registerbutton
         WebElement RegisterButton = driver.findElement(By.xpath("//button[@name='register-button']"));
         RegisterButton.click();


        //* Verify the text 'Your registration completed’
          WebElement VerifyText = driver.findElement(By.xpath("//div[@class='result']"));
          String actualText = VerifyText.getText();
          String expectedText = "Your registration completed";
          Assert.assertEquals(expectedText,actualText);

    }
    @After
    public void closebrowser(){
       // driver.quit();
    }
}