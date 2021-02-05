// Мониторинг заявок с внешних сервисов   (тут речь о конкретной заявке)
// Сотрудник ОУ
//  /ru/tko/control/monitoring/external-statements/19177

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringExternalStatementPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг заявок с внешних сервисов')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Таблицы у которых одинаковые поля.
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                             // '№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                            // 'ФИО'
    private SelenideElement specialtyTable = $x("//th[contains(text(),'Специальность')]");                 // 'Специальность'
    private SelenideElement typeOfEducationTable = $x("//th[contains(text(),'Тип образования')]");         // 'Тип образования'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                           // 'Статус'
    private SelenideElement dateOfApplicationTable = $x("//th[contains(text(),'Дата подачи')]");           // 'Дата подачи'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                     // 'Операции'

    // Кнопки просмотра в таблицах.
    private ElementsCollection viewBtn = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");           // Кнопки 'Посмотреть'

    // Кнопки фильтр
    private SelenideElement nameInput = $x("//span[contains(text(),'Фильтрация списка')]/..");                                       // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                                                 // 'Сбросить'
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                                          // 'Экспортировать'

    // Инпуты
    private SelenideElement specialtyFilter= $x("//label[contains(text(),'Специальность')]/following-sibling::div//input");          // 'Специальность'
    private SelenideElement statusFilter = $x("//label[contains(text(),'Статус')]/following-sibling::div//input");                   // 'Статус'
    private SelenideElement typeOfEducationFilter= $x("//label[contains(text(),'Тип образования')]/following-sibling::div//input");  // 'Тип образования'

    // Фильтры с диапазоном
    // "Дата"
    private SelenideElement dateFromFilter= $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name='filters[created_at][from]']"); // "От"
    private SelenideElement dateToFilter= $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name='filters[created_at][to]']");     // "До"

}
