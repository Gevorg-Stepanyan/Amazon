package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {


    static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initDriver(Browser browser) {
        switch (browser) {
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case SAFARI: {

                driver = new SafariDriver();
                break;
            }
            default:
                System.out.println("browser not found ");
        }
    }

    public static void quitDriver() {
        driver.quit();
    }
}