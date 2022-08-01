package selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		nathan.manage().window().maximize();
		nathan.get("https://www.google.co.in/");
		
		WebElement search=nathan.findElement(By.name("q"));
		search.sendKeys("SauceDemo"+Keys.ENTER);
		
		WebElement clicklink=nathan.findElement(By.partialLinkText("Swag Labs"));
		clicklink.click();
		//0.Login a SwagLabs
		//1.Enter a user name
		
		WebElement usernname= nathan.findElement(By.xpath("//*[@id=\"user-name\"]"));
		usernname.sendKeys("standard_user");
		
		//2.Enter a password
		
		WebElement passsword = nathan.findElement(By.xpath("//*[@id=\"password\"]"));
		passsword.sendKeys("secret_sauce");
		//Thread.sleep(5000);
		//3.submit
		
		WebElement sumbitt = nathan.findElement(By.xpath("//*[@id=\"login-button\"]"));
		sumbitt.click();
		
		//4.open Product and add to cart then return to back
		//Thread.sleep(5000);

		WebElement productopen=nathan.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		productopen.click();
		
		//Thread.sleep(5000);
		WebElement addtocart=nathan.findElement(By.xpath("//*[@id=\'add-to-cart-sauce-labs-bolt-t-shirt\']"));
		addtocart.click();
		//Thread.sleep(5000);
		
		WebElement backtoproductpage=nathan.findElement(By.xpath("//*[@id=\'back-to-products\']"));
		backtoproductpage.click();
		//Thread.sleep(5000);

		//5.Again add another product to addCart
		
		WebElement product2=nathan.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)"));
		product2.click();
		//Thread.sleep(5000);
		WebElement addtocart2=nathan.findElement(By.xpath("//*[@id=\'add-to-cart-test.allthethings()-t-shirt-(red)\']"));
		addtocart2.click();
		//Thread.sleep(5000);
		WebElement backtoprod=nathan.findElement(By.xpath("//*[@id=\'back-to-products\']"));
		backtoprod.click();
		
		//Thread.sleep(10000);

		//6.Go to Cart page
		
		WebElement cartpage=nathan.findElement(By.xpath("//*[@id=\'shopping_cart_container\']/a"));
		cartpage.click();
		
		//Thread.sleep(10000);

		//7.Remove high rate product
		
		WebElement remove=nathan.findElement(By.xpath("//*[@id=\'remove-test.allthethings()-t-shirt-(red)\']"));
		remove.click();
		//Thread.sleep(5000);

		//8.CheckOut Shopping 
		
		WebElement checkout=nathan.findElement(By.xpath("//*[@id=\'checkout\']"));
		checkout.click();
		//Thread.sleep(5000);

		//9.Fill your detauls
		WebElement firstname=nathan.findElement(By.xpath("//*[@id=\'first-name\']"));
		firstname.sendKeys("Sabari");
		//Thread.sleep(1000);

		WebElement lastname=nathan.findElement(By.xpath("//*[@id=\'last-name\']"));
		lastname.sendKeys("Nathan");
		
		//Thread.sleep(1000);

		WebElement zipcode=nathan.findElement(By.xpath("//*[@id=\'postal-code\']"));
		zipcode.sendKeys("636117");
		//Thread.sleep(1000);

		

		WebElement continue1=nathan.findElement(By.xpath("//*[@id=\'continue\']"));
		continue1.click();
		//Thread.sleep(1000);

		WebElement finish = nathan.findElement(By.xpath("//*[@id=\'finish\']"));
		finish.click();
		//Thread.sleep(1000);

		WebElement backtohome = nathan.findElement(By.xpath("//*[@id=\'back-to-products\']"));
		backtohome.click();
		
		WebElement clickoptionsbuttons = nathan.findElement(By.xpath("//*[@id=\'react-burger-menu-btn\']"));
		clickoptionsbuttons.click();
		
		
		
		
		
		
		//Thread.sleep(10000);
		//nathan.quit();
		
		
	}

}
