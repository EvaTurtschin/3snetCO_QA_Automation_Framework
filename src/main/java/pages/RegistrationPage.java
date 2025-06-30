package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Регистрация аффилейта')]")
    WebElement registrationPageTitle;

    public boolean varifyRegistrationPageIsOpen() {
        String headerText = registrationPageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        String expectedRes = "РЕГИСТРАЦИЯ АФФИЛЕЙТА";

        return isStringsEqual(headerText, expectedRes);
    }
}
