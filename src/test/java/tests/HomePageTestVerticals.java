package tests;

import io.qameta.allure.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

@Epic("Home Page")
@Feature("Verticals section")
public class HomePageTestVerticals extends BaseTest{

    @Test(description = "Hovering over the Gambling icon changes its color and starts animation")
    @Story("Gambling icon behavior in Verticals section")
    @Description("Verify color change and animation on hover over the Gambling icon in the Verticals section.")
    public void GamblingVerticalCanChangeItsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.verticals().verifyGamblingVerticalChangesColorOnHover();
        homePage.verticals().verifyGamblingImageAnimationOnHover();
    }

    @Test(description = "Hovering over the Poker icon changes its color and starts animation")
    @Story("Poker icon behavior in Verticals section")
    @Description("Verify color change and animation on hover over the Poker icon in the Verticals section.")
    public void PokerVerticalCanChangeItsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.verticals().verifyPokerVerticalChangesColorOnHover();
        homePage.verticals().verifyPokerImageAnimationOnHover();
    }

    @Test(description = "Hovering over the Betting icon changes its color and starts animation")
    @Story("Betting icon behavior in Verticals section")
    @Description("Verify color change and animation on hover over the Betting icon in the Verticals section.")
    public void BettingVerticalCanChangeItsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.verticals().verifyBettingVerticalChangesColorOnHover();
        homePage.verticals().verifyBettingImageAnimationOnHover();
    }

    @Test(description = "Hovering over the Lottery icon changes its color and starts animation")
    @Story("Lottery icon behavior in Verticals section")
    @Description("Verify color change and animation on hover over the Lottery icon in the Verticals section.")
    public void LotteryVerticalCanChangeItsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.verticals().verifyLotteryVerticalChangesColorOnHover();
        homePage.verticals().verifyLotteryImageAnimationOnHover();
    }

    @Test(description = "Hovering over the ESports icon changes its color and starts animation")
    @Story("ESports icon behavior in Verticals section")
    @Description("Verify color change and animation on hover over the ESports icon in the Verticals section.")
    public void ESportsVerticalCanChangeItsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.verticals().verifyESportsVerticalChangesColorOnHover();
        homePage.verticals().verifyESportsImageAnimationOnHover();
    }

    @Test(description = "Hovering over the Dating icon changes its color and starts animation")
    @Story("Dating icon behavior in Verticals section")
    @Description("Verify color change and animation on hover over the Dating icon in the Verticals section.")
    public void DatingVerticalCanChangeItsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.verticals().verifyDatingVerticalChangesColorOnHover();
        homePage.verticals().verifyDatingImageAnimationOnHover();
    }

    @Test(description = "Gambling Icon is clickable and opens the correct page")
    @Story("Varticals navigation")
    @Description("Verify Gambling Icon opens the correct page from the Verticals section.")
    public void GamblingIconIsClickableAndNavigateToGamblingPage(){
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verticals().verifyGamblingIconIsClickable(),
                "Gambling Icon In Verticals should be clickable");

        homePage.verticals().clickGamblingIconInVerticals();
        Assert.assertTrue(new GamblingPage(driver).verifyGamblingPageIsOpen());
    }
}
