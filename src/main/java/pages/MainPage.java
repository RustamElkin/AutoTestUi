package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

//Главная страница
//     /ru/tko
public class MainPage {

    private SelenideElement titleToPage = $x("//div[@class='s-jumbotron__title mb-30']");
    private SelenideElement regionSelectBtn = $x("//div[@class='s-main-header__right-panel']/div[@data-toggle='modal']");
    private SelenideElement modalRegionSelecting = $x("//div[@class='s-modal__container']//a[text()='Туркестанская область' or href='/ru/tko?region=15']");
    private SelenideElement signInBtn = $x("//div[@class='s-main-header__right-panel']//a[text() = 'Вход' and @href='/ru/tko/login']");
    private SelenideElement viewModal = $x("//div[@class='s-modal__container']//div[@class='s-modal__title' and text() = 'Выберите ваш регион']");

    // Меню
    private SelenideElement menuBtn = $x("//div[contains(text(),'Меню')]");
    private SelenideElement exitBtnMenu = $x("//span[text() ='Выйти']/..");
    private SelenideElement profileMenu = $x("//span[text() = 'Профиль']/..");
    private SelenideElement parentLinkStatementsMenu = $x("//span[text() = 'Заявки на подключение детей']/..");
    private SelenideElement myCollegeMenu = $x("//span[text() = 'Мой колледж']/ancestor::div[contains(@class,'s-dropdown__link--multi')]");
    private SelenideElement organizationProfile = $x("//a[@href='/ru/tko/organization-profile' and @class ='s-dropdown__link ']");
    private SelenideElement monitoringMenu = $x("//span[text() = 'Мониторинг']/..");





    public MainPage clickMenuBtn() {
        menuBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPage viewMyCollegeDropdownMenu() {
        actions().moveToElement(myCollegeMenu).moveToElement(organizationProfile).click();
        return this;
    }

    public AccountProfilePage clickProfileMenu() {
        profileMenu.shouldBe(Condition.visible).click();
        return new AccountProfilePage();
    }

    public ParentLinkStatementsPage clickParentLinkStatementsMenu() {
        parentLinkStatementsMenu.shouldBe(Condition.visible).click();
        return new ParentLinkStatementsPage();
    }

    public MainPage clickMenuExit() {
        exitBtnMenu.shouldBe(visible).click();
        return this;
    }
    public MainPage viewModal() {
        viewModal.shouldBe(visible);
        return this;
    }

    public MainPage clickRegionSelectBtn() {
        regionSelectBtn.shouldBe(visible).click();
        return this;
    }


    public MainPage clickSelectRegion() {
        modalRegionSelecting.shouldBe(Condition.visible).click();
        return this;
    }

    public LoginPage clickSignInBtn() {
        signInBtn.click();
        return new LoginPage();
    }

    public MainPage checkTitleToPage() {
        titleToPage.shouldHave(text("Единый портал государственных услуг"));
        return this;
    }

}
