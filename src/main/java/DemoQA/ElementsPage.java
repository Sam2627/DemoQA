package DemoQA;

import DemoQA.Elements.*;
import org.openqa.selenium.By;

import static utilities.JavaScript.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");
    private By checkBoxMenuItem = By.xpath("//li[@id='item-1']/span[text()='Check Box']");
    private By radioButtonMenuItem = By.xpath("//li[@id='item-2']/span[text()='Radio Button']");
    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By buttonsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Buttons']");
    private By linksMenuItem= By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By brokenLinksMenuItem= By.xpath("//li[@id='item-6']/span[text()='Broken Links - Images']");
    private By uploadDownloadMenuItem= By.xpath("//li[@id='item-7']/span[text()='Upload and Download']");
    private By dynamicPropertiesMenuItem= By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");

    public TextBoxPage goToTextBox() {
        scrollToElementJS(textBoxMenuItem);
        clickElement(textBoxMenuItem);
        return new TextBoxPage();
    }

    public CheckBoxPage goToCheckBox() {
        scrollToElementJS(checkBoxMenuItem);
        clickElement(checkBoxMenuItem);
        return new CheckBoxPage();
    }

    public RadioButtonPage goToRadioButton() {
        scrollToElementJS(radioButtonMenuItem);
        clickElement(radioButtonMenuItem);
        return new RadioButtonPage();
    }

    public WebTablesPage clickWebTables() {
        scrollToElementJS(webTablesMenuItem);
        clickElement(webTablesMenuItem);
        return new WebTablesPage();
    }

    public ButtonsPage goToButtons() {
        scrollToElementJS(buttonsMenuItem);
        clickElement(buttonsMenuItem);
        return new ButtonsPage();
    }

    public LinksPage goToLinks() {
        scrollToElementJS(linksMenuItem);
        clickElement(linksMenuItem);
        return new LinksPage();
    }

    public BrokenLinksPage goToBrokenLinks() {
        scrollToElementJS(brokenLinksMenuItem);
        clickElement(brokenLinksMenuItem);
        return new BrokenLinksPage();
    }

    public UploadDownloadPage goToUploadDownload() {
        scrollToElementJS(uploadDownloadMenuItem);
        clickElement(uploadDownloadMenuItem);
        return new UploadDownloadPage();
    }

    public DynamicPropertiesPage goToDynamicProperties() {
        scrollToElementJS(dynamicPropertiesMenuItem);
        clickElement(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

}
