package DemoQA.Widgets;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SliderTest extends BaseTest {

    public void testSlider() {
        int x = 150; int y = 0;

        var sliderPage = homePage.goToWidgets().goToSlider();
        sliderPage.moveSlider(x, y);

        String expectedValue = "79";
        String actualValue = sliderPage.getSliderValue();

        Assert.assertEquals(actualValue, expectedValue, "Actual & expected value don't match");
    }

}
