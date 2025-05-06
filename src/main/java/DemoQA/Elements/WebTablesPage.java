package DemoQA.Elements;

import DemoQA.ElementsPage;
import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By userEmailField = By.id("userEmail");
    private By ageField = By.id("age");
    private By salaryField = By.id("salary");
    private By departmentField = By.id("department");
    private By submitButton = By.id("submit");

    public void clickEdit(String email) {
        By edit = By.xpath("//div[text()='"+ email +"']//following::span[@id='edit-record-1']");
        clickElement(edit);
    }

    public void clickDelete(String email) {
        By delete = By.xpath("//div[text()='"+ email +"']//following::span[@title='Delete']");
        clickElement(delete);
    }

    public void setFirstName(String firstName) {  setText(firstNameField, firstName); }

    public void setLastName(String lastName) { setText(lastNameField, lastName); }

    public void setUserEmail(String userEmail) { setText(userEmailField, userEmail); }

    public void setAge(String age) { setText(ageField, age); }

    public void setSalary(String salary) { setText(salaryField, salary); }

    public void setDepartment(String department) { setText(departmentField, department); }

    public void clickSubmitButton() { clickElement(submitButton); }

    public String getEmail(String email) {
        By tableEmail = By.xpath("//div[text()='"+ email +"']");
        return findElement(tableEmail).getText();
    }

    // Get text in cell by email - preceding of email
    public String getFirstName(String email) {
        By tableFirstName = By.xpath("//div[text()='"+ email +"']//preceding::div[3]");
        return findElement(tableFirstName).getText();
    }

    public String getTableLastName(String email) {
        By tableLastName = By.xpath("//div[text()='"+ email +"']//preceding::div[2]");
        return findElement(tableLastName).getText();
    }

    public String getTableAge(String email) {
        By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
        return findElement(tableAge).getText();
    }

    // Get text in cell by email - following of email
    public String getTableSalary(String email) {
        By tableSalary = By.xpath("//div[text()='"+ email +"']//following::div[1]");
        return findElement(tableSalary).getText();
    }

    public String getTableDepartment(String email) {
        By tableDepartment = By.xpath("//div[text()='"+ email +"']//following::div[2]");
        return findElement(tableDepartment).getText();
    }

}
