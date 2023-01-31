package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class MainTest extends BaseTest {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Test
    void checkAboutItemInfoOfSecondFromHighest()  {
        driver.manage().window().fullscreen();
        mainPage.clickOnMenuElement();
        allMenuPage.clickOnTvButton();
        tvAudioCamerasPage.clickOnTelevisionsButton();
        js.executeScript("window.scrollBy(10000)", "");
        tvPage.clickOnSamsungCheckBox().clickOnSortListButton().clickOnSortHighestToLowButton().clickSecondFromHighest();
        switchWindow();
        js.executeScript("window.scrollBy(3000)", "");
        String expectedText = itemPage.getAboutItemInfo();
        softAssert.assertNotNull(expectedText);
        System.out.println("Expected text----\n" + expectedText);
        softAssert.assertAll();
    }
}