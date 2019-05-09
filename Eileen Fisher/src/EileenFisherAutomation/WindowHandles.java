package EileenFisherAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains( text(), \"Good PopUp #1\")]")).click();
		
		Set <String> handler=driver.getWindowHandles();
		Iterator <String> it= handler.iterator();
		
        String parentWindowID=it.next();
        System.out.println("parent window id:" +parentWindowID);
        
        String childWindowId=it.next();
        System.out.println("child window id:" +childWindowId);
        
        driver.switchTo().window(childWindowId);
        Thread.sleep(2000);
        System.out.println("child window pop title is:"+driver.getTitle());
        driver.close();
        
        driver.switchTo().window(parentWindowID);
        Thread.sleep(2000);
        System.out.println("parent window pop title is:"+driver.getTitle());
        driver.close();
        
        
        
        
	}

}
