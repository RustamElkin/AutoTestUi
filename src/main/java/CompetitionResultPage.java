// Результаты работы конкурсной комиссии
//      /ru/tko/statement-admissions

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CompetitionResultPage {

    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Результаты работы конкурсной комиссии')]"));

    private SelenideElement selectYearBtn = $(byXpath("//span[contains(text(),'2020')]/../../../..")); // Фильтр, выбор года
    private SelenideElement applyFilterBtn = $(byXpath("//div[contains(text(),'Применить')]/../..")); // Кнопка "Применить"

    private SelenideElement searchFilterBtn = $(byXpath("//input[@placeholder='Поиск' and @type = 'text']")); //

    private SelenideElement photoAlbumFullscreenBtn = $(byXpath("//*[@id=\"v-admission-result-org-list-app\"]//div[@class=\"sn-table__top-filters\"]/following-sibling::button"));

    private SelenideElement firstRowLookBtn = $(byXpath("//div[@class=\"s-group s-group--to-center\"]/a"));             // Таблица, операции "Просмотр"

    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   // Таблица
    private SelenideElement nameOnTable = $(byXpath("//th[contains(text(),'Название организации')]"));
    private SelenideElement journalOnTable = $(byXpath("//th[contains(text(),'Мест по гос. заказу')]"));
    private SelenideElement groupSubgroupOnTable = $(byXpath("//th[contains(text(),'Всего заявлений')]"));
    private SelenideElement OperationsOnTable = $(byXpath("//th[contains(text(),'Операции')]"));

    private SelenideElement backPaginateBtn = $(byXpath("//div[@class=\"sn-table__control\"]/button[1]"));  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement nextPaginateBtn = $(byXpath("//div[@class=\"sn-table__control\"]/button[2]"));



}
