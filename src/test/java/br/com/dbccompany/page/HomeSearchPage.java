package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class HomeSearchPage extends Interactions {

    private static final By campoSearch =
            By.cssSelector("input#search_query_top");

    private static final By btnSearch =
            By.cssSelector("button[name='submit_search']");

    private static final By nomeDoProduto =
            By.cssSelector("h5[itemprop='name'] .product-name");

    private static final By msgNoResults =
            By.cssSelector("p[class^='alert']");

    public void preencherCampoSearch(String pesquisa) {
        sendKeys(campoSearch, pesquisa);
    }

    public String validarNomeProduto() {
        return lerTexto(nomeDoProduto);
    }

    public String validarMsgNoResults() {
        return lerTexto(msgNoResults);
    }

    public void clicarBtnSearch() {
        click(btnSearch);
    }
}
