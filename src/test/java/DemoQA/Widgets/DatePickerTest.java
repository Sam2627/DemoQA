package DemoQA.Widgets;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DatePickerTest extends BaseTest {

    public void testSelectDate() {
        String year = "2030";
        String month = "December";
        String monthNumber = "12";
        String day = "30";

        var datePickerDatePage = homePage.goToWidgets().goToDatePicker();
        datePickerDatePage.clickSelectDate();
        datePickerDatePage.selectDateSelectYear(year);
        datePickerDatePage.selectDateSelectMonth(month);
        if(datePickerDatePage.isDayInMonth(day)) datePickerDatePage.clickDay(day);
        else {
            System.out.println("This month not have day: " + day);
            return;
        }

        String expectedDate = monthNumber + "/" + day + "/" + year;
        String actualDate = datePickerDatePage.getDate();

        Assert.assertEquals(actualDate, expectedDate, "\n Actual and expected date don't match \n" +
                "\n Actual date:   " + actualDate + "\n" +
                "\n Expected date: " + expectedDate + "\n");
    }

    public void testSelectDateAndTime() {
        String year = "2030";
        String month = "December";
        String day = "30";
        String time = "20:30";
        String timeResult = "8:30";
        String meridiem = "PM";

        var datePickerDatePage = homePage.goToWidgets().goToDatePicker();
        datePickerDatePage.clickDateAndTime();
        datePickerDatePage.dateAndTimeSelectYear(year);
        datePickerDatePage.dateAndTimeSelectMonth(month);
        if(datePickerDatePage.isDayInMonth(day)) datePickerDatePage.clickDay(day);
        else {
            System.out.println("This month not have day: " + day);
            return;
        }
        datePickerDatePage.dateAndTimeSelectTime(time);

        String expectedDate = month + " " + day + ", " + year + " " + timeResult + " " + meridiem;
        String actualDate = datePickerDatePage.getDateAndTime();

        Assert.assertEquals(actualDate, expectedDate, "\n Actual and expected date and time don't match \n" +
                "\n Actual date and time:   " + actualDate + "\n" +
                "\n Expected date and time: " + expectedDate + "\n");
    }

}
