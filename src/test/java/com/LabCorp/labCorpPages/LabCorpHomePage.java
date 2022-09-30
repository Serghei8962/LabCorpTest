package com.LabCorp.labCorpPages;

import com.LabCorp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabCorpHomePage {
public LabCorpHomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(linkText = "Careers")
    public WebElement careersButton;


}
