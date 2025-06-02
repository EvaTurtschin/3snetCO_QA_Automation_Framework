package tests;

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
                .clickAffiliateProgramsLink()
                .getTitle();

        Assert.assertEquals(title, TITLE);
    }

    @Test
    public void testPlaceholderSearchText() {
        String placeholderSearchText = new HomePage(driver)
                .clickAffiliateProgramsLink()
                .getPlaceholderSearchText();

        Assert.assertEquals(placeholderSearchText, PLACEHOLDER_SEARCH_TEXT);
    }

    @Test
    public void testCategoryDefaultText() {
        String categoryDefaultText = new HomePage(driver)
                .clickAffiliateProgramsLink()
                .getCategoryDefaultText();

        Assert.assertEquals(categoryDefaultText, CATEGORY_DEFAULT_TEXT);
    }

    @Test
    public void testPaymentModelDefaultText() {
        String paymentModelDefaultText = new HomePage(driver)
                .clickAffiliateProgramsLink()
                .getPaymentModelDefaultText();

                Assert.assertEquals(paymentModelDefaultText, PAYMENT_MODEL_DEFAULT_TEXT);
    }

    @Test
    public void testGeoDefaultText() {
        String geoDefaultText = new HomePage(driver)
                .clickAffiliateProgramsLink()
                .getGeoDefaultText();

                Assert.assertEquals(geoDefaultText, GEO_DEFAULT_TEXT);
    }
}
