package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";  //storing base url
        System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver();  //creating object of edge webdriver
        driver.get(baseurl);   // goes to the web page
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Timeout session
        String title = driver.getTitle();   // storing title
        System.out.println("Title of the Page :" + title);  // Printing Title in console
        String url = driver.getCurrentUrl();  //getting URL
        System.out.println("Current URL :" + url);
        String source = driver.getPageSource();
        System.out.println("page source :"+source);
        driver.findElement(By.id("user[email]")).click(); // clicking on login link
        WebElement usernameField = driver.findElement(By.id("user[email]")); // storing username field
        usernameField.sendKeys("pearldiya74@gmail.com");  //sending keys to username field field
        driver.findElements(By.id("user[password]"));  // storing password field
        WebElement passwordField = driver.findElement(By.id("user[password]")); // stroring password field
        passwordField.sendKeys("1234567a");  // sendkey to password
        driver.quit();  //closing browser
    }
}