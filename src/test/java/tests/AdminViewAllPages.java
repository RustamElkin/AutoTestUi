package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import testconfigs.AppConfig;

import static com.codeborne.selenide.Selenide.open;

public class AdminViewAllPages extends AppConfig {

    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = new MainPage();
        open("/");
    }

    @Test
    // Заявки на подключение детей
    // https://college.dev-snation.kz/ru/tko/control/parent-link-statements

    public void parentLinkStatementsPageView() {
        mainPage.viewModal().clickSelectRegion();
//        mainPage.clickRegionSelectBtn().clickSelectRegion();

        LoginPage loginPage = mainPage.clickSignInBtn().headingText().clickLoginFormTab()
                .typeLoginInput("shym.coll.as.1").typePasswordInput("123456");
        SelectRolePage selectRolePage = loginPage.clickSubmitBtn();
        selectRolePage
                .clickSelectRoleList()
                .clickSelectAdmin()
                .clickSubmitBtn();
        SelectOrganizationPage selectOrganizationPage = new SelectOrganizationPage();
        selectOrganizationPage
                .shouldBeOrganizationTitle()
                .clickOrganizationDropDownList()
                .clickOrganizationName()
                .clickSubmitBtn();

        // тест signInAdmin может слетать, если в админке убрали доп Организации.
        ParentLinkStatementsPage parentLinkStatementsPage = mainPage
                .clickMenuBtn()
                .clickParentLinkStatementsMenu()
                .checkTitleToPage();
        mainPage = parentLinkStatementsPage.mainPageLink();

    }


    @Test
    // Профиль
    // https://college.dev-snation.kz/ru/tko/account/profile
    public void accountProfilePageView() {
        AccountProfilePage accountProfilePage = mainPage
                .clickMenuBtn()
                .clickProfileMenu()
                .checkTitleToPage();
        mainPage = accountProfilePage.mainPageLink();

    }

    @Test
    //
    // https:
    public void View() {
        AccountProfilePage accountProfilePage = mainPage
                .clickMenuBtn()
                .clickProfileMenu()
                .checkTitleToPage();
        mainPage = accountProfilePage.mainPageLink();

    }


}
