package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextBoxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		
		WebDriver sabari = new ChromeDriver();
		
		sabari.get("http://www.leafground.com/pages/Edit.html");
		
		
		WebElement emailbox =	sabari.findElement(By.id("email"));
		emailbox.sendKeys("sabari@gmail.com");	
		
			
		WebElement appendbox =	sabari.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		
		appendbox.sendKeys("SABARI");
		
		WebElement gettextbox = sabari.findElement(By.name("username"));
		
	    String value = gettextbox.getAttribute("value");
		
	      
		System.out.println(value);
		
		WebElement clearbox = sabari.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		//xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		//xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		
		WebElement disabledbox = sabari.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		Boolean enabled = disabledbox.isEnabled();
		
		System.out.println(enabled);
	}

}
