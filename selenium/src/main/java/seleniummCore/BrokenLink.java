package seleniummCore;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class BrokenLink {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']/ul/li"));
		SoftAssert a=new SoftAssert();
		
		for(WebElement link: links) {
			String url=link.getAttribute("href");			
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resp=conn.getResponseCode();
			a.assertEquals(resp<400,"The link with Text"+link.getText()+"is broken with code"+resp);
			System.out.println("Response Code"+resp);
		}
		
		a.assertAll();

	}
}
