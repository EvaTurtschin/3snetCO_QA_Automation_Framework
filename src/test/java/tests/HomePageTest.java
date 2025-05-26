package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AdvertisersPage;
import pages.AffiliateProgramsPage;
import pages.HomePage;

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





//
//    @Test
//    public void positiveMyPotsPageAccessabilityFromHeader() {
//            new AnmeldenPage(driver).loginUser(PositiveTestUserData.EMAIL, PositiveTestUserData.PASSWORD);
//            new HomePage(driver).clickMeineToepfeLinkInHeader();
//            Assert.assertTrue(new MyPotsPage(driver).verifyMyPotsPageOpen());
//            new UserCabinetPage(driver).logoutUser();
//    }
//
//    @Test
//    public void anmeldenPageAccessabilityFromBody() {
//        new HomePage(driver).clickAnmeldenBtnInBody();
//                Assert.assertTrue(new AnmeldenPage(driver).verifyAnmeldenPageOpen());
//    }
//
//    @Test
//    public void gesetzPageAccessabilityFromFAQ() {
//        new HomePage(driver).clickGesetzPagelinkInFAQ();
//        Assert.assertTrue(new GesetzPage(driver)
//                .verifyGesetzPageOpen());
//    }
//
//    @Test
//    public void negativeAnleitungPageAccessabilityFromHeader() {
//        new HomePage(driver).clickAnleitungLinkInHeader();
//        Assert.assertTrue(new AnleitungPage(driver)
//                .verifyAnleitungPageAccessError());
//    }
//
//    @Test
//    public void negativeMyPotsPageAccessabilityFromHeader() {
//        new HomePage(driver).clickMeineToepfeLinkInHeader();
//        Assert.assertTrue(new MyPotsPage(driver)
//                .verifyMyPotsPageAccessError());
//    }
//
//    @Test
//    public void gesetzPageAccessabilityFromFooter() {
//        new HomePage(driver).clickGesetzPagelinkInFooter();
//        Assert.assertTrue(new GesetzPage(driver)
//                .verifyGesetzPageOpen());
//    }
}
