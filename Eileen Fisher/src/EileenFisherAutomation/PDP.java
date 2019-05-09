package EileenFisherAutomation;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PDP {

	private static final TimeUnit SECONDS = null;
	public static WebDriver driver;
	public static Properties Prop;
	public static void main(String[] args) throws InterruptedException {
		
		Prop= new Properties();
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://eftest.eileenfisher.com/system-viscose-jersey-easy-pant-eevf-p1271?size_range=1786&colorid=1958#");
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//li[@class=\"header-country-switcher\"]")).click();
		 Select select=new Select(driver.findElement(By.xpath("//select[@id=\"bf_country\"]")));
		 select.selectByValue("US");
		 
	WebElement ele= driver.findElement(By.xpath("//div[@class=\"product-top-info\"]//div[@class=\"product-name\"]"));
	boolean b1=	 ele.isDisplayed();
    System.out.println(b1);
   String s1= ele.getText();
   System.out.println(s1);
    
   driver.findElement(By.xpath("//div[@id='product-options-wrapper']//div[@attribute-code='size']//div[2][@class='swatch-option text']")).click();
   driver.findElement(By.xpath("//button[contains(@id,'product-addtocart-button')]\r\n" + 
   		"")).click();
   Thread.sleep(3000);
 driver.findElement(By.xpath("//span[@class=\"counter qty\"]")).getText();
 
 driver.findElement(By.xpath("//a[@class=\"action showcart\"]")).click();
 
 //WebDriverWait wait= new WebDriverWait(driver,20);
 //WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='base']\r\n" + 
 		//"")));
 
 driver.manage().timeouts().implicitlyWait(3, SECONDS);
 //Wait wait=new FluentWait(driver).withTimeout(30, SECONDS).pollingEvery(5, SECONDS).ignoring(ElementNotFoundException);
 
		 

 
 
 
 
		 


	}

}
