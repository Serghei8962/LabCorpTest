package com.LabCorp.labCorpPages;

import com.LabCorp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabCorpCareersPage {
    public LabCorpCareersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//input[@id='typehead'])[1]")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[.='QA Test Automation Developer ']")
    public WebElement jobTitleButton;

    @FindBy(xpath = "//h1[.='QA Test Automation Developer']")
    public WebElement jobTitle;

    @FindBy(css = ".au-target.job-location")
    public WebElement location;

    @FindBy(css = ".au-target.jobId")
    public WebElement jobId;

    @FindBy(xpath = "//div[2]/p[3]")
    public WebElement jobDescriptionText;

    @FindBy(xpath = "//div[2]/ul[2]/li[2]/p")
    public WebElement managementSupportText;

    @FindBy(xpath = "//div[2]/ul[4]/li[13]/p")
    public WebElement requirementsText;


    @FindBy(xpath = "//a/ppc-content[.='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//a[@href=\"https://careers.labcorp.com/global/en/search-results?keywords=QA%20Test%20Automation%20Developer&s=1\"]")
    public WebElement backToSearchButton;
}
