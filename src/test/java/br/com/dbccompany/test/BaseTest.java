package br.com.dbccompany.test;

import br.com.dbccompany.dto.LoginDto;
import br.com.dbccompany.factory.data.LoginData;
import br.com.dbccompany.factory.selenium.BrowserService;
import br.com.dbccompany.page.CartPage;
import br.com.dbccompany.page.LoginPage;
import org.junit.jupiter.api.AfterEach;

public class BaseTest extends BrowserService {
    private LoginBaseTest loginBaseTest;
    private CartPage cartPage;
    private LoginPage loginPage;
    private LoginData loginData;
    private BaseTest baseTest;

    public void abrirNavegador(){
        initChromeDriver("http://www.automationpractice.pl/index.php");
    }

    public void setUpLogin() {
        loginData = new LoginData();

        loginBaseTest = new LoginBaseTest();
        loginBaseTest.abrirNavegador();
        LoginDto validUser = loginData.loginDadosValidos();
        loginPage.fazerLogin(validUser.getEmail(), validUser.getSenha());
    }

    public void setUpLoginUsuarioComEndereco() {

        cartPage = new CartPage();
        loginPage = new LoginPage();
        loginData = new LoginData();

        loginBaseTest = new LoginBaseTest();
        loginBaseTest.abrirNavegador();
        LoginDto validUser = loginData.loginUsuarioComEndereco();
        loginPage.fazerLogin(validUser.getEmail(), validUser.getSenha());
    }

    @AfterEach
    public void fecharNavegador(){
        quit();
    }

}
