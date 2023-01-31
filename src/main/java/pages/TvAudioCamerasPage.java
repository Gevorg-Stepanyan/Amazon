package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionHelper;

public class TvAudioCamerasPage extends MainPage{



    @FindBy(css = "html > body > div:nth-of-type(4) > div:nth-of-type(2) > div > ul:nth-of-type(9) > li:nth-of-type(3) > a")
    public WebElement linkTelevisions;
    public TvAudioCamerasPage clickOnTelevisionsButton() {
        ActionHelper.clickOnElement(linkTelevisions);
        return this;
    }
}
