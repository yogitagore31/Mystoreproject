
package com.mystore.pageobjectPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Loginpage {
	
	@FindBy (name ="email") private WebElement email;
	@FindBy (xpath="//input[@name=\"password\"]") private WebElement password ;
	@FindBy (xpath = "//button[text()=\"Login\"]") private WebElement logintobtn;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this key to initialize page objects 
	}
	
	public void enteruseremail (String emailid) {
		Reporter.log("user email entered", true);
		//email.sendKeys("yogita@yopmail.com");
		email.sendKeys(emailid);
	}
	public void enteruserpass(String pass) {
		Reporter.log("entered password", true);
		password.sendKeys(pass);
	}
	public void Clickonlogintobtn() {
		logintobtn.click();
		//return new Homepage();
	}
}
