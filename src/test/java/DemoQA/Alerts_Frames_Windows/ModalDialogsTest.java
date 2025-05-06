package DemoQA.Alerts_Frames_Windows;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ModalDialogsTest extends BaseTest {

    public void testSmallModalDialog() {
        var ModalDialogsPage = homePage.goToAlertsFramesWindow().goToModalDialogs();
        ModalDialogsPage.clickSmallModalButton();

        String actualTextS = ModalDialogsPage.getSmallModalText();

        Assert.assertTrue(actualTextS.contains("small modal"), "\n The message doesn't contain 'small model' \n");
        ModalDialogsPage.clickCloseSmallButton();
    }

    public void testLargeModalDialog() {
        var ModalDialogsPage = homePage.goToAlertsFramesWindow().goToModalDialogs();
        ModalDialogsPage.clickLargeModalButton();

        String actualTextS = ModalDialogsPage.getLargeModalText();

        Assert.assertTrue(actualTextS.contains("Lorem Ipsum"), "\n The message Doesn't contain 'Lorem Ipsum' \n");
        ModalDialogsPage.clickCloseLargeButton();
    }

}
