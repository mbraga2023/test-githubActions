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
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--no-sandbox"); // Disable sandbox for CI environments
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
        options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
        options.addArguments("--remote-debugging-port=9222"); // Debugging port
        options.addArguments("--disable-software-rasterizer");

        options.addArguments("--remote-debugging-address=0.0.0.0");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-plugins");
        options.addArguments("--disable-software-rasterizer");
        options.addArguments("--disable-background-timer-throttling");
        options.addArguments("--disable-backgrounding-occluded-windows");
        options.addArguments("--disable-translate");
        options.addArguments("--no-first-run");
        options.addArguments("--no-default-browser-check");


        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void quit() {
        driver.quit();
    }

}
