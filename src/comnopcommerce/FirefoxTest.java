package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/";  //storing base url
        System.setProperty("webdrriver.gecko.driver","src/drivers/geckodriver.exe");// setting firefox webdriver
        WebDriver driver =new FirefoxDriver();  // creating object of firefox webdriver
        driver.get(baseurl);  // goes to the web page
        driver.manage().window().maximize(); //maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // TIMEOUT SESSION
        String title =driver.getTitle(); // storing Title
        System.out.println("Title of the page :"+title); // printing title in console
        String url =driver.getCurrentUrl();  // getting current URL
        System.out.println("current Url :" +url);  //
        String source = driver.getPageSource();
        System.out.println("page source :"+source);
        driver.findElement(By.className("ico-login")).click(); // clicking on login link
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("pearldiya@live.com");  // Sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password")); // storing password field
        passwordField.sendKeys("12345a");   //send password key to the web page
        driver.close();  // closing browser that means closing the web page
    }
}