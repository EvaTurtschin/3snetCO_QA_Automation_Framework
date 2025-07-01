package tests;

import configuration.ApplicationManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Arrays;

public abstract class BaseTest {

    protected WebDriver driver;
    private WebDriverWait wait5;
    protected ApplicationManager app =
            new ApplicationManager(System
                    .getProperty("browser", "chrome"));

    protected Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected JavascriptExecutor jsExecutor() {
        return (JavascriptExecutor) driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method, Object[] parameters) {
        logger.info("Start test: " + method.getName() + " with data " + Arrays.asList(parameters));
        driver = app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (result.isSuccess()) {
            logger.info("PASSED " + result.getMethod().getMethodName());
        } else {
            logger.error("FAILED " + result.getMethod().getMethodName());
        }
        app.quit();
        wait5 = null;
        logger.info("Stop test");
        logger.info("-------------------------------------------------------");
    }

    protected WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return wait5;
    }
}
