package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage{

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Отправить сообщение']")
    private WebElement contactsPageTitle;

    public boolean verifyContactsPageIsOpen() {
        String headerText = contactsPageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        String expectedRes = "ОТПРАВИТЬ СООБЩЕНИЕ";

        return isStringsEqual(headerText, expectedRes);
    }

}
