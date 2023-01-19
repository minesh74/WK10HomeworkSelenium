package comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public class Multibrowsing {
    static String browser = "Chrome";
    static String baseURL = "https://www.saucedemo.com/";  //storing base url
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        } else {
            System.out.println("not valid browser ");
        }
        driver.get(baseURL);
        driver.manage().window().maximize();  // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //TIMEOUT SESSION
        String title = driver.getTitle(); //storing title
        System.out.println("TITLE OF THE PAGE:" + title);   //printing title in console
        String url = driver.getCurrentUrl(); //getting url
        System.out.println("current Url :" + url);
        String source = driver.getPageSource();
        System.out.println("Page source :" + source);
        driver.findElement(By.name("user-name")).click(); // clicking on login link
        WebElement usernameField = driver.findElement(By.name("user-name")); // storing usernamefield
        usernameField.sendKeys("locked_out_user"); // sending keys to username  field
        WebElement passwordField = driver.findElement(By.name("password")); // stroring password field
        passwordField.sendKeys("secret_sauce"); // sendkeys to password field
        driver.close();// closing browser
    }
}