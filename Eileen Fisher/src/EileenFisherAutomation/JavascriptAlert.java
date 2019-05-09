package EileenFisherAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class JavascriptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Alert alert= driver.switchTo().alert();
		  
		 alert.accept();
	System.out.println( alert.getText());
		 alert.dismiss();

	}

}
