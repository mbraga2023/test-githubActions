package br.com.dbccompany.page;

import br.com.dbccompany.factory.selenium.Interactions;
import org.openqa.selenium.By;

import java.io.File;

public class ContactUsPage extends Interactions {

    private static final By contactUsBtn =
            By.cssSelector("#contact-link > a");

    private static final By customerServiceTxtValidator =
            By.cssSelector("#center_column > h1");

    private static final By subjectHeadingSelect =
            By.cssSelector("#id_contact");

    private static final By emailAddress =
            By.cssSelector("[id=\"email\"]");

    private static final By campoOrderReference =
            By.cssSelector("[id=\"id_order\"]");

    private static final By chooseFile =
            By.cssSelector("#uniform-fileUpload");

    private static final By message =
            By.cssSelector("#message");

    private static final By sendBtn =
            By.cssSelector("#submitMessage > span");

    private static final By txtContactUsSucess =
            By.cssSelector("#center_column > p");

    private static final By txtContactUsNoSucess =
            By.cssSelector("#center_column > div > ol > li");

    public void clicarBtnContactUs(){
        click(contactUsBtn);
    }

    public String validarTextoBtnAposContactUs(){
        return lerTexto(customerServiceTxtValidator);
    }

    public void clicarDropboxSize() {
        selectDropdownOption(subjectHeadingSelect, "Customer service");
    }

    public void preencherCampoEmail(String email) {
        sendKeys(emailAddress, email);
    }

    public void preencherOrderReference(String orderReference){
        sendKeys(campoOrderReference, orderReference);
    }

    public void clicarBtnArquivo(){
        click(chooseFile);
    }

    public void enviarArquivo(File arquivo) {
        By chooseFile = By.id("fileUpload");
        Interactions.uploadFile(chooseFile, arquivo.getAbsolutePath());
    }

    public void preencherMensagem(String mensagem){
        sendKeys(message, mensagem);
    }

    public void ClicarBtnEnvio(){
        click(sendBtn);
    }

    public String validarTextoBtnAposEnvioDeDados(){
        return lerTexto(txtContactUsSucess);
    }

    public String validarTextoBtnAposEnvioDeDadosInvalidos(){
        return lerTexto(txtContactUsNoSucess);
    }
}
