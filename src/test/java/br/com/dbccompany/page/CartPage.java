package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import br.com.dbccompany.factory.selenium.Waits;
import org.openqa.selenium.By;
import storys.CartStory;

import static storys.CartStory.SHOPPING_CART_EMPTY;

public class CartPage extends Interactions {

    private static final By mainLogo =
            By.cssSelector("#header_logo");
    private static final By btnWomenSection =
            By.cssSelector("#block_top_menu ul li a");
    private static final By cardProduct2 =
            By.cssSelector("#center_column > ul  > li:nth-of-type(2)");

    private static final By cardProduct4 =
            By.cssSelector("#center_column > ul  > li:nth-of-type(4)");
    private static final By dropBoxSize =
            By.cssSelector("#group_1");
    private static final By btnProductDetail4 =
            By.cssSelector("#center_column > ul  > li:nth-of-type(4) div.button-container a");


    private static final By btnProductDetail =
            By.cssSelector("#center_column > ul  > li:nth-of-type(2) div.button-container a");
    private static final By selectorColorWhite =
            By.cssSelector("#attributes fieldset:nth-of-type(2) div ul li a");
    private static final By selectorColoPink =
            By.cssSelector("#attributes fieldset:nth-of-type(2) div ul li:nth-of-type(2) a");

    private static final By btnAddToCart =
            By.cssSelector("#add_to_cart button ");
    private static final By btnModalProceedToCheckOut =
            By.cssSelector("a.btn.btn-default.button.button-medium");
    private static final By btnSummaryProceedToCheckOut =
            By.cssSelector("#columns div.row:nth-of-type(3) p:nth-of-type(2) a");
    private static final By btnAddressProceedToCheckOut =
            By.cssSelector("#center_column form > p button");
    private static final By checkBoxTermsAndConditions =
            By.cssSelector("#form div p.checkbox input");
    private static final By btnShippingProceedToCheckOut =
            By.cssSelector("#form > p button ");
    private static final By btnPayByBank =
            By.cssSelector("#HOOK_PAYMENT div div.col-xs-12");
    private static final By btnPayByCheck =
            By.cssSelector("#HOOK_PAYMENT div:nth-of-type(2) div.col-xs-12");
    private static final By btnPaymentConfirmOrder =
            By.cssSelector("#center_column form > p button");
    private static final By txtSuccessAlert =
            By.cssSelector("#center_column");
    private static final By txtErroCheckboxTermsVazio =
            By.cssSelector("#order > div.fancybox-overlay.fancybox-overlay-fixed > div");
    private static final By txtTituloFormularioCadastroEndereco =
            By.cssSelector("#center_column > div > h1");
    private static final By txtTituloPaginaLogin =
            By.cssSelector("#center_column > h1");
    private static final By txtCarrinhoVazio =
            By.cssSelector("#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a > span.ajax_cart_no_product");
      private static final By btnExcluirProdutoDoCarrinho =
            By.cssSelector("#product_2_8_0_8041 > td.cart_delete.text-center a");
    private static final By txtAvisoCarrinhoVazio =
            By.cssSelector("#center_column > p");
    private static final By btnAumentarQuantidadeProduto =
            By.cssSelector("#cart_quantity_up_2_8_0_8041");
    private static final By inputDisplayQuantidadProduto =
            By.cssSelector("#product_2_8_0_8041 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey");

    public void clicarBtnLogo() {
        click(mainLogo);
    }

    public void clicarBtnWomanSection() {
        click(btnWomenSection);
    }

    public void clicarCardProduct2() {
        click(cardProduct2);
    }

    public void clicarCardProduct4() {
        click(cardProduct4);
    }


    public void clicarDropboxSize() {
        selectDropdownOption(dropBoxSize, "M");
    }

    public void clicarBtnMore4() {
        click(btnProductDetail4);
    }

    public void clicarBtnMore() {
        click(btnProductDetail);
    }

    public void clicarselectorColorWhite() {
        click(selectorColorWhite);
    }

    public void clicarselectorColorPink() {
        click(selectorColoPink);
    }


    public void clicarBtnAddToCart() {
        By buttonLocator = By.id("add_to_cart");
        Waits.waitForModalToBeVisible(buttonLocator);
        Interactions.click(btnAddToCart);
    }

    public void clicarBtnModalProceedToCheckOut() {
        By modalLocator = By.id("layer_cart");
        Waits.waitForModalToBeVisible(modalLocator);
        Interactions.click(btnModalProceedToCheckOut);
    }

    public void clicarBtnSummaryProceedToCheckOut() {
        click(btnSummaryProceedToCheckOut);
    }

    public void clicarBtnAddressProceedToCheckOut() {
        click(btnAddressProceedToCheckOut);
    }

    public void clicarcheckBoxTermsAndConditions() {
        click(checkBoxTermsAndConditions);
    }

    public void clicarBtnShippingProceedToCheckOut() {
        click(btnShippingProceedToCheckOut);
    }

    public void clicarBtnPayByBank() {
        click(btnPayByBank);
    }

    public void clicarBtnPayByCheck() {
        click(btnPayByCheck);
    }

    public void clicarBtnPaymentConfirmOrder() {
        click(btnPaymentConfirmOrder);
    }


    public void clicarBtnExcluir() {
        click(btnExcluirProdutoDoCarrinho);

    }

    public boolean verificaMensagemDeSucesso() {
        Waits.waitForModalToBeVisible(txtSuccessAlert);
        String textoSucesso = lerTexto(txtSuccessAlert);
        return textoSucesso.equals(CartStory.SUCCESS_ORDER_COMPLETE);
    }

    public boolean verificaMensagemDeErroCheckboxTerms() {
        Waits.waitForModalToBeVisible(txtErroCheckboxTermsVazio);
        String textoErro = lerTexto(txtErroCheckboxTermsVazio);
        return textoErro.equals(CartStory.ERROR_TERMS_OF_SERVICE);
    }

    public boolean verificaTituloFormularioEndereco() {
        Waits.waitForModalToBeVisible(txtTituloFormularioCadastroEndereco);
        String titulo = lerTexto(txtTituloFormularioCadastroEndereco);
        return titulo.equals("YOUR ADDRESSES");
    }

    public boolean verificaTituloPaginaLogin() {
        Waits.waitForModalToBeVisible(txtTituloPaginaLogin);
        String titulo = lerTexto(txtTituloPaginaLogin);
        return titulo.equals("AUTHENTICATION");
    }

    public boolean verificaTextoCarrinhoVazio() {
        Waits.waitForModalToBeVisible(txtCarrinhoVazio);
        String titulo = lerTexto(txtCarrinhoVazio);
        return titulo.equals("empty");
    }

    public boolean txtAvisoCarrinhoVazio() {
        String titulo = lerTexto(txtAvisoCarrinhoVazio);
        return titulo.equals(SHOPPING_CART_EMPTY);
    }

    public void clicarParaAumentarQuantidadeProduto() {
        click(btnAumentarQuantidadeProduto);
    }

    public boolean verificarAumentarQuantidade() {
        String quantidade = lerTexto(inputDisplayQuantidadProduto);
        return quantidade.equals("2");
    }


    public void fluxoDeCompraComSucesso() {
        clicarBtnWomanSection();
        clicarCardProduct2();
        clicarBtnMore();
        clicarselectorColorWhite();
        clicarBtnAddToCart();
        clicarBtnModalProceedToCheckOut();
        clicarBtnSummaryProceedToCheckOut();
        clicarBtnAddressProceedToCheckOut();
        clicarcheckBoxTermsAndConditions();
        clicarBtnShippingProceedToCheckOut();
        clicarBtnPayByBank();
        clicarBtnPaymentConfirmOrder();
        verificaMensagemDeSucesso();
    }

}
