package com.letskodeit.pageclasses;

import com.letskodeit.base.BasePage;
import com.letskodeit.utilities.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PracticePage extends BasePage {

    public PracticePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebDriver driver;
    private String Url = "http://letskodeit.teachable.com/p/practice";
    private String RADIO_BUTTON_BMW = "id=>bmwradio";
    private String RADIO_BUTTON_BENZ = "id=>benzradio";
    private String RADIO_BUTTON_HONDA = "id=>hondaradio";
    private String PRACTICE_LINK = "xpath=>//a[@href='/pages/practice']";
    private String DROPDOWN_BMW = "xpath=>//option[@value='bmw']";
    private String DROPDOWN_BENZ = "xpath=>//option[@value='benz']";
    private String DROPDOWN_HONDA = "xpath=>//option[@value='honda']";
    private String MULTI_APPLE = "xpath=>//option[@value='apple']";
    private String MULTI_ORANGE = "xpath=>//option[@value='orange']";
    private String MULTI_PEACH = "xpath=>//option[@value='peach']";
    private String CHECKBOX_BMW = "id=>bmwcheck";
    private String CHECKBOX_BENZ = "id=>benzcheck";
    private String CHECKBOX_HONDA = "id=>hondacheck";
    private String OPEN_WINDOW = "id=>openwindow";
    private String NAME_TEXT_FIELD = "id=>name";
    private String ALERT_BUTTON = "id=>alertbtn";
    private String CONFIRM_BUTTON = "id=>confirmbtn";
    private String ENROLLED = "xpath=>//a[@href='/courses/enrolled']";
    private String HIDE_TBOX = "id=>hide-textbox";
    private String SHOW_TBOX = "id=>show-textbox";
    private String TBOX = "id=>displayed-text";
    private String MOUSE_HOVER = "id=>mousehover";
    private String SUB_TOP = "xpath=>//div[@class ='mouse-hover-content']//a[text()='Top']";
    private String TABLE_ROWS = "xpath=>//table[@class='table-display']/tbody/tr";
    private String BEFORE_XPATH = "xpath=>//table[@class='table-display']/tbody/tr[";
    private String AUTHOR1 = "xpath=>//table[@class='table-display']/tbody/tr[2]/td[1]";
    private String AUTHOR2 = "xpath=>//table[@class='table-display']/tbody/tr[3]/td[1]";
    private String AUTHOR3 = "xpath=>//table[@class='table-display']/tbody/tr[4]/td[1]";
    private String TABLE_COURSE1 = "xpath=>//table[@class='table-display']/tbody/tr[2]/td[2]";
    private String TABLE_COURSE2 = "xpath=>//table[@class='table-display']/tbody/tr[3]/td[2]";
    private String TABLE_COURSE3 = "xpath=>//table[@class='table-display']/tbody/tr[4]/td[2]";
    private String TABLE_PRICE1 = "xpath=>//table[@class='table-display']/tbody/tr[2]/td[3]";
    private String TABLE_PRICE2 = "xpath=>//table[@class='table-display']/tbody/tr[3]/td[3]";
    private String TABLE_PRICE3 = "xpath=>//table[@class='table-display']/tbody/tr[4]/td[3]";


    /***
     * Click on practice page link
     */
    public void practice() {
        elementClick(PRACTICE_LINK, "Practice Link");
    }

    /***
     * Verify practice page is url
     * @return
     */
    public boolean isOpen() {
        return Url.equalsIgnoreCase(driver.getCurrentUrl());

    }

    /***
     * Verify practice page header
     * @return
     */
    public boolean verifyHeaderText() {
        WebElement linkText = getElement(PRACTICE_LINK, "Practice Link");
        return Util.verifyTextContains(linkText.getText(), "Practice");
    }

    /***
     * Click on radio button BMW
     */
    public void setRADIO_BUTTON_BMW() {
        elementClick(RADIO_BUTTON_BMW, "BMW");
    }

    /***
     * Verify radio buttun BMW is selected
     * @return
     */
    public boolean verifyradioBMW() {
        WebElement radioBtnBMW = getElement(RADIO_BUTTON_BMW, "bmw");
        return isSelected(radioBtnBMW, "Radio BMW");
    }

    /***
     * Click on radio button benz
     */
    public void setRADIO_BUTTON_BENZ() {
        elementClick(RADIO_BUTTON_BENZ, "BENZ");
    }

    /***
     * Verify radio button benz is selected
     * @return
     */
    public boolean verifyradioBenz() {
        WebElement radioBtnBMW = getElement(RADIO_BUTTON_BENZ, "bmw");
        return isSelected(radioBtnBMW, "Radio BENZ");
    }

    /***
     * Click on radio button honda
     */
    public void setRADIO_BUTTON_HONDA() {
        elementClick(RADIO_BUTTON_HONDA, "HONDA");
    }

    /***
     * Verify radio button honda is selected
     * @return
     */
    public boolean verifyradioHonda() {
        WebElement radioBtnBMW = getElement(RADIO_BUTTON_HONDA, "honda");
        return isSelected(radioBtnBMW, "Radio HONDA");
    }

    /***
     * Click on bmw dropdown
     * @param
     */
    public void setDROPDOWN_BMW() {
        elementClick(DROPDOWN_BMW, "BMW");
    }

    public boolean verifyBMWDropdownSelected() {
        WebElement dropdownOptionBMW = getElement(DROPDOWN_BMW, "bmw");
        return isSelected(dropdownOptionBMW, "Dropdown BMW");
    }

    /***
     * Click on bmw dropdown
     * @param
     */
    public void setDROPDOWN_BENZ() {
        elementClick(DROPDOWN_BENZ, "BENZ");
    }

    public boolean verifyBenzDropdownSelected() {
        WebElement dropdownOptionBenz = getElement(DROPDOWN_BENZ, "benz");
        return isSelected(dropdownOptionBenz, "Dropdown BENZ");
    }


    /***
     * Click on bmw dropdown
     * @param
     */
    public void setDROPDOWN_HONDA() {
        elementClick(DROPDOWN_HONDA, "Honda");
    }

    public boolean verifyHondaDropdownSelected() {
        WebElement dropdownOptionHonda = getElement(DROPDOWN_HONDA, "bmw");
        return isSelected(dropdownOptionHonda, "Dropdown HONDA");
    }

    /***
     * Click on multiple select apple
     */

    public void setMULTI_APPLE() {
        elementClick(MULTI_APPLE, "Apple");
    }

    /***
     * verify multiple select apple is selected
     * @return
     */
    public boolean verifyAppleSelected() {
        WebElement appl = getElement(MULTI_APPLE, "Apple");
        return isSelected(appl, "Multiple APPLE");

    }

    /***
     * Click on multiple select orange
     */
    public void setMULTI_ORANGE() {
        elementClick(MULTI_ORANGE, "Orange");
    }

    /***
     * verify multiple select orange is selected
     */

    public boolean verifyOrangeSelected() {
        WebElement orag = getElement(MULTI_ORANGE, "Orange");
        return isSelected(orag, "Multiple ORANGE");
    }

    /***
     *  Click on multiple select peach
     */
    public void setMULTI_PEACH() {
        elementClick(MULTI_PEACH, "Peach");
    }

    /***
     * verify multiple select peach is selected
     * @return
     */
    public boolean verifyPeachSelected() {
        WebElement pea = getElement(MULTI_PEACH, "Peach");
        return isSelected(pea, "Multiple PEACH");
    }

    /***
     * Click on checkbox BMW
     */
    public void setCHECKBOX_BMW() {
        elementClick(CHECKBOX_BMW, "BMW");

    }

    /***
     * Verify Checkbox BMW is ticked
     */
    public boolean verifySetCHECKBOX_BMW() {
        WebElement carBMW = getElement(CHECKBOX_BMW, "BMW");
        return isSelected(carBMW, "Checkbox BMW");
    }

    /***
     * Click on checkbox BENZ
     */
    public void setCHECKBOX_BENZ() {
        elementClick(CHECKBOX_BENZ, "Benz");

    }

    /***
     * Verify Checkbox BENZ is ticked
     */
    public boolean verifySetCHECKBOX_BENZ() {
        WebElement carBenz = getElement(CHECKBOX_BENZ, "Benz");
        return isSelected(carBenz, "Checkbox BENZ");
    }

    /***
     * Click on checkbox HONDA
     */
    public void setCHECKBOX_HONDA() {
        elementClick(CHECKBOX_HONDA, "Honda");

    }

    /***
     * Verify Checkbox HONDA is ticked
     */
    public boolean verifySetCHECKBOX_HONDA() {
        WebElement carHonda = getElement(CHECKBOX_HONDA, "Honda");
        return isSelected(carHonda, "Checkbox HONDA");
    }

    /***
     * Click open window
     */
    public void setOPEN_WINDOW() {
        elementClick(OPEN_WINDOW, "Open Window");

    }

    /***
     * Switched window
     */
    public void openNewWindow() {
        switchWindows();
        elementClick(ENROLLED, "My Courses");

    }

    /***
     * Verify switched window
     * @return
     */
    public boolean verifyOpenedWindow() {
        WebElement myCourses = getElement(ENROLLED, "My Courses");
        return Util.verifyTextMatch(myCourses.getText(),"My Courses");


    }

    /***
     * Switch to alert Example
     */
    public void switchAlert(String name) {
        sendData(NAME_TEXT_FIELD, name, "Name field");
        elementClick(ALERT_BUTTON, "Alert Button");
        acceptAlert();
    }

    /***
     * Hide textbox
     */
    public void setHIDE_TBOX() {
        getElement(TBOX, "Display Textbox");
        elementClick(HIDE_TBOX, "Hide");
    }

    /***
     * Verify textbox is hidden
     */
    public boolean verifyTextBoxIsHidden() {
        WebElement textBox = getElement(TBOX, "Display Textbox");
        return isDisplayed(textBox, "Text Box");
    }

    /***
     * Show textbox
     */
    public void setSHOW_TBOX() {
        elementClick(SHOW_TBOX, "Show");
        getElement(TBOX, "Display Textbox");
    }

    /***
     * verify textbox is displayed
     */
    public boolean verifyTextBoxIsDisplayed() {
        WebElement textBox = getElement(TBOX, "Display Textbox");
        return isDisplayed(textBox, "Text Box");
    }

    /***
     * Mouse hover actions
     */
    public void setMOUSE_HOVER() {
        mouseHover(MOUSE_HOVER, "Mouse Hover");
        mouseHover(SUB_TOP, "Top");
    }

    /***
     * Verify text link
     */
    public boolean verifyMouseHover() {
        WebElement subElement = getElement(SUB_TOP, "Top");
        return Util.verifyTextContains(subElement.getText(), "Top");
    }

    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTableAuthor1() {
        getElement(AUTHOR1, "Let's Kode It");

    }

    /***
     * Verify Author1 is present
     */
    public boolean verifyGetWebTableAuthor1() {
        WebElement author1 = getElement(AUTHOR1, "Let's Kode It");
        return Util.verifyTextContains(author1.getText(),"Let's Kode It");
    }

    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTableAuthor2() {
        getElement(AUTHOR2, "Let's Kode It");

    }

    /***
     * Verify Author1 is present
     */
    public boolean verifyGetWebTableAuthor2() {
        WebElement author2 = getElement(AUTHOR2, "Let's Kode It");
        return Util.verifyTextContains(author2.getText(),"Let's Kode It");



    }
    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTableAuthor3() {
        getElement(AUTHOR3, "Let's Kode It");

    }

    /***
     * Verify Author1 is present
     */
    public boolean verifyGetWebTableAuthor3() {
        WebElement author3 = getElement(AUTHOR3, "Let's Kode It");
        return Util.verifyTextContains(author3.getText(),"Let's Kode It");
    }
    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTableCourse1() {
        getElement(TABLE_COURSE1, "Selenium WebDriver With Java");

    }

    /***
     * Verify Table Course 1 is present
     */
    public boolean verifyGetWebTableCourse1() {
        WebElement tableCourse1 = getElement(TABLE_COURSE1, "Selenium WebDriver With Java");
        return Util.verifyTextContains(tableCourse1.getText(),"Selenium WebDriver With Java");
    }
    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTableCourse2() {
        getElement(TABLE_COURSE2, "Python Programming Language");

    }

    /***
     * Verify Table Course 2 is present
     */
    public boolean verifyGetWebTableCourse2() {
        WebElement tableCourse2 = getElement(TABLE_COURSE2, "Python Programming Language");
        return Util.verifyTextContains(tableCourse2.getText(),"Python Programming Language");
    }
    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTableCourse3() {
        getElement(TABLE_COURSE2, "JavaScript Programming Language");
    }

    /***
     * Verify Table Course 3 is present
     */
    public boolean verifyGetWebTableCourse3() {
        WebElement tableCourse3 = getElement(TABLE_COURSE3, "JavaScript Programming Language");
        return Util.verifyTextContains(tableCourse3.getText(),"JavaScript Programming Language");
    }
    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTablePrice1() {
        getElement(TABLE_PRICE1, "35");
    }

    /***
     * Verify Table Price 1 is present
     */
    public boolean verifyGetWebTablePrice1() {
        WebElement tablePrice1 = getElement(TABLE_PRICE1, "35");
        return Util.verifyTextContains(tablePrice1.getText(),"35");
    }
    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTablePrice2() {
        getElement(TABLE_PRICE2, "30");
    }

    /***
     * Verify Table Price 2 is present
     */
    public boolean verifyGetWebTablePrice2() {
        WebElement tablePrice2 = getElement(TABLE_PRICE2, "30");
        return Util.verifyTextContains(tablePrice2.getText(),"30");
    }
    /***
     * Get elements from dynamic web table
     * @return
     */
    public void getWebTablePrice3() {
        getElement(TABLE_PRICE3, "30");
    }

    /***
     * Verify Table Price 3 is present
     */
    public boolean verifyGetWebTablePrice3() {
        WebElement tablePrice3 = getElement(TABLE_PRICE3, "25");
        return Util.verifyTextContains(tablePrice3.getText(),"25");
    }
}





