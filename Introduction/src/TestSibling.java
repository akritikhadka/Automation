import java.time.Duration;

//import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
public class TestSibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait - 5 seconds time out
		
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).click();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
	}

}