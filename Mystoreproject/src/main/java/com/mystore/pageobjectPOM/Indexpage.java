package com.mystore.pageobjectPOM;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Indexpage {

	
	@FindBy (xpath=" //a[text()=' Signup / Login']") private WebElement loginbtn;
	
	
	public Indexpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this key to initialize page objects 
	}
	
	public boolean validateLogInbtn() {
		loginbtn.isDisplayed();
		Reporter.log("LoginBtn Displayed", true);
		return true;
	}
	        //return type is void, getting error at line 25
//	public void ClickOnLoginbtn() {
//		Reporter.log("Clicking on LogIn button", true);
//		loginbtn.click();	
//		return new Loginpage();
//		
//	}
	//this ClickOnLoginbtn function/method will return Loginpage object
	public void ClickOnLoginbtn() {
		Reporter.log("Clicking on LogIn button", true);
		loginbtn.click();	
		//return new Loginpage();
		
	}
	
}
