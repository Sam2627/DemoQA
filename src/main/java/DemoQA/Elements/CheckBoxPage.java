package DemoQA.Elements;

import DemoQA.ElementsPage;
import org.openqa.selenium.By;

import static utilities.JavaScript.clickJS;
import static utilities.JavaScript.scrollToElementJS;

public class CheckBoxPage extends ElementsPage {

    private By homeCheckbox = By.id("tree-node-home");

    private By selectedHomeResponse = By.xpath("//div[@id='result']/span[text()='home']");
    private By selectedResponse = By.xpath("//div[@id='result']/span[text()='home']");

    public void clickHomeCheckbox() {
        if(!findElement(homeCheckbox).isSelected()) {
            scrollToElementJS(homeCheckbox);
            clickJS(homeCheckbox);
        }
    }

    public String getSelectHomeResponse() {
        delay(2000);
        return findElement(selectedHomeResponse).getText();
    }

    public String getSelectResponse(String selected) {
        delay(2000);
        By selectedResponse = By.xpath("//div[@id='result']/span[text()='" + selected + "']");
        return findElement(selectedResponse).getText();
    }

}
