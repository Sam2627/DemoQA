package DemoQA.Elements;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CheckBoxTest extends BaseTest {

    public void clickHomeCheckBoxTest() {
        var checkBoxPage = homePage.goToElements().goToCheckBox();
        checkBoxPage.clickHomeCheckbox();

        String expectedResponseTest = "home";
        String actualResponseText = checkBoxPage.getSelectResponse("home");

        Assert.assertEquals(actualResponseText, expectedResponseTest,
                "\n Don't find expected response: " +  expectedResponseTest + "\n");
    }

}
