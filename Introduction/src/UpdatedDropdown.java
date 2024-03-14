import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shreeairlines.com/");
		System.out.println(driver.findElement(By.name("adult")).getText());
		for(int i=1;i<6;i++) {
		driver.findElement(By.className("glyphicon glyphicon-plus bookadultinc")).click();}
		
		//System.out.println(driver.findElement(By.xpath("//input[@class='form-control border-right-radius5 upper-form-control ']")).getText());
		//driver.findElement(By.xpath("//input[@class='form-control border-right-radius5 upper-form-control '] ")).click();
		driver.close();
		
	}

}
