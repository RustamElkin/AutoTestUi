package pages;// Мониторинг заявлений по приемным комиссиям
//  /ru/tko/control/monitoring/statements-admissions

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MonitoringStatementsAdmissionsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг заявлений по приемным комиссиям')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                       // Таб "Назад"

    // Кнопки фильтр
    private SelenideElement applyBtn = $x("//button[contains(text(),'Применить фильтр')]");                              // 'Применить'
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]");                                    // 'Экспортировать'

    // Таблица
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                                           // '№'
    private SelenideElement nameOrganizationTable = $x("//div[contains(text(),'Название организации')]");                // 'Название организации'
    private SelenideElement totalOpenPCTable = $x("//div[contains(text(),'Всего открытых ПК')]");                        // 'Всего открытых ПК'
    private SelenideElement totalApplicationsSubmittedTable = $x("//div[contains(text(),'Всего подано заявок')]");       // 'Всего подано заявок'
    private SelenideElement totalRequestsProcessedTable = $x("//div[contains(text(),'Всего обработано заявок')]");       // 'Всего обработано заявок'

    private SelenideElement basedOnNineClassesTable = $x("//div[contains(text(),'На базе 9 классов')]");                 // 'На базе 9 классов'
    private SelenideElement basedOnElevenClassesTable = $x("//div[contains(text(),'На базе 11 классов')]");              // 'На базе 11 классов'
    private SelenideElement basedOnTIPOTable = $x("//div[contains(text(),'На базе ТиПО')]");                             // 'На базе ТиПО'

    private SelenideElement importBasedOnNineClassesTable = $x("(//div[contains(text(),'На базе 9 классов')])[2]");      // 'На базе 9 классов'
    private SelenideElement importBasedOnElevenClassesTable = $x("(//div[contains(text(),'На базе 11 классов')])[2]");   // 'На базе 11 классов'
    private SelenideElement importBasedOnTIPOTable = $x("(//div[contains(text(),'На базе ТиПО')])[2]");                  // 'На базе ТиПО'

    private SelenideElement moreDetailsTable = $x("//div[contains(text(),'Подробнее')]");                                // 'Подробнее'

    // Кнопка просмотра в таблице
    private SelenideElement viewBtn = $x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']/..");                          // Кнопка 'Посмотреть'

    // Фильтр с инпутом в таблице
    private SelenideElement statusFilter = $x("//input[@class=\"tablesorter_filter tablesorter-filter\"]");              // Фильтр 'Название организации'

    // Название организации
    private SelenideElement nameOrganizationsTable = $x("//td[@data-table-head='Название организации']");

}
