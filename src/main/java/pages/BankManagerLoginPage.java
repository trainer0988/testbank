package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankManagerLoginPage {
	
	
WebDriver driver;

public BankManagerLoginPage(WebDriver driver)
{
	this.driver = driver;
	
}
	
	public void clickOnAddCustomer()
	{
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
	}

	
	public void addCustomer(String fname, String lname, String pcode)
	{
		clickOnAddCustomer();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(fname);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(lname);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(pcode);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	}
	
	public String geturl() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
}
