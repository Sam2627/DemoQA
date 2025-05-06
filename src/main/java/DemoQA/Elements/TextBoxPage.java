package DemoQA.Elements;

import DemoQA.ElementsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScript.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage {

    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By permanentAddressField = By.xpath("//textarea[@id='permanentAddress']");
    private By submitButton = By.id("submit");

    private By textBoxResult = By.xpath("//p[@id='currentAddress']");

    public void setFullName(String name) {
        scrollToElementJS(fullNameField);
        setText(fullNameField, name);
    }

    public void setEmail(String email) {
        scrollToElementJS(emailField);
        sendKeys(findElement(emailField), Keys.chord(email));
    }

    public void setAddress(String address) {
        scrollToElementJS(currentAddressField);
        findElement(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void setAddress(String address, By typeAddress) {
        scrollToElementJS(typeAddress);
        findElement(typeAddress).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        clickElement(submitButton);
    }

    public String getTextBoxResult() {
        explicitWaitUntilVisible(5, textBoxResult);
        return getText(textBoxResult);
    }

}
