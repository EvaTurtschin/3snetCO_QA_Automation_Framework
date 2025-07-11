package tests;

import io.qameta.allure.Attachment;

import configuration.ApplicationManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Arrays;

@Listeners({io.qameta.allure.testng.AllureTestNg.class})
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
        String methodName = result.getMethod().getMethodName();

        if (result.isSuccess()) {
            logger.info("✅ PASSED {}", methodName);
        } else {
            logger.error("❌ FAILED {}", methodName);
            takeScreenshot(); // Аллюр вложение
        }

        app.quit();
        wait5 = null;
        logger.info("Stop test");
        logger.info("-------------------------------------------------------");
    }

    @Attachment(value = "Screenshot on Failure", type = "image/png")
    public byte[] takeScreenshot() {
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            logger.warn("Unable to take screenshot: {}", e.getMessage());
            return new byte[0];
        }
    }
    
    @Attachment(value = "Screenshot on Failure", type = "image/png")
    public void takeScreenshot(String name) {
    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
        Files.copy(src.toPath(), Path.of("target", name + ".png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    protected WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return wait5;
    }
}
