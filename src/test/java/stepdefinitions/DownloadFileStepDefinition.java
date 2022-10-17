package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadFileStepDefinition extends HerokuappPage {
    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("user goes the website to download")
    public void user_goes_the_website_to_download() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/download");

    }
    @Given("user downloads the file")
    public void user_downloads_the_file() {
        herokuappPage.downloadButton.click();
        Driver.wait(3);


    }
    @Then("user validates the file")
    public void user_validates_the_file() {
        String filePath="/Users/arif/Downloads/download.jpg";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));

    }

}
