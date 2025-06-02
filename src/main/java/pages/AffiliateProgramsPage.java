package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateProgramsPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement title;

    @FindBy(xpath = "//h1[@class='section-title level-1']")
    WebElement affiliatePageTitleContain;

    @FindBy(name = "affiliate_search")
    WebElement placeholderSearchText;

    @FindBy(xpath = "//*[contains(@class, 'affiliate_category')]//*[@class='jq-selectbox__select-text']")
    WebElement categoryDefaultText;

    @FindBy(xpath = "//*[contains(@class, 'affiliate_payment_model')]//*[@class='jq-selectbox__select-text']")
    WebElement paymentModelDefaultText;

    @FindBy(xpath = "//*[contains(@class, 'affiliate_geo')]//*[@class='jq-selectbox__select-text']")
    WebElement getGeoDefaultText;

    public AffiliateProgramsPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyAffiliateProgramsPageOpen() {
        String headerText = affiliatePageTitleContain.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        return headerText.contains("CPA ПАРТНЕРСКИЕ ПРОГРАММЫ:") &&
                headerText.contains("ТОП ОФФЕРЫ ДЛЯ ВЕБМАСТЕРОВ И РЕКЛАМОДАТЕЛЕЙ");
    }

    public String getTitle() {
        return title.getText();
    }

    public String getPlaceholderSearchText() {
        return placeholderSearchText.getAttribute("placeholder");
    }

    public String getCategoryDefaultText() {
        return categoryDefaultText.getText();
    }

    public String getPaymentModelDefaultText() {
        return paymentModelDefaultText.getText();
    }

    public String getGeoDefaultText() {
        return getGeoDefaultText.getText();
    }
}
