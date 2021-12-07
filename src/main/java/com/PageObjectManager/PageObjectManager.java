package com.PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

	public static WebDriver driver;

	public PageObjectManager(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Sign in

	@FindBy(xpath = "//a[@class='login']")
	public static WebElement sigin;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getSigin() {
		return sigin;
	}
	
	
	//email address

	public static WebElement getEmailaddress() {
		return emailaddress;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public static WebElement emailaddress;
	///////////////////////////////////////////////
	
	//create account

 	@FindBy(xpath = "//button[@id='SubmitCreate']")
	  public static WebElement create;

	public static WebElement getCreate() {
		return create;
	}

	//Title
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	public static WebElement title;

	public static WebElement getTitle() {
		return title;
	}
	
	//customer name
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public static WebElement firstname;

	public static WebElement getFirstname() {
		return firstname;
	}

	
	

}
