package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl =  "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openbrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //* click on the ‘Login’ link
        WebElement clicklogin = driver.findElement(By.linkText("Log in"));
        clicklogin.click();
        //* Verify the text ‘Welcome, Please SignIn!’
        WebElement verifytext = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualtest = verifytext.getText();
        String expectedtest = "Welcome, Please Sign In!";
         Assert.assertEquals(expectedtest,actualtest);
    }@Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){



        //* click on the ‘Login’ link
        WebElement Login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        Login.click();




        //* Enter valid username
        WebElement validusername = driver.findElement(By.xpath("//input[@class='email']"));
        validusername.sendKeys("hari@23gmail.com");


        //* Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
        password.sendKeys("12345@");


        //* Click on ‘LOGIN’ button
        WebElement clicklogin = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        clicklogin.click();



        //* Verify the ‘Log out’ text is display
        WebElement clicklogout = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        clicklogout.click();

    }@Test
    public void verifyTheErrorMessage(){

        //* click on the ‘Login’ link

        WebElement clicklogin = driver.findElement(By.xpath("//a[@href='/login?returnUrl=%2F']"));
        clicklogin.click();

        //* Enter invalid username

        WebElement invalidusername =driver.findElement(By.xpath("//input[@class='email']"));
        invalidusername.sendKeys("abcd@gmail.com");

        //* Enter invalid password

        WebElement invalidpassword = driver.findElement(By.xpath("//input[@class='password']"));
        invalidpassword.sendKeys("12345");

        //* Click on Login button

        WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        login.click();

        //* Verify the error message

        WebElement error = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        error.click();
    }
    @After
    public void closebrowser(){
     // driver.quit();
    }

}
