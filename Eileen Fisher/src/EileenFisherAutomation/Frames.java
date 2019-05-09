package EileenFisherAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.switchTo().frame("Mainpanel");
		 
	}

}
