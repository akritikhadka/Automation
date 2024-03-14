import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
public class FluentWait {
	//type of explicit wait
	
	//fluent wait find the web element repeatedly ,it will wait until time out
	//fluent wait does the same thing 
	//webdriver wait keeps on monitoring the DOM-10secs
	//fluent wait monitors in regular interval time ,10 sec,polling 2sec
	//not used as much as explicit
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button"));
		Wait<WebDriver> wait=new FluentWait<Webdriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		//wait.until(arg0);

		//WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
	}

}
