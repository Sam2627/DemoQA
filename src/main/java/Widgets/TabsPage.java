package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

public class TabsPage extends WidgetsPage {

    private By tabWhat =By.id("demo-tab-what");
    private By tabOrigin =By.id("demo-tab-origin");
    private By tabUse =By.id("demo-tab-use");
    private By tabMore =By.id("demo-tab-more");

    public void clickTabWhat() { clickElement(tabWhat); }

    public void clickTabOrigin() { clickElement(tabOrigin); }

    public void clickTabUse() { clickElement(tabUse); }

}
