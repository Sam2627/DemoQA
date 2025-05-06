package DemoQA;

import DemoQA.Forms.PracticeFormPage;
import org.openqa.selenium.By;

import static utilities.JavaScript.scrollToElementJS;

public class FormsPage extends HomePage {

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage goToPracticeForm() {
        scrollToElementJS(practiceFormMenuItem);
        clickElement(practiceFormMenuItem);
        return new PracticeFormPage();
    }

}
