package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateProgramsPage extends BasePage{

    public AffiliateProgramsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[@class='section-title level-1']")
    WebElement affiliatePageTitleContain;

    public boolean verifyAffiliateProgramsPageOpen() {
        String headerText = affiliatePageTitleContain.getText();
        return headerText.contains("CPA партнерские программы:");
    }
}
