package EileenFisherAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://html.com/input-type-file/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@name=\"fileupload\"]")).sendKeys("C:\\Users\\suksahni1\\Desktop\\ManualMapping.xlsx");
		 
	}

}
