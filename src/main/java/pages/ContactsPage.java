package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactsPage extends BasePage{

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Отправить сообщение']")
    private WebElement contactsPageTitle;

    @FindBy(xpath = "//select[@name='subject']")
    private WebElement subjectField;

    @Step("Verify Contacts Page Is Open")
    public boolean verifyContactsPageIsOpen() {
        String headerText = contactsPageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        String expectedRes = "ОТПРАВИТЬ СООБЩЕНИЕ";

        return isStringsEqual(headerText, expectedRes);
    }

    @Step("Verify Arrange A Meeting Is In A Subject Field")
    public boolean verifyArrangeAMeetingIsInASubjectField() {
        Select select = new Select(subjectField);
        String selectedOption = select.getFirstSelectedOption().getText().trim().toUpperCase();
        logger.info("In the subject field is: " + selectedOption);
        String expectedFieldText = "ДОГОВОРИТЬСЯ О ВСТРЕЧЕ";
        Assert.assertEquals(selectedOption, expectedFieldText);
        return true;
    }

}
