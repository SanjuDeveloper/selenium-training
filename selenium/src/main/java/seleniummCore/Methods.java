package seleniummCore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods extends Tests{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		String searchItem= "Cucumber";
		Methods obj = new  Methods(); // Crete object of the class
		obj.openWebSite(driver, Url);
		obj.searchItem(driver,searchItem);		
	}

}
