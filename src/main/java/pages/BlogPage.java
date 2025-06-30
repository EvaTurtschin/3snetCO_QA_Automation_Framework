package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Блог']")
    private WebElement blogPageTitle;

    public boolean varifyBlogPageIsOpen() {
        String headerText = blogPageTitle.getText().toUpperCase().trim();
        System.out.println("HEADER TEXT: [" + headerText + "]");

        String expectedRes = "БЛОГ";

        return isStringsEqual(headerText, expectedRes);
    }

}
