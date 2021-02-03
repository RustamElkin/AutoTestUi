// Мониторинг_Приемных комиссий
// Сотрудник РУ
//  /ru/tko/control/monitoring/commissions/department/16

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringCommissionsDepartmentPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг приемных комиссий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'Название организации')]");                // 'Название организации	'
    private SelenideElement areaTable = $x("//th[contains(text(),'Все')]");                                // 'Все'
    private SelenideElement districtTable = $x("//th[contains(text(),'Девятые')]");                        // 'Девятые'
    private SelenideElement specialtyTable = $x("//th[contains(text(),'Одиннадцатые')]");                  // 'Одиннадцатые'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Другие')]");                    // 'Другие'
    private SelenideElement statusTable = $x("//th[contains(text(),'Итого')]");                            // 'Итого'
    private SelenideElement sourceTable = $x("//th[contains(text(),'Подробнее')]");                        // 'Подробнее'

    // Кнопки просмотра в таблице.
    private ElementsCollection viewBtn = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");           // Кнопки 'Посмотреть'


}
