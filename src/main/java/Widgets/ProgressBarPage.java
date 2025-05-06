package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

public class ProgressBarPage extends WidgetsPage {

    private By startStopButton = By.id("startStopButton");
    private By progressBar = By.xpath("//div[@id='progressBar']/div");

    public void clickStartStopButton() { clickElement(startStopButton); }

    public String progressBarResult() { return findElement(progressBar).getText(); }

}
