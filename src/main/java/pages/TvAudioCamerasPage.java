package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionHelper;

public class TvAudioCamerasPage extends MainPage{

    @FindBy(linkText = "Televisions")
    private WebElement televisions;

    public TvAudioCamerasPage clickOnTelevisionsButton() {
        ActionHelper.clickOnElement(televisions);
        return this;
    }
}
