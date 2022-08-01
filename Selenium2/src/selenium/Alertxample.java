package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.ah.A;

public class Alertxample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		
		nathan.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alretbox = nathan.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alretbox.click();
		
		//Thread.sleep(5000);
			Alert alertb = nathan.switchTo().alert();
		
		alertb.accept();
		//alertb.dismiss();
		
		
		WebElement confirmbutton = nathan.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		
		confirmbutton.click();
		
		Alert confirmalret = nathan.switchTo().alert();
		confirmalret.accept();
		
		
		
		WebElement promptbox = nathan.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		
		promptbox.click();
		
		Thread.sleep(3000);
		
		
		Alert promptalert = nathan.switchTo().alert();
		
		promptalert.sendKeys("ASUS TUF Gaming");
		
		promptalert.accept();
		
		
		
		
		
		

		
		
		
		
		
	}

}
