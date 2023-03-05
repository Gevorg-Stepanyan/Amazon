package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class PrintItemAboutInfoPositive extends BaseTest {


    @Test
    void checkAboutItemInfoOfSecondFromHighest()  {
        driver.manage().window().fullscreen();
        mainPage.clickOnMenuElement();
        allMenuPage.clickOnTvButton();
        tvAudioCamerasPage.clickOnTelevisionsButton();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        tvPage.clickOnSamsungCheckBox().clickOnSortListButton().clickOnSortHighestToLowButton().clickSecondFromHighest();
        switchWindow();
        jse.executeScript("window.scrollBy(0,250)");
        String expectedText = itemPage.getAboutItemInfo();
        softAssert.assertNotNull(expectedText);
        System.out.println("Expected text----\n" + expectedText);
        softAssert.assertAll();
    }
}