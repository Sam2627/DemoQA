package DemoQA.Alerts_Frames_Windows;

import DemoQA.AlertsFramesWindowPage;
import org.openqa.selenium.By;

import java.util.Set;

import static utilities.GetUtility.getWindowHandles;
import static utilities.SwichToUtility.switchToWindow;

public class BrowserWindowsPage extends AlertsFramesWindowPage {

    private By tabButton = By.id("tabButton");
    private By windowButton = By.id("windowButton");
    private By messageWindowButton = By.id("messageWindowButton");

    private By messageWindowResult = By.xpath("//body[contains(text(), 'Knowledge')]");

    public void clickTabButton() { clickElement(tabButton); }

    public void clickWindowButton() { clickElement(windowButton); }

    public void clickMessageWindowButton() { clickElement(messageWindowButton); }

    public void switchToNewWindow() {
        Set<String> allHandles = getWindowHandles();
        for (String handle : allHandles) switchToWindow(handle);
    }

    public void switchToNewWindow(String handle) { switchToWindow(handle); }

    public String getMessageWindow(){ return findElement(messageWindowResult).getText(); }

    public String getCurrentWindowID() { return driver.getWindowHandle(); }

}
