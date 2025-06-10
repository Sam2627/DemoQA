package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScript.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {

    private By selectValue = By.xpath("//div[text()='Select Option']");
    private By selectOne = By.xpath("//div[text()='Select Title']");
    private By oldStyleSelectMenu = By.id("oldSelectMenu");
    private By multiselectDropDown = By.xpath("//div[text()='Select...']");
    private By standardMultiSelect = By.id("cars");

    // Select Value


    // Select One


    // Old Style Select Menu
    public void selectOldStyleSelectMenu(String color) { selectByVisibleText(oldStyleSelectMenu, color); }

    public String getOldStyleSelectMenu() { return findElement(oldStyleSelectMenu).getText(); }

    // Multiselect drop down


    // Standard multi select
    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect ,value);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiSelect);
    }

}
