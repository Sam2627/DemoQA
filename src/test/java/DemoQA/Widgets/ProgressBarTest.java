package DemoQA.Widgets;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ProgressBarTest extends BaseTest {

    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().goToProgressBar();
        progressBarPage.clickStartStopButton();
        delay(10000);

        String expected = "100%";
        String actual = progressBarPage.progressBarResult();

        Assert.assertEquals(actual, expected, "Actual and expected values don't match");
    }

}
