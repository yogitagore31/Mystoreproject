/**
 * 
 */
package com.mystore.pageobjectPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 */
public class proceedtocheckout {

	
	@FindBy (xpath ="//a[text()=\"Proceed To Checkout\"]") private WebElement proceedcheckoutbtn;
	
	public proceedtocheckout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this key to initialize page objects 
	}	
	
	public void Clickonproceedcheckoutbtn() {
		proceedcheckoutbtn.click();
		
	}
	
	
}
