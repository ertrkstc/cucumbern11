package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.Driver;

public class QuestionThree extends AbstractClass {
    WebDriver driver;
    protected Logger logger = LoggerFactory.getLogger(getClass());
    String searchname2="telefon";
    public QuestionThree(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "searchData")
    private WebElement SearchAreaClickAndWriteVocabulary;
    @FindBy(css = ".searchBtn")
    private WebElement SearchAreaClickAndWriteVocabularySearchBtn;
    @FindBy(css = "#breadCrumb a > span")
    private WebElement MakingSearchCntrlWithVocabulary;
    @FindBy(css = "[data-hdfl='m'] .filterList > div:nth-of-type(2)>a")
    private WebElement ProductListSecondFilter;
    @FindBy(css = "[data-icon='iconSortBy'] > div:nth-of-type(1)")
    private WebElement ProductListArrangeAccordinToCommit;
    @FindBy(css = "div.all-items > div.item.i4")
    private WebElement ProductListArrangeAccordinToCommit2;
    @FindBy(css = "[data-icon='iconSortBy'] span")
    private WebElement ProductListArrangeAccordinToCommitCntrl;
    @FindBy(css = "section.cargoFilter")
    private WebElement FreeCargoFilterSelect;
    @FindBy(css = "section.cargoFilter > div > div > div:nth-of-type(1) > label > span")
    private WebElement FreeCargoFilterSelect2;
    @FindBy(css = "span.cargoBadgeText")
    private WebElement FreeCargoFilterSelectCntrl;

    public void SearchAreaClickAndWriteVocabulary(){
        clickFunction(SearchAreaClickAndWriteVocabulary);
        SendKeysFunction(SearchAreaClickAndWriteVocabulary,"telefon");
    }
    public void SearchAreaClickAndWriteVocabularySearchBtn(){
        clickFunction(SearchAreaClickAndWriteVocabularySearchBtn);
        waitBySeconds(5);
    }
    public void MakingSearchCntrlWithVocabulary(){
        assertion(MakingSearchCntrlWithVocabulary,searchname2);
    }
    public void ProductListSecondFilter(){
        javascriptclicker(ProductListSecondFilter);
        waitBySeconds(5);
    }
    public void ProductListArrangeAccordinToCommit(){
        clickFunction(ProductListArrangeAccordinToCommit);
        waitBySeconds(3);
    }
    public void ProductListArrangeAccordinToCommit2(){
        clickFunction(ProductListArrangeAccordinToCommit2);
        waitBySeconds(3);
    }
    public void ProductListArrangeAccordinToCommitCntrl(){
        assertion(ProductListArrangeAccordinToCommitCntrl,"Sırala: Yorum sayısı");
    }
    public void FreeCargoFilterSelect(){
        javascriptclicker(FreeCargoFilterSelect);
        waitBySeconds(2);
        javascriptclicker(FreeCargoFilterSelect2);
    }
    public void FreeCargoFilterSelectCntrl(){
        assertion(FreeCargoFilterSelectCntrl,"ÜCRETSİZ KARGO");
        driver.quit();
    }

}
