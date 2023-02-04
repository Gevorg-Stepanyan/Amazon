package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AllMenuPage extends MainPage{


    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[17]/a")
    private WebElement tv;

    public AllMenuPage clickOnTvButton() {
        clickOnElement(tv);
        return this;
    }
}
