package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Поиск')]")
    private WebElement searchResultsTitle;

    public boolean verifySearchResultsPageIsOpen() {
        waitUntilUrlToBe("https://3snet.co/?s=");
        String url = new SearchResultsPage(driver).getCurrentUrl();
        Assert.assertEquals(url, "https://3snet.co/?s=");
        return true;
    }

    public boolean verifySearchResultsIsCorrect() {
        String rawText = searchResultsTitle.getText();
        String extractedText = rawText.replaceAll(".*:\\s*\"(.*?)\".*", "$1"); //getting the part after : and in the ""
        Assert.assertEquals(extractedText, "test text");
        return true;
    }

}
