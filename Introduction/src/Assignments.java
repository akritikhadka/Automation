import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments {

	public static void main(String[] args) {
		String text="Aakriti";
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();//switch for JS alert
		//driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.switchTo().alert().getText());
		//alert <is handled by accept() and dismiss()
	
		driver.quit();
		

	}

}
