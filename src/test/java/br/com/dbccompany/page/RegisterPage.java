package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class RegisterPage extends Interactions {

    private static final By campoEmail =
            By.cssSelector("input#email_create");

    private static final By btnCreateAccount =
            By.cssSelector("button#SubmitCreate");

    private static final By campoTitleMr =
            By.cssSelector("input#id_gender1");

    private static final By campoTitleMrs =
            By.cssSelector("input#id_gender2");

    private static final By campoFirstName =
            By.cssSelector("input#customer_firstname");

    private static final By campoLastName =
            By.cssSelector("input#customer_lastname");

    private static final By campoPassword =
            By.cssSelector("input[data-validate='isPasswd']");

    private static final By campoDay =
            By.cssSelector("select#days");

    private static final By campoMonth =
            By.cssSelector("select#months");

    private static final By campoYear =
            By.cssSelector("select#years");

    private static final By btnRegister =
            By.cssSelector("button#submitAccount");

    private static final By msgmErro =
            By.cssSelector("ol li");

    private static final By msgAposRegistro =
            By.cssSelector("p[class^='alert']");

    public void preencherCampoEmail(String email) {
        sendKeys(campoEmail, email);
    }

    public void preencherCampoTitle(String title) {
        click(campoTitleMr);
    }

    public void preencherCampoFirstName(String name) {
        sendKeys(campoFirstName, name);
    }

    public void preencherCampoLastName(String name) {
        sendKeys(campoLastName, name);
    }

    public void preencherCampoPassword(String senha) {
        sendKeys(campoPassword, senha);
    }

    public void preencherCampoDay(String day) {
        selectDropdownOption(campoDay, day);
    }

    public void preencherCampoMonth(String month) {
        selectDropdownOption(campoMonth, month);
    }

    public void preencherCampoYear(String year) {
        selectDropdownOption(campoYear, year);
    }

    public void clicarBtnCreateAccount() {
        click(btnCreateAccount);
    }

    public void clicarBtnRegister() {
        click(btnRegister);
    }

    public String validarTextoAposRegistro() {
        return lerTexto(msgAposRegistro);
    }

    public String validarMsgmErro(){
        return lerTexto(msgmErro);
    }

}
