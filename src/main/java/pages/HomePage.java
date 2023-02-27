package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
WebDriver driver;

public HomePage(WebDriver driver)
{
	this.driver = driver;
	
}
	
	public void clickOnCustomerLogin()
	{
		driver.findElement(By.xpath("//button[text() ='Customer Login']")).click();
	}

	
	public void clickOnBankManagerLogin()
	{
		driver.findElement(By.xpath("//button[text() ='Bank Manager Login']")).click();
	}
	
	
	public void selectCustomer()
	{
		WebElement dropdown = driver.findElement(By.id("userSelect"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
	}
	
	public void selectCustomer(String name)
	{
		WebElement dropdown = driver.findElement(By.id("userSelect"));
		Select select = new Select(dropdown);
		select.selectByVisibleText(name);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
	}

}
