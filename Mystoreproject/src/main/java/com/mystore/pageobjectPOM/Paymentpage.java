package com.mystore.pageobjectPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Paymentpage {
	
	
	@FindBy (name="name_on_card") 
	private WebElement nameoncard;
	
	@FindBy (name="card_number") 
	private WebElement cardnumber;
	
	@FindBy (name="cvc") 
	private WebElement cvc;
	
	@FindBy (name="expiry_month") 
	private WebElement cardexpirymonth;
	
	@FindBy (name="expiry_year") 
	private WebElement Cardexpiryyear;
	
	@FindBy (id="submit")
	private WebElement submitpayment;
	
	
	
	public Paymentpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Enternameoncard() {
		Reporter.log("Enternameoncard....", true);
		nameoncard.sendKeys("Admin");	
	}
	public void EnterCardnumber() {
		Reporter.log("entercardnum....", true);
		cardnumber.sendKeys("1234567812345678");
	}
	public void entercvc() {
	Reporter.log("entering cvc...", true);
	cvc.sendKeys("133");
	}
	
	public void enterexpirymonth() {
	Reporter.log("Entering expiry month", true);
	cardexpirymonth.sendKeys("08");
	}	
	
	public void enterexpiryyear() {
		Reporter.log("Entering expiry year", false);
		Cardexpiryyear.sendKeys("2026");
	}
	public void submitpaydetails() {
	Reporter.log("clicking on submit paydetails", true);
	submitpayment.click();
	}}

