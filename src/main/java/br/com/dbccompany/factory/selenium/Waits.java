package br.com.dbccompany.factory.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits extends BrowserService {

    private static WebDriverWait waitModal;


    static {
        waitModal = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void waitElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitForModalToBeVisible(By modalLocator) {
        waitModal.until(ExpectedConditions.visibilityOfElementLocated(modalLocator));
    }


}
