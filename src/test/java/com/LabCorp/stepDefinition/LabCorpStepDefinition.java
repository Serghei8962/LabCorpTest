package com.LabCorp.stepDefinition;

import com.LabCorp.labCorpPages.LabCorpCareersPage;
import com.LabCorp.labCorpPages.LabCorpHomePage;
import com.LabCorp.utilities.ConfigReader;
import com.LabCorp.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.LabCorp.utilities.BrowserUtils.*;

public class LabCorpStepDefinition {

    LabCorpHomePage labCorpHomePage = new LabCorpHomePage();
    LabCorpCareersPage labCorpCareersPage = new LabCorpCareersPage();

    @Given("As a user i want to be on home page")
    public void asAUserIWantToBeOnHomePage() {
        Driver.getDriver().get(ConfigReader.read("url"));
    }

    @When("user click on Careers link")
    public void userClickOnCareersLink() {
        labCorpHomePage.careersButton.click();
    }

    @And("user search for QA Test Automation Developer")
    public void userSearchFor() {

        switchToWindow("Careers at Labcorp | Join The Pursuit");
        waitFor(3);
        String cookieButton ="document.querySelector(\"body > div.ph-header > section:nth-child(1) > div > div > div > div.cookie-button-area > button\")";
        WebElement cookieWebElement = getShadowRoot(Driver.getDriver(), cookieButton);
        cookieWebElement.click();

        Driver.getDriver().findElement(By.xpath("(//button[@class='btn primary-button au-target'])[1]"));
        labCorpCareersPage.searchBar.sendKeys(ConfigReader.read("jobTitle"));
        labCorpCareersPage.searchButton.click();
    }

    @And("user click select and browse to this position")
    public void userClickSelectAndBrowseToThisPosition() {
        labCorpCareersPage.jobTitleButton.click();
        String jobTitle = "QA Test Automation Developer";
        String location = "Location\nDurham, North Carolina, United States of America";
        String jobId = "Job Id : 21-90223_RM";
        String jobDescription = "The right candidate for this role will " +
                "participate in the test automation technology development and best practice models";
        String managementSupport = "Prepare test plans, budgets, and schedules.";
        String automationTools = "Selenium";

        Assert.assertTrue(jobTitle,labCorpCareersPage.jobTitle.getText().contains("QA Test Automation Developer"));
        Assert.assertEquals(location,labCorpCareersPage.location.getText());
        Assert.assertEquals(jobId,labCorpCareersPage.jobId.getText());
        Assert.assertTrue(jobDescription,labCorpCareersPage.jobDescriptionText.getText().contains(jobDescription));
        Assert.assertTrue(managementSupport,labCorpCareersPage.managementSupportText.getText().contains(managementSupport));
        Assert.assertTrue(automationTools,labCorpCareersPage.requirementsText.getText().contains(automationTools));
    }

    @And("user click Apply Now and confirm Job Title, Job Location, Job ID and another text of choice to match the previous page in the proceeding page")
    public void userClickAndConfirmJobTitleJobLocationJobIDAndAnotherTextOfChoiceToMatchThePreviousPageInTheProceedingPage() {
        labCorpCareersPage.applyNowButton.click();
        switchToWindow("Workday");

    }

    @Then("user click return to Job Search")
    public void userClickReturnToJobSearch() {
        waitFor(3);
        switchToWindow("QA Test Automation Developer in Durham, North Carolina, United States of America | Information Technology at Labcorp");
        scrollToElement(labCorpCareersPage.backToSearchButton);
        labCorpCareersPage.backToSearchButton.click();
        labCorpCareersPage.searchBar.click();
    }



}
