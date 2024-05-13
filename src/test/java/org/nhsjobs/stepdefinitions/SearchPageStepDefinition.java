package org.nhsjobs.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.nhsjobs.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SearchPageStepDefinition {

    private WebDriver driver;
    private SearchPage searchPage;

    @Before
    public void setup() {
        //driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.setBinary("src/test/resources/drivers/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");

        ChromeDriver driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

//    @Given("I am on the NHS jobs website search page")
//    public void i_am_on_the_nhs_jobs_website_search_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Given("I am a jobseeker on NHS Jobs website")
    public void i_am_a_jobseeker_on_nhs_jobs_website() {
        driver.get("https://www.jobs.nhs.uk/candidate/search");
        searchPage = new SearchPage(driver);
    }

    @When("I put my preferences into the Search functionality")
    public void i_put_my_preferences_into_the_search_functionality() {
        searchPage.inputJobTitle("Nurse");
        searchPage.inputLocation("London");
        searchPage.clickSearchButton();
    }

    @Then("I should get a list of jobs which matches my preferences")
    public void i_should_get_a_list_of_jobs_which_matches_my_preferences() {
        Assert.assertEquals(searchPage.checkJobsResultsVisible(),true);
    }

    @Then("sort my search results with the newest Date Posted")
    public void sort_my_search_results_with_the_newest_date_posted() {
        searchPage.validateReturnResultsOnDescOrder();
    }

}
