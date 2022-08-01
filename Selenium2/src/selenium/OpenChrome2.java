package selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		
		driver1.get("http:\\www.leafground.com/pages/Link.html");
		//driver1.findElement(By.name("ad-skin")).sendKeys("FEATURED MATCHES"+Keys.ENTER);
		driver1.findElement(By.linkText("Go to Home Page")).click();
		
			
		
	}
}
