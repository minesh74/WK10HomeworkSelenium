package comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";  //storing base url
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
        driver.findElement(By.id("user-name")).click(); // clicking on login link
        WebElement usernameField = driver.findElement(By.id("user-name")); // storing username field
        usernameField.sendKeys("problem_user");  //sending keys to username field field
        driver.findElements(By.id("password"));  // storing password field
        WebElement passwordField = driver.findElement(By.id("password")); // stroring password field
        passwordField.sendKeys("secret_sauce");  // sendkey to password
        driver.quit();  //closing browser
    }
}