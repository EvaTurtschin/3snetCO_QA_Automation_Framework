package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='header__logo']")
    WebElement headerLogo;

    @FindBy(xpath = "//h1[@class='text-center mb-4 pb-2']")
    WebElement coefficientsPageTitle;

    public boolean verifyCoefficientsPageOpen() {
        String headerText = coefficientsPageTitle.getText();
        return headerText.contains("БОНУСЫ, ПРОМОКОДЫ И ФРИБЕТЫ ОТ ЛЕГАЛЬНЫХ БУКМЕКЕРОВ.");
    }

    public void clickHeaderLogo() {
        click(headerLogo);
        logger.info("Clicked on Header Logo");
    }

}
