package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BankManagerLoginPage;
import pages.HomePage;

public class ManagerTest extends Base {
	
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
		homepage.clickOnBankManagerLogin();
		BankManagerLoginPage bmlp = new BankManagerLoginPage(driver);
		String actualurl = bmlp.geturl();
		
		String expecetdurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
		//Assert.assertEquals(actualurl, expecetdurl);
		
	}
	@Test(priority = 2)
	public void verifyuseradd() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.clickOnBankManagerLogin();
		BankManagerLoginPage bmlp = new BankManagerLoginPage(driver);
		bmlp.addCustomer("Ashu", "Kumar", "110091");
		
	}
	
	@AfterTest
	public void shutDown()
	{
		tearDown();
	}


}
