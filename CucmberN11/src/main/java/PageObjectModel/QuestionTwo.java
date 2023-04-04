package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.Driver;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class QuestionTwo extends AbstractClass {
    WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());
    public static int DEFAULT_MAX_ITERATION_COUNT = 10;
    public static int DEFAULT_MILLISECOND_WAIT_AMOUNT = 1000;
    String searchname="iphone";
    public QuestionTwo(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "searchData")
    private WebElement searchAreaClickAndWriteVocab;

    @FindBy(id = "searchData")
    private WebElement makingSearch;

    @FindBy(css = ".searchBtn")
    private WebElement makingSearch2;
    @FindBy(css = "#breadCrumb a > span")
    private WebElement makingSearchCntrl;
    @FindBy(css = "div.sku-container > fieldset:nth-of-type(1) > div > div > label")
    private List<WebElement> ColorSelect;
    @FindBy(css = "div.sku-container > fieldset:nth-of-type(2) > div > div > label")
    private List<WebElement> MemorySelect;
    @FindBy(css = "#js-addBasketSku")
    private WebElement AddBasket;
    @FindBy(css = "span.btnBasket")
    private List<WebElement> firstlastProductSelect;
    @FindBy(css = ".iconsBasketWhite")
    private WebElement goToBasket;
    @FindBy(css = ".orderSummaryBoxSticky #js-buyBtn")
    private WebElement PurchaseClick;
    @FindBy(css = ".btn-continue")
    private WebElement PurchaseWithoutLogin;
    @FindBy(css = ".basket > .box__title")
    private WebElement goToNonMemberPage;
    @FindBy(css = "div.btnHolder > span.btnBlack")
    private WebElement AydinlatmaMetni;

    public void searchAreaClickAndWriteVocab(){
        clickFunction(searchAreaClickAndWriteVocab);
    }
    public void makingSearch(){
        clickFunction(makingSearch);
        SendKeysFunction(makingSearch,"iphone");
    }
    public void makingSearch2(){
        clickFunction(makingSearch2);
    }
    public void makingSearchCntrl(){
        assertion(makingSearchCntrl,searchname);
    }
    public void firstPick() {
        List<WebElement> elements =firstlastProductSelect ;
        javascriptclicker(elements.get(0));

    }
    public void ColorAndMemorySelect(){
        randomPick2(ColorSelect);
        randomPick2(MemorySelect);
        waitBySeconds(3);
    }
    public void randomPick2(List<WebElement> element) {
        try {
            List<WebElement> elements = element;
            Random random = new Random();
            int index = random.nextInt(elements.size());
            if (elements.size() > 0) {
                elements.get(index).click();
            }
        } catch (Exception e) {
            System.out.println("Tıklama işlemi hatalı.");
        }
    }
    public void AddBasket(){
        waitBySeconds(5);
        javascriptclicker(AddBasket);
    }
    public void lastPick() {
        List<WebElement> elements =firstlastProductSelect;
        javascriptclicker(elements.get(elements.size()-1));
    }
    public void goToBasket(){
        javascriptclicker(goToBasket);
    }
    public void PurchaseClick(){
        javascriptclicker(PurchaseClick);
    }
    public void PurchaseWithoutLogin(){
        javascriptclicker(PurchaseWithoutLogin);
    }
    public void AydinlatmaMetni(){
        javascriptclicker(AydinlatmaMetni);
    }
    public void goToNonMemberPage(){
        assertion(goToNonMemberPage,"Sepetim (2)");
        driver.quit();
    }

}
