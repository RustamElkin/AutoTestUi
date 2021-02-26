package pages;// Гос. услуги_Обработанные заявки
//  /ru/tko/control/gov-service-statement?type=processed

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GovServiceStatementProcessedPage {

    // Тайтл
    private SelenideElement titleToPage              = $x("//h1[contains(text(),'Заявление')]");

    // Табы на странице
    private SelenideElement applicationTab           = $x("//a[@class = 'container-content-head__tab-item ']/span[contains(text(),'Заявки')]/..");
    private SelenideElement applicationsProcessedTab = $x("//a/span[contains(text(),'Обработанные заявки')]/..");  // текущая страница
    private SelenideElement archiveTab               = $x("//a[@class = 'container-content-head__tab-item ']/span[contains(text(),'Архив')]/..");

    // Таблица
    private SelenideElement numberTable              = $x("//th[contains(text(),'№')]");                                             // '№'
    private SelenideElement dateAddedTable           = $x("//th[contains(text(),'Дата добавления')]");                            // 'Дата добавления'
    private SelenideElement fullNameTable            = $x("//th[contains(text(),'ФИО')]");                                         // 'ФИО'
    private SelenideElement applicationsTypeTable    = $x("//th[contains(text(),'Тип заявки')]");                          // 'Тип заявки'
    private SelenideElement statusTable              = $x("//th[contains(text(),'Статус')]");                                        // 'Статус'
    private SelenideElement operationsTable          = $x("//th[contains(text(),'Операции')]");                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn                  = $x("//tr[1]/td[@data-table-head = 'Операции']//a[@title = 'Посмотреть']");        // Кнопка "Посмотреть"

    // List of applications | список заявок
    private ElementsCollection listOfApplications    = $$x("//tbody/tr"); // Проверить что их 7 или фильтровать по индексу, типу и тд.

    private SelenideElement mainPageLink             = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public GovServiceStatementProcessedPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Заявление"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
