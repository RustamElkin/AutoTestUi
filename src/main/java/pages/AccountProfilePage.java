package pages;// Профиль
//  /ru/tko/account/profile

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class AccountProfilePage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Профиль')]");
    private SelenideElement aboutMeTabItem = $x("//span[contains(text(),'Обо мне')]");
    private SelenideElement myFilesTabItem = $x("//span[contains(text(),'Мои файлы')]");
    private SelenideElement changePasswordBtn = $x("//a[contains(text(),'Сменить пароль')]");
    private SelenideElement editBtn = $x("//span[contains(text(),'Редактировать')]");
    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");

    public AccountProfilePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Профиль"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}