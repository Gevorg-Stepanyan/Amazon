package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utils.Browser;
import utils.DriverFactory;

import java.util.Iterator;
import java.util.Set;

public class BaseTest  {
    protected WebDriver driver;
    protected JavascriptExecutor js;
    SoftAssert softAssert;
    protected MainPage mainPage;
    protected AllMenuPage allMenuPage;
    protected TvAudioCamerasPage tvAudioCamerasPage;
    protected TelevisionsPage tvPage;
    protected ItemPage itemPage;

    protected static final String BASE_URL = "https://www.amazon.in/";

    @BeforeMethod
    void driverSetuo(){
        DriverFactory.initDriver(Browser.CHROME);
        driver = DriverFactory.getDriver();
        driver.get(BASE_URL);
        js = (JavascriptExecutor) driver;
        mainPage = new MainPage();
        allMenuPage = new AllMenuPage();
        tvAudioCamerasPage = new TvAudioCamerasPage();
        tvPage = new TelevisionsPage();
        itemPage = new ItemPage();
        softAssert = new SoftAssert();
    }

    protected void scroll(int pixels){
        js.executeScript("window.scrollBy(0,pixels)", "");
    }

    @AfterMethod
    void driverQuite(){
        DriverFactory.quitDriver();
    }

    protected void switchWindow(){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }
}
