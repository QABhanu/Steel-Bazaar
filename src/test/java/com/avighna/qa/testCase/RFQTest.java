package com.avighna.qa.testCase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.avighna.qa.base.Base;
import com.avighna.qa.pages.RFQPage;

public class RFQTest extends Base {

    private WebDriver driver;
    private RFQPage rfqPage;

    public RFQTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
        rfqPage = new RFQPage(driver);  // Initialize RFQPage object
    }

    @Test
    public void search() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Example usage if needed: js.executeScript("document.body.style.zoom = '85%';");

        rfqPage.search("Null");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
           //driver.quit();  // Close the browser after test
        }
    }
}

