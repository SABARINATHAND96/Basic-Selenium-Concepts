package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");

		WebDriver sabari = new ChromeDriver();
		 sabari.get("http://www.leafground.com/pages/checkbox.html");
		
		
		WebElement javacheck=sabari.findElement(By.xpath("//*[@type='checkbox']/following::input[6]/following-sibling::text()/following::input[1]"));
		
		
		
		//System.out.println(javacheck.getText());
		javacheck.click();
		
		
	 
		
	}

}
