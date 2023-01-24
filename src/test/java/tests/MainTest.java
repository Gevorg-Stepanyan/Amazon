package tests;


import org.testng.annotations.Test;


public class MainTest extends BaseTest {


    @Test
    void checkAboutItemInfoOfSecondFromHighest()  {
        mainPage.clickOnMenuElement();
        allMenuPage.clickOnTvButton();
        tvAudioCamerasPage.clickOnTelevisionsButton();
        scroll(3000);
        tvPage.clickOnSamsungCheckBox().clickOnSortListButton().clickOnSortHighestToLowButton().clickSecondFromHighest();
        switchWindow();
        scroll(1000);
        String expectedText = itemPage.getAboutItemInfo();
        softAssert.assertNotNull(expectedText);
        System.out.println("Expected text----\n" + expectedText);
        softAssert.assertAll();
    }
}