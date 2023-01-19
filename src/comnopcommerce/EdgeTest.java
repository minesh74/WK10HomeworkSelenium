package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
public class EdgeTest {
    public static void main(String[] args){
        String baseurl = "https://demo.nopcommerce.com/";  //storing base url
        System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe");  //setting webdriver
        WebDriver driver=new EdgeDriver();  //creating object of edge webdriver
        driver.get(baseurl);   // goes to the web page
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Timeout session
        String title =driver.getTitle();   // storing title
        System.out.println("Title of the Page :"+title);  // Printing Title in console
        String url =driver.getCurrentUrl();  //getting URL
        System.out.println("Current URL :" +url);
        String source = driver.getPageSource();
        System.out.println("page source :"+source);
        driver.findElement(By.className("ico-login")).click();  //clicking on Login link
        WebElement emailIdField = driver.findElement(By.id("Email"));  // Storing Email field
        emailIdField.sendKeys("pearldiya@live.com");  // Sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password")); // storing password field
        passwordField.sendKeys("12345a");   //send password key to the web page
        driver.close();  // closin browser that means closing the web page

    }
}
