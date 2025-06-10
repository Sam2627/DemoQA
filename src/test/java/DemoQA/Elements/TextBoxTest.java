package DemoQA.Elements;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TextBoxTest extends BaseTest {

    public void TexboxInputText() {
        var textBoxPage = homePage.goToElements().goToTextBox();
        By permanentAddressField = By.xpath("//textarea[@id='permanentAddress']");
        textBoxPage.setFullName("Test Full Name");
        textBoxPage.setEmail("exampleEmail@email.com");
        textBoxPage.setAddress("123 Selenium");
        textBoxPage.setAddress("456 Text House", permanentAddressField);
        textBoxPage.clickSubmitButton();
        delay(3000);

        String actual = textBoxPage.getTextBoxResult();

        Assert.assertTrue(actual.contains("Selenium"), "\n Actual & expected don't match \n");
    }

}
