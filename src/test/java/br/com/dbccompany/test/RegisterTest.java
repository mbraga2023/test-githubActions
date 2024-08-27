package br.com.dbccompany.test;

import br.com.dbccompany.dto.RegisterDto;
import br.com.dbccompany.factory.data.RegisterData;
import br.com.dbccompany.factory.selenium.Validation;
import br.com.dbccompany.page.RegisterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static storys.RegisterStory.*;

@Epic(EPIC)
@Story(USER_STORY_REGISTER)
public class RegisterTest extends LoginBaseTest {

    RegisterPage registerPage = new RegisterPage();
    RegisterData registerData = new RegisterData();
    Validation validation = new Validation();

    @Test
    @Description(CT_REGISTER_001)
    public void test1validarRegistroDadosValidos() {

        RegisterDto usu = registerData.registroDadosValidos();
        registerPage.preencherCampoEmail(usu.getEmail());
        registerPage.clicarBtnCreateAccount();
        registerPage.preencherCampoTitle(usu.getTitle());
        registerPage.preencherCampoFirstName(usu.getFirstName());
        registerPage.preencherCampoLastName(usu.getLastName());
        registerPage.preencherCampoPassword(usu.getPassword());
        registerPage.preencherCampoDay(usu.getDayOfBirth());
        registerPage.preencherCampoMonth(usu.getMonthOfBirth());
        registerPage.preencherCampoYear(usu.getYearOfBirth());
        registerPage.clicarBtnRegister();

        String msgm = registerPage.validarTextoAposRegistro();
        validation.validateText(msgm, "Your account has been created.");

    }

    @Test
    @Description(CT_REGISTER_002)
    public void test2validarRegistroComEmailInvalido() {

        RegisterDto usu = registerData.registroEmailInvalido();
        registerPage.preencherCampoEmail(usu.getEmail());
        registerPage.clicarBtnCreateAccount();

        String msgm = registerPage.validarMsgmErro();
        validation.validateText(msgm, "Invalid email address.");

    }

    @Test
    @Description(CT_REGISTER_003)
    public void test3validarRegistroComSenhaInvalida() {

        RegisterDto usu = registerData.registroSenhaInvalida();
        registerPage.preencherCampoEmail(usu.getEmail());
        registerPage.clicarBtnCreateAccount();
        registerPage.preencherCampoTitle(usu.getTitle());
        registerPage.preencherCampoFirstName(usu.getFirstName());
        registerPage.preencherCampoLastName(usu.getLastName());
        registerPage.preencherCampoPassword(usu.getPassword());
        registerPage.preencherCampoDay(usu.getDayOfBirth());
        registerPage.preencherCampoMonth(usu.getMonthOfBirth());
        registerPage.preencherCampoYear(usu.getYearOfBirth());
        registerPage.clicarBtnRegister();

        String msgm = registerPage.validarMsgmErro();
        validation.validateText(msgm, "passwd is invalid.");

    }

    @Test
    @Description(CT_REGISTER_004)
    public void test4validarRegistroEmailExistente() {

        RegisterDto usu = registerData.registroEmailExistente();
        registerPage.preencherCampoEmail(usu.getEmail());
        registerPage.clicarBtnCreateAccount();

        String msgm = registerPage.validarMsgmErro();
        validation.validateText(msgm, "An account using this email address has already been registered. Please enter a valid password or request a new one.");

    }

}
