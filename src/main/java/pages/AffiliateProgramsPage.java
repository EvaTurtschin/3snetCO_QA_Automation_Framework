package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateProgramsPage extends BasePage {

    public AffiliateProgramsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    private WebElement title;

    @FindBy(xpath = "//h1[@class='section-title level-1']")
    private WebElement affiliatePageTitleContain;

    @FindBy(name = "affiliate_search")
    private WebElement placeholderSearchText;

    @FindBy(xpath = "//*[contains(@class, 'affiliate_category')]//*[@class='jq-selectbox__select-text']")
    private WebElement categoryDefaultText;

    @FindBy(xpath = "//*[contains(@class, 'affiliate_payment_model')]//*[@class='jq-selectbox__select-text']")
    private WebElement paymentModelDefaultText;

    @FindBy(xpath = "//*[contains(@class, 'affiliate_geo')]//*[@class='jq-selectbox__select-text']")
    private WebElement getGeoDefaultText;

    @FindBy(xpath = "//*[.='Присоединиться']")
    private WebElement joinButton;

    @FindBy(xpath = "//*[@class='affiliate-program-item all-programs']/*[.='Беттинг']")
    private WebElement bettingButton;

    @FindBy(xpath = "//*[@class='affiliate-program-item all-programs']/*[.='Гемблинг']")
    private WebElement gamblingButton;

    @FindBy(xpath = "//*[@class='affiliate-program-item all-programs']/*[.='Киберспорт']")
    private WebElement cybersportButton;

    @FindBy(xpath = "//*[@class='affiliate-program-item all-programs']/*[.='Лотереи']")
    private WebElement lotoButton;

    @FindBy(xpath = "//*[@class='affiliate-program-item all-programs']/*[.='Покер']")
    private WebElement pokerButton;

    @FindBy(xpath = "//h1[@class='section-title level-1']")
    private WebElement affiliatePageTitle;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement logoInHeader;

    @FindBy(xpath = "//a[@class='active who-we-are']")
    private WebElement whoWeAreLinkInHeader;

    @FindBy(xpath = "//a[text()='РЕКЛАМОДАТЕЛИ']")
    private WebElement advertisersLink;

    public boolean verifyAffiliateProgramsPageOpen() {
        String headerText = affiliatePageTitle.getText().toUpperCase().trim();
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

    public ContactsPage clickJoin() {
        joinButton.click();

        return new ContactsPage(driver);
    }

    public BettingPage clickBettingButton() {
        bettingButton.click();

        return new BettingPage(driver);
    }

    public GamblingPage clickGamblingButton() {
        gamblingButton.click();

        return new GamblingPage(driver);
    }

    public CybersportPage clickCybersportButton() {
        cybersportButton.click();

        return new CybersportPage(driver);
    }

    public LotteryPage clickLotoButton() {
        lotoButton.click();

        return new LotteryPage(driver);
    }

    public PokerPage clickPokerButton() {
        pokerButton.click();

        return new PokerPage(driver);
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
