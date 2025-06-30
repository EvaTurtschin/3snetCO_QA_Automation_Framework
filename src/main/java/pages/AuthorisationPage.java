package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorisationPage extends BasePage{

    public AuthorisationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Авторизация')]")
    WebElement authorisationPageTitle;

    public boolean varifyAuthorisationPageIsOpen() {
        String headerText = authorisationPageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        String expectedRes = "АВТОРИЗАЦИЯ";

        return isStringsEqual(headerText, expectedRes);
    }


}
