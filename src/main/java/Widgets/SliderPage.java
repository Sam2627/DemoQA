package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.dragAndDrop;
import static utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage {

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");

    public void moveSlider(int x, int y) { dragAndDrop(findElement(slider),x, y); }

    public String getSliderValue() {
        return getAttribute(sliderValue, "value");
    }

}
