package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		
		nathan.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		
		List<WebElement> sss=nathan.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select//li"));
		
		Actions dd=new Actions(nathan);
		
		dd.click();
		
	}

}
