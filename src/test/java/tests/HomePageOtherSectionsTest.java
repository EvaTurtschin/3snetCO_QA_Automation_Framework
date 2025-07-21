package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.*;

@Epic("Home Page")
@Feature("Other Home Page Tests")
public class HomePageOtherSectionsTest extends BaseTest{

    @Test(description = "Clicking Join 3SNet Button opens Registration Page")
    @Story("Join 3SNet Button")
    @Description("Verify that Join 3SNet Button changes its color on hover and opens the correct Registration Page")
    public void join3SNetButtonNavigatesToRegistrationPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyJoin3SNetButtonChangesColorOnHover();
        homePage.clickJoin3SNetButton().verifyWithLinkRegistrationPageIsOpen();
    }

    @Test(description = "Clicking First Event banner opens Contacts Page")
    @Story("Let's meet section")
    @Description("Verify that First Event Banner in Let's Meet Section changes its color on hover and opens the correct Page")
    public void clickingFirstEventBannerNavigatesToContactsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyFirstEventBannerTitleChangesColorOnHover();

        ContactsPage contactsPage = homePage.clickFirstEventBanner();
        contactsPage.verifyContactsPageIsOpen();
        contactsPage.verifyArrangeAMeetingIsInASubjectField();
    }

    @Test(description = "Clicking Second Event banner opens Contacts Page")
    @Story("Let's meet section")
    @Description("Verify that Second Event Banner in Let's Meet Section changes its color on hover and opens the correct Page")
    public void clickingSecondEventBannerNavigatesToContactsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifySecondEventBannerTitleChangesColorOnHover();

        ContactsPage contactsPage = homePage.clickSecondEventBanner();
        contactsPage.verifyContactsPageIsOpen();
        contactsPage.verifyArrangeAMeetingIsInASubjectField();
    }

    @Test(description = "Clicking Offers Link In Round Ellipses Section opens Best Offers Page")
    @Story("Navigation In Round Ellipses Section")
    @Description("Verify that Offers Link In Round Ellipses Section changes on hover and opens the correct Page")
    public void clickingOffersLinkInRoundEllipsesSectionNavigatesToBestOffersPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyOffersLinkInRoundEllipsesSectionChangesOnHover();

        BestOffersPage offersPage = homePage.clickOffersLinkInRoundEllipsesSection();
        offersPage.verifyBestOffersPageIsOpen();
    }

    @Test(description = "Clicking Promocode Link In Round Ellipses Section opens Best Promocode Page")
    @Story("Navigation In Round Ellipses Section")
    @Description("Verify that Promocode Link In Round Ellipses Section changes on hover and opens the correct Page")
    public void clickingPromocodeLinkInRoundEllipsesSectionNavigatesToPromocodePage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyPromocodeLinkInRoundEllipsesSectionChangesOnHover();

        PromocodePage promocodePage = homePage.clickPromocodeLinkInRoundEllipsesSection();
        promocodePage.verifyPromocodePageIsOpen();
    }

    @Test(description = "Clicking Affiliate Programs Link In Round Ellipses Section opens Best Promocode Page")
    @Story("Navigation In Round Ellipses Section")
    @Description("Verify that Affiliate Programs Link In Round Ellipses Section changes on hover and opens the correct Page")
    public void clickingAffiliateProgramsLinkInRoundEllipsesSectionNavigatesToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyAffiliateProgramsLinkInRoundEllipsesSectionChangesOnHover();

        AffiliateProgramsPage affiliateProgramsPage = homePage.clickAffiliateProgramsLinkInRoundEllipsesSection();
        affiliateProgramsPage.verifyAffiliateProgramsPageOpen();
    }

    @Test(description = "Clicking Search Button In Search Section Navigates To Search Results Page")
    @Story("Search Section")
    @Description("Verify that Search Button In Search Section Navigates To Search Results Page")
    public void clickingSearchButtonInSearchSectionNavigatesToSearchResultsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButtonInSearchSection().verifySearchResultsPageIsOpen();
    }

    @Test(description = "Clicking SearchField and then Search Button In Search Section Navigate To Search Results Page")
    @Story("Search Section")
    @Description("Verify that clicking Search Field and then Search Button In Search Section Navigate To Search Results Page")
    public void clickingSearchFieldAndButtonInSearchSectionNavigateToSearchResultsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickInputFieldInSearchSection();
        homePage.clickSubmitButtonInSearchSection().verifySearchResultsPageIsOpen();
    }

    @Test(description = "Entering text into Search Field and then clicking Search Button In Search Section Show Correct Search Results")
    @Story("Search Section")
    @Description("Verify that entering text into Search Field and then clicking Search Button In Search Section Show Correct Search Results")
    public void enterSearchTextInSearchSectionShowsCorrectSearchResults() {
        HomePage homePage = new HomePage(driver);
        homePage.enterTextInInputFieldInSearchSection();
        homePage.clickSubmitButtonInSearchSection().verifySearchResultsIsCorrect();
    }

    @Test(description = "Clicking Search Field and then ENTER Key In Search Section Navigate To Search Results Page")
    @Story("Search Section")
    @Description("Verify that clicking Search Field and then ENTER Key In Search Section Navigate To Search Results Page")
    public void clickingSearchFieldAndEnterKeyInSearchSectionNavigateToSearchResultsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickInputFieldInSearchSection();
        homePage.pressEnterKeyWhileFocusedOnInputFieldInSearchSection().verifySearchResultsPageIsOpen();
    }

    @Test(description = "Entering text into Search Field and then ENTER Key In Search Section Navigate To Search Results Page")
    @Story("Search Section")
    @Description("Verify that Entering text into Search Field and then ENTER Key In Search Section Navigate To Search Results Page")
    public void enteringTextIntoSearchFieldAndEnterKeyInSearchSectionNavigateToSearchResultsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.enterTextInInputFieldInSearchSection();
        homePage.pressEnterKeyWhileFocusedOnInputFieldInSearchSection().verifySearchResultsIsCorrect();
    }

    @Test(description = "Captcha is visible and opens on hover on the Home Page")
    @Story("Captcha Behavior")
    @Description("Verify that Captcha is visible and opens on hover on the Home Page")
    public void captchaIsVisibleAndOpensOnHoverOnHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyCaptchaOpensOnHover();
    }

}
