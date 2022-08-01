package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExampls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver nathan=new ChromeDriver();
		nathan.get("http://www.leafground.com/pages/Button.html");
		
		//1.Get Button XY Value
		WebElement getpositionofthebox = nathan.findElement(By.id("position"));
		Point xypoint = getpositionofthebox.getLocation();
		int xvalue =xypoint.getX();
		int yvalue =xypoint.getY();
		System.out.println("X value is : " +xvalue+ "Y value is : " +yvalue);
		
		//2.find the button color
		
		WebElement getbuttoncolor = nathan.findElement(By.id("color"));
		String color = getbuttoncolor.getCssValue("background-color");
		System.out.println("background-color is: "+color);
		
		//3.Find button height width 
		
		WebElement getheightwidth = nathan.findElement(By.id("size"));
		int heightb =getheightwidth.getSize().getHeight();
	
		int widthb =getheightwidth.getSize().getWidth();
		System.out.println("Button Height is: " +heightb+"Button Width is"+widthb);
		
		//4.goto home page
		
		WebElement homepage=nathan.findElement(By.id("home"));
		//nathan.get("http://www.leafground.com/pages/Button.html");
		homepage.click();
		
		
	}

}
