package pages;// Приемная комиссия_Поступившие
//  /ru/tko/control/distribution-contingent

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class DistributionContingentPage {

    // Тайтл
    private SelenideElement titleToPage            = $x("//h1[contains(text(),'Поступившие')]");

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn              = $x("//a[contains(text(),'Распределить по группам')]");             // 'Распределить по группам'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement fullNameTable          = $x("//th[contains(text(),'ФИО')]");                                // 'ФИО'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");                      // 'Язык обучения'
    private SelenideElement qualificationTable     = $x("//th[contains(text(),'Квалификация')]");                       // 'Квалификация'
    private SelenideElement mainPageLink           = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public DistributionContingentPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Поступившие"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
