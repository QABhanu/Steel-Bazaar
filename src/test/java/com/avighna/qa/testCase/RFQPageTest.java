package com.avighna.qa.testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.avighna.qa.base.Base;
import com.avighna.qa.pages.RFQPage;
import com.avighna.qa.pages.Homepage;
import com.avighna.qa.pages.LoginPage;


public class RFQPageTest extends Base {

    RFQPage RFQPage;

    public RFQPageTest(){
        super();

    }

    public WebDriver driver;
    
    @BeforeMethod

    public void setup(){
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
    }

    @Test 
    public void search () throws Throwable {

        RFQPage = new RFQPage(driver);
        RFQPage.search();
    }

    public void ValidateRFQForm() {
		
		
	}


    

}
