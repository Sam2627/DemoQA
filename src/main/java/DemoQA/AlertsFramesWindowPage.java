package DemoQA;

import DemoQA.Alerts_Frames_Windows.*;
import org.openqa.selenium.By;

import static utilities.JavaScript.scrollToElementJS;

public class AlertsFramesWindowPage extends HomePage {

    private By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private By nestedFramesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Nested Frames']");
    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");

    public BrowserWindowsPage goToBrowserWindows() {
        scrollToElementJS(browserWindowsMenuItem);
        clickElement(browserWindowsMenuItem);
        return new BrowserWindowsPage();
    }

    public AlertsPage goToAlerts() {
        scrollToElementJS(alertsMenuItem);
        clickElement(alertsMenuItem);
        return new AlertsPage();
    }

    public FramesPage goToFrames() {
        scrollToElementJS(framesMenuItem);
        clickElement(framesMenuItem);
        return new FramesPage();
    }

    public NestedFramesPage goToNestedFrames() {
        scrollToElementJS(nestedFramesMenuItem);
        clickElement(nestedFramesMenuItem);
        return new NestedFramesPage();
    }

    public ModalDialogsPage goToModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        clickElement(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

}
