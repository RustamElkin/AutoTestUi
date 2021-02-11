// Активность организации_контингент
//  /ru/tko/control/monitoring/activity/19195/contingent

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringActivityCollegeContingentPage {

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
    private SelenideElement accountStatusInput = $x("//label[contains(text(),'Статус аккаунта')]/following-sibling::div//input");               // 'Статус аккаунта'
    private SelenideElement formOfStudyInput = $x("//label[contains(text(),'Форма обучения')]/following-sibling::div//input");                  // 'Форма обучения'
    private SelenideElement moreAboutEducationInput = $x("//label[contains(text(),'Дополнительно об обучении')]/following-sibling::div//input");// 'Дополнительно об обучении'

    // Dropdown List
    private ElementsCollection accountingInMonitoringList = $$x("//label[contains(text(),'Учет в мониторинге')]/following-sibling::div//li[@class='multiselect__element']/span");
    private ElementsCollection accountStatusList = $$x("//label[contains(text(),'Статус аккаунта')]/following-sibling::div//li[@class='multiselect__element']/span");
    private ElementsCollection formOfStudyList = $$x("//label[contains(text(),'Форма обучения')]/following-sibling::div//li[@class='multiselect__element']/span");
    private ElementsCollection moreAboutEducationList = $$x("//label[contains(text(),'Дополнительно об обучении')]/following-sibling::div//li[@class='multiselect__element']/span");


    // Селекты в 'Учет в мониторинге'
     private SelenideElement selectNotTaken = $x("//span[contains(text(),'Не учитывается')]//ancestor::li");
     private SelenideElement selectTaken = $x("//span[contains(text(),'Учитывается')]//ancestor::li");

     private SelenideElement selectNotActivatedStatus = $x("//span[contains(text(),'Не активирован')]//ancestor::li");
     private SelenideElement selectActivatedStatus = $x("//span[contains(text(),'Активирован')]//ancestor::li");

     private SelenideElement selectFullTimeFormStudy = $x("//span[contains(text(),'Очная')]//ancestor::li");
     private SelenideElement selectEveningFormStudy = $x("//span[contains(text(),'Вечерняя')]//ancestor::li");
     private SelenideElement selectDayTimeFormOfStudy = $x("(//span[contains(text(),'дневная')]//ancestor::li)[1]");
     private SelenideElement selectDayTimeFormWithDOTOfStudy = $x("//span[contains(text(),'дневная (с применением ДОТ)')]//ancestor::li");
     private SelenideElement selectExtramuralFormOfStudy = $x("//span[contains(text(),'Заочная')]//ancestor::li");
     private SelenideElement selectExternShipFormOfStudy = $x("//span[contains(text(),'Экстернат')]//ancestor::li");
     private SelenideElement selectDistanceLearningFormOfStudy = $x("//span[contains(text(),'Дистанционное обучение')]//ancestor::li");

     private SelenideElement selectNotChosen = $x("//span[contains(text(),'Не выбрано')]//ancestor::li");
     private SelenideElement selectAcademicLeave = $x("//span[contains(text(),'Академический отпуск')]//ancestor::li");
     private SelenideElement selectIndustrialTraining = $x("//span[contains(text(),'Производственное обучение')]//ancestor::li");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   // '№'
    private SelenideElement specialtyTable = $x("//th[contains(text(),'ФИО')]");                                // 'ФИО'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Учет в мониторинге')]");             // 'Учет в мониторинге'
    private SelenideElement creatorTable = $x("//th[contains(text(),'Статус аккаунта')]");                      // 'Статус аккаунта'
    private SelenideElement dateOfCreationTable = $x("//th[contains(text(),'Форма обучения')]");                // 'Форма обучения'
    private SelenideElement startYearOfTable = $x("//th[contains(text(),'Дополнительно об обучении')]");        // 'Дополнительно об обучении'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                          // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private ElementsCollection viewBtns = $$x("//span[@class=\"s-ico s-ico--thm-eye\"]/../.. /a");              // Кнопки просмотра

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'7')]");
    private SelenideElement eighthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'8')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");



}
