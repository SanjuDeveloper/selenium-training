package seleniummCore;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trim extends Tests {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		Methods obj = new  Methods(); 
		obj.openWebSite(driver, Url);		
		List<WebElement> productsName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		String[] nameArray = productsName.get(1).getText().split("-");
		//String[] nameArray = {"Cauliflower"," 1 Kg"};
		
		System.out.println("1st index ="+ nameArray[0]);
		System.out.println("2nd index ="+ nameArray[1]);
		
		driver.findElement(By.className("search-keyword")).sendKeys(nameArray[0],Keys.ENTER);
		

	}

}
