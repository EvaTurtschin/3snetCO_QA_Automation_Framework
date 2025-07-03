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
                .clickAffiliateProgramsLinkInHeader()
                .getTitle();

        Assert.assertEquals(title, TITLE);
    }

    @Test
    public void testPlaceholderSearchText() {
        String placeholderSearchText = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .getPlaceholderSearchText();

        Assert.assertEquals(placeholderSearchText, PLACEHOLDER_SEARCH_TEXT);
    }

    @Test
    public void testCategoryDefaultText() {
        String categoryDefaultText = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .getCategoryDefaultText();

        Assert.assertEquals(categoryDefaultText, CATEGORY_DEFAULT_TEXT);
    }

    @Test
    public void testPaymentModelDefaultText() {
        String paymentModelDefaultText = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .getPaymentModelDefaultText();

                Assert.assertEquals(paymentModelDefaultText, PAYMENT_MODEL_DEFAULT_TEXT);
    }

    @Test
    public void testGeoDefaultText() {
        String geoDefaultText = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .getGeoDefaultText();

                Assert.assertEquals(geoDefaultText, GEO_DEFAULT_TEXT);
    }

    @Test
    public void testRedirectToContacts() {
        String url = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .clickJoin()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/contacts/");
    }

    @Test
    public void testRedirectToBetting() {
        String url = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .clickBettingButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/betting/");
    }

    @Test
    public void testRedirectToGambling() {
        String url = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .clickGamblingButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/gambling/");
    }

    @Test
    public void testRedirectToCybersport() {
        String url = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .clickCybersportButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/traffic-cybersport/");
    }

    @Test
    public void testRedirectToLoto() {
        String url = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .clickLotoButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/loto/");
    }

    @Test
    public void testRedirectToPoker() {
        String url = new HomePage(driver)
                .clickAffiliateProgramsLinkInHeader()
                .clickPokerButton()
                .getCurrentUrl();

        Assert.assertEquals(url, "https://3snet.co/poker/");
    }
}
