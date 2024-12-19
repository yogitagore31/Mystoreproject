package com.mystore.pageobjectPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorderconfirmation {
	
	@FindBy (xpath="//a[text()=\"Place Order\"]") private WebElement PlaceOrderbtn;
	
	
	public Placeorderconfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this key to initialize page objects 
	}	
	
	public void Clickonplaceorderbtn() {
		PlaceOrderbtn.click();
		
	}

}
