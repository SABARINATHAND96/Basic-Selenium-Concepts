package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolll {

	public static void main(String[] args) throws 
 {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\geckodriver-v0.31.0-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();	
         driver.navigate().to("http://www.leafground.com/home.html");
         JavascriptExecutor ss=(JavascriptExecutor) driver;
         Thread.sleep(1000);
         ss.executeScript("Window.scrollBy(0,1000)");
         
	}

}
