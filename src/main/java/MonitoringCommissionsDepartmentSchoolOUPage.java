// Мониторинг_Приемных комиссий
// Сотрудник РУ, Сотрудник ОУ
//  /ru/tko/control/monitoring/commissions/department/school/19181

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringCommissionsDepartmentSchoolOUPage {

    // Тайтл
    private SelenideElement titleToPage                 = $x("//h1[contains(text(),'Мониторинг приемных комиссий')]");

    // Табы на странице
    private SelenideElement backToTab                   = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Кнопки фильтр
    private SelenideElement exportBtn                   = $x("//a[contains(text(),'Экспортировать')]");                      // 'Экспортировать'

    // Таблица
    private SelenideElement typeEducationTable          = $x("//th[contains(text(),'Тип образования')]");                    // 'Тип образования'
    private SelenideElement numberOfSpecialtiesTable    = $x("//th[contains(text(),'Количество специальностей')]");          // 'Количество специальностей'
    private SelenideElement numberOfQualificationsTable = $x("//th[contains(text(),'Количество квалификаций')]");            // 'Количество квалификаций'
    private SelenideElement numberOfApplicationsTable   = $x("//th[contains(text(),'Количество заявок')]");                  // 'Количество заявок'
    private SelenideElement moreDetailsTable            = $x("//th[contains(text(),'Подробнее')]");                          // 'Подробнее'

    // Кнопки просмотра в таблице.
    private ElementsCollection viewBtn                  = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");            // Кнопки 'Посмотреть'

}
