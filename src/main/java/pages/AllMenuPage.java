package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionHelper;

public class AllMenuPage extends MainPage{


    @FindBy(linkText = "TV, Appliances, Electronics")
    private WebElement tv;

    public AllMenuPage clickOnTvButton() {
        ActionHelper.clickOnElement(tv);
        return this;
    }
}
