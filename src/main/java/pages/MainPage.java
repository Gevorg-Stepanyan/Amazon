package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class MainPage {
    public MainPage (){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }


    @FindBy(linkText = "All")
    private WebElement menu;

    public WebElement getMenu() {
        return menu;
    }
}
