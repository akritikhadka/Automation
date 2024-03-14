import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String[] veggies= {"Brocolli","Cucumber","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List <WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<=products.size();i++) {
			String[] product1=products.get(i).getText().split("-");
			//String name = product1[0].trim();
			//convert into array list
			//array list is only used when required
			//check whether the name is present in array or not
			List<String> arY=Arrays.asList(veggies);
			int j=0;
			if (arY.contains(product1)){
				j++;
				//click on add to cart
				driver.findElements(By.xpath("//div[class=\"product-action\"]/button")).get(i).click();
				if(j==veggies.length) {
					break;
				}
			}
		}
		


	}
}
