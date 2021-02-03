// Мониторинг заявок с внешних сервисов
// Сотрудник ОУ
//  /ru/tko/control/monitoring/external-statements

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringExternalStatementsPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг заявок с внешних сервисов')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                  // Таб "Назад"

    // Инпут
    private SelenideElement commissionYearFilter = $x("//label[contains(text(),'Год поступления')]/.. //following-sibling::span//span[@aria-labelledby=\"select2-commissions-year-select-container\"]");          // 'Год поступления'
    private ElementsCollection selectsCommissionYear = $$x("//label[contains(text(),'Год поступления')]/.. //following-sibling::select/option");

    // Кнопки фильтр
    private SelenideElement applyBtn = $x("//button[contains(text(),'Применить фильтр')]");                         // 'Применить'
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]");                               // 'Экспортировать'

    // Таблица
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                                      // '№'
    private SelenideElement nameOfTheOrganizationTable = $x("//div[contains(text(),'Название организации')]");      // 'Название организации'
    private SelenideElement totalApplicationsSubmittedTable = $x("//div[contains(text(),'Всего подано заявок')]");  // 'Всего подано заявок'
    private SelenideElement totalRequestsProcessedTable = $x("//div[contains(text(),'Всего обработано заявок')]");  // 'Всего обработано заявок'
    private SelenideElement basedOnNineClassesTable = $x("//div[contains(text(),'На базе 9 классов')]");            // 'На базе 9 классов'
    private SelenideElement basedOnElevenClassesTable = $x("//div[contains(text(),'На базе 11 классов')]");         // 'На базе 11 классов'
    private SelenideElement moreDetailsTable = $x("//div[contains(text(),'Подробнее')]");                           // 'Подробнее'

    // Кнопки просмотра в таблицах
    private ElementsCollection viewBtn = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");                    // Кнопки 'Посмотреть'

    // Фильтр с инпутом в таблице
    private SelenideElement statusFilter = $x("//input[@class=\"tablesorter_filter tablesorter-filter\"]");         // Фильтр 'Название организации'

    // Список организаций по названию
    private ElementsCollection organizationsList = $$x("//td[@data-table-head='Название организации']");

}
