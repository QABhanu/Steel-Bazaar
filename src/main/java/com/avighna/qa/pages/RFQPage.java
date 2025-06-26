package com.avighna.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RFQPage {

   private WebDriver driver;
    private Actions actions;

    // --- Constructor ---
    public RFQPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    // --- Web Elements ---

    @FindBy(xpath = "//div[contains(@class, 'webCloseButton')]/img[@alt='closeIcon']")
    private WebElement closeIcon;

    @FindBy(xpath = "//button[normalize-space(text())='Get Quote']")
    private WebElement GetQuoteButton;
    
    @FindBy(xpath = "//input[@placeholder='Enter your Full Name']")
    private WebElement InputName;

    @FindBy(xpath = "//input[@name='mobileNumber']")
    private WebElement InputNumber;

    @FindBy(xpath = "//input[@placeholder='Enter your GSTIN Number']")
    private WebElement inputGST;
    
    @FindBy(xpath ="//input[@role='combobox' and @placeholder='Select Here']")
    private WebElement ProductCategoryDropdown;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Select Here' and @value='Hot Rolled']")
    private WebElement Option;    
    




     // --- Actions / Methods ---

    public void search(String searchText) throws InterruptedException {
         Thread.sleep(5000);
        closeIcon.click();


        Thread.sleep(2000);
        GetQuoteButton.click();

        Thread.sleep(2000);
        InputName.click();
        InputName.sendKeys("Bhawesh Sah");

        Thread.sleep(3000);
        InputNumber.click();
        InputNumber.sendKeys("6396505156");


         Thread.sleep(3000);
        inputGST.click();
        inputGST.sendKeys("10AAJCA1389G1ZY");


        Thread.sleep(2000);
        ProductCategoryDropdown.click();
        ProductCategoryDropdown.sendKeys("Hot");

        Thread.sleep(2000);
        Option.click();
        
        
}

}