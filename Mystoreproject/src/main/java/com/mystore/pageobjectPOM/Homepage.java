/**
 * 
 */
package com.mystore.pageobjectPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * 
 */
public class Homepage {
	
	Actions act;

	@FindBy (xpath ="(//a[text()=\"Add to cart\"])[1]") private WebElement Addtocartbtn;
	
	@FindBy (xpath = "/button[text()=\"Continue Shopping\"]") private WebElement Continuecartbtn;
	@FindBy (xpath = "//u[text()='View Cart']") private WebElement Viewcartbutton;
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
		act = new Actions(driver);
	}
	public void Addproduct()
	{
		Reporter.log("adding product...", true);
		act.moveToElement(Addtocartbtn).build().perform();
		Addtocartbtn.click();
	}
	public void Viewcart() throws InterruptedException
	{
	
		Reporter.log("view product cart...", true);
		Thread.sleep(12000);
		Viewcartbutton.click();
	}


}

