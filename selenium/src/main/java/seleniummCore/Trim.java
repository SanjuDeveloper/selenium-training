package seleniummCore;

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
		Methods obj = new  Methods(); 
		obj.openWebSite(driver, Url);
		List<WebElement> productsName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		String[] name = productsName.get(1).getText().split("-");
		System.out.println(name[0]);
		driver.findElement(By.className("search-keyword")).sendKeys(name[0],Keys.ENTER);
		 

	}

}
