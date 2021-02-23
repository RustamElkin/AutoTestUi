package pages;
// Заявки на подключение детей
//  /ru/tko/control/parent-link-statements

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ParentLinkStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Заявки на подключение детей')]");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   //'№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                 //'ФИО'
    private SelenideElement parentIINTable = $x("//th[contains(text(),'ИИН Родителя')]");                       //'ИИН Родителя'
    private SelenideElement childIINTable = $x("//th[contains(text(),'ИИН Ребенка')]");                         //'ИИН Ребенка'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]//td//a");                                                     // Кнопка "Посмотреть"

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public ParentLinkStatementsPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Заявки на подключение детей"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
