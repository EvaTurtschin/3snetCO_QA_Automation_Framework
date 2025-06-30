package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VacancyPage extends BasePage{

    public VacancyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[normalize-space(text()='Вакансии')]")
    private  WebElement vacancyPageTitle;

    public boolean varifyVacancyPageIsOpen() {
        String headerText = vacancyPageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        String expectedRes = "ВАКАНСИИ";

        return isStringsEqual(headerText, expectedRes);
    }
}
