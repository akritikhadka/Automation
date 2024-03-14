import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait - 5 seconds time out
		
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://support-hub.tricentis.com/open?id=csm_login");
		//driver.findElement(By.className("unifiedMenuPrimaryMenuText")).click();
		/*driver.findElement(By.id("username")).sendKeys("aakriti");
		driver.findElement(By.id("password")).sendKeys("ramram");
		driver.findElement(By.className("login-button-old")).click();
		System.out.println(driver.findElement(By.cssSelector("div.alert")).getText());
		//driver.findElement(By.linkText("/open?id=reset_password")).click();
		driver.findElement(By.cssSelector("a.forgot-pwd-link")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Business Email ID']")).sendKeys("testmyautomation@yopmail.com");
		driver.findElement(By.cssSelector("button.pull-right")).click();
		//driver.findElement(By.xpath("//input[@name='username']")).clear();*/
		//Thread.sleep(2000);
		/*
		driver.findElement(By.xpath("//input=[ng.model='c.username']")).sendKeys("testmyautomation@yopmail.com");*/
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='c.username']")));
		//usernameInput.sendKeys("testmyautomation@yopmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter Business Email']")).sendKeys("testmy@yopmail.com");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("1Strongaaku!");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName ("p")).getText());
		//Assert.assertEquals((driver.findElement(By.tagName ("p")).getText()), "Your Account is waiting for verification. The verification link is expired.\n"
		//		+ "Please request a new Verification email by clicking the button below.");
		driver.findElement(By.xpath("//span[text()='test test2']")).click();
		//driver.quit();

		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//driver.quit();
		
		//sibling to sibling child to parent reverse absolute xpath only one slash /html/body/header- relative xpath //traversing relative xpath and there we have to give double slash is relative xpath  from last  few lectyures
		//traverse from sibling to sibling<//header/div/button[1/following-sibling::button[1]
		//driver.findElement(By.xpath("")))
	}
	/*public String getpassword (WebDriver driver) {
	 driver.get("https://support-hub.tricentis.com/open?id=csm_login");
	 driver.findElement(By.linkText("/open?id=reset_password")).click();
	 Thread.sleep(200);
	 System.out.println(driver.findElement(By.cssSelector("div.alert")).getText());
	 String passwordText=driver.findElement(By.cssSelector("div.alert")).getText();
	String [] passwordArray1= passwordText.split("'");
	String [] passwordArray2= passwordArray1[1].split("'");
	String password=passwordArray2[0];
	return password;
	 }
	*/

}
