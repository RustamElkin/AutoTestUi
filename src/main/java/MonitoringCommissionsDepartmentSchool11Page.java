// Мониторинг_Приемных комиссий_ На базе 11 классов
// Сотрудник РУ
//  /ru/tko/control/monitoring/commissions/department/school/19195/4

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringCommissionsDepartmentSchool11Page {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг приемных комиссий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                   // Таб "Назад"

    // Кнопки фильтр
    private SelenideElement nameInput = $x("//span[contains(text(),'Фильтрация списка')]/..");                                       // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                                                 // 'Сбросить'
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                                          // 'Экспортировать'

    // Инпуты
    private SelenideElement specialtyFilter= $x("//label[contains(text(),'Специальность')]/following-sibling::div//input");          // 'Специальность'
    private SelenideElement qualificationFilter= $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");       // 'Квалификация'
    private SelenideElement statusFilter = $x("//label[contains(text(),'Статус')]/following-sibling::div//input");                   // 'Статус'
    private SelenideElement sourceFilter= $x("//label[contains(text(),'Источник')]/following-sibling::div//input");                  // 'Источник'
    private SelenideElement typeOfEducationFilter= $x("//label[contains(text(),'Тип образования')]/following-sibling::div//input");  // 'Тип образования'

    // Фильтры с диапазоном
    // "Дата"
    private SelenideElement DateFromFilter= $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name='filters[created_at][from]']"); // "От"
    private SelenideElement DateToFilter= $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name='filters[created_at][to]']");     // "До"

    // нет данных на деве
    // Таблица
    private SelenideElement numberOn = $x("//th[contains(text(),'№')]");                                                             // '№'
    private SelenideElement areaTable = $x("//th[contains(text(),'Дата подачи')]");                                                  // 'Дата подачи'
    private SelenideElement districtTable = $x("//th[contains(text(),'ФИО')]");                                                      // 'ФИО'
    private SelenideElement specialtyTable = $x("//th[contains(text(),'Специальность')]");                                           // 'Специальность'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                                        // 'Квалификация'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                                                     // 'Статус'
    private SelenideElement sourceTable = $x("//th[contains(text(),'Источник')]");                                                   // 'Источник'
    private SelenideElement typeOfEducationTable = $x("//th[contains(text(),'Тип образования')]");                                   // 'Тип образования'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                               // 'Операции'

    // Кнопки просмотра в таблице.
    private ElementsCollection viewBtn = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");                                     // Кнопки 'Посмотреть'

    // Пагинации на деве небыло, надо поставить задачку


}
