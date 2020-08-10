package com.letskodeit.pageclasses;

import com.letskodeit.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

        /***
         * Variables
         * Locators
         * URL
         */
        public WebDriver driver;
        private String Url = "?query=";
        private String COURSE_LIST = "xpath=>//div[@class='course-listing']";

    /***
     * Methods
     */
    public boolean isOpen(){
        return driver.getCurrentUrl().contains(Url);

    }
    public int coursesCount(){
        List<WebElement> courseList = getElementList(COURSE_LIST,"Course List");
        return courseList.size();
    }
    public boolean verifySearchResult(){
        boolean result = false;
        if (coursesCount()> 0) {
            result = true;
        }
        result = isOpen()&& result;
                return result;
    }

    public boolean verifyFilterCourseCount(int expectedCount) {
        return coursesCount()== expectedCount;
    }
}
