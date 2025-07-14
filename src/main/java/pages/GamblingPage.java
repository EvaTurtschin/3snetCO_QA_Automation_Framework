package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamblingPage extends BasePage {

    public GamblingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(normalize-space(), 'Гемблинг трафик')]")
    private WebElement gamblingPageTitle;

    public boolean verifyGamblingPageIsOpen() {
            String headerText = gamblingPageTitle.getText().toUpperCase().trim();
            System.out.println("HEADER TEXT: [" + headerText + "]");

            String expectedRes = "ГЕМБЛИНГ ПАРТНЕРКИ 2025. ГЕМБЛИНГ ТРАФИК";

            return isStringsEqual(headerText, expectedRes);
    }
}
