package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class NewsletterPage extends Interactions {

    private static final By campoEmail =
            By.cssSelector("#newsletter-input");
    private static final By btnAcessar =
            By.cssSelector("#newsletter_block_left > div > form > div > button");
    private static final By msgTextValidation =
            By.cssSelector("#columns > p");

    public void preencherCampoEmail(String email){sendKeys(campoEmail, email);}

    public void clicarBtnAcessar(){
        click(btnAcessar);
    }

    public String validarTextoDeRetorno(){return lerTexto(msgTextValidation);}
}
