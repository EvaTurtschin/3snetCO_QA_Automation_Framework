package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List

public class WDListener implements WebDriverListener {

    private static final Logger logger = LoggerFactory.getLogger(WDListener.class);

    // Ошибка WebDriver
    @Override
    public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
        logger.error("WebDriver error in method [{}]: {}", method.getName(), e.getCause().getMessage());
    }

    // Клик
    @Override
    public void beforeClick(WebElement element) {
        logger.info("Click on: {}", element);
    }

    // Ввод текста
    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        logger.info("Type '{}' into: {}", Arrays.toString(keysToSend), element);
    }

    // Поиск элемента
    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        logger.debug("Find element: {}", locator);
    }

    // Навигация
    @Override
    public void beforeTo(WebDriver.Navigation navigation, String url) {
        logger.info("Navigate to: {}", url);
    }
}
