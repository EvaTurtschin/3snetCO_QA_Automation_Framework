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
        String headerText = affiliatePageTitleContain.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        return headerText.contains("CPA ПАРТНЕРСКИЕ ПРОГРАММЫ:") &&
                headerText.contains("ТОП ОФФЕРЫ ДЛЯ ВЕБМАСТЕРОВ И РЕКЛАМОДАТЕЛЕЙ");
    }
}
