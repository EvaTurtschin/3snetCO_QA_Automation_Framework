package tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class AffiliateProgramsTest extends BaseTest {

    private static final String TITLE = "CPA ПАРТНЕРСКИЕ ПРОГРАММЫ:\nТОП ОФФЕРЫ ДЛЯ ВЕБМАСТЕРОВ И РЕКЛАМОДАТЕЛЕЙ";
    private static final String PLACEHOLDER_SEARCH_TEXT = "Поиск";
    private static final String CATEGORY_DEFAULT_TEXT = "Вертикаль";
    private static final String PAYMENT_MODEL_DEFAULT_TEXT = "Модель оплаты";
    private static final String GEO_DEFAULT_TEXT = "GEO";


    @Test
    public void testTitleText() {
        String title = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getTitle();

        Assert.assertEquals(title, TITLE);
    }

    @Test
    public void testPlaceholderSearchText() {
        String placeholderSearchText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getPlaceholderSearchText();

        Assert.assertEquals(placeholderSearchText, PLACEHOLDER_SEARCH_TEXT);
    }

    @Test
    public void testCategoryDefaultText() {
        String categoryDefaultText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getCategoryDefaultText();

        Assert.assertEquals(categoryDefaultText, CATEGORY_DEFAULT_TEXT);
    }

    @Test
    public void testPaymentModelDefaultText() {
        String paymentModelDefaultText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getPaymentModelDefaultText();

                Assert.assertEquals(paymentModelDefaultText, PAYMENT_MODEL_DEFAULT_TEXT);
    }

    @Test
    public void testGeoDefaultText() {
        String geoDefaultText = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .getGeoDefaultText();

                Assert.assertEquals(geoDefaultText, GEO_DEFAULT_TEXT);
    }

    @Test
    public void testRedirectToContacts() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickJoin()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/contacts/");
    }

    @Test
    public void testRedirectToBetting() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickBettingButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/betting/");
    }

    @Test
    public void testRedirectToGambling() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickGamblingButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/gambling/");
    }

    @Test
    public void testRedirectToCybersport() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickCybersportButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/traffic-cybersport/");
    }

    @Test
    public void testRedirectToLoto() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickLotoButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/loto/");
    }

    @Test
    public void testRedirectToPoker() {
        String url = new HomePage(driver)
                .header().clickAffiliateProgramsLinkInHeader()
                .clickPokerButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/poker/");
    }
}
