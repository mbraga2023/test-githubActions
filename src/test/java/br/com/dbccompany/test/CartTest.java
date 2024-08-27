package br.com.dbccompany.test;

import br.com.dbccompany.dto.LoginDto;
import br.com.dbccompany.factory.data.LoginData;
import br.com.dbccompany.page.CartPage;
import br.com.dbccompany.page.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static storys.CartStory.*;

@Epic(EPIC_CART)
@Story(USER_STORY_CART)
public class CartTest extends BaseTest {
    private LoginBaseTest loginBaseTest;
    private CartPage cartPage;
    private LoginPage loginPage;
    private LoginData loginData;
    private BaseTest baseTest;

    public void setUpLoginUsuarioComEndereco() {

        cartPage = new CartPage();
        loginPage = new LoginPage();
        loginData = new LoginData();

        loginBaseTest = new LoginBaseTest();
        loginBaseTest.abrirNavegador();
        LoginDto validUser = loginData.loginUsuarioComEndereco();
        loginPage.fazerLogin(validUser.getEmail(), validUser.getSenha());
    }

    public void setUpLoginUsuarioSemEndereco() {
        cartPage = new CartPage();
        loginPage = new LoginPage();
        loginData = new LoginData();

        loginBaseTest = new LoginBaseTest();
        loginBaseTest.abrirNavegador();

        LoginDto validUser = loginData.loginUsuarioSemEndereco();
        loginPage.fazerLogin(validUser.getEmail(), validUser.getSenha());
    }

    public void setUpLoginUsuarioSemLogin() {
        cartPage = new CartPage();
        baseTest = new BaseTest();

        baseTest.abrirNavegador();
    }

    @Test
    @Description(CT_CART_01)
    public void testValidarFluxoCarrinhoComSucesso() {
        setUpLoginUsuarioComEndereco();
        cartPage.fluxoDeCompraComSucesso();
        ;
    }

    @Test
    @Description(CT_CART_02)
    public void validarCheckoutPagamentoCheck() {
        setUpLoginUsuarioComEndereco();
        cartPage.clicarBtnLogo();
        cartPage.clicarBtnWomanSection();
        cartPage.clicarCardProduct2();
        cartPage.clicarBtnMore();
        cartPage.clicarselectorColorWhite();
        cartPage.clicarBtnAddToCart();
        cartPage.clicarBtnModalProceedToCheckOut();
        cartPage.clicarBtnSummaryProceedToCheckOut();
        cartPage.clicarBtnAddressProceedToCheckOut();
        cartPage.clicarcheckBoxTermsAndConditions();
        cartPage.clicarBtnShippingProceedToCheckOut();
        cartPage.clicarBtnPayByCheck();
        cartPage.clicarBtnPaymentConfirmOrder();
        cartPage.verificaMensagemDeSucesso();
    }

    @Test
    @Description(CT_CART_03)
    public void validarCheckoutComVariaçãoDeTamanhoECor() {
        setUpLoginUsuarioComEndereco();
        cartPage.clicarBtnLogo();
        cartPage.clicarBtnWomanSection();
        cartPage.clicarCardProduct4();
        cartPage.clicarBtnMore4();
        cartPage.clicarDropboxSize();
        cartPage.clicarselectorColorPink();
        cartPage.clicarBtnAddToCart();
        cartPage.clicarBtnModalProceedToCheckOut();
        cartPage.clicarBtnSummaryProceedToCheckOut();
        cartPage.clicarBtnAddressProceedToCheckOut();
        cartPage.clicarcheckBoxTermsAndConditions();
        cartPage.clicarBtnShippingProceedToCheckOut();
        cartPage.clicarBtnPayByCheck();
        cartPage.clicarBtnPaymentConfirmOrder();
        cartPage.verificaMensagemDeSucesso();
    }

    @Test
    @Description(CT_CART_04)
    public void validarMensagemCheckboxTermosVazio() {
        setUpLoginUsuarioComEndereco();
        cartPage.clicarBtnLogo();
        cartPage.clicarBtnWomanSection();
        cartPage.clicarCardProduct2();
        cartPage.clicarBtnMore();
        cartPage.clicarselectorColorWhite();
        cartPage.clicarBtnAddToCart();
        cartPage.clicarBtnModalProceedToCheckOut();
        cartPage.clicarBtnSummaryProceedToCheckOut();
        cartPage.clicarBtnAddressProceedToCheckOut();
        cartPage.clicarBtnShippingProceedToCheckOut();
        cartPage.verificaMensagemDeErroCheckboxTerms();

    }

    @Test
    @Description(CT_CART_05)
    public void validarCompraUsuarioSemEndereço() {
        setUpLoginUsuarioSemEndereco();
        cartPage.clicarBtnLogo();
        cartPage.clicarBtnWomanSection();
        cartPage.clicarCardProduct2();
        cartPage.clicarBtnMore();
        cartPage.clicarselectorColorWhite();
        cartPage.clicarBtnAddToCart();
        cartPage.clicarBtnModalProceedToCheckOut();
        cartPage.clicarBtnSummaryProceedToCheckOut();
        cartPage.clicarBtnAddressProceedToCheckOut();
        cartPage.verificaTituloFormularioEndereco();

    }

    @Test
    @Description(CT_CART_06)
    public void validarCheckoutSemLogin() {
        setUpLoginUsuarioSemLogin();
        cartPage.clicarBtnLogo();
        cartPage.clicarBtnWomanSection();
        cartPage.clicarCardProduct2();
        cartPage.clicarBtnMore();
        cartPage.clicarselectorColorWhite();
        cartPage.clicarBtnAddToCart();
        cartPage.clicarBtnModalProceedToCheckOut();
        cartPage.clicarBtnSummaryProceedToCheckOut();
        cartPage.verificaTituloPaginaLogin();

    }

    @Test
    @Description(CT_CART_07)
    public void validarCarrinhoVazioAposPagamento() {
        setUpLoginUsuarioComEndereco();
        cartPage.fluxoDeCompraComSucesso();
        cartPage.verificaTextoCarrinhoVazio();

    }

    @Test
    @Description(CT_CART_08)
    public void validarExcluirProdutoDoCarrinho() {
        setUpLoginUsuarioComEndereco();
        cartPage.clicarBtnLogo();
        cartPage.clicarBtnWomanSection();
        cartPage.clicarCardProduct2();
        cartPage.clicarBtnMore();
        cartPage.clicarselectorColorWhite();
        cartPage.clicarBtnAddToCart();
        cartPage.clicarBtnModalProceedToCheckOut();
        cartPage.clicarBtnExcluir();
        cartPage.txtAvisoCarrinhoVazio();

    }

    @Test
    @Description(CT_CART_09)
    public void validarAumentarAQuantidadeDeProdutoNoCarrinho() {
        setUpLoginUsuarioComEndereco();
        cartPage.clicarBtnLogo();
        cartPage.clicarBtnWomanSection();
        cartPage.clicarCardProduct2();
        cartPage.clicarBtnMore();
        cartPage.clicarselectorColorWhite();
        cartPage.clicarBtnAddToCart();
        cartPage.clicarBtnModalProceedToCheckOut();
        cartPage.clicarParaAumentarQuantidadeProduto();
        cartPage.verificarAumentarQuantidade();

    }


}