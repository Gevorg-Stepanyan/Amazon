package tests;

import configs.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utils.Browser;
import utils.DriverFactory;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class BaseTest  {
    protected WebDriver driver;
    protected SoftAssert softAssert;
    protected MainPage mainPage;
    protected AllMenuPage allMenuPage;
    protected TvAudioCamerasPage tvAudioCamerasPage;
    protected TelevisionsPage tvPage;
    protected ItemPage itemPage;

    @BeforeMethod
    void driverSetuo() throws IOException {
        DriverFactory.initDriver(Browser.CHROME);
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.dataReader("baseUrl"));
        mainPage = new MainPage();
        allMenuPage = new AllMenuPage();
        tvAudioCamerasPage = new TvAudioCamerasPage();
        tvPage = new TelevisionsPage();
        itemPage = new ItemPage();
        softAssert = new SoftAssert();
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
