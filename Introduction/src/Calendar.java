import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]/option[8]")).click();
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1\"]/option[9]")).click();
			driver.findElement(By.xpath("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
			
			
	}

}
