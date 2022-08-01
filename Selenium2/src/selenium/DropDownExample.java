package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		
		nathan.get("http://www.leafground.com/home.html");
		
		//1.goto drop down page
		 
		WebElement gotodropdownpage = nathan.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
		gotodropdownpage.click();
		
		//2.select first drop down
		
		WebElement dropdownselect = nathan.findElement(By.id("dropdown1"));
		Select selectdropdownlist = new Select(dropdownselect);
		selectdropdownlist.selectByIndex(3);
		//Thread.sleep(5000);
		selectdropdownlist.selectByValue("2");
		//Thread.sleep(5000);
		selectdropdownlist.selectByVisibleText("Selenium");
		//Thread.sleep(5000); You won't use thread method in tamil because need fast
		
		
		//3.Drop down list size
		
		List<WebElement> listofoptions=selectdropdownlist.getOptions();
		int sizeofthedropdown =	listofoptions.size();
		
		System.out.println("List of The DropDown :"+sizeofthedropdown);
		
		//4.you can use send keys
		
		
		dropdownselect.sendKeys("Loadrunner");
		
		//4.Select Multiselect drop down
		
		WebElement Multiselect = nathan.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select Multiselectbox = new Select(Multiselect);
		
		Multiselectbox.selectByValue("1");
		Multiselectbox.selectByIndex(2);
		
		Multiselectbox.selectByIndex(3);
		
		
	}

}
