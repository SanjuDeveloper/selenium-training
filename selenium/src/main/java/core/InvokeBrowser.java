package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
	
	public static boolean isDisplay;
	public static boolean isEnable;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		openBrowser(driver,"https://www.amazon.in");
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Phone",Keys.ENTER);

		//System.out.println("The 16th Products IS = "+ allProducts.get(15).getText());
		WebElement nextButton = driver.findElement(By.cssSelector("a[aria-label='Go to next page, page 2']"));
		
		if(isEnable(nextButton)) {
			PrintProductsName(driver);
		}
	}
	
	 public static boolean verifyMessage(String actual,String expected) {
		 if (actual.equalsIgnoreCase(expected)) {
				return true;
			 } 
		 return false;
     } 
	 
	 
	 
	 
	public static void openBrowser(WebDriver driver,String URL)
	{
		driver.get(URL);
	}
	
	public static boolean isEnable(WebElement nextButton)
	{
		isDisplay = nextButton.isDisplayed();
		isEnable = nextButton.isEnabled();
		if(isDisplay && isEnable ) {
			return true;
		}
		return false;
	}
	public static void PrintProductsName(WebDriver driver) {
		List<WebElement> allProducts = driver.findElements(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']"));
		allProducts.forEach(name->System.out.println(name.getText()));
		driver.findElement(By.cssSelector("a[aria-label*='next page']")).click();
		if(isDisplay && isEnable ) {
			PrintProductsName(driver);
		}
	}
}
