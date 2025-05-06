package DemoQA.Forms;

import DemoQA.FormsPage;
import org.openqa.selenium.By;

import static utilities.ActionsUtility.sendKeys;
import static utilities.ActionsUtility.sendKeysThenTab;
import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScript.clickJS;
import static utilities.JavaScript.scrollToElementJS;

public class PacTest extends FormsPage {

    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By userEmailField = By.id("userEmail");
    private By maleRadioButton = By.id("gender-radio-1");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By otherRadioButton = By.id("gender-radio-3");
    private By userNumber = By.id("userNumber");
    private By dateOfBirth = By.id("dateOfBirthInput");
    private By selectDateYearDropDown = By.className("react-datepicker__year-select");
    private By selectDateMonthDropDown = By.className("react-datepicker__month-select");
    private By subjectsField = By.className("subjects-auto-complete__control css-yk16xz-control");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By uploadPicture = By.id("uploadPicture");
    private By currentAddressField = By.id("currentAddress");
    private By selectStateField = By.xpath("//div[text()='Select State']");
    // Haryana
    //private By selectStateName = By.className(" css-2613qy-menu");
    private String selectStateXPath = "//div[@class='Select State']/div[text()='";

    private By selectCityField = By.xpath("//div[text()='Select City']");
    // Karnal

    private By submitButton = By.id("submit");

    public void setFirstName(String firstName) { sendKeys(findElement(firstNameField), firstName); }

    public void setLastName(String lastName) { sendKeys(findElement(lastNameField), lastName); }

    public void setUserEmail(String email) { sendKeys(findElement(userEmailField), email); }

    public void clickMaleRadioButton() {
        scrollToElementJS(maleRadioButton);
        clickJS(maleRadioButton);
    }

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public void clickOtherRadioButton() {
        scrollToElementJS(otherRadioButton);
        clickJS(otherRadioButton);
    }

    public boolean isMaleRadioButtonSelected() { return findElement(maleRadioButton).isSelected(); }

    public boolean isFemaleRadioButtonSelected() { return findElement(femaleRadioButton).isSelected(); }

    public boolean isOtherRadioButtonSelected() { return findElement(otherRadioButton).isSelected(); }

    public void setUserNumber(String number) { sendKeys(findElement(userNumber), number); }

    public boolean isUserNumberValid(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public void clickDateOfBirth() { clickElement(dateOfBirth); }

    public void selectDateSelectYear(String year) { selectByVisibleText(selectDateYearDropDown, year); }

    public void selectDateSelectMonth(String month) { selectByVisibleText(selectDateMonthDropDown, month); }

    private By dayXPath(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickDay(String day) { clickElement(dayXPath(day)); }

    public boolean isDayInMonth(String day) { return findElement(dayXPath(day)).isDisplayed(); }

    public void setSubjectsField(String subject) { sendKeysThenTab(findElement(subjectsField), subject); }

    public void clickSportsHobbyCheckbox() {
        if(!findElement(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckbox() {
        if(!findElement(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckbox() {
        if(!findElement(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclickSportsHobbyCheckbox() {
        if(findElement(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void unclickReadingHobbyCheckbox() {
        if(findElement(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void unclickMusicHobbyCheckbox() {
        if(findElement(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public boolean isSportsSelected() { return findElement(sportsHobbyCheckbox).isSelected(); }

    public boolean isReadingSelected() { return findElement(readingHobbyCheckbox).isSelected(); }

    public boolean isMusicSelected() { return findElement(musicHobbyCheckbox).isSelected(); }

    public void clickUploadPicture() {
        scrollToElementJS(uploadPicture);
        clickJS(uploadPicture);
    }

    public void setCurrentAddress(String currentAddress) { sendKeys(findElement(currentAddressField), currentAddress); }

    public void selectState(String state) {
        scrollToElementJS(selectStateField);
        clickJS(selectStateField);
        By xPath = By.xpath(selectStateXPath + state + "']");
        clickJS(xPath);
    }


    //public void clickSubmitButton() { clickElement(submitButton); }

}
