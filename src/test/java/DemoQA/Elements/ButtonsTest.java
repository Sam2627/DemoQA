package DemoQA.Elements;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ButtonsTest extends BaseTest {

    public void doubleClickTest() {
        var buttonsPage = homePage.goToElements().goToButtons();
        buttonsPage.clickDoubleClickButton();

        String expected = "You have done a double click";
        String actual = buttonsPage.getDoubleClickResponse();

        Assert.assertEquals(actual, expected,
                "\n Don't find expected response: " +  expected + "\n");
    }

    public void rightClickTest() {
        var buttonsPage = homePage.goToElements().goToButtons();
        buttonsPage.clickRightClickButton();

        String expected = "You have done a right click";
        String actual = buttonsPage.getRightClickResponse();

        Assert.assertEquals(actual, expected,
                "\n Don't find expected response: " +  expected + "\n");
    }

    public void clickMeTest() {
        var buttonsPage = homePage.goToElements().goToButtons();
        buttonsPage.clickClickMeButton();

        String expected = "You have done a dynamic click";
        String actual = buttonsPage.getClickMeResponse();

        Assert.assertEquals(actual, expected,
                "\n Don't find expected response: " +  expected + "\n");
    }

}
