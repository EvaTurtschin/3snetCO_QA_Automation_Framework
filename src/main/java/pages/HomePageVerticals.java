package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePageVerticals extends BasePage{

    public HomePageVerticals(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='verticals']")
    private WebElement verticalsSection;
    @FindBy(xpath = "//a[@href='gambling/']/parent::li")
    private WebElement gamblingIconInVerticals;
    @FindBy(xpath = "//a[@href='gambling/']")
    private WebElement gamblingBackground;
    @FindBy(xpath = "//img[@class='image-gambling']")
    private WebElement gamblingIconImage;
    @FindBy(xpath = "//a[@href='poker/']/parent::li")
    private WebElement pokerIconInVerticals;
    @FindBy(xpath = "//a[@href='poker/']")
    private WebElement pokerBackground;
    @FindBy(xpath = "//img[@class='image-poker']")
    private WebElement pokerIconImage;
    @FindBy(xpath = "//a[@href='betting/']/parent::li")
    private WebElement bettingIconInVerticals;
    @FindBy(xpath = "//a[@href='betting/']")
    private WebElement bettingBackground;
    @FindBy(xpath = "//img[@class='image-betting']")
    private WebElement bettingIconImage;
    @FindBy(xpath = "//a[@href='loto/']/parent::li")
    private WebElement lotteryIconInVerticals;
    @FindBy(xpath = "//a[@href='loto/']")
    private WebElement lotteryBackground;
    @FindBy(xpath = "//img[@class='image-loto']")
    private WebElement lotteryIconImage;
    @FindBy(xpath = "//a[@href='traffic-cybersport/']/parent::li")
    private WebElement cybersportIconInVerticals;
    @FindBy(xpath = "//a[@href='traffic-cybersport/']")
    private WebElement cybersportBackground;
    @FindBy(xpath = "//img[@class='image-cybersport']")
    private WebElement cybersportIconImage;
    @FindBy(xpath = "//a[@href='dating/']/parent::li")
    private WebElement datingIconInVerticals;
    @FindBy(xpath = "//a[@href='dating/']")
    private WebElement datingBackground;
    @FindBy(xpath = "//img[@class='image-dating']")
    private WebElement datingIconImage;

    @Step("Verify Gabbling Icon in Verticals section changes behavior on hover")
    public void verifyGamblingVerticalChangesColorOnHover(){
        moveToElement(verticalsSection);
        String initialStyle = gamblingBackground.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(gamblingIconInVerticals);
        String hoveredStyle = gamblingBackground.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
    }

    @Step("Verify Gambling icon image in Verticals section animates on hover")
    public void verifyGamblingImageAnimationOnHover() {
        moveToElement(verticalsSection);
        String initialTransform = gamblingIconImage.getCssValue("transform");
        logger.info("Initial transform: " +initialTransform);
        moveToElement(gamblingIconInVerticals);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String hoveredTransform = gamblingIconImage.getCssValue("transform");
        logger.info("Hovered transform: " + hoveredTransform);
        Assert.assertNotEquals(hoveredTransform, initialTransform, "Icon image should animate on hover");
    }

    @Step("Verify Poker Icon in Verticals section changes behavior on hover")
    public void verifyPokerVerticalChangesColorOnHover(){
        moveToElement(verticalsSection);
        String initialStyle = pokerBackground.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(pokerIconInVerticals);
        String hoveredStyle = pokerBackground.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
    }

    @Step("Verify Poker icon image in Verticals section animates on hover")
    public void verifyPokerImageAnimationOnHover() {
        moveToElement(verticalsSection);
        String initialTransform = pokerIconImage.getCssValue("transform");
        logger.info("Initial transform: " +initialTransform);
        moveToElement(pokerIconInVerticals);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String hoveredTransform = pokerIconImage.getCssValue("transform");
        logger.info("Hovered transform: " + hoveredTransform);
        Assert.assertNotEquals(hoveredTransform, initialTransform, "Icon image should animate on hover");
    }

    @Step("Verify Betting Icon in Verticals section changes behavior on hover")
    public void verifyBettingVerticalChangesColorOnHover(){
        moveToElement(verticalsSection);
        String initialStyle = bettingBackground.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(bettingIconInVerticals);
        String hoveredStyle = bettingBackground.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
    }

    @Step("Verify Betting icon image in Verticals section animates on hover")
    public void verifyBettingImageAnimationOnHover() {
        moveToElement(verticalsSection);
        String initialTransform = bettingIconImage.getCssValue("transform");
        logger.info("Initial transform: " +initialTransform);
        moveToElement(bettingIconInVerticals);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String hoveredTransform = bettingIconImage.getCssValue("transform");
        logger.info("Hovered transform: " + hoveredTransform);
        Assert.assertNotEquals(hoveredTransform, initialTransform, "Icon image should animate on hover");
    }

    @Step("Verify Lottery Icon in Verticals section changes behavior on hover")
    public void verifyLotteryVerticalChangesColorOnHover(){
        moveToElement(verticalsSection);
        String initialStyle = lotteryBackground.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(lotteryIconInVerticals);
        String hoveredStyle = lotteryBackground.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
    }

    @Step("Verify Lottery icon image in Verticals section animates on hover")
    public void verifyLotteryImageAnimationOnHover() {
        moveToElement(verticalsSection);
        String initialTransform = lotteryIconImage.getCssValue("transform");
        logger.info("Initial transform: " +initialTransform);
        moveToElement(lotteryIconInVerticals);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String hoveredTransform = lotteryIconImage.getCssValue("transform");
        logger.info("Hovered transform: " + hoveredTransform);
        Assert.assertNotEquals(hoveredTransform, initialTransform, "Icon image should animate on hover");
    }

    @Step("Verify Cybersport Icon in Verticals section changes behavior on hover")
    public void verifyCybersportVerticalChangesColorOnHover(){
        moveToElement(verticalsSection);
        String initialStyle = cybersportBackground.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(cybersportIconInVerticals);
        String hoveredStyle = cybersportBackground.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
    }

    @Step("Verify Cybersport icon image in Verticals section animates on hover")
    public void verifyCybersportImageAnimationOnHover() {
        moveToElement(verticalsSection);
        String initialTransform = cybersportIconImage.getCssValue("transform");
        logger.info("Initial transform: " +initialTransform);
        moveToElement(cybersportIconInVerticals);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String hoveredTransform = cybersportIconImage.getCssValue("transform");
        logger.info("Hovered transform: " + hoveredTransform);
        Assert.assertNotEquals(hoveredTransform, initialTransform, "Icon image should animate on hover");
    }

    @Step("Verify Dating Icon in Verticals section changes behavior on hover")
    public void verifyDatingVerticalChangesColorOnHover(){
        moveToElement(verticalsSection);
        String initialStyle = datingBackground.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(datingIconInVerticals);
        String hoveredStyle = datingBackground.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
    }

    @Step("Verify Dating icon image in Verticals section animates on hover")
    public void verifyDatingImageAnimationOnHover() {
        moveToElement(verticalsSection);
        String initialTransform = datingIconImage.getCssValue("transform");
        logger.info("Initial transform: " +initialTransform);
        moveToElement(datingIconInVerticals);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String hoveredTransform = datingIconImage.getCssValue("transform");
        logger.info("Hovered transform: " + hoveredTransform);
        Assert.assertNotEquals(hoveredTransform, initialTransform, "Icon image should animate on hover");
    }

    @Step("Click Gambling Icon in Verticals section")
    public void clickGamblingIconInVerticals() {
        click(gamblingIconInVerticals);
        logger.info("Clicked on the Gambling Icon in Verticals section");
    }

    @Step("Verify Gambling Icon is Clickable")
    public boolean verifyGamblingIconIsClickable() {
        return isElementClickable(gamblingIconInVerticals);
    }

    public PokerPage clickPokerIconInVerticals() {
        click(pokerIconInVerticals);
        logger.info("Clicked on the Poker Icon in Verticals section");
        return new PokerPage(driver);
    }

    @Step("Verify Poker Icon is Clickable")
    public boolean verifyPokerIconIsClickable() {
        return isElementClickable(pokerIconInVerticals);
    }

    @Step("Click Betting Icon In Verticals")
    public BettingPage clickBettingIconInVerticals() {
        click(bettingIconInVerticals);
        logger.info("Clicked on the Betting Icon in Verticals section");
        return new BettingPage(driver);
    }

    @Step("Verify Betting Icon is Clickable")
    public boolean verifyBettingIconIsClickable() {
        return isElementClickable(bettingIconInVerticals);
    }

    @Step("Click Lottery Icon In Verticals")
    public LotteryPage clickLotteryIconInVerticals() {
        click(lotteryIconInVerticals);
        logger.info("Clicked on the Lottery Icon in Verticals section");
        return new LotteryPage(driver);
    }

    @Step("Verify Lottery Icon is Clickable")
    public boolean verifyLotteryIconIsClickable() {
        return isElementClickable(lotteryIconInVerticals);
    }

    @Step("Click Cybersport Icon In Verticals")
    public CybersportPage clickCybersportIconInVerticals() {
        click(cybersportIconInVerticals);
        logger.info("Clicked on the Cybersport Icon in Verticals section");
        return new CybersportPage(driver);
    }

    @Step("Verify Cybersport Icon is Clickable")
    public boolean verifyCybersportIconIsClickable() {
        return isElementClickable(cybersportIconInVerticals);
    }

    @Step("Click Dating Icon In Verticals")
    public DatingPage clickDatingIconInVerticals() {
        click(datingIconInVerticals);
        logger.info("Clicked on the Dating Icon in Verticals section");
        return new DatingPage(driver);
    }

    @Step("Verify Dating Icon is Clickable")
    public boolean verifyDatingIconIsClickable() {
        return isElementClickable(datingIconInVerticals);
    }


}
