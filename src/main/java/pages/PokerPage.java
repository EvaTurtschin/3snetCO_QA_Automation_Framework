package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PokerPage extends BasePage {

    public PokerPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyPokerPageIsOpen() {
        String url = new PokerPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/poker/");
        return true;
    }
}
