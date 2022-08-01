package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\SABARINATHAN D\\\\Downloads\\\\Compressed\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:\\www.leafground.com/pages/Link.html");
		
		//driver.findElement(By.linkText("Go To Home Page")).click();
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		driver.findElement(By.linkText(null))
		
	}

}
