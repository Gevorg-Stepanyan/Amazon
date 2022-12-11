package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverSetup;

public class BaseTest  {

    protected static final String BASE_URL = "https://www.amazon.in/";

    @BeforeMethod
    void driverSetuo(){
        DriverSetup.getInstance();
    }

    @AfterMethod
    void driverQuite(){
        DriverSetup.getInstance().quit();
    }
}
