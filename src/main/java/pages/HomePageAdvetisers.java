package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageAdvetisers extends BasePage{

    public HomePageAdvetisers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[contains(text(), 'Рекламодатели')]")
    private WebElement advetisersSectionTitle;

    public String getAdvetisersAnchorUrl() {
        return "https://3snet.co/#ourAdvertisers";
    }

    @Step("Verify Advertiser section is visible")
    public boolean verifyAdvertiserSectionIsVisible() {
        moveToElement(advetisersSectionTitle);
        return isElementVisible(advetisersSectionTitle);
    }
}
