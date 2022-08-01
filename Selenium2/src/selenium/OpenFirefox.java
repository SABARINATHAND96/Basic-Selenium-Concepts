package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.ElementScrollBehavior;


public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		//driver.quit();
		
		//enter the search item
		//click wikipedia link
		
		driver.findElement(By.name("q")).sendKeys("javatpoint"+Keys.ENTER);
		
		
		
	}

}
