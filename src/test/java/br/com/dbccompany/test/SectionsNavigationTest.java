package br.com.dbccompany.test;

import br.com.dbccompany.page.SectionsNavigationPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static storys.NavigationStory.*;

@Epic(EPIC_NAVIGATION)
@Story(USER_STORY_NAVIGATION)
public class SectionsNavigationTest extends BaseTest{

    private BaseTest baseTest;
    private SectionsNavigationPage navigationPage;

    public void setUpLoginUsuarioSemLogin() {
        baseTest = new BaseTest();
        baseTest.abrirNavegador();
        navigationPage = new SectionsNavigationPage();
    }

    @Test
    @Description(CT_NAVIGATION_001)
    public void test1validarNavegacaoSessaoWomen(){
        setUpLoginUsuarioSemLogin();
        navigationPage.clicarBtnWomanSection();

    }

    @Test
    @Description(CT_NAVIGATION_002)
    public void test2validarNavegacaoDressesSection(){
        setUpLoginUsuarioSemLogin();
        navigationPage.clicarBtnDressesSection();
    }
    @Test
    @Description(CT_NAVIGATION_003)
    public void test3validarNavegacaoTShirtSection(){
        setUpLoginUsuarioSemLogin();
        navigationPage.clicarBtnTShirtSection();
    }

    @Test
    @Description(CT_NAVIGATION_004)
    public void test4validarNavegacaoBlogSection(){
        setUpLoginUsuarioSemLogin();
        navigationPage.clicarBtnBlogSection();
    }

    @Test
    @Description(CT_NAVIGATION_005)
    public void test5validarNavegacaoPopularSection(){
        setUpLoginUsuarioSemLogin();
        navigationPage.clicarBtnPopularSection();
    }

    @Test
    @Description(CT_NAVIGATION_006)
    public void test6validarNavegacaoBestSellersSection(){
        setUpLoginUsuarioSemLogin();
        navigationPage.clicarBtnBestSellersSection();
    }
}
