package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionsPage extends MainPage{


    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[24]/ul/li[3]/span/a/div/label/i")
    private WebElement samsungCheckBox;

    @FindBy(id = "a-autoid-0")
    private WebElement sortList;

    @FindBy(id = "s-result-sort-select_2")
    private WebElement sortHighToLow;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")
    private WebElement secondFromHighest;

    public TelevisionsPage clickOnSamsungCheckBox() {
        clickOnElement(samsungCheckBox);
        return this;
    }

    public TelevisionsPage clickOnSortListButton() {
        clickOnElement(sortList);
        return this;
    }

    public TelevisionsPage clickOnSortHighestToLowButton() {
        clickOnElement(sortHighToLow);
        return this;
    }

    public TelevisionsPage clickSecondFromHighest() {
        clickOnElement(secondFromHighest);
        return this;
    }
}
