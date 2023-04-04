package StepDefinition;

import PageObjectModel.QuestionTwo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import utilities.Driver;
public class QuestionTwo_Steps {
    private WebDriver driver;
    PageObjectModel.QuestionTwo QuestionTwo = new QuestionTwo();

    @Given("GoToNMainWebSite")
    public void go_to_n_main_web_site() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");//gitmek istediğimiz url
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Given("SearchAreaClickAndWriteVocab")
    public void searchareaclickandwritevocab() {
        QuestionTwo.searchAreaClickAndWriteVocab();
    }

    @Given("MakingSearch")
    public void making_search() {
        QuestionTwo.makingSearch();
        QuestionTwo.makingSearch2();
        QuestionTwo.waitBySeconds(5);

    }

    @Given("MakingSearchCntrl")
    public void makingsearchcntrl() {
        QuestionTwo.makingSearchCntrl();
    }

    @Given("FirstProductSelect")
    public void first_product_select() {
        QuestionTwo.firstPick();
    }

    @Given("ColorAndMemorySelect")
    public void colorandmemoryselect() {
        QuestionTwo.ColorAndMemorySelect();
    }

    @Given("AddBasket")
    public void add_basket() {
        QuestionTwo.AddBasket();
    }

    @Given("LastProductSelect")
    public void last_product_select() {
        QuestionTwo.lastPick();
    }

    @Given("GotoBasket")
    public void goto_basket() {
        QuestionTwo.goToBasket();
    }

    @Given("PurchaseClick")
    public void purchase_click() {
        QuestionTwo.PurchaseClick();
    }

    @Given("PurchaseWithoutLogin")
    public void purchase_without_login() {
        QuestionTwo.PurchaseWithoutLogin();
    }

    @When("AydinlatmaMetniKapat")
    public void AydinlatmaMetniKapat() {

        QuestionTwo.AydinlatmaMetni();
    }

    @Then("GoToNonMemberPage")
    public void go_to_non_member_page() {
        QuestionTwo.goToNonMemberPage();
    }
}
