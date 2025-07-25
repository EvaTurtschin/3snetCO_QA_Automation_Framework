package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePageAdvertisers extends BasePage{

    public HomePageAdvertisers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[contains(text(), 'Рекламодатели')]")
    private WebElement advertisersSectionTitle;
    @FindBy(xpath = "//section[@class='affiliate_programs ']")
    private WebElement advertisersCardsSection;
    @FindBy(xpath = "(//button[@class='btn'])[1]")
    private WebElement firstCardMoreButton;
    @FindBy(xpath = "(//button[@class='btn'])[2]")
    private WebElement secondCardMoreButton;
    @FindBy(xpath = "(//button[@class='btn'])[3]")
    private WebElement thirdCardMoreButton;
    @FindBy(xpath = "(//button[@class='btn'])[4]")
    private WebElement forthCardMoreButton;
    @FindBy(xpath = "(//button[@class='btn'])[5]")
    private WebElement fifthCardMoreButton;
    @FindBy(xpath = "(//button[@class='btn'])[6]")
    private WebElement sixthCardMoreButton;
    @FindBy(xpath = "(//button[@class='btn'])[7]")
    private WebElement seventhCardMoreButton;
    @FindBy(xpath = "(//button[@class='btn'])[8]")
    private WebElement eighthCardMoreButton;
    @FindBy(xpath = "(//div[@class='affiliate_program_name'])[1]")
    private WebElement firstAdvertiserCardName;
    @FindBy(xpath = "(//div[@class='affiliate_program_name'])[2]")
    private WebElement secondAdvertiserCardName;
    @FindBy(xpath = "(//div[@class='affiliate_program_name'])[3]")
    private WebElement thirdAdvertiserCardName;
    @FindBy(xpath = "(//div[@class='affiliate_program_name'])[7]")
    private WebElement seventhAdvertiserCardName;
    @FindBy(xpath = "(//div[@class='affiliate_program_name'])[8]")
    private WebElement eighthAdvertiserCardName;
    @FindBy(xpath = "(//div[@class='hidden-modal'])[1]")
    private WebElement modalWindow;
    @FindBy(xpath = "(//a[contains(text(),'Подробнее')])[1]")
    private WebElement modalWindowMoreBtn;
    @FindBy(xpath = "(//button[@title='Close'])[2]")
    private WebElement modalWindowCloseButton;

    public String getAdvertisersAnchorUrl() {
        return "https://3snet.co/#ourAdvertisers";
    }

    @Step("Verify Advertiser section is visible")
    public boolean verifyAdvertiserSectionIsVisible() {
        moveToElement(advertisersSectionTitle);
        return isElementVisible(advertisersSectionTitle);
    }

    @Step("Click the 'More' Button on the First Advertiser Card")
    public void clickMoreButtonOnFirstCard(){
        clickWithJSScroll(firstCardMoreButton);
        logger.info("Clicking the 'More' Button on the First Advertiser Card");
    }

    @Step("Click the 'More' Button on the Second Advertiser Card")
    public void clickMoreButtonOnSecondCard(){
        clickWithJSScroll(secondCardMoreButton);
        logger.info("Clicking the 'More' Button on the second Advertiser Card");
    }

    @Step("Click the 'More' Button on the Third Advertiser Card")
    public void clickMoreButtonOnThirdCard(){
        clickWithJSScroll(thirdCardMoreButton);
        logger.info("Clicking the 'More' Button on the Third Advertiser Card");
    }

    @Step("Click the 'More' Button on the Forth Advertiser Card")
    public void clickMoreButtonOnForthCard(){
        clickWithJSScroll(forthCardMoreButton);
        logger.info("Clicking the 'More' Button on the Forth Advertiser Card");
    }

    @Step("Click the 'More' Button on the Fifth Advertiser Card")
    public void clickMoreButtonOnFifthCard(){
        clickWithJSScroll(fifthCardMoreButton);
        logger.info("Clicking the 'More' Button on the Fifth Advertiser Card");
    }

    @Step("Click the 'More' Button on the Sixth Advertiser Card")
    public void clickMoreButtonOnSixthCard(){
        clickWithJSScroll(sixthCardMoreButton);
        logger.info("Clicking the 'More' Button on the Sixth Advertiser Card");
    }

    @Step("Click the 'More' Button on the Seventh Advertiser Card")
    public void clickMoreButtonOnSeventhCard(){
        clickWithJSScroll(seventhCardMoreButton);
        logger.info("Clicking the 'More' Button on the Seventh Advertiser Card");
    }

    @Step("Click the 'More' Button on the Eighth Advertiser Card")
    public void clickMoreButtonOnEighthCard(){
        clickWithJSScroll(eighthCardMoreButton);
        logger.info("Clicking the 'More' Button on the Eighth Advertiser Card");
    }

    @Step("Verify the 'More' Button of the First Card changes on Hover")
    public void verifyMoreButtonOfFirstCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = firstCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(firstCardMoreButton);
        waitUntilCssValueChanges(firstCardMoreButton, "background", initialStyle);
        String hoveredStyle = firstCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the 'More' Button of the Second Card changes on Hover")
    public void verifyMoreButtonOfSecondCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = secondCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(secondCardMoreButton);
        waitUntilCssValueChanges(secondCardMoreButton, "background", initialStyle);
        String hoveredStyle = secondCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the 'More' Button of the Third Card changes on Hover")
    public void verifyMoreButtonOfThirdCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = thirdCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(thirdCardMoreButton);
        waitUntilCssValueChanges(thirdCardMoreButton, "background", initialStyle);
        String hoveredStyle = thirdCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the 'More' Button of the Forth Card changes on Hover")
    public void verifyMoreButtonOfForthCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = forthCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(forthCardMoreButton);
        waitUntilCssValueChanges(forthCardMoreButton, "background", initialStyle);
        String hoveredStyle = forthCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the 'More' Button of the Fifth Card changes on Hover")
    public void verifyMoreButtonOfFifthCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = fifthCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(fifthCardMoreButton);
        waitUntilCssValueChanges(fifthCardMoreButton, "background", initialStyle);
        String hoveredStyle = fifthCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the 'More' Button of the Sixth Card changes on Hover")
    public void verifyMoreButtonOfSixthCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = sixthCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(sixthCardMoreButton);
        waitUntilCssValueChanges(sixthCardMoreButton, "background", initialStyle);
        String hoveredStyle = sixthCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the 'More' Button of the Seventh Card changes on Hover")
    public void verifyMoreButtonOfSeventhCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = seventhCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(seventhCardMoreButton);
        waitUntilCssValueChanges(seventhCardMoreButton, "background", initialStyle);
        String hoveredStyle = seventhCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the 'More' Button of the Eighth Card changes on Hover")
    public void verifyMoreButtonOfEighthCardChangesOnHover(){
        moveToElement(advertisersCardsSection);
        String initialStyle = eighthCardMoreButton.getCssValue("background");
        logger.info("Initial background: " +initialStyle);
        moveToElement(eighthCardMoreButton);
        waitUntilCssValueChanges(eighthCardMoreButton, "background", initialStyle);
        String hoveredStyle = eighthCardMoreButton.getCssValue("background");
        logger.info("Hoved background: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background should change on hover");
    }

    @Step("Verify the Modal window of the First Card is Open")
    public void verifyModalWindowOfFirstCarsIsOpen(){
        clickWithJSScroll(firstCardMoreButton);
        isElementVisible(modalWindow);
    }
    @Step("Verify Correct Page Link Connected With First Advertiser Card")
    public void verifyCorrectPageLinkConnectedWithFirstAdvertiserCard() {
        String href = modalWindowMoreBtn.getAttribute("href");
        String nameInTheLink = href.split("/")[href.split("/").length - 1].toUpperCase();
        logger.info("The name of the Advertiser page from the link is: " + nameInTheLink);
        String cardTitle = firstAdvertiserCardName.getText().trim().toUpperCase();
        logger.info("The name from the Advertiser card is: " + cardTitle);

        Assert.assertEquals(nameInTheLink, cardTitle);
    }

    @Step("Verify Modal Window closes with Close button")
    public boolean verifyModalWindowClosesWithCloseButton() {
        logger.info("Checking Model Window is Open...");
        boolean isVisibleBeforeClick = modalWindow.isDisplayed();
        logger.info("Modal Window Before Click : isDisplayed() = " + isVisibleBeforeClick);
        Assert.assertTrue(isVisibleBeforeClick);

        logger.info("Click On Closed Btn...");
        click(modalWindowCloseButton);

        waitUntilInvisible(modalWindow);

        logger.info("Checking the Modal Window is Clossed...");
        boolean isVisibleAfterClick = modalWindow.isDisplayed();
        logger.info("Modal Window After Click: isDisplayed() = " + isVisibleAfterClick);
        Assert.assertFalse(isVisibleAfterClick);

        return true;
    }

    @Step("Verify the Modal window of the Third Card is Open")
    public void verifyModalWindowOfThirdCardIsOpen(){
        clickWithJSScroll(thirdCardMoreButton);
        isElementVisible(modalWindow);
    }
    @Step("Verify Correct Page Link Connected With Third Advertiser Card")
    public void verifyCorrectPageLinkConnectedWithThirdAdvertiserCard() {
        String href = modalWindowMoreBtn.getAttribute("href");
        String nameInTheLink = href.split("/")[href.split("/").length - 1].toUpperCase();
        logger.info("The name of the Advertiser page from the link is: " + nameInTheLink);
        String cardTitle = thirdAdvertiserCardName.getText().trim().toUpperCase();
        logger.info("The name from the Advertiser card is: " + cardTitle);

        Assert.assertEquals(nameInTheLink, cardTitle);
    }

    @Step("Verify the Modal window of the Seventh Card is Open")
    public void verifyModalWindowOfSeventhCardIsOpen(){
        clickWithJSScroll(seventhCardMoreButton);
        isElementVisible(modalWindow);
    }
    @Step("Verify Correct Page Link Connected With Seventh Advertiser Card")
    public void verifyCorrectPageLinkConnectedWithSeventhAdvertiserCard() {
        String href = modalWindowMoreBtn.getAttribute("href");
        String nameInTheLink = href.split("/")[href.split("/").length - 1].toUpperCase();
        logger.info("The name of the Advertiser page from the link is: " + nameInTheLink);
        String cardTitle = seventhAdvertiserCardName.getText().trim().toUpperCase();
        logger.info("The name from the Advertiser card is: " + cardTitle);

        Assert.assertEquals(nameInTheLink, cardTitle);
    }


    @Step("Verify the Modal window of the Eighth Card is Open")
    public void verifyModalWindowOfEighthCardIsOpen(){
        clickWithJSScroll(eighthCardMoreButton);
        isElementVisible(modalWindow);
    }
    @Step("Verify Correct Page Link Connected With Eighth Advertiser Card")
    public void verifyCorrectPageLinkConnectedWithEighthAdvertiserCard() {
        String href = modalWindowMoreBtn.getAttribute("href");
        String nameInTheLink = href.split("/")[href.split("/").length - 1].toUpperCase();
        logger.info("The name of the Advertiser page from the link is: " + nameInTheLink);
        String cardTitle = eighthAdvertiserCardName.getText().trim().toUpperCase();
        logger.info("The name from the Advertiser card is: " + cardTitle);

        Assert.assertEquals(nameInTheLink, cardTitle);
    }

}
