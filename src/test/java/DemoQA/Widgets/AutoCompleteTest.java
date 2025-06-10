package DemoQA.Widgets;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class AutoCompleteTest extends BaseTest {

    public void testMulipleColor() {
        String color1 = "r";
        String color2 = "b";
        String color3 = "y";
        String color4 = "b";

        var autoCompletePage = homePage.goToWidgets().goToAutoComplete();
        autoCompletePage.inputMultipleColor(color1);
        autoCompletePage.inputMultipleColor(color2);
        autoCompletePage.inputMultipleColor(color3);
        autoCompletePage.inputMultipleColor(color4);

        String expected = "Black";
        String actual = autoCompletePage.getInputMultiColor(expected);

        Assert.assertTrue(actual.contains(expected), "\n Actual and expected color don't match \n" +
                "\n Actual color:   " + actual + "\n" +
                "\n Expected color: " + expected + "\n");
    }

    public void testSingleColor() {
        String color = "r";

        var autoCompletePage = homePage.goToWidgets().goToAutoComplete();
        autoCompletePage.inputSingleColor(color);

        String expectedDate = "Red";
        String actualDate = autoCompletePage.getInputSingleColor();

        Assert.assertEquals(actualDate, expectedDate, "\n Actual and expected color don't match \n" +
                "\n Actual color:   " + actualDate + "\n" +
                "\n Expected color: " + expectedDate + "\n");
    }

}
