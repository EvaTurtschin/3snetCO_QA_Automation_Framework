package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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

    @Step ("Verify Affiliate Programs Page is Open")
    public boolean verifyAffiliateProgramsPageOpen() {
        String url = new PromocodePage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/affiliate_programs/");
        return true;
    }

    @Step ("Getting Title")
    public String getTitle() {
        return title.getText();
    }

    @Step ("Getting Placeholder Search text")
    public String getSearchDefaultText() {
        return placeholderSearchText.getAttribute("placeholder");
    }

    @Step ("Getting Category Default text")
    public String getVerticalDefaultText() {
        return categoryDefaultText.getText();
    }

    @Step ("Getting Payment Model Default text")
    public String getPaymentModelDefaultText() {
        return paymentModelDefaultText.getText();
    }

    @Step ("Getting GEO Default text")
    public String getGeoDefaultText() {
        return getGeoDefaultText.getText();
    }

    @Step("Click Join Button on Affiliate Programs Page")
    public ContactsPage clickJoin() {
        joinButton.click();

        return new ContactsPage(driver);
    }

    @Step("Click Betting Button on Affiliate Programs Page")
    public BettingPage clickBettingButton() {
        bettingButton.click();

        return new BettingPage(driver);
    }

    @Step("Click Gambling Button on Affiliate Programs Page")
    public GamblingPage clickGamblingButton() {
        gamblingButton.click();

        return new GamblingPage(driver);
    }

    @Step("Click Cybersport Button on Affiliate Programs Page")
    public CybersportPage clickCybersportButton() {
        cybersportButton.click();

        return new CybersportPage(driver);
    }

    @Step("Click Loto Button on Affiliate Programs Page")
    public LotteryPage clickLotoButton() {
        lotoButton.click();

        return new LotteryPage(driver);
    }

    @Step("Click Poker Button on Affiliate Programs Page")
    public PokerPage clickPokerButton() {
        pokerButton.click();

        return new PokerPage(driver);
    }

    @Step("Click Logo in header on Affiliate Programs Page")
    public void clickLogoInHeader () {
        click(logoInHeader);
    }

    @Step("Click Who We Are Link in Header Navigation on Affiliate Programs Page")
    public void clickWhoWeAreInHeader () {
        click(whoWeAreLinkInHeader);
    }

}
