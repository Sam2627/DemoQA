package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.hoveringMouse;

public class MenuPage extends WidgetsPage {

    private By mainItem1 = By.xpath("//ul[@id='nav']//a[text()='Main Item 1']");
    private By mainItem2 = By.xpath("//ul[@id='nav']//a[text()='Main Item 2']");
    private By mainItem3 = By.xpath("//ul[@id='nav']//a[text()='Main Item 3']");

    public void hoverMainItem2() { hoveringMouse(findElement(mainItem2)); }

}
