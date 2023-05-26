package seleniummCore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize(); //Mazimize current window
		Thread.sleep(2000);    //Delay execution for 5 seconds to view the maximize operation	
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Rahul@123");
		driver.findElement(By.className("signInBtn")).click();
		String errorMessage = driver.findElement(By.cssSelector("p[class='error']")).getText();
		System.out.println(errorMessage);

	}

}
