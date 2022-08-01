package selenium;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neilalexander.jnacl.crypto.xsalsa20;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		
		nathan.get("http://www.leafground.com/pages/radio.html");

		
		WebElement unchecked=nathan.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"))	;	
		WebElement checked = nathan.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		
		boolean status1=unchecked.isSelected();
		boolean status2=checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20=nathan.findElement(By.name("age"));
		below20.click();
		
		
		
		
	}

}
