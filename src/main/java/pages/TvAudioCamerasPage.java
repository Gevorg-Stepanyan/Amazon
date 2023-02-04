package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TvAudioCamerasPage extends AllMenuPage{



    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")
    public WebElement linkTelevisions;

    public TvAudioCamerasPage clickOnTelevisionsButton() {
        clickOnElement(linkTelevisions);
        return this;
    }
}
