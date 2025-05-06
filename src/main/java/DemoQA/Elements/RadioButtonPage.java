package DemoQA.Elements;

import DemoQA.ElementsPage;
import org.openqa.selenium.By;

import static utilities.JavaScript.clickJS;

public class RadioButtonPage extends ElementsPage {

    private By yesRadioButton = By.xpath("//input[@id='yesRadio']");
    private By impressiveRadioButton = By.xpath("//input[@id='impressiveRadio']");
    private By noRadioButton = By.xpath("//input[@id='noRadio']");

    private By responseText = By.xpath("//p/span");

    public void clickYesRadioButton() {
        if(!findElement(yesRadioButton).isSelected()) {
            clickJS(yesRadioButton);
        }
    }

    public void clickImpressiveRadioButton() {
        if(!findElement(impressiveRadioButton).isSelected()) {
            clickJS(impressiveRadioButton);
        }
    }

    public String getResponseText() {
        delay(1000);
        return findElement(responseText).getText();
    }
}
