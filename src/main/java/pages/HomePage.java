package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='navbar-brand']")
    WebElement headerLogo;
    @FindBy(xpath = "//a[contains(normalize-space(), 'КТО МЫ?')]")
    WebElement whoWeAreLink;

    @FindBy(xpath = "//p[contains(normalize-space(), 'Что такое 3snet?')]")
    WebElement homePageTitleContain;

    @FindBy(xpath = "//a[text()='РЕКЛАМОДАТЕЛИ']")
    WebElement advertisersLink;

    @FindBy(xpath = "//a[contains(normalize-space(), 'ПАРТНЕРСКИЕ ПРОГРАММЫ')]")
    WebElement affiliateProgramsLink;
    @FindBy(xpath = "//a[contains(normalize-space(), 'БЛОГ')]")
    WebElement blogLink;
    @FindBy(xpath = "//a[contains(normalize-space(), 'ВАКАНСИИ')]")
    WebElement vacancyLink;
    @FindBy(xpath = "//a[contains(normalize-space(), 'КОНТАКТЫ')]")
    WebElement contactsLink;

    public void clickHeaderLogo() {
        click(headerLogo);
        logger.info("Clicked on Header Logo");
    }

    public boolean verifyHomePageOpenWithLogoClick() {
        String headerText = homePageTitleContain.getText();
        return headerText.contains("Что такое 3snet?");
    }

    public void clickWhoWeAre() {
            click(whoWeAreLink);
            logger.info("Clicked on Who we Are Link in Header");
    }

    public boolean verifyHomePageOpenWithWhoWeAreClick() {
        String headerText = homePageTitleContain.getText();
        return headerText.contains("Что такое 3snet?");
    }
    public void clickAdvertisers() {
        click(advertisersLink);
        logger.info("Clicked on Advertisers Link in Header");
    }


    public void clickAffiliateProgramsLink() {
        click(affiliateProgramsLink);
        logger.info("Clicked on Affiliate Programs Link in Header");
    }



//    public void clickAnmeldenBtnInHeader() {
//        click(anmeldenBtns.get(0));
//    }
//
//    public void clickAnmeldenBtnInBody() {
//        clickWithJSScroll(anmeldenBtns.get(1));
//    }
//
//    public void clickGesetzPagelinkInFAQ() {
//        clickWithJSScroll(gesetzPageLinkFQA);
//    }
//
//    public void clickGesetzPagelinkInFooter() {
//        clickWithJSScroll(gesetzPageLinkFooter);
//    }
//
//    public boolean verifyLoginSuccess() {
//        clickWithJSScroll(homePageLinkInHeader);
//        return isElementDisplayed(userCabinetIcon);
//    }
//
//    public void clickUserCabinetPageLink() {
//        click(userCabinetIcon);
//    }
//
//    public boolean verifyUserUnauthorized() {
//        return isElementDisplayed(anmeldenBtns.get(0));
//    }
//
//    public void clickBackToHomePageAfterError() {
//        click(clickBackToHomePage.get(0));
//    }
}
