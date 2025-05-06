package Base;

import BasePage.BasePage;
import DemoQA.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String demoQAUrl = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void LoadApp() {
        driver.get(demoQAUrl);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/(" +
                    java.time.LocalDate.now() + ")" +
                    testResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At " + destination);
        }
    }

    @AfterClass
    public void tearDownTest() {
        delay(2000);
        driver.quit();
    }

    public static void delay(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        }
        catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }

    // Print all windows ID
    public void printWindowID() {
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
                //switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }

        String newCurrentHandle = driver.getWindowHandle();
        System.out.println("Current window: " + newCurrentHandle + "\n");
    }

}
