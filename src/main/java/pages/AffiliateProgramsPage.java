package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateProgramsPage extends BasePage{

    public AffiliateProgramsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[@class='section-title level-1']")
    WebElement affiliatePageTitle;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    WebElement logoInHeader;

    @FindBy(xpath = "//a[@class='active who-we-are']")
    WebElement whoWeAreLinkInHeader;

    @FindBy(xpath = "//a[text()='РЕКЛАМОДАТЕЛИ']")
    WebElement advertisersLink;

    public boolean verifyAffiliateProgramsPageOpen() {
        String headerText = affiliatePageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        return headerText.contains("CPA ПАРТНЕРСКИЕ ПРОГРАММЫ:") &&
                headerText.contains("ТОП ОФФЕРЫ ДЛЯ ВЕБМАСТЕРОВ И РЕКЛАМОДАТЕЛЕЙ");
    }

    public void clickLogoInHeader () {
        click(logoInHeader);
    }

    public void clickWhoWeAreInHeader () {
        click(whoWeAreLinkInHeader);
    }

    public void clickAdvertisersInHeader() {
        click(advertisersLink);
    }


}
