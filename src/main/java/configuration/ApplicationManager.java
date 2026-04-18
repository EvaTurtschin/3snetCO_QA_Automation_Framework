package configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.Dimension;


public class ApplicationManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    String browser;
    private static final Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public WebDriver init() {
    if (browser.equals("edge")) {
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriverManager.edgedriver().setup();
        driver.set(new EdgeDriver(edgeOptions));
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
        driver.set(new ChromeDriver(chromeOptions));

        if (isCI) {
            driver.get().manage().window().setSize(new Dimension(1920, 1080));
        } else {
            driver.get().manage().window().maximize();
        }
    } else {
        throw new IllegalArgumentException("Unsupported browser: " + browser);
    }

    logger.info("Window size: {}", driver.get().manage().window().getSize());

    driver.set(new EventFiringDecorator(new WDListener()).decorate(driver.get()));
    driver.get().navigate().to("https://3snet.co/");
    return driver.get();
}
    public void quit() {
        driver.get().quit();
        driver.remove();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

}
