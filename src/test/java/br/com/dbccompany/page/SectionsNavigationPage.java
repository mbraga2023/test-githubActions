package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import br.com.dbccompany.factory.selenium.Waits;
import org.openqa.selenium.By;

public class SectionsNavigationPage extends Interactions {
    private static final By mainLogo =
            By.cssSelector("#header_logo");
    private static final By btnWomenSection =
            By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    private static final By btnDressesSection =
            By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private static final By btnTShirtSection =
            By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    private static final By btnBlogSection =
            By.cssSelector("#block_top_menu > ul > li:nth-child(4) > a");
    private static final By btnPopular =
            By.cssSelector("a[class='homefeatured']");
    private static final By btnBestSellers =
            By.cssSelector("a[class='blockbestsellers']");


    public void clicarBtnLogo() {
        click(mainLogo);
    }

    public void clicarBtnBlogSection() {
        click(btnBlogSection);
    }
    public void clicarBtnTShirtSection() {
        click(btnTShirtSection);
    }
    public void clicarBtnWomanSection() {
        By pageElement = By.id("center_column");
        Waits.waitForModalToBeVisible(pageElement);
        click(btnWomenSection);
    }
    public void clicarBtnDressesSection() {
        click(btnDressesSection);
    }

    public void clicarBtnPopularSection() {
        click(btnPopular);
    }

    public void clicarBtnBestSellersSection() {
        click(btnBestSellers);
    }
}
