package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {
    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="file-upload")
    public WebElement uploadButton;

    @FindBy(id ="file-submit")
    public WebElement submitButton;

    @FindBy(tagName = "h3")
    public WebElement result;


    @FindBy(xpath = "//a[.='download.jpg']")
    public WebElement downloadButton;

}
