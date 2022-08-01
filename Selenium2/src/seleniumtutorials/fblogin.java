package seleniumtutorials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver nathan = new ChromeDriver();
		 
		nathan.get("https://www.facebook.com/");
		
		WebElement email = nathan.findElement(By.id("email"));
		email.sendKeys("sa@gmail.com");
		
		WebElement pass = nathan.findElement(By.id("pass"));
		pass.sendKeys("dsf45");
		
		WebElement getpositionbutton = nathan.findElement(By.name("login"));
		getpositionbutton.click();	
				
				
	}

}
