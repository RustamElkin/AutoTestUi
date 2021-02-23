package pages;// Редактировать профиль
//  /ru/tko/account/profile/edit

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class AccountProfileEditPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Профиль')]");
    private SelenideElement backBtn = $x("//*[@id=\"vue-container\"]/div[1]//div/a");
    private SelenideElement submitBtn = $x("//span[contains(text(),'Сохранить')]/..");
    private SelenideElement actualizeBtn = $x("//button[contains(text(),'Актуализировать')]");
    private SelenideElement fotoEditBtn = $x("//button[contains(text(),'Изменить фото')]");
    private SelenideElement titleInformationAboutYourself = $x("//span[contains(text(),'Общие сведения о себе')]");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public AccountProfileEditPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Профиль"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
