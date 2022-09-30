package com.LabCorp.labCorpPages;

import com.LabCorp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabCorpCareersPage {
    public LabCorpCareersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//header/div[1]/div/div[4]/section/div/form//div[2]/div/div/div[1]/label")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[.='QA Test Automation Developer ']")
    public WebElement jobTitleButton;

    @FindBy(xpath = "//h1[.='QA Test Automation Developer']")
    public WebElement jobTitle;

    @FindBy(xpath = "//span[.='Location']")
    public WebElement location;

    @FindBy(xpath = "//div[1]/span[3]/span/text()[4]")
    public WebElement jobId;

    @FindBy(xpath = "//div[2]/p[3]/text()")
    public WebElement jobDescriptionText;

    @FindBy(xpath = "//div[2]/ul[2]/li[2]/p")
    public WebElement managementSupportText;

    @FindBy(xpath = "//div[2]/ul[4]/li[13]/p/text()")
    public WebElement requirementsText;


    @FindBy(xpath = "//a/ppc-content[.='Apply Now']")
    public WebElement applyNowButton;
}
