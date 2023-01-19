package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class ChromeTest {
    public static void main(String[] args){
        String  baseurl="https://demo.nopcommerce.com/";  //storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");  // setting webdriver
        WebDriver driver = new ChromeDriver(); //creating object of chrome webdriver
        driver.get(baseurl);   // goes to the web page
       driver.manage().window().maximize();  // maximising window
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //TIMEOUT SESSION
     String title  =driver.getTitle(); //storing title
     System.out.println("TITLE OF THE PAGE:" +title);   //printing title in console
        String url=driver.getCurrentUrl(); //getting url
       System.out.println("current Url :"+ url);
        String source = driver.getPageSource();
        System.out.println("page source :"+source);
        driver.findElement(By.className("ico-login")).click(); // clicking on login link
        WebElement emailIdField = driver.findElement(By.id("Email")); // storing email field
        emailIdField.sendKeys("pearldiya@live.com"); // sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password")); // stroring password field
        passwordField.sendKeys("1234567a"); // send keys to password field
        driver.close();// closing browser that means closing the web page
    }
}
