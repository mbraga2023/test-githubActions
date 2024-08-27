package br.com.dbccompany.test;

import br.com.dbccompany.factory.selenium.BrowserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class LoginBaseTest extends BrowserService {

    @BeforeEach
    public void abrirNavegador(){
        initChromeDriver("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
    }

    @AfterEach
    public void fecharNavegador(){
        quit();
    }

}
