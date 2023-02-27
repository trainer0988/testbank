package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BankManagerLoginPage;
import pages.HomePage;

public class CustomerTest extends Base {
	
	@BeforeClass
	public void doSetup()
	{
		setup();
	}
	
	@BeforeMethod
	public void navigateToHomePage()
	{
		getHomePage();
	}
	
	@Test(priority = 1)
	public void doManagerLogin() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.clickOnCustomerLogin();
		homepage.selectCustomer();
		
		homepage.clickOnLogin();
		
	}
	

}
