package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class HomePageTest extends BaseTest {

//    @BeforeTest
//    public void testPreconditions() {
//        new HomePage(driver).navigateToHomePage();
//    }


    @Test
    public void headerLogoIsClickableAndNavigateToHomePage() {
        HomePage homePage = new HomePage(driver);

       Assert.assertTrue(homePage.verifyHomePageLogoIsClickable(),
                    "Logo in Header should be clickable");

        homePage.clickAffiliateProgramsLinkInHeader();
        new AffiliateProgramsPage(driver).clickLogoInHeader();

        homePage.waitUntilUrlToBe(homePage.getHomePageUrl());

        String urlAfter = driver.getCurrentUrl();
        Assert.assertEquals(urlAfter, homePage.getHomePageUrl(),
                "Logo click from Other page (Affiliate Programs page) should navigate to Home page");
    }

    @Test
    public void WhoWeAreLinkIsClickableAndNavigateToHomePage() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verifyWhoWeAreLinkIsClickable(),
                "Who We Are Link in Header should be clickable");

        homePage.clickAffiliateProgramsLinkInHeader();
        new AffiliateProgramsPage(driver).clickWhoWeAreInHeader();

        homePage.waitUntilUrlToBe(homePage.getHomePageUrl());

        String urlAfter = driver.getCurrentUrl();
        Assert.assertEquals(urlAfter, homePage.getHomePageUrl(),
                "WhoWeAre link click from Other page (Affiliate Programs page) should navigate to Home page");

    }

    @Test
    public void AdvertisersLinkClickNavigateToAdvertisersBlock() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verifyAdvertisersLinkIsClickable(),
                "Advertisers Link in Header should be clickable");

        homePage.clickAffiliateProgramsLinkInHeader();
        new AffiliateProgramsPage(driver).clickAdvertisersInHeader();

        homePage.waitUntilUrlToBe(homePage.getAdvetisersAnchorUrl());

        String urlAfter = driver.getCurrentUrl();
        Assert.assertEquals(urlAfter, homePage.getAdvetisersAnchorUrl(),
                "Advertisers link click from Other page (Affiliate Programs page) should navigate to Home page to Anchor section");
        Assert.assertTrue(homePage.verifyAdvertiserSectionIsVisible(),
                "Advertisers Section on Home Page should be visible");
    }

    @Test
    public void AffiliateProgramsLinkNavigateToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verifyAffiliateProgramsLinkIsClickable(),
                "Affiliate Programs Link in Header should be clickable");

        homePage.clickAffiliateProgramsLinkInHeader();
        Assert.assertTrue(new AffiliateProgramsPage(driver).verifyAffiliateProgramsPageOpen());
    }

    @Test
    public void BlogLinkNavigateToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verifyBlogLinkIsClickable(),
                "Blog Link in Header should be clickable");

        homePage.clickBlockLinkInHeader();
        Assert.assertTrue(new BlogPage(driver).varifyBlogPageIsOpen());
    }

    @Test
    public void VacancyLinkNavigateToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verifyVacancyLinkIsClickable(),
                "Vacancy Link in Header should be clickable");

        homePage.clickVacancyLinkInHeader();
        Assert.assertTrue(new VacancyPage(driver).varifyVacancyPageIsOpen());
    }

    @Test
    public void ContactsLinkNavigateToAffiliateProgramsPage() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.verifyContactsLinkIsClickable(),
                "Contacts Link in Header should be clickable");

        homePage.clickContactsLinkInHeader();
        Assert.assertTrue(new ContactsPage(driver).varifyContactsPageIsOpen());
    }

    @Test
    public void EnterLinkNavigateToAuthorisationPage() {
        new HomePage(driver).clickEnterLinkInHeader();
        Assert.assertTrue(new AuthorisationPage(driver).varifyAuthorisationPageIsOpen());
    }

    @Test
    public void RegisterLinkNavigateToRegistrationPage() {
        new HomePage(driver).clickRegisterLinkInHeader();
        Assert.assertTrue(new RegistrationPage(driver).varifyRegistrationPageIsOpen());
    }

    @Test
    public void LanguageBtnOpensLanguageDropdownMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLanguageBtn();
        Assert.assertTrue(homePage.verifyLanguageDropdownOpens());
    }

    @Test
    public void LanguageIconClickInDropdownChangesPageLanguage() {
        HomePage homePage = new HomePage(driver);
        String languageBefore = homePage.getHeaderLanguageSnapshot();
        homePage.clickLanguageIconInDropdown();
        String languageAfter = homePage.getHeaderLanguageSnapshot();
        Assert.assertNotEquals(languageBefore, languageAfter,
                "Clicking language icon in dropdown should change the page language.");

        homePage.clickLanguageIconInDropdown();
        homePage.waitUntilTextPresent(homePage.getWhoWeAreLinkElement(),"КТО МЫ");
    }








//        private static final Logger logger = LoggerFactory.getLogger(HomePageTest.class);
//
//        public static void main(String[] args) {
//            logger.info("Hello, Logback!");
//            logger.debug("Debug message");
//            logger.warn("Warning message");
//        }




}
