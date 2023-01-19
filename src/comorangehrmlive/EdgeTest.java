package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";  //storing base url
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
        driver.findElement(By.name("username")).click();  //clicking on Login link
        WebElement usernameField = driver.findElement(By.name("username"));  // Storing Email field
        usernameField.sendKeys("Admin");  // Sending keys to email id field
        WebElement passwordField = driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("admin123");   //send password key to the web page
        driver.close();  // closin browser that means closing the web page
    }
}