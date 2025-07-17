package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePage extends BasePage {

    private HomePageHeader header;
    private HomePageAdvetisers advetisers;
    private HomePageVerticals verticals;

    public HomePage(WebDriver driver) {
        super(driver);
        this.header = new HomePageHeader(driver);
        this.advetisers = new HomePageAdvetisers(driver);
        this.verticals = new HomePageVerticals(driver);
    }

    public HomePageHeader header() {
        return header;
    }

    public HomePageAdvetisers advetisers() {
        return advetisers;
    }

    public HomePageVerticals verticals() {
        return verticals;
    }

    public String getHomePageUrl() {
        return "https://3snet.co/";
    }

    @FindBy(xpath = "//a[@class ='btn yellowGrd']")
    private WebElement join3SNetButton;
    @FindBy(xpath = "//div[@class ='col-xs-12 join-3snet']")
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

    @Step("Click Join 3SNet Button")
    public RegistrationPage clickJoin3SNetButton() {
        clickWithJSScroll(join3SNetButton);
        logger.info("Clicked on the Join 3SNet Button");
        return new RegistrationPage(driver);
    }

    @Step("Verify Join 3SNet Button changes behavior on hover")
    public boolean verifyJoin3SNetButtonChangesColorOnHover(){
        moveToElement(join3SNetButtonSection);
        String initialStyle = join3SNetButton.getCssValue("background");
        logger.info("Initial color: " +initialStyle);
        moveToElement(join3SNetButton);
        String hoveredStyle = join3SNetButton.getCssValue("background");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
        return true;
    }

    @Step("Verify First Event Banner Title Changes Color On Hover")
    public boolean verifyFirstEventBannerTitleChangesColorOnHover() {
        moveToElement(letsMeetSection);
        waitUntilVisible(firstEventBanner);
        String initialStyle = firstEventBanner.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(firstEventBanner);
        String hoveredStyle = firstEventBanner.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text color should change on hover");
        return true;
    }

    @Step("Click on the first Event Banner")
    public ContactsPage clickFirstEventBanner() {
            clickWithJSScroll(firstEventBanner);
            logger.info("Clicked on the first Event Banner");
            return new ContactsPage(driver);
    }

    @Step("Click on the second Event Banner")
    public boolean verifySecondEventBannerTitleChangesColorOnHover() {
        moveToElement(letsMeetSection);
        waitUntilVisible(secondEventBanner);
        String initialStyle = secondEventBanner.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(secondEventBanner);
        String hoveredStyle = secondEventBanner.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text color should change on hover");
        return true;
    }
    @Step("Click on the second Event Banner")
    public ContactsPage clickSecondEventBanner() {
        clickWithJSScroll(secondEventBanner);
        logger.info("Clicked on the second Event Banner");
        return new ContactsPage(driver);
    }

    @Step("Verify Offers Link in Round Ellipses Section changes on hover")
    public boolean verifyOffersLinkInRoundEllipsesSectionChangesOnHover(){
        moveToElement(navigationInRoundEllipses);
        String initialStyle = offersInRoundEllipses.getCssValue("text-decoration");
        logger.info("Initial test-decoration: " +initialStyle);
        moveToElement(offersInRoundEllipses);
        String hoveredStyle = offersInRoundEllipses.getCssValue("text-decoration");
        logger.info("Hoved test-decoration: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text-decoration should change on hover");
        return true;
    }

    @Step("Click on the Offers Link in Round Ellipses Section")
    public BestOffersPage clickOffersLinkInRoundEllipsesSection() {
        clickWithJSScroll(offersInRoundEllipses);
        logger.info("Clicked on the Offers Link in Round Ellipses Section");
        return new BestOffersPage(driver);
    }

    @Step("Verify Promocode Link in Round Ellipses Section changes on hover")
    public boolean verifyPromocodeLinkInRoundEllipsesSectionChangesOnHover(){
        moveToElement(navigationInRoundEllipses);
        String initialStyle = promocodeInRoundEllipses.getCssValue("text-decoration");
        logger.info("Initial test-decoration: " +initialStyle);
        moveToElement(promocodeInRoundEllipses);
        String hoveredStyle = promocodeInRoundEllipses.getCssValue("text-decoration");
        logger.info("Hoved test-decoration: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text-decoration should change on hover");
        return true;
    }

    @Step("Click on the Promocode Link in Round Ellipses Section")
    public PromocodePage clickPromocodeLinkInRoundEllipsesSection() {
        clickWithJSScroll(promocodeInRoundEllipses);
        logger.info("Clicked on the Promocode Link in Round Ellipses Section");
        return new PromocodePage(driver);
    }

    @Step("Verify Affiliate Programs Link in Round Ellipses Section changes on hover")
    public boolean verifyAffiliateProgramsLinkInRoundEllipsesSectionChangesOnHover(){
        moveToElement(navigationInRoundEllipses);
        String initialStyle = affiliateProgramsInRoundEllipses.getCssValue("text-decoration");
        logger.info("Initial test-decoration: " +initialStyle);
        moveToElement(affiliateProgramsInRoundEllipses);
        String hoveredStyle = affiliateProgramsInRoundEllipses.getCssValue("text-decoration");
        logger.info("Hoved test-decoration: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Text-decoration should change on hover");
        return true;
    }

    @Step("Click on the Affiliate Programs Link in Round Ellipses Section")
    public AffiliateProgramsPage clickAffiliateProgramsLinkInRoundEllipsesSection() {
        clickWithJSScroll(affiliateProgramsInRoundEllipses);
        logger.info("Clicked on the Affiliate Programs Link in Round Ellipses Section");
        return new AffiliateProgramsPage(driver);
    }


}
