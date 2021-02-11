// Активность организации_персонал
//  /ru/tko/control/monitoring/activity/19195/personnel

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringActivityCollegePersonnelPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Активность организаций')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                              // Таб "Назад"
    private SelenideElement contingentTab = $x("//a[@class=\"s-dropdown__link \"]/span[contains(text(),'Контингент')]/..");                     // Таб "Контингент"
    private SelenideElement personnelTab = $x("//a[contains(@class,'container-content-head__tab-item')]/span[contains(text(),'Персонал')]/.."); // Таб "Персонал"

    // Кнопка фильтр
    private SelenideElement nameInput = $x("//span[contains(text(),'Фильтрация списка')]/..");                                                  // 'Фильтрация списка'

    // Кнопки
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                           // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                                                            // 'Сбросить'

    // Фильтр Инпуты
    private SelenideElement accountingInMonitoringInput = $x("//label[contains(text(),'Учет в мониторинге')]/following-sibling::div//input");   // 'Учет в мониторинге'
    private SelenideElement personnelTypeInput = $x("//label[contains(text(),'Тип персонала')]/following-sibling::div//input");                 // 'Тип персонала'
    private SelenideElement accountStatusInput = $x("//label[contains(text(),'Статус аккаунта')]/following-sibling::div//input");               // 'Статус аккаунта'
    private SelenideElement informationAboutTeachingActivitiesInput = $x("//label[contains(text(),'Сведения о преподавательской деятельности')]/following-sibling::div//input ");         // 'Сведения о преподавательской деятельности'
    private SelenideElement moreAboutTeachingInput = $x("//label[contains(text(),'Дополнительно о преподавательской деятельности')]/following-sibling::div//input ");                     // 'Дополнительно о преподавательской деятельности'

    // Dropdown List
    private ElementsCollection accountingInMonitoringList = $$x("//label[contains(text(),'Учет в мониторинге')]/following-sibling::div//li[@class='multiselect__element']/span");
    private ElementsCollection personnelTypeList = $$x("//label[contains(text(),'Тип персонала')]/following-sibling::div//li[@class='multiselect__element']/span");
    private ElementsCollection accountStatusList = $$x("//label[contains(text(),'Статус аккаунта')]/following-sibling::div//li[@class='multiselect__element']/span");
    private ElementsCollection informationAboutTeachingActivitiesList = $$x("//label[contains(text(),'Сведения о преподавательской деятельности')]/following-sibling::div//li[@class='multiselect__element']/span");
    private ElementsCollection moreAboutTeachingList = $$x("//label[contains(text(),'Дополнительно о преподавательской деятельности')]/following-sibling::div//li[@class='multiselect__element']/span");

    // Селекты в 'Учет в мониторинге'
    private SelenideElement selectNotTaken = $x("//span[contains(text(),'Не учитывается')]//ancestor::li");           // 'Не учитывается'
    private SelenideElement selectTaken = $x("//span[contains(text(),'Учитывается')]//ancestor::li");                 // 'Учитывается'
    // Селекты в 'Тип персонала'
    private SelenideElement selectStaff = $x("//span[contains(text(),'Сотрудники')]//ancestor::li");                  // 'Сотрудники'
    private SelenideElement selectTeacher = $x("//span[contains(text(),'Преподаватель')]//ancestor::li");             // 'Преподаватель'
    private SelenideElement selectAdministration = $x("//span[contains(text(),'Администрация')]//ancestor::li");      // 'Администрация'
    // Селекты в 'Статус аккаунта'
    private SelenideElement selectNotActivatedStatus = $x("//span[contains(text(),'Не активирован')]//ancestor::li"); // 'Не активирован'
    private SelenideElement selectActivatedStatus = $x("//span[contains(text(),'Активирован')]//ancestor::li");       // 'Активирован'
    // Селекты в 'Сведения о преподавательской деятельности'
    private SelenideElement selectNotChosen = $x("//span[contains(text(),'Не выбрано')]//ancestor::li");              // 'Не выбрано'
    private SelenideElement selectDoesNotTeach = $x("//span[contains(text(),'Не преподает')]//ancestor::li");         // 'Не преподает'
    private SelenideElement selectTeach = $x("//span[contains(text(),'Преподает')]//ancestor::li");                   // 'Преподает'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                         // '№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                       // 'ФИО'
    private SelenideElement accountingInMonitoringTable = $x("//th[contains(text(),'Учет в мониторинге')]");          // 'Учет в мониторинге'
    private SelenideElement accountStatusTable = $x("//th[contains(text(),'Статус аккаунта')]");                      // 'Статус аккаунта'
    private SelenideElement informationAboutTeachingActivitiesTable = $x("//th[contains(text(),'Сведения о преподавательской деятельности')]");    // 'Сведения о преподавательской деятельности'
    private SelenideElement personnelTypeTable = $x("//th[contains(text(),'Тип персонала')]");                                                     // 'Тип персонала'
    private SelenideElement moreAboutTeachingTable = $x("//th[contains(text(),'Дополнительно о преподавательской деятельности')]");                // 'Дополнительно о преподавательской деятельности'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private ElementsCollection viewBtns = $$x("//span[@class=\"s-ico s-ico--thm-eye\"]/../.. /a");                    // Кнопки просмотра

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'7')]");
    private SelenideElement eighthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'8')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}
