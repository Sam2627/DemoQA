package DemoQA.Elements;

import DemoQA.ElementsPage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.doubleClick;
import static utilities.ActionsUtility.rightClick;

public class ButtonsPage extends ElementsPage {

    private By doubleClickButton = By.id("doubleClickBtn");
    private By rightClickButton = By.id("rightClickBtn");
    // Unusual case
    private By clickMeButton = By.xpath("//button[starts-with(text(), 'Click Me')]");

    private By doubleClickResponse = By.id("doubleClickMessage");
    private By rightClickResponse = By.id("rightClickMessage");
    private By dynamicClickResponse = By.id("dynamicClickMessage");

    // Click button

    public void clickDoubleClickButton(){ doubleClick(findElement(doubleClickButton)); }

    public void clickRightClickButton(){ rightClick(findElement(rightClickButton)); }

    public void clickClickMeButton(){ clickElement(clickMeButton); }

    // Get response

    public String getDoubleClickResponse() {
        delay(2000);
        return findElement(doubleClickResponse).getText();
    }

    public String getRightClickResponse() {
        delay(2000);
        return findElement(rightClickResponse).getText();
    }

    public String getClickMeResponse() {
        delay(2000);
        return findElement(dynamicClickResponse).getText();
    }

}
