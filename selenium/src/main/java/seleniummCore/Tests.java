package seleniummCore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Tests {
	public Tests()
	{
		
	}
	
	/*
	 * This method will  Open the given URL in browser
	 * @void
	 */
	public void openWebSite(WebDriver driver,String URL) {
		driver.get(URL); // open the url
	}
	
	/*
	 * Search the Item 
	 */  
	public void searchItem(WebDriver driver,String itemName)
	{
		driver.findElement(By.xpath("//input[@type='search']"))
		.sendKeys(itemName,Keys.ENTER);
		
	}
	
}
