package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

// For dropdown element
public class DropDownUtility extends Utility {

    // Method support other select
    private static Select findDropDown(By locator) { return new Select(driver.findElement(locator)); }

    // Select by text
    public static void selectByVisibleText(By locator, String text) { findDropDown(locator).selectByVisibleText(text); }

    // Select by index
    public static void selectByIndex(By locator, int index) { findDropDown(locator).selectByIndex(index); }

    // Select by value
    public static void selectByValue(By locator, String value) { findDropDown(locator).selectByValue(value); }

    // Deselect by text
    public static void deselectByVisibleText(By locator, String text) { findDropDown(locator).deselectByVisibleText(text); }

    // Deselect by index
    public static void deselectByIndex(By locator, int index) { findDropDown(locator).deselectByIndex(index);}

    // Deselect by value
    public static void deselectByValue(By locator, String value) { findDropDown(locator).deselectByValue(value); }

    // Get all select options - check assert
    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions = findDropDown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    // Select by XPath
    public static void selectByXPath(By locator, String xPath, String text) {
        By selectOption = By.xpath(xPath + text + "']");
        driver.findElement(locator).click();
        driver.findElement(selectOption).click();
    }

}
