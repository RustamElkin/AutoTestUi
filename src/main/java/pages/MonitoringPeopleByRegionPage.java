package pages;// Мониторинг_Онлайн занятия_по региону
// Сотрудник ОУ
//  /ru/tko/control/monitoring/people/by-region

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringPeopleByRegionPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Онлайн занятия')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");

    // Тайтл таблицы региона
    private SelenideElement titleRegionList = $x("//h3/span[contains(text(),'Шымкент')]");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                                     // '№ в таблице'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название организации')]");                                      // 'Название организации'
    private SelenideElement groupTable = $x("//th[contains(text(),'Количество студентов')] ");                                    // 'Количество студентов'
    private SelenideElement disciplineTable = $x("//th[contains(text(),'Количество персонала')] ");                               // 'Количество персонала'
    private SelenideElement operationsTable = $x("//th[@width='10%']");                                                           // 'Операции'

    private ElementsCollection organizationsList = $$x("//td[@data-table-head='Название организации']");                          // 'Список организаций'
    private ElementsCollection viewBtns = $$x("//a[@title='Посмотреть']");                                                      // 'Список кнопок "Посмотреть"'


}
