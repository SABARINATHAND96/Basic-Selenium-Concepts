import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleScroll 
{

 
 public void scrollDown()
         {
         // System.setProperty("webdriver.gecko.driver","C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\geckodriver-v0.31.0-win64");
          // WebDriver driver = new FirefoxDriver();
            
            //to perform Scroll on application using Selenium
            //JavascriptExecutor js = (JavascriptExecutor) driver;
         //   js.executeScript("window.scrollBy(0,350)", "");
            
            
            
            System.setProperty("webdriver.gecko.driver","C:\\Users\\SABARINATHAN D\\Downloads\\Compressed\\geckodriver-v0.31.0-win64");
            WebDriver driver = new FirefoxDriver();	
            driver.navigate().to("http://www.leafground.com/home.html");
            JavascriptExecutor ss=(JavascriptExecutor) driver;
            ss.executeScript("Window.scrollBy(100,1000)");
            
            
         }
}