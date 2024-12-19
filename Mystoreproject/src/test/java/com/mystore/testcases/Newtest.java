package com.mystore.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobjectPOM.Homepage;
import com.mystore.pageobjectPOM.Indexpage;
import com.mystore.pageobjectPOM.Loginpage;
import com.mystore.pageobjectPOM.Paymentpage;
import com.mystore.pageobjectPOM.Placeorderconfirmation;
import com.mystore.pageobjectPOM.ordersuccess;
import com.mystore.pageobjectPOM.proceedtocheckout;

public class Newtest {
	

	WebDriver driver = new ChromeDriver();
	
	
	@Test
	public void testrun() throws InterruptedException

	{
	
//		WebDriver driver;
		
		Homepage homepage;
		Indexpage indexpage;
		Loginpage loginpage;
		ordersuccess orderpage;
		Paymentpage paypage;
		Placeorderconfirmation orderconfirmationpage;
		proceedtocheckout checkoutpage;
		
	driver.get("https://automationexercise.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	 homepage = new Homepage(driver) ;
	 indexpage = new Indexpage(driver);
	 loginpage = new Loginpage(driver);
	 orderpage = new ordersuccess(driver);
	 paypage = new Paymentpage(driver);
	 orderconfirmationpage= new Placeorderconfirmation(driver);
	 checkoutpage = new proceedtocheckout(driver);
	 
	 indexpage.validateLogInbtn();
	 indexpage.ClickOnLoginbtn();
	 loginpage.enteruseremail("yogita@yopmail.com");
	 loginpage.enteruserpass("test@123");
	 loginpage.Clickonlogintobtn();
	 homepage.Addproduct();
	 homepage.Viewcart();
	 checkoutpage.Clickonproceedcheckoutbtn();
	 orderconfirmationpage.Clickonplaceorderbtn();
	 paypage.Enternameoncard();
	 paypage.EnterCardnumber();
	 paypage.entercvc();
	 paypage.enterexpirymonth();
	 paypage.enterexpiryyear();
	 paypage.submitpaydetails();
	 
	 String actual = orderpage.stringText();
		String expected="Congratulations! Your order has been confirmed!";
		Assert.assertEquals(actual, expected, "Both value matches");
	}

	

}
