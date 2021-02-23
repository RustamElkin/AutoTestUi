package pages;// Сведения о сотруднике
//  /ru/tko/control/personnel/2181

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class PersonnelIntelligencePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Сведения о сотруднике')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                      // 'Назад'

    // Кнопка "Редактировать"
    private SelenideElement editBtn = $x("//span[contains(text(),'Редактировать')]/.. ");                               // 'Редактировать'

    // Можно чекнуть наличие title-ов "Описание и Адрес"
    private SelenideElement personalInformationTitle = $x("//span[contains(text(),'Личная информация')]");              // 'Личная информация'
    private SelenideElement commonInformationTitle = $x("//span[contains(text(),'Общая информация')]");                 // 'Общая информация'
    private SelenideElement additionalInformationTitle = $x("//span[contains(text(),'Дополнительная информация')]");    // 'Дополнительная информация'

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");

    public PersonnelIntelligencePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Сведения о сотруднике"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
