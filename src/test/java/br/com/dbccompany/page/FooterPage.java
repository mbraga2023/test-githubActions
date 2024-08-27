package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FooterPage extends Interactions {

    private static final By linkFacebookIcon =
            By.cssSelector("#social_block > ul > li.facebook > a");
    private static final By linkTwitterIcon =
            By.cssSelector("#social_block > ul > li.twitter > a ");
    private static final By linkRSSIcon =
            By.cssSelector("#social_block > ul > li.rss > a ");
    private static final By linkWomenSection =
            By.cssSelector("#footer > div > section.blockcategories_footer.footer-block.col-xs-12.col-sm-2 > div > div > ul > li > a");
    private static final By linkOurStores =
            By.cssSelector("#block_various_links_footer > ul > li:nth-child(1) > a");
    private static final By linkTermsAndConditions =
            By.cssSelector("#block_various_links_footer > ul > li:nth-child(2) > a");
    private static final By linkAboutUs =
            By.cssSelector("#block_various_links_footer > ul > li:nth-child(3) > a");
    private static final By linkMyOrders =
            By.cssSelector("#footer > div > section:nth-child(7) > div > ul > li:nth-child(1) > a");
    private static final By linkMyCreditSlips =
            By.cssSelector("#footer > div > section:nth-child(7) > div > ul > li:nth-child(2) > a");
    private static final By linkMyAddresses =
            By.cssSelector("#footer > div > section:nth-child(7) > div > ul > li:nth-child(3) > a");
    private static final By linkMyPersonalInfo =
            By.cssSelector("    #footer > div > section:nth-child(7) > div > ul > li:nth-child(4) > a");
    private static final By mainLogo =
            By.cssSelector("#header_logo");
    private static final By btnDetails =
            By.cssSelector("#order-list > tbody > tr.first_item > td.history_detail.footable-last-column > a.btn.btn-default.button.button-small");
    private static final By btnRepedido =
            By.cssSelector("#order-list > tbody > tr.first_item > td.history_detail.footable-last-column > a.link-button");
    private static final By txtTotalPrice =
            By.cssSelector("#total_price");
    private static final By linkContatoEmail =
            By.cssSelector("#block_contact_infos > div > ul > li:nth-child(3) > span > a");


    public void clicarBtnFacebook() {
        click(linkFacebookIcon);
    }
    public void clicarBtnTwitter() {
        click(linkTwitterIcon);
    }
    public void clicarBtnCSS() {
        click(linkRSSIcon);
    }

    public void clicarBtnWoman() {
        click(linkWomenSection);
    }
    public void clicarBtnOurStores() {
        click(linkOurStores);
    }
    public void clicarBtnTermsAndConditiosn() {
        click(linkTermsAndConditions);
    }
    public void clicarBtnAboutUs() {
        click(linkAboutUs);
    }

    public void clicarBtnMyOrders() {
        click(linkMyOrders);
    }

    public void clicarBtnMyCreditSlips() {
        click(linkMyCreditSlips);
    }
    public void clicarBtnMyAddresses() {
        click(linkMyAddresses);
    }

    public void clicarBtnMyPersonalInfo() {
        click(linkMyPersonalInfo);
    }

    public void clicarBtnLogo() {
        click(mainLogo);
    }

    public void clicarBtnProductDetail() {
        click(btnDetails);
    }

    public void clicarBtnRepedido() {
        click(btnRepedido);
    }
    public boolean verificaTituloFormularioEndereco() {
         String preco = lerTexto(txtTotalPrice);
        return preco != null && !preco.trim().isEmpty();
    }

    public void clicarLinkContatoEmail() {
        click(linkContatoEmail);
    }

    public boolean verificarEmailFooter(){
        WebElement emailLink = element(linkContatoEmail);
        String href = emailLink.getAttribute("href");
        boolean isMailtoLink = href != null && href.startsWith("mailto:sales@yourcompany.com");
        String visibleText = emailLink.getText().trim();
        boolean isCorrectText = "sales@yourcompany.com".equals(visibleText);
        return isMailtoLink && isCorrectText;
    }

}
