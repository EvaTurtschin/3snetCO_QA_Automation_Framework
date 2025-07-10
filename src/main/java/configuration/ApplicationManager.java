package configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import java.util.UUID;

public class ApplicationManager {
    static WebDriver driver;
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

            String isCI = System.getenv("CI"); // GitHub Actions автоматически задаёт CI=true

            if ("true".equals(isCI)) {
                chromeOptions.addArguments("--headless=new");
                chromeOptions.addArguments("--window-size=1920,1080");
                chromeOptions.addArguments("--window-position=0,0");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                chromeOptions.addArguments("--disable-gpu");
            } else {
                chromeOptions.addArguments("--start-maximized"); // для наглядного запуска
            }

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            System.out.println("Window size: " + driver.manage().window().getSize());
        } else if (browser != null &&
                !browser.equalsIgnoreCase("edge") &&
                !browser.equalsIgnoreCase("chrome")) {
            throw new IllegalArgumentException("Browser entered is not correct");
        }

        driver = new EventFiringDecorator(new WDListener()).decorate(driver);

        driver.manage().window().maximize();
        driver.navigate().to("https://3snet.co/");

        return driver;
    }
    public void quit() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
