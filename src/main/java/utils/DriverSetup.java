package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    static WebDriver driver = null;
    private DriverSetup(){

    }

    public  static  WebDriver getInstance () {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver =  new ChromeDriver();

        }
        return driver;
    }
}
