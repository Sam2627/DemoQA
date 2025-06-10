package DemoQA.Alerts_Frames_Windows;

import DemoQA.AlertsFramesWindowPage;
import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramesWindowPage {

    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmButton = By.id("confirmButton");
    private By promtButton = By.id("promtButton");

    // Result from click - confirmButton
    private By confirmationResult = By.id("confirmResult");
    // Result from click - promtButton
    private By promptResult = By.id("promptResult");

    public void clickAlertButton() { clickElement(alertButton); }

    public void clickTimerAlertButton() { clickElement(timerAlertButton); }

    public void clickConfirmButton() { clickElement(confirmButton); }

    public void clickPromtButton() { clickElement(promtButton); }

    public String getConfirmationResult() { return findElement(confirmationResult).getText(); }

    public String getPromptResult() {
        return findElement(promptResult).getText();
    }

}
