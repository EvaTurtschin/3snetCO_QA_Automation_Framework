package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BestOffersPage extends BasePage{

    public BestOffersPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyBestOffersPageIsOpen() {
        String url = new BestOffersPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/best_offers/");
        return true;
    }
}
