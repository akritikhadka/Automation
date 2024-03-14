import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_originStation1'] option[value='DEL']")).click();
		Thread.sleep(2000);
		
		

	}

}
