package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility{

    private static Actions actions() { return new Actions(driver); }

    // Double left mouse click
    public static void doubleClick(WebElement source) { actions().doubleClick(source).perform(); }

    // Right mouse click
    public static void rightClick(WebElement source) { actions().contextClick(source).perform(); }

    // Hover mouse on element
    public static void hoveringMouse(WebElement source) { actions().moveToElement(source).perform(); }

    // Drag and drop mouse action
    public static void dragAndDrop(WebElement source, int x, int y) { actions().dragAndDropBy(source, x, y).perform(); }

    // Input keyboard action
    public static void sendKeys(WebElement source, CharSequence keys) { actions().sendKeys(source, keys).perform(); }

    // Input keyboard then press tab
    public static void sendKeysThenTab(WebElement source, String keys) {
        actions().sendKeys(source, keys).perform();
        // Wait for suggestions
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }
        actions().sendKeys(Keys.TAB).perform();
    }

}
