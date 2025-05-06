package DemoQA.Interactions;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SortableTest extends BaseTest {

    public void SortableListTest() {
        var sortablePage = homePage.goToInteractions().goToSortable();
        sortablePage.clickTabList();

        String expected = "fade tab-pane active show";
        String actual = sortablePage.getTabpaneListClassName();

        Assert.assertEquals(actual, expected,
                "\n Don't find expected class name: " +  expected + "\n");
    }

    public void SortableGridTest() {
        var sortablePage = homePage.goToInteractions().goToSortable();
        sortablePage.clickTabGrid();

        String expected = "fade tab-pane";
        String actual = sortablePage.getTabpaneListClassName();

        Assert.assertEquals(actual, expected,
                "\n Don't find expected class name: " +  expected + "\n");
    }

}
