package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class WaitUtility extends Utility{

    // Wait for condition if not meet before designated return timeout error
    public static void explicitWaitUntilVisible(int seconds, By locator ) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Similar to explicit but with more controls
    public static void fluentWaitUntilVisible(int seconds, By locator) {
        FluentWait fluentWait = new FluentWait(driver)
                // Set timeout
                .withTimeout(Duration.ofSeconds(seconds))
                // Set time between each condition checking
                .pollingEvery(Duration.ofMillis(500))
                // Ignore exception
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
