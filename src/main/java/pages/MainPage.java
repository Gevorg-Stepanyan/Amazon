package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ActionHelper;
import utils.DriverFactory;

public class MainPage {
    public MainPage (){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/span")
    private WebElement menu;

    public MainPage clickOnMenuElement() {
        ActionHelper.clickOnElement(menu);
        return this;
    }
}
