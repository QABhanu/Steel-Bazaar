package com.avighna.qa.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RFQPage {

    WebDriver driver;
    private WebDriverWait wait;

    
    public RFQPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    
    @FindBy(xpath = "//button[@type='button' and text()='Get Quote'] [1]")
    private WebElement GetQuoteButton;

    @FindBy(xpath = "(//input[@placeholder='Select Here'])[1]")
    private WebElement SuperCategory;

    @FindBy(xpath = "//li[text()='Carbon Flat Rolled']")
    private WebElement SuperCategoryDropdown;

    @FindBy(xpath = "(//input[@placeholder='Select Here'])[2]")
    private WebElement MainCategory;

    @FindBy(xpath = "//li[text()='Cold-Rolled']")
    private WebElement MainCategoryDropdown;

    @FindBy(xpath = "(//input[@placeholder='Select Here'])[3]")
    private WebElement ProductCategory;

    @FindBy(xpath = "//li[text()='Cold Rolled']")
    private WebElement ProductCategoryDropdown;

    @FindBy(xpath = "(//input[@placeholder='Select Here'])[4]")
    private WebElement Standard;

    @FindBy(xpath = "//li[text()='IS 277:2018']")
    private WebElement StandardDropdown;

    @FindBy(xpath = "(//input[@placeholder='Select Here'])[5]")
    private WebElement Grade;

    @FindBy(xpath = "//li[text()='CR0']")
    private WebElement GradeDropdown;

    @FindBy(xpath = "//div[@id='select-Shape*']")
    private WebElement Shape;

    @FindBy(xpath = "//li[text()='Plate']")
    private WebElement ShapeDropdown;











    // Helper method to select a dropdown option
    private void selectDropdownOption(WebElement dropdown, WebElement option) {
        wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(option)).click();
    }

    // Main search method
    public void search() throws Throwable {
        // Wait for and click 'Get Quote' button
        wait.until(ExpectedConditions.elementToBeClickable(GetQuoteButton)).click();

        // Handle Super Category dropdown
        selectDropdownOption(SuperCategory, SuperCategoryDropdown);

        // Handle Main Category dropdown
        selectDropdownOption(MainCategory, MainCategoryDropdown);

        // Handle Product Category dropdown
        selectDropdownOption(ProductCategory, ProductCategoryDropdown);

        //Handle Standrad dropdown
        selectDropdownOption(Standard, StandardDropdown);

        // Handle Grade Dropdown
        selectDropdownOption(Grade, GradeDropdown);


        //handle Shape Dropdown
        selectDropdownOption(Shape, ShapeDropdown);
    }
}
