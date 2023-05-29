package seleniummCore;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Switching Window

		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String productName = driver.findElements(By.xpath("//h4[@class='product-name']"))
				.get(1).getText();
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.className("search-keyword")).sendKeys(productName,Keys.ENTER);
		
		/*// Screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		// driver.quit();

		// GEt Height & Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());*/

	}

}
