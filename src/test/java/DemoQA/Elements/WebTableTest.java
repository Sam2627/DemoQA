package DemoQA.Elements;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        String email = "cierra@example.com";
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("30");
        webTablePage.clickSubmitButton();

        String expectedAge = "30";
        String actualAge = webTablePage.getTableAge(email);

        Assert.assertEquals(actualAge, expectedAge, "\n Actual and expected age don't match \n");
    }

}
