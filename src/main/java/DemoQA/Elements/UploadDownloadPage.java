package DemoQA.Elements;

import DemoQA.ElementsPage;
import org.openqa.selenium.By;

public class UploadDownloadPage extends ElementsPage {

    private By downloadButton = By.xpath("//*[@id='downloadButton']");
    private By chosenFileButton = By.xpath("//*[@id='uploadFile']");

    public void clickDownloadButton() { clickElement(downloadButton); }

    public void clickChosenFileButton() { clickElement(chosenFileButton); }

}
