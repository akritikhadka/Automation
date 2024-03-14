import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class windowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj9prC7ipmEAxX-HhAIHX75CmoQPAgJ");
		driver.navigate().to("https://fonts.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
