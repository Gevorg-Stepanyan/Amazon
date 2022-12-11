package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverSetup;

public class MainPage {
    public MainPage (){
        PageFactory.initElements(DriverSetup.getInstance(), this);
    }


    @FindBy(linkText = "All")
    private WebElement menu;

    public WebElement getMenu() {
        return menu;
    }
}
