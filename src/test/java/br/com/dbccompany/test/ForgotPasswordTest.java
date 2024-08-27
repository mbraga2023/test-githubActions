package br.com.dbccompany.test;

import br.com.dbccompany.dto.ForgotPasswordDto;
import br.com.dbccompany.factory.data.ForgotPasswordData;
import br.com.dbccompany.factory.selenium.Validation;
import br.com.dbccompany.page.ForgotPasswordPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static storys.ForgotPasswordStory.*;


@Epic(EPIC)
@Story(USER_STORY_FORGOTPASSWORD)
public class ForgotPasswordTest extends LoginBaseTest{

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    ForgotPasswordData forgotPasswordData = new ForgotPasswordData();
    Validation validation = new Validation();

    @Test
    @Description(CT_FORGOTPASSWORD_001)
    public void test1ValidarEnvioSenhaNovaComEmailValido(){
        ForgotPasswordDto usu = forgotPasswordData.forgotPasswordEmailValido();

        forgotPasswordPage.clicarBotaoEntrar();
        String txtPaginaLogin = forgotPasswordPage.validarPaginaDeLogin();
        validation.validateText(txtPaginaLogin, "AUTHENTICATION");

        forgotPasswordPage.clicarBotaoForgotPassword();

        String txtPaginaForgotPassword = forgotPasswordPage.validarPaginaDeForgotPassword();
        validation.validateText(txtPaginaForgotPassword, "FORGOT YOUR PASSWORD?");
        forgotPasswordPage.preencherCampoEmail(usu.getEmailAdress());
        forgotPasswordPage.clicarBotaoRetrievePassword();

        String txtEmailEnviado = forgotPasswordPage.validarTextoEmailEnviadoComNovaSenha();
        validation.validateText(txtEmailEnviado,"A confirmation email has been sent to your address: " + usu.getEmailAdress());
    }

    @Test
    @Description(CT_FORGOTPASSWORD_002)
    public void test2ValidarTentativaDeEnvioSenhaNovaComEmailInvalido(){
        ForgotPasswordDto usu = forgotPasswordData.forgotPasswordEmailInvalido();

        forgotPasswordPage.clicarBotaoEntrar();
        String txtPaginaLogin = forgotPasswordPage.validarPaginaDeLogin();
        validation.validateText(txtPaginaLogin, "AUTHENTICATION");

        forgotPasswordPage.clicarBotaoForgotPassword();

        String txtPaginaForgotPassword = forgotPasswordPage.validarPaginaDeForgotPassword();
        validation.validateText(txtPaginaForgotPassword, "FORGOT YOUR PASSWORD?");
        forgotPasswordPage.preencherCampoEmail(usu.getEmailAdress());
        forgotPasswordPage.clicarBotaoRetrievePassword();

        String txtEmailEnviado = forgotPasswordPage.validarTextoTentativaEmailEnviadoComNovaSenha();
        validation.validateText(txtEmailEnviado,"There is no account registered for this email address.");
    }

    @Test
    @Description(CT_FORGOTPASSWORD_003)
    public void test2ValidarTentativaDeEnvioSenhaNovaComEmailNãoCadastrado(){
        ForgotPasswordDto usu = forgotPasswordData.forgotPasswordEmailNaoCadastrado();

        forgotPasswordPage.clicarBotaoEntrar();
        String txtPaginaLogin = forgotPasswordPage.validarPaginaDeLogin();
        validation.validateText(txtPaginaLogin, "AUTHENTICATION");

        forgotPasswordPage.clicarBotaoForgotPassword();

        String txtPaginaForgotPassword = forgotPasswordPage.validarPaginaDeForgotPassword();
        validation.validateText(txtPaginaForgotPassword, "FORGOT YOUR PASSWORD?");
        forgotPasswordPage.preencherCampoEmail(usu.getEmailAdress());
        forgotPasswordPage.clicarBotaoRetrievePassword();

        String txtEmailEnviado = forgotPasswordPage.validarTextoTentativaEmailEnviadoComNovaSenha();
        validation.validateText(txtEmailEnviado,"There is no account registered for this email address.");
    }

    @Test
    @Description(CT_FORGOTPASSWORD_004)
    public void test2ValidarTentativaDeEnvioSenhaNovaComEmailEmBranco(){
        ForgotPasswordDto usu = forgotPasswordData.forgotPasswordEmailEmBranco();

        forgotPasswordPage.clicarBotaoEntrar();
        String txtPaginaLogin = forgotPasswordPage.validarPaginaDeLogin();
        validation.validateText(txtPaginaLogin, "AUTHENTICATION");

        forgotPasswordPage.clicarBotaoForgotPassword();

        String txtPaginaForgotPassword = forgotPasswordPage.validarPaginaDeForgotPassword();
        validation.validateText(txtPaginaForgotPassword, "FORGOT YOUR PASSWORD?");
        forgotPasswordPage.preencherCampoEmail(usu.getEmailAdress());
        forgotPasswordPage.clicarBotaoRetrievePassword();

        String txtEmailEnviado = forgotPasswordPage.validarTextoTentativaEmailEnviadoComNovaSenha();
        validation.validateText(txtEmailEnviado,"Invalid email address.");
    }


}
