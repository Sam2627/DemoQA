package DemoQA.Forms;

import Base.BaseTest;
import org.testng.annotations.Test;

@Test
public class PracticeFormTest extends BaseTest {

    public void StudentRegistrationFormTest() {
        var practiceFormPage = homePage.goToForms().goToPracticeForm();
        practiceFormPage.setFirstName("My First Name");
        practiceFormPage.setLastName("My Last Name");
        practiceFormPage.setUserEmail("MyEmailCTU@ctu.edu");
        practiceFormPage.clickMaleRadioButton();
        if (practiceFormPage.isMaleRadioButtonSelected()) System.out.println("Male button is selected");
        practiceFormPage.setUserNumber("0949000006");
        practiceFormPage.clickDateOfBirth();
        practiceFormPage.selectDateSelectYear("1900");
        practiceFormPage.selectDateSelectMonth("January");
        if(practiceFormPage.isDayInMonth("1")) practiceFormPage.selectDay("1");
        else {
            System.out.println("This month not have day: 1");
            return;
        }
        practiceFormPage.selectSubjectsField("ma");
        practiceFormPage.selectSubjectsField("co");
        practiceFormPage.clickMusicHobbyCheckbox();
        if (practiceFormPage.isMusicSelected()) System.out.println("Music hobby is selected");
        practiceFormPage.clickReadingHobbyCheckbox();
        if (practiceFormPage.isReadingSelected()) System.out.println("Reading hobby is selected");
        practiceFormPage.setCurrentAddress("123 CT");
        practiceFormPage.selectState("Haryana");
        practiceFormPage.selectCity("Karnal");
        delay(3000);
        practiceFormPage.clickSubmitButton();
        delay(5000);
    }

}
