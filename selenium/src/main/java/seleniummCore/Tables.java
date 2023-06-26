package seleniummCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>  values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;

 		for(int i=0;i<values.size();i++) {
 			sum = sum + Integer.parseInt(values.get(i).getText());
			// sum = 28 +23 + 48 +
 			// i=2
		}
		System.out.println(sum);
		System.out.println(Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim()));
		 
		// Total Amount Collected: 296
		//  12S
		
		int total =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		 Assert.assertEquals(total, sum);
		
		
		 

	}

}
