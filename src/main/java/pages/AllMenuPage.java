package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllMenuPage extends MainPage{


    @FindBy(linkText = "TV, Appliances, Electronics")
    private WebElement tv;

    public WebElement getTv() {
        return tv;
    }
}
