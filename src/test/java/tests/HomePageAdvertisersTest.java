package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.HomePage;

@Epic("Home Page")
@Feature("Advertisers Section Tests")
public class HomePageAdvertisersTest extends BaseTest{

    @Test(description = "Testing the First Advertisers Card")
    @Story("Advertisers Section")
    @Description("Verify that More Button On the First Card changes on Hover, opens the Modal Window, and the button from Modal Window opens the correct Page")
    public void checkingFirstCardLinksAndModalWindowAndButtonsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.advetisers().verifyMoreButtonOfFirstCardChangesOnHover();
        homePage.advetisers().verifyModalWindowOfFirstCarsIsOpen();
        homePage.advetisers().verifyCorrectPageLinkConnectedWithFirstAdvertiserCard();
        homePage.advetisers().verifyModalWindowClosesWithCloseButton();

    }

    @Test(description = "Testing the Third Advertisers Card")
    @Story("Advertisers Section")
    @Description("Verify that More Button On the Third Card changes on Hover, opens the Modal Window, and the button from Modal Window opens the correct Page")
    public void checkingThirdCardLinksAndModalWindowAndButtonsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.advetisers().verifyMoreButtonOfThirdCardChangesOnHover();
        homePage.advetisers().verifyModalWindowOfThirdCardIsOpen();
        homePage.advetisers().verifyCorrectPageLinkConnectedWithThirdAdvertiserCard();
        homePage.advetisers().verifyModalWindowClosesWithCloseButton();
    }

    @Test(description = "Testing the Seventh Advertisers Card")
    @Story("Advertisers Section")
    @Description("Verify that More Button On the Seventh Card changes on Hover, opens the Modal Window, and the button from Modal Window opens the correct Page")
    public void checkingSeventhCardLinksAndModalWindowAndButtonsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.advetisers().verifyMoreButtonOfSeventhCardChangesOnHover();
        homePage.advetisers().verifyModalWindowOfSeventhCardIsOpen();
        homePage.advetisers().verifyCorrectPageLinkConnectedWithSeventhAdvertiserCard();
        homePage.advetisers().verifyModalWindowClosesWithCloseButton();
    }

    @Test(description = "Testing the Eighth Advertisers Card")
    @Story("Advertisers Section")
    @Description("Verify that More Button On the Eighth Card changes on Hover, opens the Modal Window, and the button from Modal Window opens the correct Page")
    public void checkingEighthCardLinksAndModalWindowAndButtonsBehavior() {
        HomePage homePage = new HomePage(driver);
        homePage.advetisers().verifyMoreButtonOfEighthCardChangesOnHover();
        homePage.advetisers().verifyModalWindowOfEighthCardIsOpen();
        homePage.advetisers().verifyCorrectPageLinkConnectedWithEighthAdvertiserCard();
        homePage.advetisers().verifyModalWindowClosesWithCloseButton();
    }



}
