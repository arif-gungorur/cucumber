package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.Driver;

public class UploadFileStepDefinition extends HerokuappPage {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("user goes the website to upload")
    public void user_goes_the_website_to_upload(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/upload");

    }

    @And("user uploads the file")
    public void userUploadsTheFile() {
        String filePath="/Users/arif/Desktop/Tech Edu/Selenium.pdf";
        herokuappPage.uploadButton.sendKeys(filePath);
        herokuappPage.submitButton.click();
    }

    @Then("user validates the result")
    public void userValidatesTheResult() {
        Assert.assertTrue(herokuappPage.result.isDisplayed());
    }
}
