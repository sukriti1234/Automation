package com.ef.qa.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ef.qa.base.TestBase;
import com.ef.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
    LoginPage loginPage;
    
    public LoginPageTest() {
    super();
    }
	
	@BeforeMethod
	public void setUP() {
	initialization();
	loginPage=new LoginPage();
	}
	
	@Test
	public void loginPageTitleTest() {
    String title=loginPage.validateLoginPageTitle();
    System.out.println(title);
    
	}
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();	
	}
}
