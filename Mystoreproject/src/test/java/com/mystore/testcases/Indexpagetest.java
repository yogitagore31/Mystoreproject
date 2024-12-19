/**

 * 
 */
package com.mystore.testcases;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.Base.Base;
import com.mystore.pageobjectPOM.Homepage;
import com.mystore.pageobjectPOM.Indexpage;
import com.mystore.pageobjectPOM.Loginpage;
import com.mystore.pageobjectPOM.Paymentpage;
import com.mystore.pageobjectPOM.Placeorderconfirmation;
import com.mystore.pageobjectPOM.ordersuccess;
import com.mystore.pageobjectPOM.proceedtocheckout;

/**
 * 
 */
public class Indexpagetest extends Base {	

	WebDriver driver;
	Homepage homepage;
	Indexpage indexpage;
	Loginpage loginpage;
	ordersuccess orderpage;
	Paymentpage paypage;
	Placeorderconfirmation orderconfirmationpage;
	proceedtocheckout checkoutpage;
	
//	@SuppressWarnings("deprecation")
//	@BeforeClass
//	public void classMethod() throws IOException
//	{
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://automationexercise.com/");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		 
//	}

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void enterdetails() throws EncryptedDocumentException, IOException, InterruptedException	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		
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
		 //homepage.Viewcart();
		 checkoutpage.Clickonproceedcheckoutbtn();
		 orderconfirmationpage.Clickonplaceorderbtn();
		 paypage.Enternameoncard();
		 paypage.EnterCardnumber();
		 paypage.entercvc();
		 paypage.enterexpirymonth();
		 paypage.enterexpiryyear();
		 paypage.submitpaydetails();
	}

	@Test()

	public void testFirstNameTabDisability()

	{
		String actual = orderpage.stringText();
		String expected="Congratulations! Your order has been confirmed!";
		Assert.assertEquals(actual, expected, "Both value matches");

	}

//	//@Test(priority = 2)
//
//	public void testEmailTabDisability()
//
//	{
//
//		boolean b = fKProfileInformation.isEnabledFirstName();
//
//		System.out.println("Is Email activated? --> " + b);
//
//		// if(b==false) {System.out.println("Test2 = Pass");}
//
//		// else {System.out.println("Test2 = Fail");}
//
//		Assert.assertEquals(b, false);
//
//	}
//
//	@Test(priority = 3)
//
//	public void testMobileNumberTabDisability()
//
//	{
//
//		boolean c = fKProfileInformation.isEnabledMobileNo();
//
//		System.out.println("Is MobileNo activated? --> " + c);
//
//		// if(c==false) {System.out.println("Test3 = Pass");}
//
//		// else {System.out.println("Test3 = Fail");}
//
//		Assert.assertEquals(c, true);
//
//	}

	

	@AfterClass

	public void closeBrowser()

	{

	driver.quit();

	}
}
