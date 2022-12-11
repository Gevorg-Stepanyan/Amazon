package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.ActionHelper;
import utils.DriverSetup;
import java.util.Iterator;
import java.util.Set;


public class MainTest extends BaseTest {
    JavascriptExecutor js = (JavascriptExecutor) DriverSetup.getInstance();

    @Test
    void checkAboutItemInfoOfSecondFromHighest()  {
        MainPage mainPage = new MainPage();
        AllMenuPage amp = new AllMenuPage();
        TvAudioCamerasPage tac = new TvAudioCamerasPage();
        TelevisionsPage tvpage = new TelevisionsPage();
        ItemPage itemPage = new ItemPage();
        DriverSetup.getInstance().get(BASE_URL);
        DriverSetup.getInstance().manage().window().maximize();
        System.out.println(mainPage.getMenu());
        ActionHelper.clickOnElement(mainPage.getMenu());
        ActionHelper.clickOnElement(amp.getTv());
        ActionHelper.clickOnElement(tac.getTelevisions());
        js.executeScript("window.scrollBy(0,3000)", "");
        ActionHelper.clickOnElement(tvpage.getSamsungCheckBox());
        ActionHelper.clickOnElement(tvpage.getSortList());
        ActionHelper.clickOnElement(tvpage.getSortHighToLow());
        ActionHelper.clickOnElement(tvpage.getSecondFromHighest());
        String mainWindowHandle = DriverSetup.getInstance().getWindowHandle();
        Set<String> allWindowHandles = DriverSetup.getInstance().getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                DriverSetup.getInstance().switchTo().window(ChildWindow);
            }
        }
        js.executeScript("window.scrollBy(0,1000)", "");
        String expectedText = itemPage.getAboutItemInfo().getText();
        if (expectedText != null){
            System.out.println("Expected text----\n" + expectedText);
        }
        Assert.assertNotNull(expectedText);
    }
}
