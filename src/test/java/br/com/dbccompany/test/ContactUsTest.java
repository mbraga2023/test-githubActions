package br.com.dbccompany.test;

import br.com.dbccompany.dto.ContactUsDto;
import br.com.dbccompany.factory.data.ContactUsData;
import br.com.dbccompany.factory.selenium.Validation;
import br.com.dbccompany.page.ContactUsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import static storys.ContactUsStory.*;

@Epic(EPIC)
@Story(USER_STORY_CONTACTUS)
public class ContactUsTest extends LoginBaseTest{

    ContactUsPage contactUsPage = new ContactUsPage();
    ContactUsData contactUsData = new ContactUsData();
    Validation validation = new Validation();

    @Test
    @Description(CT_CONTACTUS_001)
    public void test1validarContactUsDadosValidos() {
        ContactUsDto usu = contactUsData.ContactUsDadosValidos();

        contactUsPage.clicarBtnContactUs();

        String validator = contactUsPage.validarTextoBtnAposContactUs();
        validation.validateText(validator, "CUSTOMER SERVICE - CONTACT US");

        contactUsPage.clicarDropboxSize();
        contactUsPage.preencherCampoEmail(usu.getEmailAddress());
        contactUsPage.preencherOrderReference(usu.getOrderReference());

        contactUsPage.clicarBtnArquivo();

        contactUsPage.enviarArquivo(usu.getFile());
        contactUsPage.preencherMensagem(usu.getMessage());

        contactUsPage.ClicarBtnEnvio();

        String txtReturn = contactUsPage.validarTextoBtnAposEnvioDeDados();
        validation.validateText(txtReturn, "Your message has been successfully sent to our team.");
    }

    @Test
    @Description(CT_CONTACTUS_002)
    public void test2validarContactUsComEmailInvalidos() { //BUG
        ContactUsDto usu = contactUsData.ContactUsComEmailInvalido();

        contactUsPage.clicarBtnContactUs();

        String validator = contactUsPage.validarTextoBtnAposContactUs();
        validation.validateText(validator, "CUSTOMER SERVICE - CONTACT US");

        contactUsPage.clicarDropboxSize();
        contactUsPage.preencherCampoEmail(usu.getEmailAddress());
        contactUsPage.preencherOrderReference(usu.getOrderReference());

        contactUsPage.clicarBtnArquivo();

        contactUsPage.enviarArquivo(usu.getFile());
        contactUsPage.preencherMensagem(usu.getMessage());

        contactUsPage.ClicarBtnEnvio();

        String txtReturn = contactUsPage.validarTextoBtnAposEnvioDeDadosInvalidos();
        validation.validateText(txtReturn, "Invalid email address.");
    }

    @Test
    @Description(CT_CONTACTUS_003)
    public void test3validarContactUsComMensagemVazia() {
        ContactUsDto usu = contactUsData.ContactUsComMensagemVazia();

        contactUsPage.clicarBtnContactUs();

        String validator = contactUsPage.validarTextoBtnAposContactUs();
        validation.validateText(validator, "CUSTOMER SERVICE - CONTACT US");

        contactUsPage.clicarDropboxSize();
        contactUsPage.preencherCampoEmail(usu.getEmailAddress());
        contactUsPage.preencherOrderReference(usu.getOrderReference());

        contactUsPage.clicarBtnArquivo();

        contactUsPage.enviarArquivo(usu.getFile());
        contactUsPage.preencherMensagem(usu.getMessage());

        contactUsPage.ClicarBtnEnvio();

        String txtReturn = contactUsPage.validarTextoBtnAposEnvioDeDadosInvalidos();
        validation.validateText(txtReturn, "The message cannot be blank.");
    }

    @Test
    @Description(CT_CONTACTUS_004)
    public void test4validarContactUsComOrderReferenceVazio() {
        ContactUsDto usu = contactUsData.ContactUsComOrderReferenceVazio();

        contactUsPage.clicarBtnContactUs();

        String validator = contactUsPage.validarTextoBtnAposContactUs();
        validation.validateText(validator, "CUSTOMER SERVICE - CONTACT US");

        contactUsPage.clicarDropboxSize();
        contactUsPage.preencherCampoEmail(usu.getEmailAddress());
        contactUsPage.preencherOrderReference(usu.getOrderReference());

        contactUsPage.clicarBtnArquivo();

        contactUsPage.enviarArquivo(usu.getFile());
        contactUsPage.preencherMensagem(usu.getMessage());

        contactUsPage.ClicarBtnEnvio();

        String txtReturn = contactUsPage.validarTextoBtnAposEnvioDeDados();
        validation.validateText(txtReturn, "Your message has been successfully sent to our team.");
    }

    @Test
    @Description(CT_CONTACTUS_005)
    public void test5validarContactUsSemArquivoAnexado() {
        ContactUsDto usu = contactUsData.ContactUsSemArquivoAnexado();

        contactUsPage.clicarBtnContactUs();

        String validator = contactUsPage.validarTextoBtnAposContactUs();
        validation.validateText(validator, "CUSTOMER SERVICE - CONTACT US");

        contactUsPage.clicarDropboxSize();
        contactUsPage.preencherCampoEmail(usu.getEmailAddress());
        contactUsPage.preencherOrderReference(usu.getOrderReference());

        contactUsPage.clicarBtnArquivo();

        contactUsPage.preencherMensagem(usu.getMessage());

        contactUsPage.ClicarBtnEnvio();

        String txtReturn = contactUsPage.validarTextoBtnAposEnvioDeDados();
        validation.validateText(txtReturn, "Your message has been successfully sent to our team.");
    }
}
