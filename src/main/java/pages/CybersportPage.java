package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CybersportPage extends BasePage {

    public CybersportPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyCybersportPageIsOpen() {
        String url = new CybersportPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/traffic-cybersport/");
        return true;
    }
}
