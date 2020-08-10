package com.letskodeit.testclasses;

import com.letskodeit.base.BaseTest;
import com.letskodeit.base.CheckPoint;
import com.letskodeit.utilities.Constants;
import com.letskodeit.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @DataProvider(name = "invalidLogin")
    public Object[][] invalidLogin() {
        Object[][] testData = ExcelUtility.getTestData("invalid_credentials");
        return testData;
    }

    @BeforeClass
    public void setUp() {
        ExcelUtility.setExcelFile(Constants.EXCEL_FILE, "LoginTests");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("************** After Method***************");
        if (nav.isUserLoggedIn()) {
            nav.logOut();
            nav.login();
        }
    }

    @Test()
    public void testLogin() {
        nav = login.signInWith(Constants.DEFAULT_USERNAME, Constants.DEFAULT_PASSWORD);
        boolean headerResult = nav.verifyHeader();
        //Assert.assertTrue(headerResult); // Code stops, I fix this
        CheckPoint.mark("test-01",headerResult, "header verification");
        boolean result = nav.isUserLoggedIn();  // there are issues with this method also
        CheckPoint.markFinal("test-01", result, "login verification");
        //Assert.assertTrue(result);
    }

    @Test(dataProvider = "invalidLogin")
    public void testInvalidLogin(String username, String password) {
        nav = login.signInWith(username, password);
        boolean result = nav.isUserLoggedIn();
        Assert.assertFalse(result);
    }
}