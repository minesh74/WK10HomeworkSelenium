package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";  //storing base url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");  // setting webdriver
        WebDriver driver = new ChromeDriver(); //creating object of chrome webdriver
        driver.get(baseurl);   // goes to the web page
        driver.manage().window().maximize();  // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //TIMEOUT SESSION
        String title = driver.getTitle(); //storing title
        System.out.println("TITLE OF THE PAGE:" + title);   //printing title in console
        String url = driver.getCurrentUrl(); //getting url
        System.out.println("current Url :" + url);
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