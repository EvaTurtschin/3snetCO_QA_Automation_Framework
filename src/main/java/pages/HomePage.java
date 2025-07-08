package pages;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement headerLogoinHeader;
    @FindBy(xpath = "//a[@class='active who-we-are']")
    private WebElement whoWeAreLinkinHeader;
    @FindBy(xpath = "//a[text()='РЕКЛАМОДАТЕЛИ']")
    private WebElement advertisersLinkinHeader;
    @FindBy(xpath = "//h3[contains(text(), 'Рекламодатели')]")
    private WebElement advetisersSectionTitleinHeader;
    @FindBy(xpath = "//a[contains(normalize-space(), 'ПАРТНЕРСКИЕ ПРОГРАММЫ')]")
    private WebElement affiliateProgramsLinkinHeader;
    @FindBy(xpath = "//a[contains(text(), 'БЛОГ')]")
    private WebElement blogLinkInHeader;
    @FindBy(xpath = "//a[contains(text(),'ВАКАНСИИ')]")
    private WebElement vacancyLinkinHeader;
    @FindBy(xpath = "//a[contains(text(), 'КОНТАКТЫ')]")
    private WebElement contactsLinkinHeader;
    @FindBy(xpath = "//a[contains(normalize-space(), 'ВХОД')]")
    private WebElement enterLinkinHeader;
    @FindBy(xpath = "//a[contains(normalize-space(), 'РЕГИСТРАЦИЯ')]")
    private WebElement registerLinkinHeader;
    @FindBy(xpath = "//span[@class='arrow']")
    private WebElement laguageBtn;
    @FindBy(xpath = "//img[@class='language-flag']")
    private WebElement laguageIconInDropdown;



    @Step("Verify Logo is Clickable")
    public boolean verifyHomePageLogoIsClickable() {
        return isElementClickable(headerLogoinHeader);
    }

    @Step("Verify Who We Are link is clickable")
    public boolean verifyWhoWeAreLinkIsClickable() {
        return isElementClickable(whoWeAreLinkinHeader);
    }

    @Step("Verify Advertisers link is clickable")
    public boolean verifyAdvertisersLinkIsClickable() {
        return isElementClickable(advertisersLinkinHeader);
    }

    @Step("Verify Affiliate Programs link is clickable")
    public boolean verifyAffiliateProgramsLinkIsClickable() {
        return isElementClickable(affiliateProgramsLinkinHeader);
    }

    @Step("Verify Blog link is clickable")
    public boolean verifyBlogLinkIsClickable() {
        return isElementClickable(blogLinkInHeader);
    }

    @Step("Verify Vacancy link is clickable")
    public boolean verifyVacancyLinkIsClickable() {
        return isElementClickable(vacancyLinkinHeader);
    }

    @Step("Verify Contacts link is clickable")
    public boolean verifyContactsLinkIsClickable() {
        return isElementClickable(contactsLinkinHeader);
    }

    public String getHomePageUrl() {
        return "https://3snet.co/";
    }

    public String getAdvetisersAnchorUrl() {
        return "https://3snet.co/#ourAdvertisers";
    }

    @Step("Verify Advertiser section is visible")
    public boolean verifyAdvertiserSectionIsVisible() {
       scrollToElement(advetisersSectionTitleinHeader);
       return isElementVisible(advetisersSectionTitleinHeader);
    }

    @Step("Click Affiliate Programs link in header")
    public AffiliateProgramsPage clickAffiliateProgramsLinkInHeader() {
        click(affiliateProgramsLinkinHeader);
        logger.info("Clicked on Affiliate Programs Link in Header");

        return new AffiliateProgramsPage(driver);
    }

    @Step("Click Blog link in header")
    public void clickBlogLinkInHeader() {
        waitUntilClickable(blogLinkInHeader);
        click(blogLinkInHeader);
        logger.info("Clicked on the Blog link in Header");
    }

    @Step("Click Vacancy link in header")
    public void clickVacancyLinkInHeader() {
        click(vacancyLinkinHeader);
        logger.info("Clicked on the Vacancy link in Header");
    }

    @Step("Click Contacts link in header")
    public void clickContactsLinkInHeader() {
        click(contactsLinkinHeader);
        logger.info("Clicked on the Contacts link in Header");
    }

    @Step("Click Enter link in header")
    public void clickEnterLinkInHeader() {
        click(enterLinkinHeader);
        logger.info("Clicked on the Enter link in Header");
    }

    @Step("Click Register link in header")
    public void clickRegisterLinkInHeader() {
        click(registerLinkinHeader);
        logger.info("Clicked on the Register link in Header");
    }

    @Step("Click Language button in header")
    public void clickLanguageBtn() {
        click(laguageBtn);
        logger.info("Clicked on Language Btn to open Dropdown");
    }

    @Step("Click Language Icon in Dropdown menu")
    public void clickLanguageIconInDropdown() {
        click(laguageBtn);
        click(laguageIconInDropdown);
        logger.info("Clicked on Language Icon in Dropdown to change the language");
    }

    @Step("Verify Language Dropdown menu opens")
    public boolean verifyLanguageDropdownOpens() {
        return isElementVisible(laguageIconInDropdown);
    }

    @Step("Get language snapshot from Who We Are link in header")
    public String getHeaderLanguageSnapshot() {
        return whoWeAreLinkinHeader.getText().toUpperCase().trim();
    }

    public WebElement getWhoWeAreLinkElement() {
        return whoWeAreLinkinHeader;
    }

}
