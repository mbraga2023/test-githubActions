package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Interactions {

    private static final By signInBtn =
            By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
    private static final By authValidationPage =
            By.cssSelector("#center_column > h1");
    private static final By forgotPasswordBtn =
            By.cssSelector("#login_form > div > p.lost_password.form-group > a");
    private static final By forgotYourPasswordValidationPage =
            By.cssSelector("#center_column > div > h1");
    private static final By campoEmail =
            By.cssSelector("#email");
    private static final By retrievePasswordBtn =
            By.cssSelector("#form_forgotpassword > fieldset > p > button");
    private static final By sendEmailWithNewPasswordTxt =
            By.cssSelector("#center_column > div > p");
    private static final By trySendEmailWithNewPasswordTxt =
            By.cssSelector("#center_column > div > div > ol > li");

    public void clicarBotaoEntrar(){
        click(signInBtn);
    }

    public String validarPaginaDeLogin(){
        return lerTexto(authValidationPage);
    }

    public void clicarBotaoForgotPassword(){
        click(forgotPasswordBtn);
    }

    public String validarPaginaDeForgotPassword(){
        return lerTexto(forgotYourPasswordValidationPage);
    }

    public void preencherCampoEmail(String email){
        sendKeys(campoEmail, email);
    }

    public void clicarBotaoRetrievePassword(){
        click(retrievePasswordBtn);
    }

    public String validarTextoEmailEnviadoComNovaSenha(){
        return lerTexto(sendEmailWithNewPasswordTxt);
    }

    public String validarTextoTentativaEmailEnviadoComNovaSenha(){
        return lerTexto(trySendEmailWithNewPasswordTxt);
    }
}
