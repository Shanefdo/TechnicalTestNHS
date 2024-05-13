package org.nhsjobs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {

    private WebDriver driver;

    //Locators from the page
    private By searchButtonLocator = By.id("search");
    private By whatInputLocator = By.id("keyword");
    private By whereInputLocator = By.id("location");
    private By distanceDropdownLocator = By.cssSelector("#distance option[value=\"20\"]");
    private By jobRefInputLocator = By.id("jobReference");
    private By employerInputLocator = By.id("employer");
    private By payRangeDropdownLocator = By.cssSelector("#payRange option[value=\"40-50\"]");
    private By sortResultsDropDown = By.cssSelector("#sort option[value=\"publicationDateDesc\"]");
    private By jobsResultsCountLocator = By.cssSelector("[data-test=\"search-result-query\"]");
    private By jobClosingDateLocator = By.cssSelector("[data-test=\"search-result-closingDate\"] ");


    //Page webElements
    public WebElement inputWhat = driver.findElement(whatInputLocator);
    public WebElement inputWhere = driver.findElement(whereInputLocator);
    public WebElement selectDistance = driver.findElement(distanceDropdownLocator);
    public WebElement inputJobRef = driver.findElement(jobRefInputLocator);
    public WebElement inputEmployer = driver.findElement(employerInputLocator);
    public WebElement selectPayRange = driver.findElement(payRangeDropdownLocator);
    public WebElement searchClick = driver.findElement(searchButtonLocator);
    public WebElement sortResultsClick = driver.findElement(sortResultsDropDown);
    public WebElement validateJobResults = driver.findElement(jobsResultsCountLocator);
    public WebElement jobClosingDateDescOrder = driver.findElement(jobClosingDateLocator);

    //Constructor
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputJobTitle(String whatJobTitle){
        inputWhat.sendKeys(whatJobTitle);
    }
    public void inputLocation(String whereJobLocation){
        inputWhere.sendKeys(whereJobLocation);
    }
    public void selectDistanceWithinTwenty(){
        selectDistance.click();
    }
    public void inputJobReference(String jobRef){
        inputJobRef.sendKeys(jobRef);
    }
    public void inputEmployerDetails(String employerDetails){
        inputEmployer.sendKeys(employerDetails);
    }
    public void selectPayRangeFortyToFifty(){
        selectPayRange.click();
    }

    public void clickSearchButton(){
        searchClick.click();
    }

    public void clickSortResultsButton(){
        sortResultsClick.click();
    }
    public boolean checkJobsResultsVisible(){
        return validateJobResults.isDisplayed();
    }

    public boolean validateReturnResultsOnDescOrder(){
//        List myList = new ArrayList();
//        for i = 1;
//        myList.add(jobClosingDateDescOrder);
//        jobClosingDateDescOrder.
//                my
                return true;
    }
}
