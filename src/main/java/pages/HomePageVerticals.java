package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @Step("Verify Gabbling Icon in Verticals section changes behavior on hover")
    public boolean verifyGamblingVerticalChangesColorOnHover(){
        moveToElement(verticalsSection);
        String initialStyle = gamblingBackground.getCssValue("color");
        logger.info("Initial color: " +initialStyle);
        moveToElement(gamblingIconInVerticals);
        String hoveredStyle = gamblingBackground.getCssValue("color");
        logger.info("Hoved color: " + hoveredStyle);
        Assert.assertNotEquals(hoveredStyle, initialStyle, "Background color should change on hover");
        return true;
    }

    @Step("Verify Gambling icon image in Verticals section animates on hover")
    public boolean verifyGamblingImageAnimationOnHover() {
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
        return true;
    }

}
