package com.avighna.qa.testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.avighna.qa.base.Base;
import com.avighna.qa.pages.LoginPage;

public class LoginTest extends Base{
	
	LoginPage loginpage;
	
	public LoginTest() {
		super();
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
		
	}
	
	@Test
	public void LoginToPortal() throws Throwable {
		loginpage = new LoginPage(driver);
		loginpage.ValidLogin(prop.getProperty("email"), prop.getProperty("password"));
		

		
	}
	public void ValidateLogin() {
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
