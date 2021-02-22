package pages;// Мониторинг_Гос. услуг_Статистика
// Сотрудник ОУ
//  /ru/tko/control/monitoring/gov-service-statement/statistic

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MonitoringGovServiceStatementStatisticPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Заявления')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                                           // Таб "Назад"
    private SelenideElement applicationsTab = $x("//span[text()='Заявки']/parent::a[@href=\"/ru/tko/control/monitoring/gov-service-statements\"]");          // Таб "Заявки"
    private SelenideElement statisticsTab = $x("//span[text()='Статистика']/parent::a[@href='/ru/tko/control/monitoring/gov-service-statement/statistic']"); // Таб "Статистика"
    private SelenideElement archiveTab = $x("//span[text()='Архив']/parent::a[@href=\"/ru/tko/control/monitoring/gov-service-statements?tab=archived\"]");   // Таб "Архив"

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");                                             // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                             // 'Применить'
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                                                       // 'Экспортировать'

    // Фильтр инпуты

    private SelenideElement statusFilter= $x("//label[contains(text(),'Статус')]/following-sibling::div//input");                                 // 'Статус'
    private SelenideElement previousStatusFilter= $x("//label[contains(text(),'Предыдущий статус')]/following-sibling::div//input");              // 'Предыдущий статус'

    // Фильтры с диапазоном
    private SelenideElement dateFromInput = $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name=\"filters[created_at][from]\"]");       // 'Дата от'
    private SelenideElement dateToInput = $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name=\"filters[created_at][to]\"]");           // 'Дата до'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[@class='s-to-center s-table__col-1']");                                   // '№ в таблице'
    private SelenideElement organizationTable = $x("//th[contains(text(),'Организация')]");                                    // 'Организация'
    private SelenideElement totalTable = $x("//th[contains(text(),'Всего')]");                                                 // 'Всего'

    private SelenideElement providingFreeFoodTable = $x("//th[contains(text(),'Предоставление бесплатного питания')]");        // 'Предоставление бесплатного питания'
    private SelenideElement academicLeaveApplicationTable = $x("//th[contains(text(),'Заявление на академический отпуск')]");  // 'Заявление на академический отпуск'

    private SelenideElement providingBehaviorTable = $x("//th[contains(text(),'Предоставление общежития')]");                  // 'Предоставление общежития'
    private SelenideElement typeTransferTable = $x("//th[contains(text(),'Заявка на перевод/восстановление')]");               // 'Заявка на перевод/восстановление'
    private SelenideElement typeIncompleteRefTable = $x("//th[contains(text(),'Выдача справки о неоконченном образовании')]"); // 'Выдача справки о неоконченном образовании'
    private SelenideElement typeDocsDoubleTable = $x("//th[contains(text(),'Выдача дубликатов документов')]");                 // 'Выдача дубликатов документов'



}
