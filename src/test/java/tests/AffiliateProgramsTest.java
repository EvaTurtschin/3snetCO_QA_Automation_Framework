package tests;

import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class AffiliateProgramsTest extends BaseTest{

    @BeforeTest
    public void testPreconditions() {
        new HomePage(driver).clickAffiliateProgramsLinkInHeader();
    }

//    @Test
//    public void verifyFirstThreeLettersInPageTitle() {
//        String headerText = new AffiliateProgramsPage(driver).getPageTitleText().toUpperCase().trim();
//
//        char firstChar = headerText.charAt(0);
//        int unicode1 = (int) firstChar;
//
//        char secondChar = headerText.charAt(1);
//        int unicode2 = (int) secondChar;
//
//        char thirdChar = headerText.charAt(2);
//        int unicode3 = (int) thirdChar;
//
//        logger.info(
//                "Проверка первых трёх символов заголовка: '{}'\n" +
//                        "1) '{}' — код {} ({})\n" +
//                        "2) '{}' — код {} ({})\n" +
//                        "3) '{}' — код {} ({})",
//                headerText,
//                firstChar, unicode1, isLatinOrCyrillic(unicode1),
//                secondChar, unicode2, isLatinOrCyrillic(unicode2),
//                thirdChar, unicode3, isLatinOrCyrillic(unicode3)
//        );
//    }
//
//    private String isLatinOrCyrillic(int code) {
//        if (code >= 1040 && code <= 1103) {
//            return "кириллица ❌";
//        } else if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
//            return "латиница ✅";
//        } else {
//            return "другое";
//        }
//    }
}
