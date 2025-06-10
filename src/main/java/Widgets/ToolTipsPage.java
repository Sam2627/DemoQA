package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.hoveringMouse;

public class ToolTipsPage extends WidgetsPage {

    private By toolTipButton = By.id("toolTipButton");
    private By texFieldTool = By.id("toolTipTextField");

    private By toolTipButtonText = By.xpath("//div[text()='You hovered over the Button']");
    private By toolTipFieldText = By.xpath("//div[text()='You hovered over the text field']");

    public void hoverToolTipButton() { hoveringMouse(findElement(toolTipButton)); }

    public void hoverTexFieldTool() { hoveringMouse(findElement(texFieldTool)); }

    public String getToolTipButton() { return findElement(toolTipButtonText).getText(); }

    public String getToolTipField() { return findElement(toolTipFieldText).getText(); }

}
