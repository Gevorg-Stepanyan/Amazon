package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TvAudioCamerasPage extends MainPage{

    @FindBy(linkText = "Televisions")
    private WebElement televisions;

    public WebElement getTelevisions() {
        return televisions;
    }
}
