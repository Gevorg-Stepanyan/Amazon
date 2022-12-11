package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    static Wait<WebDriver> wait;

    public static void waitUntilElementIsVisible(WebElement element){

        wait = new WebDriverWait(DriverSetup.getInstance(),10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void  waitUntilElementIsClickable(WebElement element){

        wait = new WebDriverWait(DriverSetup.getInstance(),10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void  waitOnly(){
        wait = new WebDriverWait(DriverSetup.getInstance(),10);
    }

    public static void  waitImplicitly(){
        System.out.println("Wait implicitly start: ");
        wait = new WebDriverWait(DriverSetup.getInstance(),10);
        try {
            wait.wait(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
