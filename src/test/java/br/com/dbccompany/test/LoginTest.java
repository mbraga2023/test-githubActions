package br.com.dbccompany.test;

import br.com.dbccompany.dto.LoginDto;
import br.com.dbccompany.factory.data.LoginData;
import br.com.dbccompany.factory.selenium.Validation;
import br.com.dbccompany.page.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static storys.LoginStory.*;

@Epic(EPIC)
@Story(USER_STORY_LOGIN)
public class LoginTest extends LoginBaseTest {

    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();
    Validation validation = new Validation();

    @Test
    @Description(CT_LOGIN_001)
    public void test1validarLoginDadosValidos() {

        LoginDto usu = loginData.loginDadosValidos();
        loginPage.preencherCampoEmail(usu.getEmail());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();

        String msgm = loginPage.validarTextoBtnAposLogin();
        validation.validateText(msgm, "Sign out");

    }

    @Test
    @Description(CT_LOGIN_002)
    public void test2validarLoginComEmailInvalido() {

        LoginDto usu = loginData.loginEmailInvalido();
        loginPage.preencherCampoEmail(usu.getEmail());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();

        String msgm = loginPage.validarMsgmErro();
        validation.validateText(msgm, "Invalid email address.");

    }

    @Test
    @Description(CT_LOGIN_003)
    public void test3validarLoginComSenhaInvalida() {

        LoginDto usu = loginData.loginSenhaInvalida();
        loginPage.preencherCampoEmail(usu.getEmail());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();

        String msgm = loginPage.validarMsgmErro();
        validation.validateText(msgm, "Invalid password.");

    }

    @Test
    @Description(CT_LOGIN_004)
    public void test4validarLoginComDadosNaoCadastrados() {

        LoginDto usu = loginData.loginDadosDinamicos();
        loginPage.preencherCampoEmail(usu.getEmail());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();

        String msgm = loginPage.validarMsgmErro();
        validation.validateText(msgm, "Authentication failed.");

    }

}
