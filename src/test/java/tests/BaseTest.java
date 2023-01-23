package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.Browser;
import utils.DriverFactory;

public class BaseTest  {
    protected WebDriver driver;
    JavascriptExecutor js;
    MainPage mainPage;
    AllMenuPage allMenuPage;
    TvAudioCamerasPage tvAudioCamerasPage;
    TelevisionsPage tvPage;
    ItemPage itemPage;

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
    }

    protected void scroll(int pixels){
        js.executeScript("window.scrollBy(0,pixels)", "");
    }

    @AfterMethod
    void driverQuite(){
        DriverFactory.quitDriver();
    }
}
