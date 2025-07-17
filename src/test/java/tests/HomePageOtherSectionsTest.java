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
    public void join3SNetButtonNavigateToRegistrationPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyJoin3SNetButtonChangesColorOnHover();
        homePage.clickJoin3SNetButton().verifyWithLinkRegistrationPageIsOpen();
    }

    @Test(description = "Clicking First Event banner opens Contacts Page")
    @Story("Let's meet section")
    @Description("Verify that First Event Banner in Let's Meet Section changes its color on hover and opens the correct Page")
    public void ClickingFirstEventBannerNavigateToContactsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyFirstEventBannerTitleChangesColorOnHover();

        ContactsPage contactsPage = homePage.clickFirstEventBanner();
        contactsPage.verifyContactsPageIsOpen();
        contactsPage.verifyArrangeAMeetingIsInASubjectField();
    }

    @Test(description = "Clicking Second Event banner opens Contacts Page")
    @Story("Let's meet section")
    @Description("Verify that Second Event Banner in Let's Meet Section changes its color on hover and opens the correct Page")
    public void ClickingSecondEventBannerNavigateToContactsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifySecondEventBannerTitleChangesColorOnHover();

        ContactsPage contactsPage = homePage.clickSecondEventBanner();
        contactsPage.verifyContactsPageIsOpen();
        contactsPage.verifyArrangeAMeetingIsInASubjectField();
    }

    @Test(description = "Clicking Offers Link In Round Ellipses Section opens Best Offers Page")
    @Story("Navigation In Round Ellipses Section")
    @Description("Verify that Offers Link In Round Ellipses Section changes on hover and opens the correct Page")
    public void ClickingOffersLinkInRoundEllipsesSectionNavigateToBestOffersPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyOffersLinkInRoundEllipsesSectionChangesOnHover();

        BestOffersPage offersPage = homePage.clickOffersLinkInRoundEllipsesSection();
        offersPage.verifyBestOffersPageIsOpen();
    }

    @Test(description = "Clicking Promocode Link In Round Ellipses Section opens Best Promocode Page")
    @Story("Navigation In Round Ellipses Section")
    @Description("Verify that Promocode Link In Round Ellipses Section changes on hover and opens the correct Page")
    public void ClickingPromocodeLinkInRoundEllipsesSectionNavigateToPromocodePage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyPromocodeLinkInRoundEllipsesSectionChangesOnHover();

        PromocodePage promocodePage = homePage.clickPromocodeLinkInRoundEllipsesSection();
        promocodePage.verifyPromocodePageIsOpen();
    }

    @Test(description = "Clicking Affiliate Programs Link In Round Ellipses Section opens Best Promocode Page")
    @Story("Navigation In Round Ellipses Section")
    @Description("Verify that Affiliate Programs Link In Round Ellipses Section changes on hover and opens the correct Page")
    public void ClickingAffiliateProgramsLinkInRoundEllipsesSectionNavigateToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyAffiliateProgramsLinkInRoundEllipsesSectionChangesOnHover();

        AffiliateProgramsPage affiliateProgramsPage = homePage.clickAffiliateProgramsLinkInRoundEllipsesSection();
        affiliateProgramsPage.verifyAffiliateProgramsPageOpen();
    }

}
