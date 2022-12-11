package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends MainPage{

    @FindBy(xpath = "//*[@id=\"feature-bullets\"]/ul")
    private WebElement aboutItemInfo;

    public WebElement getAboutItemInfo() {
        return aboutItemInfo;
    }
}
