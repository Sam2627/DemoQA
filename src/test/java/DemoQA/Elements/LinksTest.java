package DemoQA.Elements;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;
//import static utilities.GetUtility.*;

@Test
public class LinksTest extends BaseTest {

    public void homeLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickHomeLink();
        linksPage.switchToNewWindow();

        String expectedURL = "https://demoqa.com/";
        String actualURL = getURL();

        Assert.assertEquals(actualURL, expectedURL,
                "\n Current windows URL: " + actualURL + "\n expect URL: " + expectedURL + " \n");
    }

    public void createdLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickCreatedLink();

        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("201") && actualResponse.contains("Created"),
                "\n Actual response :" + actualResponse + ". \n Doesn't contain '201' and 'Created' \n");
    }

    public void noContentLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickNoContentLink();

        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("204") && actualResponse.contains("No Content"),
                "\n Actual response :" + actualResponse + ". \n Doesn't contain '204' and 'No Content' \n");
    }

    public void movedLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickMovedLink();

        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("301") && actualResponse.contains("Moved Permanently"),
                "\n Actual response :" + actualResponse + ". \n Doesn't contain '301' and 'Moved Permanently' \n");
    }

    public void testLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickBadRequestLink();

        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual response :" + actualResponse + ". \n Doesn't contain '400' and 'Bad Request' \n");
    }

    public void unauthorizedLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickUnauthorizedLink();

        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("401") && actualResponse.contains("Unauthorized"),
                "\n Actual response :" + actualResponse + ". \n Doesn't contain '401' and 'Unauthorized' \n");
    }

    public void forbiddenLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickForbiddenLink();

        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("403") && actualResponse.contains("Forbidden"),
                "\n Actual response :" + actualResponse + ". \n Doesn't contain '403' and 'Forbidden' \n");
    }

    public void notFoundLinks() {
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickNotFoundLink();

        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("404") && actualResponse.contains("Not Found"),
                "\n Actual response :" + actualResponse + ". \n Doesn't contain '404' and 'Not Found' \n");
    }

}
