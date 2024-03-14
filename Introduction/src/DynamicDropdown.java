import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]/option[8]")).click();
		Thread.sleep(900);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1']//option[@value='MAA'][normalize-space()='Chennai (MAA)']']")).click();
//
	}

}
