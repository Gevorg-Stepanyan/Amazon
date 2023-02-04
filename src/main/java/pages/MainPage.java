package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MainPage extends BasePage{
    public MainPage (){
        super();
    }

    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/span")
    private WebElement menu;

    public MainPage clickOnMenuElement() {
        clickOnElement(menu);
        return this;
    }
}
