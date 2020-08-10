package com.letskodeit.testclasses;

import com.letskodeit.base.BaseTest;
import com.letskodeit.pageclasses.PracticePage;
import com.letskodeit.utilities.Constants;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticePageTests extends BaseTest {


    @BeforeClass
    public void setUp() {
        nav = login.signInWith(Constants.DEFAULT_USERNAME, Constants.DEFAULT_PASSWORD);
        pra.practice();
    }

    @Test
    public void verifyTitle() {
        PracticePage pageTitle = new PracticePage(driver);
        boolean title = pageTitle.verifyHeaderText();
        Assert.assertTrue(title);

    }

    @Test
    public void clickRadioButtonBMW(){
        pra.setRADIO_BUTTON_BMW();
        boolean radioBMW = pra.verifyradioBMW();
        Assert.assertTrue(radioBMW);
    }

    @Test
    public void clickRadioBtnBenz() {
        pra.setRADIO_BUTTON_BENZ();
        boolean radioBenz = pra.verifyradioBenz();
        Assert.assertTrue(radioBenz);
    }

    @Test
    public void clickRadioBtnHonda() {
        pra.setRADIO_BUTTON_HONDA();
        boolean radioHonda = pra.verifyradioHonda();
        Assert.assertTrue(radioHonda);
    }

    @Test
    public void selectDropdownBmw() {
        pra.setDROPDOWN_BMW();
        boolean dropdownBMW = pra.verifyBMWDropdownSelected();
        Assert.assertTrue(dropdownBMW);
    }

    @Test
    public void selectDropdownBenz(){
        pra.setDROPDOWN_BENZ();
        boolean dropdownBenz = pra.verifyBenzDropdownSelected();
        Assert.assertTrue(dropdownBenz);

    }

    @Test
    public void selectDropdownHonda(){
        pra.setDROPDOWN_HONDA();
        boolean dropdownHonda = pra.verifyHondaDropdownSelected();
        Assert.assertTrue(dropdownHonda);

    }
    @Test
    public void multipleSelectionApple(){
        pra.setMULTI_APPLE();
        boolean multiApple = pra.verifyAppleSelected();
        Assert.assertTrue(multiApple);
    }
    @Test
    public void multipleSelectionOrange() {
        pra.setMULTI_ORANGE();
        boolean multiOrange = pra.verifyOrangeSelected();
        Assert.assertTrue(multiOrange);
    }
    @Test
    public void multipleSelectionPeach() {
        pra.setMULTI_PEACH();
        boolean multiPeach = pra.verifyPeachSelected();
        Assert.assertTrue(multiPeach);
    }
    @Test
    public void CheckboxBMW(){
        pra.setCHECKBOX_BMW();
        boolean checkBMW = pra.verifySetCHECKBOX_BMW();
        Assert.assertTrue(checkBMW);
    }
    @Test
    public void CheckboxBenz(){
        pra.setCHECKBOX_BENZ();
        boolean checkBenz = pra.verifySetCHECKBOX_BENZ();
        Assert.assertTrue(checkBenz);
    }
    @Test
    public void CheckboxHonda(){
        pra.setCHECKBOX_HONDA();
        boolean checkHonda = pra.verifySetCHECKBOX_HONDA();
        Assert.assertTrue(checkHonda);
    }
    @Test
    public void openWindow(){
        pra.setOPEN_WINDOW();

    }
    @Test
    public void switchWindow(){
        pra.openNewWindow();
        boolean checkMyCourses = pra.verifyOpenedWindow();
        Assert.assertTrue(checkMyCourses);

    }
    @Test
    public void alert(){
        pra.switchAlert(Constants.TESTER_NAME);
    }
    @Test
    public void hideTextBox(){
        pra.setHIDE_TBOX();
        boolean hideTextBox = pra.verifyTextBoxIsHidden();
        Assert.assertFalse(hideTextBox);
    }
    @Test
    public void showTextBox(){
        pra.setSHOW_TBOX();
        boolean showTextBox = pra.verifyTextBoxIsDisplayed();
        Assert.assertTrue(showTextBox);
    }
    @Test
    public void mouseHover() {
        pra.setMOUSE_HOVER();
        boolean subEl = pra.verifyMouseHover();
        Assert.assertTrue(subEl);
    }
    @Test
    public void tableTextAuth1(){
        pra.getWebTableAuthor1();
        boolean auth1 = pra.verifyGetWebTableAuthor1();
        Assert.assertTrue(auth1);
    }
    @Test
    public void tableTextAuth2() {
        pra.getWebTableAuthor2();
        boolean auth2 = pra.verifyGetWebTableAuthor2();
        Assert.assertTrue(auth2);
    }
    @Test
    public void tableTextAuth3() {
        pra.getWebTableAuthor3();
        boolean auth3 = pra.verifyGetWebTableAuthor3();
        Assert.assertTrue(auth3);
    }
    @Test
    public void tableTextCourse1() {
        pra.getWebTableCourse1();
        boolean course1 = pra.verifyGetWebTableCourse1();
        Assert.assertTrue(course1);
    }
    @Test
    public void tableTextCourse2() {
        pra.getWebTableCourse2();
        boolean course2 = pra.verifyGetWebTableCourse2();
        Assert.assertTrue(course2);
    }
    @Test
    public void tableTextCourse3() {
        pra.getWebTableCourse3();
        boolean course3 = pra.verifyGetWebTableCourse3();
        Assert.assertTrue(course3);
    }
    @Test
    public void tableTextPrice1() {
        pra.getWebTablePrice1();
        boolean pri1 = pra.verifyGetWebTablePrice1();
        Assert.assertTrue(pri1);
    }
    @Test
    public void tableTextPrice2() {
        pra.getWebTablePrice2();
        boolean pri2 = pra.verifyGetWebTablePrice2();
        Assert.assertTrue(pri2);
    }
    @Test
    public void tableTextPrice3() {
        pra.getWebTablePrice3();
        boolean pri3 = pra.verifyGetWebTablePrice3();
        Assert.assertTrue(pri3);
    }

    @AfterClass
    public void tearDown () {
        //WebDriverFactory.getInstance().quitDriver();

    }

}

