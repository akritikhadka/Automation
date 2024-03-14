import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		//Chrome-ChromeDriver -->Methods close get
		//Create object 
		//Firefox-FirefoxDriver ->Methods close get
		//Safari-SafariDriver ->Methods close get
		//chromedriver.exe
		//System.setProperty("webdriver.chrome.driver","/Users/aakritikhadka/Documents/Google Chrome for Testing");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		//driver.quit();
	}

}
