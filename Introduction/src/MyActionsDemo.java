import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;


public class MyActionsDemo {

    public static void main(String[] args) {
        // Setting up the WebDriver path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/Users/aakritikhadka/Downloads/chromedriver-mac-arm64/chromedriver");
     // Assuming 'driver' is your instance of WebDriver
        //driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
       

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
        Actions a = new Actions(driver);
        
        // Corrected the syntax by adding quotes around the CSS selector
        WebElement b = driver.findElement(By.cssSelector("#nav-link-accountList"));
        WebElement c = driver.findElement(By.cssSelector("#nav-link-accountList"));
        
        // Perform moveToElement action
        a.moveToElement(b).contextClick().build().perform();
        a.moveToElement(c).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        //a.moveToElement(move)
        a.moveToElemen
        // Now you can use 'a' to perform further actions
    }
}
