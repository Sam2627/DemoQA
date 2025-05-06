package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.sendKeysThenTab;
import static utilities.GetUtility.getText;

public class AutoCompletePage extends WidgetsPage {

    private By multipleColor = By.id("autoCompleteMultipleContainer");
    private By singleColor = By.xpath("//div[contains(@class, 'auto-complete__value-container css')]");

    private By singleColorResult = By.xpath("//div[@class='auto-complete__single-value css-1uccc91-singleValue']");

    //div[@class='auto-complete__control css-yk16xz-control']//div[text()='Blue']

    public void inputMultipleColor(String text) { sendKeysThenTab(findElement(multipleColor), text); }

    public void inputSingleColor(String text) { sendKeysThenTab(findElement(singleColor), text); }

    public String getInputMultiColor(String color){
        By xPath = By.xpath("//div[@id='autoCompleteMultipleContainer']// div[text()='" + color + "']");
        return getText(xPath);
    }

    public String getInputSingleColor() { return getText(singleColorResult); }

}
