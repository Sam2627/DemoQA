package Widgets;

import DemoQA.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.DropDownUtility.selectByXPath;

public class DatePickerPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By selectDateYearDropDown = By.className("react-datepicker__year-select");
    private By selectDateMonthDropDown = By.className("react-datepicker__month-select");

    private By selectDateAndTimeField = By.id("dateAndTimePickerInput");
    private By dateAndTimeYearDropDown = By.cssSelector(".react-datepicker__year-read-view--selected-year");
    private By dateAndTimeMonthDropDown = By.cssSelector(".react-datepicker__month-read-view--selected-month");

    private String dateAndTimeYearDropDownOption = "//div[@class='react-datepicker__year-dropdown']/div[text()='";
    private String dateAndTimeMonthDropDownOption = "//div[@class='react-datepicker__month-dropdown']/div[text()='";

    private By dateAndTimeSelectYearNavUp = By.xpath("//div[@class='react-datepicker__year-option']/a[contains(@class, 'years-upcoming')]");
    private By dateAndTimeSelectYearNavDown = By.xpath("//div[@class='react-datepicker__year-option']/a[contains(@class, 'years-previous')]");

    // Select Date
    public void clickSelectDate() { clickElement(selectDateField); }

    public void selectDateSelectYear(String year) { selectByVisibleText(selectDateYearDropDown, year); }

    public void selectDateSelectMonth(String month) {
        selectByVisibleText(selectDateMonthDropDown, month);
    }

    private By dayXPath(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickDay(String day) { clickElement(dayXPath(day)); }

    public boolean isDayInMonth(String day) { return findElement(dayXPath(day)).isDisplayed(); }

    public String getDate() {
        return findElement(selectDateField).getAttribute("value");
    }

    //Date And Time
    public void clickDateAndTime() {
        clickElement(selectDateAndTimeField);
    }

    public void dateAndTimeSelectYear(String year) { selectByXPath(dateAndTimeYearDropDown, dateAndTimeYearDropDownOption, year); }

    public void dateAndTimeSelectMonth(String month) { selectByXPath(dateAndTimeMonthDropDown, dateAndTimeMonthDropDownOption, month); }

    // time format ab:cd (20:30)
    public void dateAndTimeSelectTime(String time) {
        By timePath = By.xpath("//li[contains(@class,'react-datepicker__time-list-item ')][text()='" + time + "']");
        clickElement(timePath);
    }

    public String getDateAndTime() {
        return findElement(selectDateAndTimeField).getAttribute("value");
    }

    // Move list year options up
    public void dateAndTimeSelectYearNavUp(){ clickElement(dateAndTimeSelectYearNavUp); }

    // Move list year options down
    public void dateAndTimeSelectYearNavDown(){ clickElement(dateAndTimeSelectYearNavDown); }

}
