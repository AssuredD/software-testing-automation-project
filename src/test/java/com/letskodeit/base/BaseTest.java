package com.letskodeit.base;

import com.letskodeit.pageclasses.*;
import com.letskodeit.utilities.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    public WebDriver driver;
    protected String baseUrl;
    protected LoginPage login;
    protected NavigationPage nav;
    protected SearchBarPage search;
    protected ResultsPage result;
    protected CategoryFilterPage category;
    protected PracticePage pra;

    @BeforeClass
    @Parameters({"browser"})
    public void CommonSetUp(String browser) {
        driver = WebDriverFactory.getInstance().getDriver(browser);
        baseUrl = Constants.BASE_URL;
        driver.get(baseUrl);
        nav = new NavigationPage(driver);
        pra = new PracticePage(driver);
        login = nav.login();
    }

    @BeforeMethod
    public void methodSetUp(){
        CheckPoint.clearHashMap();
    }

    @AfterClass
    public void commontearDown() {
       //WebDriverFactory.getInstance().quitDriver();
    }
}
