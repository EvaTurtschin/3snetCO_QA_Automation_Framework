package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

@Epic("Home Page")
@Feature("Header Navigation")
public class HomePageHeaderTest extends BaseTest {

    @Test(description = "Clicking logo in header returns to homepage")
    @Story("Header logo navigation")
    @Description("Verify that clicking the logo in the header navigates back to the homepage from another page")
    public void headerLogoIsClickableAndNavigateToHomePage() {
        HomePage homePage = new HomePage(driver);
        try {
           homePage.header().clickAffiliateProgramsLinkInHeader();
        } catch (Exception e) {
        takeScreenshot("affiliate_programs_click_failed");
        throw e;
        }
        try {
            new AffiliateProgramsPage(driver).clickLogoInHeader();
        } catch (Exception e) {
        takeScreenshot("logo_click_failed");
        throw e;
        }
        homePage.waitUntilUrlToBe(homePage.getHomePageUrl());

        String urlAfter = driver.getCurrentUrl();
        Assert.assertEquals(urlAfter, homePage.getHomePageUrl(),
                "Logo click from Other page (Affiliate Programs page) should navigate to Home page");
    }

   @Test(description = "Clicking 'Who we are' scrolls to expected section")
   @Story("Header navigation")
   @Description("Verify that clicking the 'Who we are' link scrolls the page to the correct section")
   public void whoWeAreLinkIsClickableAndNavigateToHomePage() {
       HomePage homePage = new HomePage(driver);

       Assert.assertTrue(homePage.header().verifyWhoWeAreLinkIsClickable(),
               "Who We Are Link in Header should be clickable");

       homePage.header().clickAffiliateProgramsLinkInHeader();
       new AffiliateProgramsPage(driver).clickWhoWeAreInHeader();

       homePage.waitUntilUrlToBe(homePage.getHomePageUrl());

       String urlAfter = driver.getCurrentUrl();
       Assert.assertEquals(urlAfter, homePage.getHomePageUrl(),
               "WhoWeAre link click from Other page (Affiliate Programs page) should navigate to Home page");
   }

   @Test(description = "Advertisers link goes to anchor section")
   @Story("Header navigation")
   @Description("Check that the 'Advertisers' link in the header scrolls to the anchor block")
   public void advertisersLinkClickNavigateToAdvertisersBlock() {
       HomePage homePage = new HomePage(driver);

       Assert.assertTrue(homePage.header().verifyAdvertisersLinkIsClickable(),
               "Advertisers Link in Header should be clickable");

       homePage.header().clickAdvertisersInHeader();

       homePage.waitUntilUrlToBe(homePage.advetisers().getAdvetisersAnchorUrl());

       String urlAfter = driver.getCurrentUrl();
       Assert.assertTrue(homePage.advetisers().verifyAdvertiserSectionIsVisible(),
               "Advertisers Section on Home Page should be visible");
   }

    @Test(description = "Affiliate Programs link opens correct page")
    @Story("Header navigation")
    @Description("User is redirected to Affiliate Programs page via header link")
    public void affiliateProgramsLinkNavigateToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.header().verifyAffiliateProgramsLinkIsClickable(),
                "Affiliate Programs Link in Header is clickable");

        homePage.header().clickAffiliateProgramsLinkInHeader();
        Assert.assertTrue(new AffiliateProgramsPage(driver).verifyAffiliateProgramsPageOpen());
    }

   @Test(description = "Blog link opens correct page")
   @Story("Header navigation")
   @Description("User is redirected to Blog page via header link")
   public void blogLinkNavigateToBlogPage() {
       HomePage homePage = new HomePage(driver);

       Assert.assertTrue(homePage.header().verifyBlogLinkIsClickable(),
               "Blog Link in Header should be clickable");

       homePage.header().clickBlogLinkInHeader();
       Assert.assertTrue(new BlogPage(driver).verifyBlogPageIsOpen());
   }

   @Test(description = "Vacancy link opens correct page")
   @Story("Header navigation")
   @Description("User is redirected to Vacancy page via header link")
   public void vacancyLinkNavigateToAffiliateProgramsPage() {
       HomePage homePage = new HomePage(driver);

       Assert.assertTrue(homePage.header().verifyVacancyLinkIsClickable(),
               "Vacancy Link in Header should be clickable");

       homePage.header().clickVacancyLinkInHeader();
       Assert.assertTrue(new VacancyPage(driver).varifyVacancyPageIsOpen());
   }

   @Test(description = "Contacts link opens correct page")
   @Story("Header navigation")
   @Description("User is redirected to Contacts page via header link")
   public void contactsLinkNavigateToAffiliateProgramsPage() {
       HomePage homePage = new HomePage(driver);

       Assert.assertTrue(homePage.header().verifyContactsLinkIsClickable(),
               "Contacts Link in Header should be clickable");

       homePage.header().clickContactsLinkInHeader();
       Assert.assertTrue(new ContactsPage(driver).verifyContactsPageIsOpen());
   }

    @Test(description = "Enter link opens correct page")
    @Story("Header navigation")
    @Description("User is redirected to Authorisation page via header link")
    public void enterLinkNavigateToAuthorisationPage() {
        new HomePage(driver).header().clickEnterLinkInHeader();
        Assert.assertTrue(new AuthorisationPage(driver).verifyAuthorisationPageIsOpen());
    }

    @Test(description = "Register link opens correct page")
    @Story("Header navigation")
    @Description("User is redirected to Registration page via header link")
    public void registerLinkNavigateToRegistrationPage() {
        new HomePage(driver).header().clickRegisterLinkInHeader();
        Assert.assertTrue(new RegistrationPage(driver).verifyRegistrationPageIsOpen());
    }

    @Test(description = "Clicking language button opens Dropdown language menu")
    @Story("Language selection")
    @Description("Verify that clicking the language button in the header opens the language dropdown menu")
    public void languageBtnOpensLanguageDropdownMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.header().clickLanguageBtn();
        Assert.assertTrue(homePage.header().verifyLanguageDropdownOpens());
    }

   @Test(description = "Clicking language icon in Dropdown menu changes page language")
   @Story("Language selection")
   @Description("Verify that clicking the language icon in the dropdown changes the site language")
   public void languageIconClickInDropdownChangesPageLanguage() {
       HomePage homePage = new HomePage(driver);
       String languageBefore = homePage.header().getHeaderLanguageSnapshot();
       homePage.header().clickLanguageIconInDropdown();
       String languageAfter = homePage.header().getHeaderLanguageSnapshot();
       Assert.assertNotEquals(languageBefore, languageAfter,
               "Clicking language icon in dropdown should change the page language.");

       homePage.header().clickLanguageIconInDropdown();
       homePage.waitUntilTextPresent(homePage.header().getWhoWeAreLinkElement(),"КТО МЫ");
   }

}
