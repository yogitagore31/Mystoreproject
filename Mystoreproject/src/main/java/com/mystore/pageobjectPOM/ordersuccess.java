package com.mystore.pageobjectPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ordersuccess {
	
	@FindBy (xpath="//p[contains(text(), 'Congratulations!')]")
	private WebElement sucessmsg;
	
	
public ordersuccess(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public String stringText() {
	
	Reporter.log("Validating order confirmed....", true);
	String result = sucessmsg.getText();
	return result;
	
}

}
