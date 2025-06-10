package DemoQA.Alerts_Frames_Windows;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwichToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void AlertButtonTest() {
        var alertsPage = homePage.goToAlertsFramesWindow().goToAlerts();
        alertsPage.clickAlertButton();

        String expectedAlertText = "You clicked a button";

        Assert.assertEquals(getAlertText(), expectedAlertText, "\n Actual and expected message don't match \n");
        acceptAlert();
    }

    public void AlertDelayButtonTest() {
        var alertsPage = homePage.goToAlertsFramesWindow().goToAlerts();
        alertsPage.clickTimerAlertButton();
        delay(6000);

        String expectedAlertText = "This alert appeared after 5 seconds";

        Assert.assertEquals(getAlertText(), expectedAlertText, "\n Actual and expected message don't match \n");
        acceptAlert();
    }

    public void ConfirmationAlertButtonTest_Ok() {
        var alertsPage = homePage.goToAlertsFramesWindow().goToAlerts();
        alertsPage.clickConfirmButton();
        acceptAlert();

        String expectConfirmationResult = "You selected Ok";
        String actualConfirmationResult = alertsPage.getConfirmationResult();

        Assert.assertEquals(actualConfirmationResult, expectConfirmationResult, "\n You did not selected OK \n");
    }

    public void ConfirmationAlertButtonTest_Cancel() {
        var alertsPage = homePage.goToAlertsFramesWindow().goToAlerts();
        alertsPage.clickConfirmButton();
        dismissAlert();

        String expectConfirmationResult = "You selected Cancel";
        String actualConfirmationResult = alertsPage.getConfirmationResult();

        Assert.assertEquals(actualConfirmationResult, expectConfirmationResult, "\n You did not selected Cancel \n");
    }

}
