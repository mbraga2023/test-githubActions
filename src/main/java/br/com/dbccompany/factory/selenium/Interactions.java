package br.com.dbccompany.factory.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static br.com.dbccompany.factory.selenium.Waits.waitElement;

public class Interactions extends Elements {

    protected static void sendKeys(By by, String text) {
        waitElement(by);
        element(by).sendKeys(text);
    }

    protected static void click(By by) {
        waitElement(by);
        element(by).click();
    }

    protected static String lerTexto(By by) {
        waitElement(by);
        return element(by).getText();
    }

    protected static void sendTab(By by){
        waitElement(by);
        element(by).sendKeys("\t");
    }

    protected static void selectDropdownOption(By by, String value) {
        waitElement(by);
        WebElement dropdown = element(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
           }
    protected static void uploadFile(By by, String filePath) {
        waitElement(by);
        WebElement fileInput = element(by);
        fileInput.sendKeys(filePath);
    }
}
