package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PromocodePage extends BasePage{

    public PromocodePage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyPromocodePageIsOpen() {
        String url = new PromocodePage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/promocode/");
        return true;
    }
}
