package DemoQA;

import Widgets.*;
import org.openqa.selenium.By;

import static utilities.JavaScript.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private By accordianMenuItem = By.xpath("//li[@id='item-0']/span[text()='Accordian']");
    private By autoCompleteMenuItem = By.xpath("//li[@id='item-1']/span[text()='Auto Complete']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']/span[text()='Slider']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
    private By tabsMenuItem = By.xpath("//li[@id='item-5']/span[text()='Tabs']");
    private By toolTipsMenuItem = By.xpath("//li[@id='item-6']/span[text()='Tool Tips']");
    private By menuMenuItem = By.xpath("//li[@id='item-7']/span[text()='Menu']");
    private By selectMenuMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");


    public AccordianPage clickAccordian() {
        scrollToElementJS(accordianMenuItem);
        clickElement(accordianMenuItem);
        return new AccordianPage();
    }

    public AutoCompletePage goToAutoComplete() {
        scrollToElementJS(autoCompleteMenuItem);
        clickElement(autoCompleteMenuItem);
        return new AutoCompletePage();
    }

    public DatePickerPage goToDatePicker() {
        scrollToElementJS(datePickerMenuItem);
        clickElement(datePickerMenuItem);
        return new DatePickerPage();
    }

    public SliderPage goToSlider() {
        scrollToElementJS(sliderMenuItem);
        clickElement(sliderMenuItem);
        return new SliderPage();
    }

    public ProgressBarPage goToProgressBar() {
        scrollToElementJS(progressBarMenuItem);
        clickElement(progressBarMenuItem);
        return new ProgressBarPage();
    }

    public TabsPage goToTabs() {
        scrollToElementJS(tabsMenuItem);
        clickElement(tabsMenuItem);
        return new TabsPage();
    }

    public ToolTipsPage goToToolTips() {
        scrollToElementJS(toolTipsMenuItem);
        clickElement(toolTipsMenuItem);
        return new ToolTipsPage();
    }

    public MenuPage goToMenu() {
        scrollToElementJS(menuMenuItem);
        clickElement(menuMenuItem);
        return new MenuPage();
    }

    public SelectMenuPage goToSelectMenu() {
        scrollToElementJS(selectMenuMenuItem);
        clickElement(selectMenuMenuItem);
        return new SelectMenuPage();
    }

}
