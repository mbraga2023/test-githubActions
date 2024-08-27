package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class LoginPage extends Interactions {

    private static final By btnLogout =
            By.cssSelector("a[class='logout']");
    private static final By textAuthentication =
            By.cssSelector("h1");
    private static final By campoEmail =
            By.cssSelector("input#email");
    private static final By campoSenha =
            By.cssSelector("input#passwd");
    private static final By btnAcessar =
            By.cssSelector("button#SubmitLogin");
    private static final By textMsgmBtn =
            By.cssSelector("a[class='logout']");
    private static final By msgmErro =
            By.cssSelector("ol li");

    public void preencherCampoEmail(String email) {
        sendKeys(campoEmail, email);
    }

    public void preencherCampoSenha(String senha) {
        sendKeys(campoSenha, senha);
    }

    public void clicarBtnAcessar() {
        click(btnAcessar);
    }

    public void clicarBtnLogout() {
        click(btnLogout);
    }

    public String validarTextoAntesLogin() {
        return lerTexto(textAuthentication);
    }

    public String validarTextoBtnAposLogin() {
        return lerTexto(textMsgmBtn);
    }

    public String validarMsgmErro() {
        return lerTexto(msgmErro);
    }

    public String fazerLogin(String email, String senha) {
        sendKeys(campoEmail, email);
        sendKeys(campoSenha, senha);
        click(btnAcessar);
        return lerTexto(textMsgmBtn);
    }

}
