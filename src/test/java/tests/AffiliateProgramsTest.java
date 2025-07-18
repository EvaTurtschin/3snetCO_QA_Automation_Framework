package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

@Epic("Affiliate Programs Page")
@Feature("Affiliate Programs Page")
public class AffiliateProgramsTest extends BaseTest {

    private static final String PAGE_TITLE = "CPA ПАРТНЕРСКИЕ ПРОГРАММЫ:\nТОП ОФФЕРЫ ДЛЯ ВЕБМАСТЕРОВ И РЕКЛАМОДАТЕЛЕЙ";
    private static final String SEARCH_DEFAULT_TEXT = "Поиск";
    private static final String VERTICAL_DEFAULT_TEXT = "Вертикаль";
    private static final String PAYMENT_MODEL_DEFAULT_TEXT = "Модель оплаты";
    private static final String GEO_DEFAULT_TEXT = "GEO";


    @Test(description = "Affiliate Programs has the Correct Title")
    @Story("Affiliate Programs Page Title")
    @Description("Verify that Affiliate Programs has the Correct Title")
    public void affiliateProgramsPageHasCorrectTitle() {
        String title = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getTitle();

        Assert.assertEquals(title, PAGE_TITLE);
    }

    @Test(description = "Search Filter in Filter Section has the Correct Default text")
    @Story("Affiliate Programs Filter Section")
    @Description("Verify that Search Filter in Filter Section has the Correct Default text")
    public void searchFilterHasCorrectDefaultText() {
        String searchDefaultText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getSearchDefaultText();

        Assert.assertEquals(searchDefaultText, SEARCH_DEFAULT_TEXT);
    }

    @Test(description = "Vertical Filter in Filter Section has the Correct Default text")
    @Story("Affiliate Programs Filter Section")
    @Description("Verify that Vertical Filter in Filter Section has the Correct Default text")
    public void verticalFilterHasCorrectDefaultText() {
        String verticalDefaultText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getVerticalDefaultText();

        Assert.assertEquals(verticalDefaultText, VERTICAL_DEFAULT_TEXT);
    }

    @Test(description = "Payment Model in Filter Section should have the Correct Default text")
    @Story("Affiliate Programs Filter Section")
    @Description("Verify that Payment Model Filter in Filter Section has the Correct Default text")
    public void paymentModelFilterHasCorrectDefaultText() {
        String paymentModelDefaultText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getPaymentModelDefaultText();

                Assert.assertEquals(paymentModelDefaultText, PAYMENT_MODEL_DEFAULT_TEXT);
    }

    @Test(description = "GEO Filter in Filter Section should have the Correct Default text")
    @Story("Affiliate Programs Filter Section")
    @Description("Verify that GEO Filter in Filter Section has the Correct Default text")
    public void geoFilterHasCorrectDefaultText() {
        String geoDefaultText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getGeoDefaultText();

                Assert.assertEquals(geoDefaultText, GEO_DEFAULT_TEXT);
    }

    @Test(description = "Clicking Join Button in Join Sidebar opens the correct Contacts Page")
    @Story("Join Sidebar - New Affiliates")
    @Description("Verify that Join Button in Join Sidebar opens the correct Contacts Page")
    public void joinButtonInJoinSidebarNavigatesToContactsPage() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickJoin()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/contacts/");
    }

    @Test(description = "Clicking Betting Button in All Programs Sidebar opens the correct Betting Page")
    @Story("All Programs Sidebar")
    @Description("Verify that Betting Button in All Programs Sidebar opens the correct Betting Page")
    public void bettingButtonOnAllProgramsSidebarNavigatesToBettingPage() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickBettingButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/betting/");
    }

    @Test(description = "Clicking Gambling Button in All Programs Sidebar opens the correct Gambling Page")
    @Story("All Programs Sidebar")
    @Description("Verify that Gambling Button in All Programs Sidebar opens the correct Gambling Page")
    public void gamblingButtonOnAllProgramsSidebarNavigatesToGamblingPage() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickGamblingButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/gambling/");
    }

    @Test(description = "Clicking Cybersport Button in All Programs Sidebar opens the correct Cybersport Page")
    @Story("All Programs Sidebar")
    @Description("Verify that Cybersport Button in All Programs Sidebar opens the correct Cybersport Page")
    public void cybersportButtonOnAllProgramsSidebarNavigatesToCybersportPage() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickCybersportButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/traffic-cybersport/");
    }

    @Test(description = "Clicking Loto Button in All Programs Sidebar opens the correct Loto Page")
    @Story("All Programs Sidebar")
    @Description("Verify that Loto Button in All Programs Sidebar opens the correct Loto Page")
    public void lotoButtonOnAllProgramsSidebarNavigatesToLotoPage() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickLotoButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/loto/");
    }

    @Test(description = "Clicking Poker Button in All Programs Sidebar opens the correct Poker Page")
    @Story("All Programs Sidebar")
    @Description("Verify that Poker Button in All Programs Sidebar Page opens the correct Poker Page")
    public void pokerButtonOnAllProgramsSidebarNavigatesToPokerPage() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickPokerButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/poker/");
    }
}
