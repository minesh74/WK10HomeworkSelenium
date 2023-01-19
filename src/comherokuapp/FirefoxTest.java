package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";  //storing base url
        System.setProperty("webdrriver.gecko.driver", "src/drivers/geckodriver.exe");// setting firefox webdriver
        WebDriver driver = new FirefoxDriver();  // creating object of firefox webdriver
        driver.get(baseurl);  // goes to the web page
        driver.manage().window().maximize(); //maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // TIMEOUT SESSION
        String title = driver.getTitle(); // storing Title
        String source = driver.getPageSource();
        System.out.println("page source :"+source);
        driver.findElement(By.id("username")).click(); // clicking on login link
        WebElement usernameField = driver.findElement(By.id("username")); // storing username field
        usernameField.sendKeys("tomsmith ");  //sending keys to username field field
        driver.findElements(By.id("password"));  // storing password field
        WebElement passwordField = driver.findElement(By.id("password")); // stroring password field
        passwordField.sendKeys("SuperSecretPassword!");  // sendkey to password
        driver.quit();  //closing browser
    }
}