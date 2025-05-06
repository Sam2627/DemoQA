package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) { BasePage.driver = driver; }

    // Find element
    protected WebElement findElement(By locator) { return driver.findElement(locator); }

    // Set text in element
    protected void setText(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    protected void setText(By locator, String text, boolean cleanField) {
        if(cleanField)
            findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    // Click text in element
    protected void clickElement(By locator) { findElement(locator).click(); }

    // Delay
    public static void delay(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        }
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }

}
