package DemoQA.Widgets;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ToolTipsTest extends BaseTest {

    public void testToolTipButton() {
        var toolTipsPage = homePage.goToWidgets().goToToolTips();
        toolTipsPage.hoverToolTipButton();
        delay(500);

        String expected = "You hovered over the Button";
        String actual = toolTipsPage.getToolTipButton();

        Assert.assertEquals(actual, expected, "Actual & expected value don't match");
    }

    public void testToolTipField() {
        var toolTipsPage = homePage.goToWidgets().goToToolTips();
        toolTipsPage.hoverTexFieldTool();
        delay(500);

        String expected = "You hovered over the text field";
        String actual = toolTipsPage.getToolTipField();

        Assert.assertEquals(actual, expected, "Actual & expected value don't match");
    }

}
