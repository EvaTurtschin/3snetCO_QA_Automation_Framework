package pages;

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
    private WebElement blogLinkinHeader;
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


    public boolean verifyHomePageLogoIsClickable() {
        return isElementClickable(headerLogoinHeader);
    }

    public boolean verifyWhoWeAreLinkIsClickable() {
        return isElementClickable(whoWeAreLinkinHeader);
    }

    public boolean verifyAdvertisersLinkIsClickable() {
        return isElementClickable(advertisersLinkinHeader);
    }

    public boolean verifyAffiliateProgramsLinkIsClickable() {
        return isElementClickable(affiliateProgramsLinkinHeader);
    }

    public boolean verifyBlogLinkIsClickable() {
        return isElementClickable(blogLinkinHeader);
    }

    public boolean verifyVacancyLinkIsClickable() {
        return isElementClickable(vacancyLinkinHeader);
    }

    public boolean verifyContactsLinkIsClickable() {
        return isElementClickable(contactsLinkinHeader);
    }

    public String getHomePageUrl() {
        return "https://3snet.co/";
    }

    public String getAdvetisersAnchorUrl() {
        return "https://3snet.co/#ourAdvertisers";
    }

    public boolean verifyAdvertiserSectionIsVisible() {
       scrollToElement(advetisersSectionTitleinHeader);
       return isElementVisible(advetisersSectionTitleinHeader);
    }

    public AffiliateProgramsPage clickAffiliateProgramsLinkInHeader() {
        click(affiliateProgramsLinkinHeader);
        logger.info("Clicked on Affiliate Programs Link in Header");

        return new AffiliateProgramsPage(driver);
    }

    public void clickBlockLinkInHeader() {
        click(blogLinkinHeader);
        logger.info("Clicked on the Block link in Header");
    }

    public void clickVacancyLinkInHeader() {
        click(vacancyLinkinHeader);
        logger.info("Clicked on the Vacancy link in Header");
    }

    public void clickContactsLinkInHeader() {
        click(contactsLinkinHeader);
        logger.info("Clicked on the Contacts link in Header");
    }

    public void clickEnterLinkInHeader() {
        click(enterLinkinHeader);
        logger.info("Clicked on the Enter link in Header");
    }

    public void clickRegisterLinkInHeader() {
        click(registerLinkinHeader);
        logger.info("Clicked on the Register link in Header");
    }

    public void clickLanguageBtn() {
        click(laguageBtn);
        logger.info("Clicked on Language Btn to open Dropdown");
    }

    public void clickLanguageIconInDropdown() {
        click(laguageBtn);
        click(laguageIconInDropdown);
        logger.info("Clicked on Language Icon in Dropdown to change the language");
    }

    public boolean verifyLanguageDropdownOpens() {
        return isElementVisible(laguageIconInDropdown);
    }

    public String getHeaderLanguageSnapshot() {
        return whoWeAreLinkinHeader.getText().toUpperCase().trim();
    }

    public WebElement getWhoWeAreLinkElement() {
        return whoWeAreLinkinHeader;
    }

}
