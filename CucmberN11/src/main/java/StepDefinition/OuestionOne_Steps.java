package StepDefinition;

import PageObjectModel.QuestionOne;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import utilities.Driver;
public class OuestionOne_Steps {
    private WebDriver driver;

    QuestionOne QuestionOne= new QuestionOne();
    @Given("GoToNWebSite")
    public void go_to_n_web_site() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/magazalar");//gitmek istediğimiz url
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("AllBrandsButtonClick")
    public void all_brands_button_click() {
       QuestionOne.clickAllBrandsButton();
    }

    @And("StartingBrandswithSLetter")
    public void starting_brandswith_s_letter() {
        QuestionOne.clickStartingBrandswithSLetter();
    }

    @When("RandomBrandsClick")
    public void random_brands_click() throws InterruptedException {
    QuestionOne.randomBrandsClick();
}

    @Then("GoToBrandPage")
    public void go_to_brand_page() {
        QuestionOne.goToBrandPage();
    }
}
