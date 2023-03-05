package pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitHelper;

public class BasePage {

    public  Logger logger;
    public BasePage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
        PropertyConfigurator.configure("src/main/resources/configs/log4j.properties");
        PropertyConfigurator.configure("src/main/java/pages/pages.BasePage.java");
        logger = Logger.getLogger(this.getClass().getName());
    }

    protected   void clickOnElement(WebElement element){
        Actions actions = new Actions(DriverFactory.getDriver());
        logger.info("Waiting until element is visible" + element);
        WaitHelper.waitUntilElementIsVisible(element);
        logger.info("Waiting ntil element is clickable" + element);
        WaitHelper.waitUntilElementIsClickable(element);
        actions.click(element).build().perform();
        logger.info("Clicked successfully in element" + element);
    }

    protected   void waitUntilElementIsVisible(WebElement element){
        logger.info("Waiting until element is visible" + element);
        WaitHelper.waitUntilElementIsVisible(element);
        logger.info("Element is visible" + element);
    }

    protected   void sendKeyAction(WebElement element, String text){
        Actions actions = new Actions(DriverFactory.getDriver());
        logger.info("Waiting until element is visible" + element);
        WaitHelper.waitUntilElementIsVisible(element);
        logger.info("Element is visible" + element);
        actions.sendKeys(text).build().perform();
        logger.info("Text inputed in element" + element);
    }
}
