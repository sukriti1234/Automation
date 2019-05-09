package firsttestngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTestNGFile {
WebDriver driver;
	
  @BeforeMethod
  public void SetUp() {
  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
  driver= new ChromeDriver();
  driver.manage().deleteAllCookies();
  driver.manage().window().maximize();
  driver.get("https://www.google.com");
  }
	
 @Test(invocationCount=10)
 public void googleTitleTest() {
 String title=driver.getTitle();
 System.out.println(title);
 
 }
 
  
	 
 @AfterMethod
 public void tearDown() {
 driver.close();
 
 

}
}
