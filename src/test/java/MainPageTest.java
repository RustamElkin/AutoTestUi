import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testconfigs.AppConfig;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest extends AppConfig {

    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = new MainPage();
        open("/");
    }

//    @After
//    public void tearDown() {
//
//    }

    @Test
    public void signInRUEmployee() {

        mainPage.clickRegionSelectBtn().clickSelectRegion();

        LoginPage loginPage = mainPage.clickSignInBtn().headingText().clickLoginFormTab()
                .typeLoginInput("shym.coll.as.1").typePasswordInput("123456");
        SelectRolePage selectRolePage = loginPage.clickSubmitBtn();
        selectRolePage
                .clickSelectRoleList()
                .clickSelectRUEmployee()
                .clickSubmitBtn();
        mainPage.checkTitleToPage().clickMenuBtn().clickMenuExit();

    }

    @Test
    public void signInMonRKEmployee() {
        mainPage.clickRegionSelectBtn().clickSelectRegion();
        LoginPage loginPage = mainPage.clickSignInBtn().headingText().clickLoginFormTab()
                .typeLoginInput("shym.coll.as.1").typePasswordInput("123456");
        SelectRolePage selectRolePage = loginPage.clickSubmitBtn();
        selectRolePage
                .clickSelectRoleList()
                .clickSelectMonRKEmployee()
                .clickSubmitBtn();
        mainPage.checkTitleToPage().clickMenuBtn().clickMenuExit();
    }

    @Test
    public void signInOUEmployee() {
        mainPage.clickSelectRegion();
        LoginPage loginPage = mainPage.clickSignInBtn().headingText().clickLoginFormTab()
                .typeLoginInput("shym.coll.as.1").typePasswordInput("123456");
        SelectRolePage selectRolePage = loginPage.clickSubmitBtn();
        selectRolePage
                .clickSelectRoleList()
                .clickSelectOUEmployee()
                .clickSubmitBtn();
        mainPage.checkTitleToPage().clickMenuBtn().clickMenuExit();
    }

    @Test
    public void signInDirectorEmployee() {
        mainPage.clickRegionSelectBtn().clickSelectRegion();
        LoginPage loginPage = mainPage.clickSignInBtn().headingText().clickLoginFormTab()
                .typeLoginInput("shym.coll.as.1").typePasswordInput("123456");
        SelectRolePage selectRolePage = loginPage.clickSubmitBtn();
        selectRolePage
                .clickSelectRoleList()
                .clickSelectDirectorEmployee()
                .clickSubmitBtn();
        mainPage.checkTitleToPage().clickMenuBtn().clickMenuExit();
    }

    @Test
    public void signInStudent() {
        mainPage.clickRegionSelectBtn().clickSelectRegion();
        LoginPage loginPage = mainPage.clickSignInBtn().headingText().clickLoginFormTab()
                .typeLoginInput("040812500554").typePasswordInput("123456");
        loginPage.clickSubmitBtn();
        mainPage.checkTitleToPage().clickMenuBtn().clickMenuExit();
    }

    @Test
    public void signInAdmin() {
        mainPage.clickRegionSelectBtn().clickSelectRegion();
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
        mainPage.checkTitleToPage().clickMenuBtn().clickMenuExit();

        // тест signInAdmin может слетать, если в админке убрали доп Организации.
    }

}
