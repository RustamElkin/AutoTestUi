// Мониторинг_Гос. услуг_Заявки
//  /ru/tko/control/monitoring/gov-service-statements

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringGovServiceStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг гос. услуг')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                                           // Таб "Назад"
    private SelenideElement applicationsTab = $x("//span[text()='Заявки']/parent::a[@href=\"/ru/tko/control/monitoring/gov-service-statements\"]");          // Таб "Заявки"
    private SelenideElement statisticsTab = $x("//span[text()='Статистика']/parent::a[@href='/ru/tko/control/monitoring/gov-service-statement/statistic']"); // Таб "Статистика"
    private SelenideElement archiveTab = $x("//span[text()='Архив']/parent::a[@href=\"/ru/tko/control/monitoring/gov-service-statements?tab=archived\"]");   // Таб "Архив"

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");                                             // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                             // 'Применить'

    // Фильтр инпуты
    private SelenideElement surnameFilter= $x("//label[contains(text(),'Фамилия')]/following-sibling::input");                                    // 'Фамилия'
    private SelenideElement nameFilter= $x("//label[contains(text(),'Имя')]/following-sibling::input[@name=\"filters[firstname]\"]");             // 'Имя'
    private SelenideElement patronymicFilter= $x("//label[contains(text(),'Отчество')]/following-sibling::input[@name=\"filters[lastname]\"]");   // 'Отчество'
    private SelenideElement applicationsTypeFilter= $x("//label[contains(text(),'Тип заявки')]/following-sibling::div//input");                   // 'Тип заявки'
    private SelenideElement statusFilter= $x("//label[contains(text(),'Статус')]/following-sibling::div//input");                                 // 'Статус'
    private SelenideElement previousStatusFilter= $x("//label[contains(text(),'Предыдущий статус')]/following-sibling::div//input");              // 'Предыдущий статус'
    private SelenideElement organizationFilter= $x("//label[contains(text(),'Организация')]/following-sibling::div//input");                      // 'Организация'

    // Фильтры с диапазоном
    private SelenideElement dateFromInput = $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name=\"filters[created_at][from]\"]");       // 'Дата от'
    private SelenideElement dateToInput = $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name=\"filters[created_at][to]\"]");           // 'Дата до'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[@class='s-to-center s-table__col-1']");                        // '№ в таблице'
    private SelenideElement numberId = $x("(//th[contains(text(),'№')])[2]");                                       // '№'
    private SelenideElement dateTable = $x("//th[contains(text(),'Дата')]");                                        // 'Дата'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                                    // 'Статус'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                     // 'ФИО'
    private SelenideElement organizationTable = $x("//th[contains(text(),'Организация')]");                         // 'Организация'
    private SelenideElement typeOfApplicationTable = $x("//th[contains(text(),'Тип заявки')]");                     // 'Тип заявки'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                              // 'Операции'

    private ElementsCollection selectByFullName = $$x("//td[@data-table-head='ФИО']");

    // Кнопки просмотра в таблицах
    private ElementsCollection viewBtns = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");                    // Кнопки 'Посмотреть'

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'5')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");




}
