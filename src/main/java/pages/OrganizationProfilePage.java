package pages;// Профиль колледжа
//  /ru/tko/organization-profile

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class OrganizationProfilePage {

    // Тайтл
    private SelenideElement titleToPage                 = $x("//h1[contains(text(),'Профиль колледжа')]");

    // Табы на странице
    private SelenideElement organizationTab             = $x("//span[contains(text(),'Организация')]/..");                        // 'Организация'
    private SelenideElement registrationInformationTab  = $x("//span[contains(text(),'Регистрационные сведения')]/..");           // 'Регистрационные сведения'
    private SelenideElement materialAndTechnicalBaseTab = $x("//span[contains(text(),'МТБ')]/..");                                // 'МТБ'

    // Кнопка "Редактировать"
    private SelenideElement editBtn                     = $x("//div[contains(text(),'Редактировать')]/..");

    // Можно чекнуть наличие titl-ов "Описание и Адрес"
     private SelenideElement descriptionTitle           = $x("//span[contains(text(),'Описание')]");
     private SelenideElement addressTitle               = $x("//span[contains(text(),'Адрес')]");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");


    public OrganizationProfilePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Профиль колледжа"));
        return this;
    }
    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
