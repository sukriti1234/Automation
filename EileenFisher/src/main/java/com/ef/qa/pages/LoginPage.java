package com.ef.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ef.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory
	@FindBy(xpath="//a[@aria-label=\"Login or Sign up\"]")
	 WebElement loginLink;
	
	//Initialising page objects
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
	return driver.getTitle();	
	}
}

