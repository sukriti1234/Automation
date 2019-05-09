package EileenFisherAutomation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EFTest {
	public static WebDriver driver;
	public static Properties Prop;

	public static void main(String[] args) throws InterruptedException {
		Prop= new Properties();
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	 driver= new ChromeDriver();
	 
	 driver.get("https://eftest.eileenfisher.com/system-viscose-jersey-easy-pant-eevf-p1271?size_range=1786&colorid=1958#");
	driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    boolean b1=driver.findElement(By.xpath("//li[@class='header-country-switcher']//span")).isDisplayed();
    System.out.println(b1);
    Thread.sleep(3000);
    
    //country switcher
    Select select=new Select(driver.findElement(By.xpath("//select[@id=\"bf_country\"]")));
    select.selectByIndex(0);
   
    

 
 
 
 
 
	}	

}
