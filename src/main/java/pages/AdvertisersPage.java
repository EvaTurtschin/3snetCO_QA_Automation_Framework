package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvertisersPage extends BasePage{

    public AdvertisersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[contains(normalize-space(),'Рекламодатели cpa-сети 3snet')]")
    WebElement advertisersBlockTitleContain;


    public boolean verifyAdvertisersPageOpen() {
        String headerText = advertisersBlockTitleContain.getText();
        return headerText.contains("Рекламодатели cpa-сети 3snet");
    }
}
