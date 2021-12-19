package utils;

import capabilities.LuloCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericActions {


    static AndroidDriver<MobileElement> driver = LuloCapabilities.driver;
    static WebDriverWait wait = new WebDriverWait(LuloCapabilities.driver, 20);

    public static void writeElementId(String id, String text) {
        MobileElement element = driver.findElementById(id);
        driver.findElementById(id).click();
        element.sendKeys(text);
        driver.hideKeyboard();
    }


    public static void waitById(String id) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }
}