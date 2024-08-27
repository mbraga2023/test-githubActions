package br.com.dbccompany.test;

import br.com.dbccompany.factory.selenium.Validation;
import br.com.dbccompany.page.LoginPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static storys.LogoutStory.CT_LOGOUT_001;

public class LogoutTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    Validation validation = new Validation();


    @BeforeEach
    public void setUp() {
        setUpLoginUsuarioComEndereco();
    }

    @Test
    @Description(CT_LOGOUT_001)
    public void test1validarLogoutComSucesso() {

        loginPage.clicarBtnLogout();

        String msgm = loginPage.validarTextoAntesLogin();
        validation.validateText(msgm, "AUTHENTICATION");

    }
}
