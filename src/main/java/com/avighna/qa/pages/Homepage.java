package com.avighna.qa.pages;

import java.util.Locale.Category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
    
    WebDriver driver;

    public Homepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
    @FindBy(xpath = "(//input[@placeholder='Search anything in steel...'])[1]")
    private WebElement cataloguesearchfield;
     
    @FindBy(xpath = "//li[text()='CRNO catalogue 8']")
    private WebElement cataloguefind;
     
    @FindBy(xpath = "//img[@class='cursor-pointer' and @src='/static/media/footerLogo.0b4b88fa279567e1afede2ba2f373af4.svg']")
    private WebElement steelbazaarIcon;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div[1]/div[1]")
    private WebElement DropDown;

    @FindBy(xpath = "//a[text()='Raw / Semi Finished']")
    private WebElement CategoriesName;

    @FindBy(xpath = "//a[text()='Carbon Flat Rolled']")
    private WebElement SuperCategoriesName;

    @FindBy(xpath = "//a[text()='Hot-Rolled']")
    private WebElement MainCategoriesName;

    @FindBy(xpath = "//span[text()='Hot Rolled']")
    private WebElement CategoryNameOnDropDown;

    


   





     
    public void search(String searchText) throws Throwable {
		cataloguesearchfield.click();
		
		cataloguesearchfield.sendKeys("CRNO catalogue 8");

    
       if (cataloguefind != null){
        cataloguefind.click();
        System.out.println("catalogue found ");
       }
       else{
        System.out.println("catalogue not found ");
       }

       steelbazaarIcon.click();


       if (DropDown.isDisplayed() && DropDown.isEnabled()) {
        DropDown.click();
       }



       if (CategoriesName.isDisplayed() && CategoriesName.isEnabled()) {
        CategoriesName.click();
        
       }


       if (SuperCategoriesName.isDisplayed() && SuperCategoriesName.isEnabled()) {
        SuperCategoriesName.click();
        
       }

       if (MainCategoriesName.isDisplayed() && MainCategoriesName.isEnabled()) {

        MainCategoriesName.click();
        
       }

       if (CategoryNameOnDropDown.isDisplayed() && CategoryNameOnDropDown.isEnabled()) {
        CategoryNameOnDropDown.click();
        String categoryNameFromDropDown = CategoryNameOnDropDown.getText(); // Get the text of the dropdown category
        System.out.println("Category Name from Dropdown: " + categoryNameFromDropDown);

       
      }
    }
  }

        
      

       
       
	


