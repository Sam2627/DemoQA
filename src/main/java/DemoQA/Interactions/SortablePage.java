package DemoQA.Interactions;

import DemoQA.InteractionsPage;
import org.openqa.selenium.By;

public class SortablePage extends InteractionsPage {

    private By demoTabList = By.id("demo-tab-list");
    private By demoTabGrid = By.id("demo-tab-grid");

    private By tabpaneList = By.id("demo-tabpane-list");

    public void clickTabList() { clickElement(demoTabList); }

    public void clickTabGrid() { clickElement(demoTabGrid); }

    public String getTabpaneListClassName() { return findElement(tabpaneList).getAttribute("class"); }

}
