package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	
	
	public static WebDriver driver=null;
	public void setup()
	{
		if(driver==null)
		{
		WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
	}
	
	
	public void getHomePage()
	{

		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}

	public void tearDown()
	{
		driver.quit();
	}
}
