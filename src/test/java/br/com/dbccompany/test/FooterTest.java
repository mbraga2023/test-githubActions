package br.com.dbccompany.test;

import br.com.dbccompany.page.FooterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static storys.FooterStory.*;

@Epic(EPIC_FOOTER)
@Story(USER_STORY_FOOTER)
public class FooterTest extends BaseTest{
    private BaseTest baseTest;
    private FooterPage footerPage;

    public void setUpLoginUsuarioSemLogin() {
        footerPage = new FooterPage();
        baseTest = new BaseTest();

        baseTest.abrirNavegador();
    }

    public void setUpLoginUsuarioComLogin() {
        footerPage = new FooterPage();
        baseTest = new BaseTest();

        //baseTest.abrirNavegador();
        baseTest.setUpLoginUsuarioComEndereco();
        footerPage.clicarBtnLogo();
    }


    @Test
    @Description(CT_FOOTER_01)
    public void validarLinkFacebook(){
        setUpLoginUsuarioSemLogin();
        footerPage.clicarBtnFacebook();
    }

    @Test
    @Description(CT_FOOTER_02)
    public void validarLinkTwitter(){
        setUpLoginUsuarioSemLogin();
        footerPage.clicarBtnTwitter();
    }
    @Test
    @Description(CT_FOOTER_03)
    public void validarLinkRSS(){
        setUpLoginUsuarioSemLogin();
        footerPage.clicarBtnCSS();
    }

    @Test
    @Description(CT_FOOTER_04)
    public void validarLinkWomenSection(){
        setUpLoginUsuarioSemLogin();
        footerPage.clicarBtnWoman();
    }

    @Test
    @Description(CT_FOOTER_05)
    public void validarlinkOurStores(){
        setUpLoginUsuarioSemLogin();
        footerPage.clicarBtnOurStores();
    }

    @Test
    @Description(CT_FOOTER_06)
    public void validarLinkTermsAndConditions(){
        setUpLoginUsuarioSemLogin();
        footerPage.clicarBtnTermsAndConditiosn();
    }

    @Test
    @Description(CT_FOOTER_07)
    public void validarLinkAboutUs(){
        setUpLoginUsuarioSemLogin();
        footerPage.clicarBtnAboutUs();
    }

    @Test
    @Description(CT_FOOTER_08)
    public void validarLinkMyOrders(){
        setUpLoginUsuarioComLogin();
        footerPage.clicarBtnMyOrders();
    }
    @Test
    @Description(CT_FOOTER_09)
    public void validarLinkMyCreditSlips(){
        setUpLoginUsuarioComLogin();
        footerPage.clicarBtnMyCreditSlips();
    }

    @Test
    @Description(CT_FOOTER_10)
    public void validarLinkMyAddresses(){
        setUpLoginUsuarioComLogin();
        footerPage.clicarBtnMyAddresses();
    }

    @Test
    @Description(CT_FOOTER_11)
    public void validarLinkMyPersonalInfo(){
        setUpLoginUsuarioComLogin();
        footerPage.clicarBtnMyPersonalInfo();
    }

    @Test
    @Description(CT_FOOTER_12)
    public void validarNavegacaoPaginaDetalheDaCompra(){
        setUpLoginUsuarioComLogin();
        footerPage.clicarBtnMyOrders();
        footerPage.clicarBtnProductDetail();

    }

    @Test
    @Description(CT_FOOTER_13)
    public void validarFazerACompraNovamente(){
        setUpLoginUsuarioComLogin();
        footerPage.clicarBtnMyOrders();
        footerPage.clicarBtnRepedido();
        footerPage.verificaTituloFormularioEndereco();

    }

    @Test
    @Description(CT_FOOTER_14)
    public void validarLinkContatoEmail(){
        setUpLoginUsuarioSemLogin();
        footerPage.verificarEmailFooter();
    }


}
