package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

@Epic("Home Page")
@Feature("Verticals section")
public class HomePageVerticalsTest extends BaseTest{

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
        homePage.verticals().verifyCybersportVerticalChangesColorOnHover();
        homePage.verticals().verifyCybersportImageAnimationOnHover();
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

    @Test(description = "Poker Icon is clickable and opens the correct page")
    @Story("Varticals navigation")
    @Description("Verify Poker Icon opens the correct page from the Verticals section.")
    public void PokerIconIsClickableAndNavigateToPokerPage(){
        HomePage homePage = new HomePage(driver);
       Assert.assertTrue(homePage.verticals().verifyPokerIconIsClickable(),
                "Poker Icon In Verticals should be clickable");

       homePage.verticals().clickPokerIconInVerticals().verifyPokerPageIsOpen();
    }

    @Test(description = "Betting Icon is clickable and opens the correct page")
    @Story("Varticals navigation")
    @Description("Verify Betting Icon opens the correct page from the Verticals section.")
    public void BettingIconIsClickableAndNavigateToBettingPage(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.verticals().verifyBettingIconIsClickable(),
                "Betting Icon In Verticals should be clickable");

        homePage.verticals().clickBettingIconInVerticals().verifyBettingPageIsOpen();
    }

    @Test(description = "Lottery Icon is clickable and opens the correct page")
    @Story("Varticals navigation")
    @Description("Verify Lottery Icon opens the correct page from the Verticals section.")
    public void LotteryIconIsClickableAndNavigateToLotteryPage(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.verticals().verifyLotteryIconIsClickable(),
                "Lottery Icon In Verticals should be clickable");

        homePage.verticals().clickLotteryIconInVerticals().verifyLotteryPageIsOpen();
    }

    @Test(description = "Cybersport Icon is clickable and opens the correct page")
    @Story("Varticals navigation")
    @Description("Verify Cybersport Icon opens the correct page from the Verticals section.")
    public void CybersportIconIsClickableAndNavigateToCybersportPage(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.verticals().verifyCybersportIconIsClickable(),
                "Cybersport Icon In Verticals should be clickable");

        homePage.verticals().clickCybersportIconInVerticals().verifyCybersportPageIsOpen();
    }

    @Test(description = "Dating Icon is clickable and opens the correct page")
    @Story("Varticals navigation")
    @Description("Verify Dating Icon opens the correct page from the Verticals section.")
    public void DatingIconIsClickableAndNavigateToDatingPage(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.verticals().verifyDatingIconIsClickable(),
                "Dating Icon In Verticals should be clickable");

        homePage.verticals().clickDatingIconInVerticals().verifyDatingPageIsOpen();
    }

}
