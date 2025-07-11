package configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import java.util.UUID;
import org.openqa.selenium.Dimension;

public class ApplicationManager {
    private WebDriver driver;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public WebDriver init() {
    if (browser.equals("edge")) {
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(edgeOptions);
    } else if (browser.equals("chrome")) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lang=en");

        boolean isCI = "true".equals(System.getenv("CI"));

        if (isCI) {
            chromeOptions.addArguments("--headless=new");
            chromeOptions.addArguments("--window-size=1920,1080");
            chromeOptions.addArguments("--window-position=0,0");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--disable-gpu");
        } else {
            chromeOptions.addArguments("--start-maximized");
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        if (isCI) {
            driver.manage().window().setSize(new Dimension(1920, 1080));
        } else {
            driver.manage().window().maximize();
        }
    } else {
        throw new IllegalArgumentException("Unsupported browser: " + browser);
    }

    System.out.println("Window size: " + driver.manage().window().getSize());

    // driver = new EventFiringDecorator(new WDListener()).decorate(driver);
    driver.navigate().to("https://3snet.co/");
    return driver;
}
    public void quit() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
