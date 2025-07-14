package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LotteryPage extends BasePage {

    public LotteryPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyLotteryPageIsOpen() {
        String url = new LotteryPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/loto/");
        return true;
    }
}
