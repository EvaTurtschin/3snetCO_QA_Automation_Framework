package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AdvertisersPage;
import pages.AffiliateProgramsPage;
import pages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePageTest extends BaseTest {

//    @BeforeClass
//    public void classPrecondition() {
//        new HomePage(driver).navigateToHomePage();
//    }

    @BeforeTest
    public void testPostconditions() {
        new HomePage(driver).navigateToHomePage();
    }

    @Test
    public void goToAdvertisersBlockWithAdvertisersClick() {
        new HomePage(driver).clickAdvertisers();
        Assert.assertTrue(new AdvertisersPage(driver).verifyAdvertisersPageOpen());
    }

    @Test
    public void goToHomePageWithHeaderLogoClick() {
        new HomePage(driver).clickHeaderLogo();
        Assert.assertTrue(new HomePage(driver).verifyHomePageOpenWithLogoClick());
    }

    @Test
    public void affiliateProgramsPageOpenWithAffiliateProgramsClick() {
        new HomePage(driver).clickAffiliateProgramsLink();
        Assert.assertTrue(new AffiliateProgramsPage(driver).verifyAffiliateProgramsPageOpen());
    }

    @Test
    public void goToHomePageWithWhoWeAreClick() {
        new HomePage(driver).clickWhoWeAre();
        Assert.assertTrue(new HomePage(driver).verifyHomePageOpenWithWhoWeAreClick());
    }

        private static final Logger logger = LoggerFactory.getLogger(HomePageTest.class);

        public static void main(String[] args) {
            logger.info("Hello, Logback!");
            logger.debug("Debug message");
            logger.warn("Warning message");
        }




}
