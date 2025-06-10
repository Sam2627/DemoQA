package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwichToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    // Return alert pop-up text
    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    // Accept alert pop-up
    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    // Dismiss alert pop-up
    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    // Set alert pop-up text
    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    // Switch frame by name
    public static void switchToFrames(String value) {
        switchTo().frame(value);
    }

    // Switch frame by index
    public static void switchToFrames(int index) {
        switchTo().frame(index);
    }

    // Switch frame by element
    public static void switchToFrames(WebElement element) {
        switchTo().frame(element);
    }

    // Switch default frame
    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    // Switch window frame
    public static void switchToWindow(String handle) {
        switchTo().window(handle);
    }

}
