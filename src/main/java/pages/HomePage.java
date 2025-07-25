package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

    private HomePageHeader header;
    private HomePageAdvertisers advetisers;
    private HomePageVerticals verticals;
    private HomePageTopOffers topOffers;
    private HomePageQuickLinks quickLinks;
    private HomePageFooter footer;

    public HomePage(WebDriver driver) {
        super(driver);
        this.header = new HomePageHeader(driver);
        this.advetisers = new HomePageAdvertisers(driver);
        this.verticals = new HomePageVerticals(driver);
        this.topOffers = new HomePageTopOffers(driver);
        this.quickLinks = new HomePageQuickLinks(driver);
        this.footer = new HomePageFooter(driver);
    }

    public HomePageHeader header() {
        return header;
    }
    public HomePageAdvertisers advetisers() {
        return advetisers;
    }
    public HomePageVerticals verticals() {
        return verticals;
    }
    public HomePageTopOffers topOffers() {return topOffers;}
    public HomePageQuickLinks quickLinks() {return quickLinks;}
    public HomePageFooter footer() {return footer;}

    public String getHomePageUrl() {
        return "https://3snet.co/";
    }

    @FindBy(xpath = "//a[@class ='btn yellowGrd']")
    private WebElement join3SNetButton;
    @FindBy(xpath = "//div[contains(@class, 'join-3snet')]")
    private WebElement join3SNetButtonSection;
    @FindBy(xpath = "//li[@class='online-help']") //section[@id='eventsFrom3SnetInfo']")
    private WebElement letsMeetSection;
    @FindBy(xpath = "(//a[contains(@href,'/contacts')])[2]")
    private WebElement firstEventBanner;
    @FindBy(xpath = "(//a[contains(@href,'/contacts')])[4]")
    private WebElement secondEventBanner;
    @FindBy(xpath = "//img[@class='image-round-ellipses']")
    private WebElement navigationInRoundEllipses;
    @FindBy(xpath = "(//a[@href='/best_offers/'])[1]")
    private WebElement offersInRoundEllipses;
    @FindBy(xpath = "(//a[@href='/promocode/'])[1]")
    private WebElement promocodeInRoundEllipses;
    @FindBy(xpath = "//a[@href='/affiliate_programs/']")
    private WebElement affiliateProgramsInRoundEllipses;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchInputField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchSubmitButton;
    @FindBy(xpath = "//div[contains(@class, 'grecaptcha-badge')]")
    private WebElement captcha;


    @Step("Click Submit Button in Search Section")
    public SearchResultsPage clickSubmitButtonInSearchSection() {
        waitUntilClickable(searchSubmitButton);
        clickWithJSScroll(searchSubmitButton);
        logger.info("Clicked on the Submit Button in Search Section");
        return new SearchResultsPage(driver);
    }

    @Step("Click Input Field in Search Section")
    public void clickInputFieldInSearchSection() {
        waitUntilVisible(searchInputField);
        clickWithJSScroll(searchInputField);
        logger.info("Clicked on the Input Field in Search Section");
    }

    @Step("Press Enter Key While Focused On Input Field In Search Section")
    public SearchResultsPage pressEnterKeyWhileFocusedOnInputFieldInSearchSection() {
        moveToElement(searchInputField);
        searchInputField.sendKeys(Keys.ENTER);
        logger.info("Enter Key pressed on the Input Field in Search Section");
        return new SearchResultsPage(driver);
    }

    @Step("Enter text 'test text' into Input Field in Search Section")
    public void enterTextInInputFieldInSearchSection() {
        typeText(searchInputField, "test text");
    }

    @Step("Click Join 3SNet Button")
    public RegistrationPage clickJoin3SNetButton() {
        clickWithJSScroll(join3SNetButton);
        logger.info("Clicked on the Join 3SNet Button");
        return new RegistrationPage(driver);
    }

    @Step("Verify Join 3SNet Button changes behavior on hover")
    public void verifyJoin3SNetButtonChangesColorOnHover(){
        moveToElement(join3SNetButtonSection);
        String initialStyle = join3SNetButton.getCssValue("background");
        logger.info("Initial color: " +initialStyle);
        waitUntilClickable(join3SNetButtonSection);
        moveToElement(join3SNetButton);
        waitUntilCssValueChanges(join3SNetButton, "background", initialStyle);
        String hoveredStyle = join3SNetButton.getCssValue("background");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
    }

    @Step("Verify First Event Banner Title Changes Color On Hover")
    public void verifyFirstEventBannerTitleChangesColorOnHover() {
        moveToElement(letsMeetSection);
        waitUntilVisible(firstEventBanner);
        String initialStyle = firstEventBanner.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(firstEventBanner);
        waitUntilCssValueChanges(firstEventBanner, "color", initialStyle);
        String hoveredStyle = firstEventBanner.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text color should change on hover");
    }

    @Step("Click on the first Event Banner")
    public ContactsPage clickFirstEventBanner() {
            clickWithJSScroll(firstEventBanner);
            logger.info("Clicked on the first Event Banner");
            return new ContactsPage(driver);
    }

    @Step("Click on the second Event Banner")
    public void verifySecondEventBannerTitleChangesColorOnHover() {
        moveToElement(letsMeetSection);
        waitUntilVisible(secondEventBanner);
        String initialStyle = secondEventBanner.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(secondEventBanner);
        waitUntilCssValueChanges(secondEventBanner, "color", initialStyle);
        String hoveredStyle = secondEventBanner.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text color should change on hover");
    }
    @Step("Click on the second Event Banner")
    public ContactsPage clickSecondEventBanner() {
        clickWithJSScroll(secondEventBanner);
        logger.info("Clicked on the second Event Banner");
        return new ContactsPage(driver);
    }

    @Step("Verify Offers Link in Round Ellipses Section changes on hover")
    public void verifyOffersLinkInRoundEllipsesSectionChangesOnHover(){
        moveToElement(navigationInRoundEllipses);
        String initialStyle = offersInRoundEllipses.getCssValue("text-decoration");
        logger.info("Initial test-decoration: " +initialStyle);
        moveToElement(offersInRoundEllipses);
        waitUntilCssValueChanges(offersInRoundEllipses, "text-decoration", initialStyle);
        String hoveredStyle = offersInRoundEllipses.getCssValue("text-decoration");
        logger.info("Hoved test-decoration: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text-decoration should change on hover");
    }

    @Step("Click on the Offers Link in Round Ellipses Section")
    public BestOffersPage clickOffersLinkInRoundEllipsesSection() {
        clickWithJSScroll(offersInRoundEllipses);
        logger.info("Clicked on the Offers Link in Round Ellipses Section");
        return new BestOffersPage(driver);
    }

    @Step("Verify Promocode Link in Round Ellipses Section changes on hover")
    public void verifyPromocodeLinkInRoundEllipsesSectionChangesOnHover(){
        moveToElement(navigationInRoundEllipses);
        String initialStyle = promocodeInRoundEllipses.getCssValue("text-decoration");
        logger.info("Initial test-decoration: " +initialStyle);
        moveToElement(promocodeInRoundEllipses);
        waitUntilCssValueChanges(promocodeInRoundEllipses, "text-decoration", initialStyle);
        String hoveredStyle = promocodeInRoundEllipses.getCssValue("text-decoration");
        logger.info("Hoved test-decoration: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text-decoration should change on hover");
    }

    @Step("Click on the Promocode Link in Round Ellipses Section")
    public PromocodePage clickPromocodeLinkInRoundEllipsesSection() {
        clickWithJSScroll(promocodeInRoundEllipses);
        logger.info("Clicked on the Promocode Link in Round Ellipses Section");
        return new PromocodePage(driver);
    }

    @Step("Verify Affiliate Programs Link in Round Ellipses Section changes on hover")
    public void verifyAffiliateProgramsLinkInRoundEllipsesSectionChangesOnHover(){
        moveToElement(navigationInRoundEllipses);
        String initialStyle = affiliateProgramsInRoundEllipses.getCssValue("text-decoration");
        logger.info("Initial test-decoration: " +initialStyle);
        moveToElement(affiliateProgramsInRoundEllipses);
        waitUntilCssValueChanges(affiliateProgramsInRoundEllipses, "text-decoration", initialStyle);
        String hoveredStyle = affiliateProgramsInRoundEllipses.getCssValue("text-decoration");
        logger.info("Hoved test-decoration: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text-decoration should change on hover");
    }

    @Step("Click on the Affiliate Programs Link in Round Ellipses Section")
    public AffiliateProgramsPage clickAffiliateProgramsLinkInRoundEllipsesSection() {
        clickWithJSScroll(affiliateProgramsInRoundEllipses);
        logger.info("Clicked on the Affiliate Programs Link in Round Ellipses Section");
        return new AffiliateProgramsPage(driver);
    }

    public void verifyCaptchaOpensOnHover() {
        String captchaRightValue = captcha.getCssValue("right");
        logger.info("Right Value before hover: " + captchaRightValue);
        moveToElement(captcha);
        String captchaOpened = captcha.getCssValue("right");
        logger.info("Right Value after hover: " + captchaOpened);
        Assert.assertNotEquals(captchaRightValue, captchaOpened);
    }
}
