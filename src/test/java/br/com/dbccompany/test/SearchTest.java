package br.com.dbccompany.test;

import br.com.dbccompany.dto.ProductDto;
import br.com.dbccompany.factory.data.ProductData;
import br.com.dbccompany.factory.selenium.Validation;
import br.com.dbccompany.page.HomeSearchPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static storys.SearchStory.*;

@Epic(EPIC)
@Story(USER_STORY_SEARCH)
public class SearchTest extends LoginBaseTest {

    HomeSearchPage homeSearchPage = new HomeSearchPage();
    ProductData productData = new ProductData();
    Validation validation = new Validation();

    @Test
    @Description(CT_SEARCH_001)
    public void test1validarBuscaProdutoExistente() {

        ProductDto product = productData.produtoExistente();
        homeSearchPage.preencherCampoSearch(product.getName());
        homeSearchPage.clicarBtnSearch();

        String nomeProduto = homeSearchPage.validarNomeProduto();
        validation.validateText(product.getName(), nomeProduto);

    }

    @Test
    @Description(CT_SEARCH_002)
    public void test2validarBuscaProdutoInexistente() {

        ProductDto product = productData.produtoInexistente();
        homeSearchPage.preencherCampoSearch(product.getName());
        homeSearchPage.clicarBtnSearch();

        String msg = homeSearchPage.validarMsgNoResults();
        validation.validateText("No results were found for your search " + "\"" + product.getName() + "\"", msg);

    }
}
