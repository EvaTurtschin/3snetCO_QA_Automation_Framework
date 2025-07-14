package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BettingPage extends BasePage {

    public BettingPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyBettingPageIsOpen() {
        String url = new BettingPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/betting/");
        return true;
    }
}
