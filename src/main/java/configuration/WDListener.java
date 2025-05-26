package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class WDListener implements WebDriverListener {

    Logger logger = LoggerFactory.getLogger(WDListener.class);

    @Override
    public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
        logger.info("exception: " + e.getMessage());
        WebDriverListener.super.onError(target, method, args, e);
    }

    @Override
    public void beforeGetCurrentUrl(WebDriver driver) {
        WebDriverListener.super.beforeGetCurrentUrl(driver);
    }

    @Override
    public void beforeGetTitle(WebDriver driver) {
        WebDriverListener.super.beforeGetTitle(driver);
    }

    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        WebDriverListener.super.beforeFindElement(driver, locator);
    }

    @Override
    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
        WebDriverListener.super.afterFindElement(driver, locator, result);
    }

    @Override
    public void beforeFindElement(WebElement element, By locator) {
        WebDriverListener.super.beforeFindElement(element, locator);
    }

    @Override
    public void afterFindElement(WebElement element, By locator, WebElement result) {
        WebDriverListener.super.afterFindElement(element, locator, result);
    }

    @Override
    public void beforeFindElements(WebDriver driver, By locator) {
        logger.info("listener -> search element: " + locator.toString());
        WebDriverListener.super.beforeFindElements(driver, locator);
    }

    @Override
    public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
        WebDriverListener.super.afterFindElements(driver, locator, result);
    }

    @Override
    public void beforeFindElements(WebElement element, By locator) {
        WebDriverListener.super.beforeFindElements(element, locator);
    }

    @Override
    public void afterFindElements(WebElement element, By locator, List<WebElement> result) {
        WebDriverListener.super.afterFindElements(element, locator, result);
    }

    @Override
    public void beforeClick(WebElement element) {
        WebDriverListener.super.beforeClick(element);
    }

    @Override
    public void afterClick(WebElement element) {
        WebDriverListener.super.afterClick(element);
    }

    @Override
    public void beforeSubmit(WebElement element) {
        WebDriverListener.super.beforeSubmit(element);
    }

    @Override
    public void afterSubmit(WebElement element) {
        WebDriverListener.super.afterSubmit(element);
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.beforeSendKeys(element, keysToSend);
    }

    @Override
    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.afterSendKeys(element, keysToSend);
    }

    @Override
    public void beforeClear(WebElement element) {
        WebDriverListener.super.beforeClear(element);
    }

    @Override
    public void afterClear(WebElement element) {
        WebDriverListener.super.afterClear(element);
    }

    @Override
    public void beforeGetText(WebElement element) {
        WebDriverListener.super.beforeGetText(element);
    }

    @Override
    public void afterGetText(WebElement element, String result) {
        WebDriverListener.super.afterGetText(element, result);
    }

    @Override
    public void beforeIsDisplayed(WebElement element) {
        WebDriverListener.super.beforeIsDisplayed(element);
    }

    @Override
    public void afterIsDisplayed(WebElement element, boolean result) {
        WebDriverListener.super.afterIsDisplayed(element, result);
    }

}
