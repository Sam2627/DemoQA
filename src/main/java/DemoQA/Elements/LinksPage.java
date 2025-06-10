package DemoQA.Elements;

import DemoQA.ElementsPage;
import org.openqa.selenium.By;

import java.util.Set;

import static utilities.JavaScript.scrollToElementJS;
import static utilities.SwichToUtility.switchToWindow;

public class LinksPage extends ElementsPage {

    private By homeLink = By.id("simpleLink");
    private By createdLink = By.id("created");
    private By badRequestLink = By.id("bad-request");
    private By noContentLink = By.id("no-content");
    private By movedLink = By.id("moved");
    private By unauthorizedLink = By.id("unauthorized");
    private By forbiddenLink = By.id("forbidden");
    private By notFoundLink = By.id("invalid-url");

    private By responseLink = By.id("linkResponse");

    public void clickHomeLink() {
        scrollToElementJS(homeLink);
        clickElement(homeLink);
    }

    public void switchToNewWindow() {
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open Windows: " + allHandles.size() + "\n");

        // Scroll through all windows ID and land on the last window
        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st Window ID: " + handle);
            }
            else {
                //driver.switchTo().window(handle);
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }
    }

    public void clickCreatedLink() {
        scrollToElementJS(createdLink);
        clickElement(createdLink);
    }

    public void clickBadRequestLink() {
        scrollToElementJS(badRequestLink);
        clickElement(badRequestLink);
    }

    public void clickNoContentLink() {
        scrollToElementJS(noContentLink);
        clickElement(noContentLink);
    }

    public void clickMovedLink() {
        scrollToElementJS(movedLink);
        clickElement(movedLink);
    }

    public void clickUnauthorizedLink() {
        scrollToElementJS(unauthorizedLink);
        clickElement(unauthorizedLink);
    }

    public void clickForbiddenLink() {
        scrollToElementJS(forbiddenLink);
        clickElement(forbiddenLink);
    }

    public void clickNotFoundLink() {
        scrollToElementJS(notFoundLink);
        clickElement(notFoundLink);
    }

    public String getResponse() {
        delay(3000);
        return findElement(responseLink).getText();
    }

}
