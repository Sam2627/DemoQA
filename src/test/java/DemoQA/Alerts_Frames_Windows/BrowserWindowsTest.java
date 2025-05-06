package DemoQA.Alerts_Frames_Windows;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

@Test
public class BrowserWindowsTest extends BaseTest {

    public void clickTabButtonTest() {
        var browserWindowsPage = homePage.goToAlertsFramesWindow().goToBrowserWindows();
        browserWindowsPage.clickTabButton();
        browserWindowsPage.switchToNewWindow();

        String expectedURL = "https://demoqa.com/sample";
        String actualURL = getURL();

        Assert.assertEquals(actualURL, expectedURL,
                "\n Current window URL: " + actualURL + "\n expected URL: " + expectedURL + " \n");
    }

    public void clickWindowButtonTest() {
        var browserWindowsPage = homePage.goToAlertsFramesWindow().goToBrowserWindows();
        browserWindowsPage.clickWindowButton();
        browserWindowsPage.switchToNewWindow();

        String expectedURL = "https://demoqa.com/sample";
        String actualURL = getURL();

        Assert.assertEquals(actualURL, expectedURL,
                "\n Current window URL: " + actualURL + "\n expected URL: " + expectedURL + " \n");
    }

    // Keep loading => assert window id
    public void clickMessageWindowButtonTest() {
        var browserWindowsPage = homePage.goToAlertsFramesWindow().goToBrowserWindows();
        browserWindowsPage.clickMessageWindowButton();

        String expected = browserWindowsPage.getCurrentWindowID();
        browserWindowsPage.switchToNewWindow();
        String actual = browserWindowsPage.getCurrentWindowID();
        browserWindowsPage.switchToNewWindow(expected);

        Assert.assertNotEquals(actual, expected,
                "\n Current and old ID must different \n" +
                "Current window ID: " + actual + "\n old window ID: " + expected + " \n");
    }

}
