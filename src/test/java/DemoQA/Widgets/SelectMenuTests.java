package DemoQA.Widgets;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class SelectMenuTests extends BaseTest {

    public void testOldStyleSelectMenu(){
        var selectMenuPage = homePage.goToWidgets().goToSelectMenu();
        selectMenuPage.selectOldStyleSelectMenu("Aqua");

        String expected = "Aqua";
        String actual = selectMenuPage.getOldStyleSelectMenu();

        //Assert.assertEquals(actual, expected, "Actual & expected value don't match");
    }

    public void testStandardMultiSelect() {
        var selectMenuPage = homePage.goToWidgets().goToSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);
        selectMenuPage.deselectStandardMulti("saab");

        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "\n Saab Is Selected As An Option \n");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }

}
