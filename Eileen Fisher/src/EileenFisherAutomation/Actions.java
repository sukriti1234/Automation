package EileenFisherAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions {

	
	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://spicejet.com");
		 driver.manage().window().maximize();
		 
		 Actions action=new Actions();
		 

	}

}
