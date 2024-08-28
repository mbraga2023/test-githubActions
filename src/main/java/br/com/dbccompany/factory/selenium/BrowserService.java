package br.com.dbccompany.factory.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;

public class BrowserService {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void initChromeDriver(String url) {
        ChromeOptions options = new ChromeOptions();
        if (System.getProperty("chrome.headless") != null && System.getProperty("chrome.headless").equals("true")) {
            options.addArguments("--headless"); // Run in headless mode
        }
        options.addArguments("--no-sandbox"); // Disable sandbox
        options.addArguments("--disable-dev-shm-usage"); // Overcome resource limits
        options.addArguments("--disable-gpu"); // Disable GPU acceleration


        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void quit() {
        driver.quit();
    }

}
