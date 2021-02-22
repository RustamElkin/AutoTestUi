package pages;// Мониторинг_Приемных комиссий
// Сотрудник ОУ
//  /ru/tko/control/monitoring/commissions

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringCommissionsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг приемных комиссий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Кнопки фильтр
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить фильтр')]/..");               // 'Применить'
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                // 'Экспортировать'

    // Таблица
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                             // '№'
    private SelenideElement areaTable = $x("//div[contains(text(),'Название организации')]");              // 'Название организации'
    private SelenideElement districtTable = $x("//div[contains(text(),'Всего заявок')]");                  // 'Всего заявок'
    private SelenideElement specialtyTable = $x("//div[contains(text(),'На базе 9 классов')]");            // 'На базе 9 классов'
    private SelenideElement qualificationTable = $x("//div[contains(text(),'На базе 11 классов')]");       // 'На базе 11 классов'
    private SelenideElement statusTable = $x("//div[contains(text(),'ТиПО')]");                            // 'ТиПО'
    private SelenideElement sourceTable = $x("//div[contains(text(),'Подробнее')]");                       // 'Подробнее'

    // Инут (фильтр по названию) в таблице
    private SelenideElement organizationNameFilter = $x("//input[@type='search'][@placeholder='Название организации']");

    // Кнопки просмотра в таблице.
    private ElementsCollection viewBtn = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");           // Кнопки 'Посмотреть'




}
