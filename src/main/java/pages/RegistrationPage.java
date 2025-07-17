package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Регистрация аффилейта')]")
    private WebElement registrationPageTitle;

    public boolean verifyRegistrationPageIsOpen() {
        String headerText = registrationPageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        String expectedRes = "РЕГИСТРАЦИЯ АФФИЛЕЙТА";

        return isStringsEqual(headerText, expectedRes);
    }

    public boolean verifyWithLinkRegistrationPageIsOpen() {
        String url = new RegistrationPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/affiliate-signup/");
        return true;
    }
}
