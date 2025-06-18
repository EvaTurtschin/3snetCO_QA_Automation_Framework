package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    private WebDriverWait wait5;
    protected WebDriverWait wait;
    static Logger logger = LoggerFactory.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void clear(WebElement element) {
        element.clear();
    }

    public void clickWithJSScroll(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        element.click();
    }

    protected boolean isStringsEqual(String actualRes, String expectedRes) {
        if (actualRes.equals(expectedRes)) {
            return true;
        } else {
            logger.info("actual res: " + actualRes +
                    " expected res " + expectedRes);
            return false;
        }
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getTextBase(WebElement element) {
        return element.getText().trim();
    }

    public boolean isElementVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    public void navigateToHomePage() {
        if (driver != null) {
            driver.get("https://3snet.co/");
        } else {
            logger.error("WebDriver is not initialized. Cannot navigate to home page.");
            throw new IllegalStateException("WebDriver is not initialized.");
        }
    }

    public void typeText(WebElement element, String text) {
        click(element);
        element.clear();
        element.sendKeys(text);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    protected WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return wait5;
    }
}
