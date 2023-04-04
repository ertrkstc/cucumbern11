package PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class QuestionOne extends AbstractClass {
    WebDriver driver;
    String name;

    public QuestionOne(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".tab li:nth-of-type(4)")
    private WebElement AllBrandsBtnClick;

    @FindBy(css = "[data-has-seller='S']")
    private WebElement StartingBrandswithSLetter;

    @FindBy(css = "#breadCrumb a>span")
    private WebElement goToBrandPage;

    @FindBy(css = "div.tabPanel.allSellers > div.sellerListHolder > ul > li>a")
    private List<WebElement> randomBrandsClick;

    public void goToBrandPage(){
        assertion(goToBrandPage,name);
        driver.quit();
    }
    public void clickAllBrandsButton(){
        clickFunction(AllBrandsBtnClick);
    }
    public void clickStartingBrandswithSLetter(){
        javascriptclicker(StartingBrandswithSLetter);
    }
    public void randomBrandsClick(){
        Random random = new Random();
        int index = random.nextInt(randomBrandsClick.size());
        name=randomBrandsClick.get(index).getText();
        System.out.println(name);
        System.out.println(randomBrandsClick.size());
        waitBySeconds(5);
        if (randomBrandsClick.size() > 0) {
            try {
                clickFunction(randomBrandsClick.get(index));
            } catch (org.openqa.selenium.StaleElementReferenceException ex){
                clickFunction(randomBrandsClick.get(index));
            }
        }

}}
