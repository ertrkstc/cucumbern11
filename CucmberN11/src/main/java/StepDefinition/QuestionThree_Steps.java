package StepDefinition;

import PageObjectModel.QuestionThree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class QuestionThree_Steps {
    private WebDriver driver;
    PageObjectModel.QuestionThree QuestionThree= new QuestionThree();

    @Given("GoToMainWebSite")
    public void go_to_main_web_site() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");//gitmek istediğimiz url
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Given("SearchAreaClickAndWriteVocabulary")
    public void search_area_click_and_write_vocabulary() {
        QuestionThree.SearchAreaClickAndWriteVocabulary();
    }

    @Given("MakingSearchWithVocabulary")
    public void making_search_with_vocabulary() {
        QuestionThree.SearchAreaClickAndWriteVocabularySearchBtn();
    }

    @Given("MakingSearchCntrlWithVocabulary")
    public void making_search_cntrl_with_vocabulary() {
        QuestionThree.MakingSearchCntrlWithVocabulary();
    }

    @Given("ProductListSecondFilter")
    public void productlistsecondfilter() {
        QuestionThree.ProductListSecondFilter();
    }

    @Given("ProductListArrangeAccordinToCommit")
    public void productlistarrangeaccordintocommit() {
        QuestionThree.ProductListArrangeAccordinToCommit();
        QuestionThree.ProductListArrangeAccordinToCommit2();
        QuestionThree.ProductListArrangeAccordinToCommitCntrl();
    }

    @When("FreeCargoFilterSelect")
    public void freecargofilterselect() {
        QuestionThree.FreeCargoFilterSelect();

    }

    @Then("FreeCargoFilterSelectCntrl")
    public void freecargofilterselectcntrl() {
       QuestionThree.FreeCargoFilterSelectCntrl();

    }
}
