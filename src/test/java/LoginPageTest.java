import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import testconfigs.AppConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest extends AppConfig {

    private SelenideElement modalRegionSelecting = $(By.xpath("//*[@id='modal-region-selecting']//a[text()='Туркестанская область']"));
    private SelenideElement signInBtn = $("div.s-main-header__right-panel >a[href='/ru/tko/login']");
    private SelenideElement entryTitle = $(By.xpath("//div[2][contains(text(),'Вход')]"));
    private SelenideElement loginFormTab = $(By.xpath("//div[@tabindex='0' and @role='tab']"));
    private SelenideElement loginInput = $(By.xpath("//input[@tabindex='0' and @aria-label='Логин или номер телефона']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@aria-label='Пароль' and @type='password']"));
    private SelenideElement submitBtn = $("button[type='submit']");
    private SelenideElement roleTitle = $(By.xpath("//div[2][contains(text(),'Роль')]"));
    private SelenideElement selectRoleDropDownList = $("div.multiselect__tags");
    private SelenideElement organizationTitle = $(By.xpath("//div[2][contains(text(),'Организация')]"));
    private SelenideElement selectOrganizationDropDownList = $(By.xpath("//*[@id='vue-container']//form//div/div[2]"));
    private SelenideElement selectOrganizationName = $(By.xpath("//*[@id='vue-container']//div[3]/ul/li[1]/span/span"));
    private SelenideElement titleToPage = $(By.xpath("//section[1]/div/div[1]"));
    private SelenideElement menuBtn = $(By.xpath("//div[contains(text(),'Меню')]"));
    private SelenideElement menuDropdownGetOutLink = $(By.xpath("//a/span[text() ='Выйти']"));
    private SelenideElement selectRUEmployee = $(By.xpath("//div//span[text()='Сотрудник РУ']"));
    private SelenideElement selectMonRKEmployee = $(By.xpath("//div//span[text()='МОН РК']"));
    private SelenideElement selectOUEmployee = $(By.xpath("//div//span[text()='Сотрудник ОУ']"));
    private SelenideElement selectDirectorEmployee = $(By.xpath("//div//span[text()='Директор']"));
    private SelenideElement selectAdminEmployee = $(By.xpath("//div//span[text()='Сотрудник колледжа (админ)']"));



    @Test
    public void UsersCanOpenMainPage() {

        /////////////////////////////////////////////////Сотрудник РУ///////////////////////////////////////////////////
        open("/");


        modalRegionSelecting.click();
        signInBtn.click();

        entryTitle.shouldBe(visible);
        loginFormTab.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue("shym.coll.as.1");
        passwordInput.setValue("123456");
        submitBtn.click();
        roleTitle.shouldBe(visible);
        selectRoleDropDownList.click();
        selectRUEmployee.click();
        submitBtn.click();

        titleToPage.shouldHave(text("Единый портал государственных услуг"));

        menuBtn.click();
        menuDropdownGetOutLink.shouldBe(visible).click();


        ////////////////////////////////////////////////МОН РК//////////////////////////////////////////////////////////
        open("/tko");

        signInBtn.click();

        entryTitle.shouldBe(visible);
        loginFormTab.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue("shym.coll.as.1");
        passwordInput.setValue("123456");
        submitBtn.click();

        roleTitle.shouldBe(visible);
        selectRoleDropDownList.click();
        selectMonRKEmployee.shouldBe(visible).click();
        submitBtn.click();

        titleToPage.shouldHave(text("Единый портал государственных услуг"));

        menuBtn.click();
        menuDropdownGetOutLink.shouldBe(visible).click();


        ///////////////////////////////////////////////Сотрудник ОУ/////////////////////////////////////////////////////
        open("/tko");

        signInBtn.click();
        entryTitle.shouldBe(visible);
        loginFormTab.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue("shym.coll.as.1");
        passwordInput.setValue("123456");
        submitBtn.click();

        roleTitle.shouldBe(visible);
        selectRoleDropDownList.click();
        selectOUEmployee.shouldBe(visible).click();
        submitBtn.click();

        titleToPage.shouldHave(text("Единый портал государственных услуг"));

        menuBtn.click();
        menuDropdownGetOutLink.shouldBe(visible).click();


        ///////////////////////////////////////////////Директор/////////////////////////////////////////////////////////
        open("/tko");

        signInBtn.click();
        entryTitle.shouldBe(visible);
        loginFormTab.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue("shym.coll.as.1");
        passwordInput.setValue("123456");
        submitBtn.click();

        roleTitle.shouldBe(visible);
        selectRoleDropDownList.click();
        selectDirectorEmployee.shouldBe(visible).click();
        submitBtn.click();

        titleToPage.shouldHave(text("Единый портал государственных услуг"));

        menuBtn.click();
        menuDropdownGetOutLink.shouldBe(visible).click();


        //////////////////////////////////////Сотрудник колледжа (админ)////////////////////////////////////////////////
        open("/tko");

        signInBtn.click();
        entryTitle.shouldBe(visible);
        loginFormTab.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue("shym.coll.as.1");
        passwordInput.setValue("123456");
        submitBtn.click();

        roleTitle.shouldBe(visible);
        selectRoleDropDownList.click();
        selectAdminEmployee.shouldBe(visible).click();
        submitBtn.click();

        organizationTitle.shouldBe(visible);
        selectOrganizationDropDownList.shouldBe(visible).click();
        selectOrganizationName.shouldBe(visible).click();
        submitBtn.click();


        titleToPage.shouldHave(text("Единый портал государственных услуг"));

        menuBtn.click();
        menuDropdownGetOutLink.shouldBe(visible).click();


        ///////////////////////////////////////////////Студент//////////////////////////////////////////////////////////
        open("/tko");

        signInBtn.click();
        entryTitle.shouldBe(visible);
        loginFormTab.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue("040812500554");
        passwordInput.setValue("123456");
        submitBtn.click();

        titleToPage.shouldHave(text("Единый портал государственных услуг"));

        menuBtn.click();
        menuDropdownGetOutLink.shouldBe(visible).click();

    }

}
