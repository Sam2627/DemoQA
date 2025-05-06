package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

public class AccordianPage extends WidgetsPage {

    private By heading1 = By.id("section1Heading");
    private By heading2 = By.id("section2Heading");
    private By heading3 = By.id("section3Heading");

    public void clickHeading1() { clickElement(heading1); }

    public void clickHeading2() { clickElement(heading2); }

    public void clickHeading3() { clickElement(heading3); }

}
