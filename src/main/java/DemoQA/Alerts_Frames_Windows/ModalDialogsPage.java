package DemoQA.Alerts_Frames_Windows;

import DemoQA.AlertsFramesWindowPage;
import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertsFramesWindowPage {

    private By smallModalButton = By.id("showSmallModal");
    private By largeModalButton = By.id("showLargeModal");
    private By smallModalText = By.xpath("//div[contains(text(), 'small modal')]");
    private By largeModalText = By.xpath("//p[contains(text(), 'Lorem Ipsum')]");
    private By closeButtonSmall = By.id("closeSmallModal");
    private By closeButtonLarge = By.id("closeLargeModal");

    public void clickSmallModalButton() { clickElement(smallModalButton); }

    public void clickLargeModalButton() {
        clickElement(largeModalButton);
    }

    public String getSmallModalText() { return findElement(smallModalText).getText(); }

    public String getLargeModalText() {
        return findElement(largeModalText).getText();
    }

    public void clickCloseSmallButton() {
        clickElement(closeButtonSmall);
    }

    public void clickCloseLargeButton() {
        clickElement(closeButtonLarge);
    }

}
