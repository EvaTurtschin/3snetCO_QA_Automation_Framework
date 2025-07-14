package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DatingPage extends BasePage{

    public DatingPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyDatingPageIsOpen() {
        String url = new DatingPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/dating/");
        return true;
    }
}
