package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		WebDriver sabari = new ChromeDriver();
		 sabari.get("http://www.leafground.com/pages/Alert.html");
		 
		 //1.click the button display a alert box
		 
		 WebElement alertbox1 = sabari.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));	 
				 
		alertbox1.click();
	//	1.i) All driver controls gone to alert box so we click ok button only
		Alert alert= sabari.switchTo().alert();
		Thread.sleep(5000);
		 alert.accept();
		 
		 //2.click 
		 
		 
		 
		
	}

}
