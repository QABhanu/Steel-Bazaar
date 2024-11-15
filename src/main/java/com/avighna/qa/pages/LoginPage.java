package com.avighna.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@alt='cartIcon' and contains(@class, 'cursor-pointer')]")
	private WebElement emailIconField;

	@FindBy(xpath="//button[text()=\"Login via email\"]")
	private WebElement emailLoginField;
	
	@FindBy(xpath="(//input[@name=\"email\" and @type= \"text\"])[4]")
	private WebElement emailAccountField;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[text()=\"Login\" and @type= \"submit\"]")
	private WebElement loginButton;
	
	public void ValidLogin(String email, String password) throws Throwable {
		emailIconField.click();
		emailLoginField.click();
	//	Thread.sleep(3000);
		emailAccountField.sendKeys(email);
	//	Thread.sleep(6000);
		passwordField.sendKeys(password);
	//	Thread.sleep(6000);
		loginButton.click();
		
	}
	
	public void ValidateLogin() {
		
	}
}


