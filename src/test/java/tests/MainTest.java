package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ActionHelper;
import java.util.Iterator;
import java.util.Set;


public class MainTest extends BaseTest {


    @Test
    void checkAboutItemInfoOfSecondFromHighest()  {
        ActionHelper.clickOnElement(mainPage.getMenu());
        ActionHelper.clickOnElement(allMenuPage.getTv());
        ActionHelper.clickOnElement(tvAudioCamerasPage.getTelevisions());
        scroll(3000);
        ActionHelper.clickOnElement(tvPage.getSamsungCheckBox());
        ActionHelper.clickOnElement(tvPage.getSortList());
        ActionHelper.clickOnElement(tvPage.getSortHighToLow());
        ActionHelper.clickOnElement(tvPage.getSecondFromHighest());
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
        scroll(1000);
        String expectedText = itemPage.getAboutItemInfo().getText();
        if (expectedText != null){
            System.out.println("Expected text----\n" + expectedText);
        }
        Assert.assertNotNull(expectedText);
    }
}