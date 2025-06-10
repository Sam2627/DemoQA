package DemoQA.Forms;

import DemoQA.FormsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.ActionsUtility.sendKeysThenTab;
import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScript.clickJS;
import static utilities.JavaScript.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By userEmailField = By.id("userEmail");
    private By maleRadioButton = By.id("gender-radio-1");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By otherRadioButton = By.id("gender-radio-3");
    private By userNumberField = By.id("userNumber");
    private By dateOfBirth = By.id("dateOfBirthInput");
    private By selectDateYearDropDown = By.className("react-datepicker__year-select");
    private By selectDateMonthDropDown = By.className("react-datepicker__month-select");
    private By subjectsField = By.id("subjectsContainer");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By uploadPicture = By.id("uploadPicture");
    private By currentAddressField = By.id("currentAddress");
    private By selectStateField = By.xpath("//div[text()='Select State']");
    private By selectCityField = By.xpath("//div[text()='Select City']");
    private String selectStateCityXPath = "//div[@class=' css-26l3qy-menu']//div[text()='";
    private By submitButton = By.id("submit");

    public void setFirstName(String firstName) {
        scrollToElementJS(firstNameField);
        setText(firstNameField, firstName);
    }

    public void setLastName(String lastName) {
        scrollToElementJS(lastNameField);
        clickElement(lastNameField);
        sendKeys(findElement(lastNameField), Keys.chord(lastName));
    }

    public void setUserEmail(String email) {
        scrollToElementJS(userEmailField);
        clickElement(userEmailField);
        sendKeys(findElement(userEmailField), Keys.chord(email));
    }

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

    public void setUserNumber(String number) {
        scrollToElementJS(userEmailField);
        sendKeys(findElement(userNumberField), number);
    }

    public void clickDateOfBirth() {
        scrollToElementJS(dateOfBirth);
        clickElement(dateOfBirth);
    }

    public void selectDateSelectYear(String year) { selectByVisibleText(selectDateYearDropDown, year); }

    public void selectDateSelectMonth(String month) { selectByVisibleText(selectDateMonthDropDown, month); }

    private By dayXPath(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void selectDay(String day) { clickElement(dayXPath(day)); }

    public boolean isDayInMonth(String day) { return findElement(dayXPath(day)).isDisplayed(); }

    public void selectSubjectsField(String subject) { sendKeysThenTab(findElement(subjectsField), subject); }

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

    public void setCurrentAddress(String currentAddress) { setText(currentAddressField, currentAddress, true); }

    public void selectState(String state) {
        scrollToElementJS(selectStateField);
        clickElement(selectStateField);
        By xPath = By.xpath(selectStateCityXPath + state + "']");
        clickElement(xPath);
    }

    public void selectCity(String city) {
        scrollToElementJS(selectCityField);
        clickElement(selectCityField);
        By xPath = By.xpath(selectStateCityXPath + city + "']");
        clickElement(xPath);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        clickElement(submitButton);
    }

}
