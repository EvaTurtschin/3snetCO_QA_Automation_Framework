package tests;

import io.qameta.allure.*;
//import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

@Epic("Home Page")
@Feature("Header Navigation")
public class HomePageTest extends BaseTest {


//     @Test(description = "Clicking logo in header returns to homepage")
//     @Story("Header logo navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("Verify that clicking the logo in the header navigates back to the homepage from another page")
//     public void headerLogoIsClickableAndNavigateToHomePage() {
//         HomePage homePage = new HomePage(driver);

//        Assert.assertTrue(homePage.verifyHomePageLogoIsClickable(),
//                     "Logo in Header should be clickable");

//         homePage.clickAffiliateProgramsLinkInHeader();
//         new AffiliateProgramsPage(driver).clickLogoInHeader();

//         homePage.waitUntilUrlToBe(homePage.getHomePageUrl());

//         String urlAfter = driver.getCurrentUrl();
//         Assert.assertEquals(urlAfter, homePage.getHomePageUrl(),
//                 "Logo click from Other page (Affiliate Programs page) should navigate to Home page");
//     }

//     @Test(description = "Clicking 'Who we are' scrolls to expected section")
//     @Story("Header navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("Verify that clicking the 'Who we are' link scrolls the page to the correct section")
//     public void WhoWeAreLinkIsClickableAndNavigateToHomePage() {
//         HomePage homePage = new HomePage(driver);

//         Assert.assertTrue(homePage.verifyWhoWeAreLinkIsClickable(),
//                 "Who We Are Link in Header should be clickable");

//         homePage.clickAffiliateProgramsLinkInHeader();
//         new AffiliateProgramsPage(driver).clickWhoWeAreInHeader();

//         homePage.waitUntilUrlToBe(homePage.getHomePageUrl());

//         String urlAfter = driver.getCurrentUrl();
//         Assert.assertEquals(urlAfter, homePage.getHomePageUrl(),
//                 "WhoWeAre link click from Other page (Affiliate Programs page) should navigate to Home page");

//     }

//     @Test(description = "Advertisers link goes to anchor section")
//     @Story("Header navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("Check that the 'Advertisers' link in the header scrolls to the anchor block")
//     public void AdvertisersLinkClickNavigateToAdvertisersBlock() {
//         HomePage homePage = new HomePage(driver);

//         Assert.assertTrue(homePage.verifyAdvertisersLinkIsClickable(),
//                 "Advertisers Link in Header should be clickable");

//         homePage.clickAffiliateProgramsLinkInHeader();
//         new AffiliateProgramsPage(driver).clickAdvertisersInHeader();

//         homePage.waitUntilUrlToBe(homePage.getAdvetisersAnchorUrl());

//         String urlAfter = driver.getCurrentUrl();
//         Assert.assertEquals(urlAfter, homePage.getAdvetisersAnchorUrl(),
//                 "Advertisers link click from Other page (Affiliate Programs page) should navigate to Home page to Anchor section");
//         Assert.assertTrue(homePage.verifyAdvertiserSectionIsVisible(),
//                 "Advertisers Section on Home Page should be visible");
//     }

//     @Test(description = "Affiliate Programs link opens correct page")
//     @Story("Header navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("User is redirected to Affiliate Programs page via header link")
//     public void AffiliateProgramsLinkNavigateToAffiliateProgramsPage() {
//         HomePage homePage = new HomePage(driver);

//         Assert.assertTrue(homePage.verifyAffiliateProgramsLinkIsClickable(),
//                 "Affiliate Programs Link in Header should be clickable");

//         homePage.clickAffiliateProgramsLinkInHeader();
//         Assert.assertTrue(new AffiliateProgramsPage(driver).verifyAffiliateProgramsPageOpen());
//     }

    @Test(description = "Blog link opens correct page")
    @Story("Header navigation")
//    @Severity(SeverityLevel.NORMAL)
    @Description("User is redirected to Blog page via header link")
    public void BlogLinkNavigateToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verifyBlogLinkIsClickable(),
                "Blog Link in Header should be clickable");

        homePage.clickBlockLinkInHeader();
        Assert.assertTrue(new BlogPage(driver).varifyBlogPageIsOpen());
    }

//     @Test(description = "Vacancy link opens correct page")
//     @Story("Header navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("User is redirected to Vacancy page via header link")
//     public void VacancyLinkNavigateToAffiliateProgramsPage() {
//         HomePage homePage = new HomePage(driver);

//         Assert.assertTrue(homePage.verifyVacancyLinkIsClickable(),
//                 "Vacancy Link in Header should be clickable");

//         homePage.clickVacancyLinkInHeader();
//         Assert.assertTrue(new VacancyPage(driver).varifyVacancyPageIsOpen());
//     }

//     @Test(description = "Contacts link opens correct page")
//     @Story("Header navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("User is redirected to Contacts page via header link")
//     public void ContactsLinkNavigateToAffiliateProgramsPage() {
//         HomePage homePage = new HomePage(driver);

//         Assert.assertTrue(homePage.verifyContactsLinkIsClickable(),
//                 "Contacts Link in Header should be clickable");

//         homePage.clickContactsLinkInHeader();
//         Assert.assertTrue(new ContactsPage(driver).varifyContactsPageIsOpen());
//     }

//     @Test(description = "Enter link opens correct page")
//     @Story("Header navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("User is redirected to Authorisation page via header link")
//     public void EnterLinkNavigateToAuthorisationPage() {
//         new HomePage(driver).clickEnterLinkInHeader();
//         Assert.assertTrue(new AuthorisationPage(driver).varifyAuthorisationPageIsOpen());
//     }

//     @Test(description = "Register link opens correct page")
//     @Story("Header navigation")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("User is redirected to Registration page via header link")
//     public void RegisterLinkNavigateToRegistrationPage() {
//         new HomePage(driver).clickRegisterLinkInHeader();
//         Assert.assertTrue(new RegistrationPage(driver).varifyRegistrationPageIsOpen());
//     }

//     @Test(description = "Clicking language button opens Dropdown language menu")
//     @Story("Language selection")
// //    @Severity(SeverityLevel.MINOR)
//     @Description("Verify that clicking the language button in the header opens the language dropdown menu")
//     public void LanguageBtnOpensLanguageDropdownMenu() {
//         HomePage homePage = new HomePage(driver);
//         homePage.clickLanguageBtn();
//         Assert.assertTrue(homePage.verifyLanguageDropdownOpens());
//     }

//     @Test(description = "Clicking language icon in Dropdown menu changes page language")
//     @Story("Language selection")
// //    @Severity(SeverityLevel.NORMAL)
//     @Description("Verify that clicking the language icon in the dropdown changes the site language")
//     public void LanguageIconClickInDropdownChangesPageLanguage() {
//         HomePage homePage = new HomePage(driver);
//         String languageBefore = homePage.getHeaderLanguageSnapshot();
//         homePage.clickLanguageIconInDropdown();
//         String languageAfter = homePage.getHeaderLanguageSnapshot();
//         Assert.assertNotEquals(languageBefore, languageAfter,
//                 "Clicking language icon in dropdown should change the page language.");

//         homePage.clickLanguageIconInDropdown();
//         homePage.waitUntilTextPresent(homePage.getWhoWeAreLinkElement(),"КТО МЫ");
//     }

}
