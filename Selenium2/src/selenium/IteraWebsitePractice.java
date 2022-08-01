package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IteraWebsitePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver sabari=new ChromeDriver();
		sabari.manage().window().maximize();
		sabari.get("https://itera-qa.azurewebsites.net/home");
		
		//1.Click a Test automation link
		
		WebElement testautomationlink	= sabari.findElement(By.xpath("/html/body/nav/div/ul/li[3]/a"));
		testautomationlink.click();
		
		//2.Enter a name to textBox
		
		WebElement entername=	sabari.findElement(By.xpath("//*[@id=\"name\"]"));
		entername.sendKeys("SABARINATHAN");
		
		//3.Enter mobile number
		
		WebElement phonenumber  =	sabari.findElement(By.xpath("//*[@id=\"phone\"]"));
		phonenumber.sendKeys("134567895");
		
		//4.Enter a mail address	
		
		WebElement mailaddress =	sabari.findElement(By.xpath("//*[@id=\"email\"]"));
		mailaddress.sendKeys("sa@gmail.com");
		
		//5.Enter a password
		
		WebElement password = sabari.findElement(By.id("password"));
		password.sendKeys("sgdasghd22556654");
		
		//6.Enter a address
		
		WebElement address = sabari.findElement(By.id("address"));
		address.sendKeys("15,middle street,chennai,636500");
		
		WebElement submits=sabari.findElement(By.xpath("/html/body/div/div[2]/div[2]/button"));
		submits.click();
	
		//sabari.quit();
		
		//Thread.sleep(4000);
		//7.Click radio button other
		
		WebElement RadioToOther=sabari.findElement(By.id("male"));
		RadioToOther.click();		
		
		
		//8.select checBbox 
		
		WebElement checkbox=sabari.findElement(By.id("friday"));
		checkbox.click();
		
		//9.Select DropDown
		
		WebElement dropdown1=sabari.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
		Select dropdown2=new Select(dropdown1);
		dropdown2.selectByIndex(10);
		
		//10.Select radioButton
		WebElement radiobuttonclick=sabari.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label"));
		radiobuttonclick.click();
		
		//11.select check box
		
		WebElement checkbox2=sabari.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label"));
		checkbox2.click();
		
		WebElement checkbox3=sabari.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label"));
		checkbox3.click();

		
		Thread.sleep(10000);
		
		//sabari.quit();
		
		
		
		
	}

}
