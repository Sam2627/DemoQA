package utilities;

import org.openqa.selenium.By;

import java.util.Set;

public class GetUtility extends Utility{

    // Get current ID of window
    public static String getWindowHandle() {
        return driver.getWindowHandle();
    }

    // Get all current ID of windows
    public static Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    // Get text of element
    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    // Get attribute of element
    public static String getAttribute(By locator, String attribute) { return driver.findElement(locator).getAttribute(attribute); }

    // Get url
    public static String getURL() {
        return driver.getCurrentUrl();
    }

}
