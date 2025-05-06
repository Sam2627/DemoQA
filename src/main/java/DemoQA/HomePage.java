package DemoQA;

import BasePage.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScript.scrollToElementJS;

public class HomePage extends BasePage {

    private By elements = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By forms = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By alertsFrameWindows = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");
    private By widgets = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By interactions = By.xpath("//div[@id='app']//h5[text()='Interactions']");

    public ElementsPage goToElements() {
        scrollToElementJS(elements);
        clickElement(elements);
        return new ElementsPage();
    }

    public FormsPage goToForms() {
        scrollToElementJS(forms);
        clickElement(forms);
        return new FormsPage();
    }

    public AlertsFramesWindowPage goToAlertsFramesWindow() {
        scrollToElementJS(alertsFrameWindows);
        clickElement(alertsFrameWindows);
        return new AlertsFramesWindowPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgets);
        clickElement(widgets);
        return new WidgetsPage();
    }

    public InteractionsPage goToInteractions() {
        scrollToElementJS(interactions);
        clickElement(interactions);
        return new InteractionsPage();
    }

}
