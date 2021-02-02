// Мониторинг_Посещаемость
//  /ru/tko/control/monitoring/attendance

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MonitoringAttendancePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Посещаемость')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                   // Таб "Назад"

    // Кнопки
    private SelenideElement exportBtn = $x("//div[contains(text(),'Экспортировать')]//ancestor::button");                            // 'Экспортировать'
    private SelenideElement resetBtn = $x("//div[contains(text(),'Сбросить фильтр')]//ancestor::button");                            // 'Сбросить'
    private SelenideElement applyBtn = $x("//div[contains(text(),'Применить')]//ancestor::button");                                  // 'Применить'

    // Кнопка "Полноэкранный режим"
    private SelenideElement fullscreenBtn = $x("//i[contains(@class,'s-ico--thm-fullscreen s-ico')]//ancestor::button");

    // Таблица
    private SelenideElement fullNameColumn = $x("//table//th[contains(text(),'ФИО')]");                                                                                                               // '№'

    // Фильтр Инпуты
    private SelenideElement departmentInput = $x("//label[contains(text(),'Группа')]/following-sibling::div//input");                // 'Группа'

    // Фильтры с диапазоном
    // "Дата"
    private SelenideElement DateFromInput = $x("//div[contains(text(),'Дата от')]//following-sibling::div//input[@aria-label=\"Дата от\"]");          // 'Дата от'
    private SelenideElement DateToInput = $x("//div[contains(text(),'Дата до')]//following-sibling::div//input[@aria-label=\"Дата до\"] ");           // 'Дата до'

    // Dropdown
    private SelenideElement groupDropdown = $x("//div[contains(@class,'sn-item--clickable')]//div[@class=\"sn-item__label\"]");                                              // 'Группа'
    private SelenideElement studentsDropdown = $x("//div[contains(text(),'Студенты')]/following-sibling::div/div[@class=\"sn-field__inner\"]");                             // 'Студенты'


}
