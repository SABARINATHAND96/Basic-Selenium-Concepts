package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver sabari = new ChromeDriver();
		
		sabari.get("http://www.leafground.com/pages/Edit.html");
		
		
		sabari.findElement(By.id("email")).sendKeys("sabari@gmail.com");
		
		
		sabari.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("SABARI");
		
		
	      String value=	sabari.findElement(By.name("username")).getAttribute("value");
		
		
	      
		System.out.println(value);
		
		
		sabari.findElement(By.name("username")).clear();
		
		
		
	}

}
