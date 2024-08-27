package br.com.dbccompany.test;

import br.com.dbccompany.dto.NewsletterDto;
import br.com.dbccompany.factory.data.NewsletterData;
import br.com.dbccompany.factory.selenium.Validation;
import br.com.dbccompany.page.NewsletterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import static storys.NewsletterStory.*;


@Epic(EPIC)
@Story(USER_STORY_NEWSLETTER)
public class NewsletterTest extends LoginBaseTest {

    NewsletterPage newsletterPage = new NewsletterPage();
    NewsletterData newsletterData = new NewsletterData();
    Validation validation = new Validation();

    @Test
    @Description(CT_NEWSLETTER_001)
    public void test1ValidarEnvioNewsletterComEmailValido(){
        NewsletterDto usu = newsletterData.newsletterEmailValido();

        newsletterPage.preencherCampoEmail(usu.getEmail());
        newsletterPage.clicarBtnAcessar();

        String msg = newsletterPage.validarTextoDeRetorno();
        validation.validateText(msg,"Newsletter : You have successfully subscribed to this newsletter.");
    }

    @Test
    @Description(CT_NEWSLETTER_002)
    public void test2ValidarEnvioNewsletterComEmailInvalido(){
        NewsletterDto usu = newsletterData.newsletterEmailInvalido();

        newsletterPage.preencherCampoEmail(usu.getEmail());
        newsletterPage.clicarBtnAcessar();

        String msg = newsletterPage.validarTextoDeRetorno();
        validation.validateText(msg,"Newsletter : Invalid email address.");
    }

    @Test
    @Description(CT_NEWSLETTER_003)
    public void test3ValidarEnvioNewsletterComEmailEmBranco(){
        NewsletterDto usu = newsletterData.newsletterEmailEmBranco();

        newsletterPage.preencherCampoEmail(usu.getEmail());
        newsletterPage.clicarBtnAcessar();

        String msg = newsletterPage.validarTextoDeRetorno();
        validation.validateText(msg,"Newsletter : Invalid email address.");
    }

    @Test
    @Description(CT_NEWSLETTER_004)
    public void test2ValidarEnvioNewsletterComEmailJaCadastrado(){
        NewsletterDto usu = newsletterData.newsletterEmailJaCadastrado();

        newsletterPage.preencherCampoEmail(usu.getEmail());
        newsletterPage.clicarBtnAcessar();

        String msg = newsletterPage.validarTextoDeRetorno();
        validation.validateText(msg,"Newsletter : This email address is already registered.");
    }

}
