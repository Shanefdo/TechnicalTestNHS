package org.nhsjobs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private WebDriver driver;

    //Locators from the page
    private By searchButtonLocator = By.id("search");
    private By sortResultsDropDown = By.id("sort");
    private By jobsResultsCountLocator = By.cssSelector("[data-test=\"search-result-query\"]");


    //Page web elements
    public WebElement searchClick = driver.findElement(searchButtonLocator);
    public WebElement sortResultsClick = driver.findElement(sortResultsDropDown);

    //Constructor
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSearchButton(){
        searchClick.click();
    }

    public void clickSortResultsButton(){
        sortResultsClick.click();
    }
}
