package pages;// Результаты работы конкурсной комиссии
//      /ru/tko/statement-admissions

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class CompetitionResultPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Результаты работы конкурсной комиссии')]");

    private SelenideElement selectYearBtn = $x("//span[contains(text(),'2020')]/../../../.."); // Фильтр, выбор года
    private SelenideElement applyFilterBtn = $x("//div[contains(text(),'Применить')]/../.."); // Кнопка "Применить"

    private SelenideElement searchFilterBtn = $x("//input[@placeholder='Поиск' and @type = 'text']"); //

    private SelenideElement photoAlbumFullscreenBtn = $x("//*[@id=\"v-admission-result-org-list-app\"]//div[@class=\"sn-table__top-filters\"]/following-sibling::button");

    private SelenideElement firstRowLookBtn = $x("//div[@class=\"s-group s-group--to-center\"]/a");             // Таблица, операции "Просмотр"

    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   // Таблица
    private SelenideElement nameOfTheOrganizationTable = $x("//th[contains(text(),'Название организации')]");
    private SelenideElement placesInStateOrderTable = $x("//th[contains(text(),'Мест по гос. заказу')]");
    private SelenideElement totalApplicationsTable = $x("//th[contains(text(),'Всего заявлений')]");
    private SelenideElement operationsOnTable = $x("//th[contains(text(),'Операции')]");

    private SelenideElement backPaginateBtn = $x("//div[@class=\"sn-table__control\"]/button[1]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement nextPaginateBtn = $x("//div[@class=\"sn-table__control\"]/button[2]");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public CompetitionResultPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Результаты работы конкурсной комиссии"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
