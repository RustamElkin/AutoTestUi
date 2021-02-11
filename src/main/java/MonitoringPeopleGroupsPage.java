// Мониторинг_Онлайн занятия
//  /ru/tko/control/monitoring/people/groups/19195

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringPeopleGroupsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Список студентов')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                       // Таб "Назад"
    private SelenideElement contingentTab = $x("//span[contains(@class,'s-str-ico--wider')][contains(text(),'Контингент')]/..");         // Таб "Контингент"
    private SelenideElement teachersTab = $x("//span[contains(@class,'s-str-ico--wider')][contains(text(),'Педагоги')]/.. ");            // Таб "Педагоги"

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");

    // Фильтры
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input[@name=\"filters[name]\"]");    // 'Название'
    private SelenideElement qualificationInput = $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");           // 'Квалификация'
    private SelenideElement educatorInput = $x("//label[contains(text(),'Куратор')]/following-sibling::div//input");                     // 'Куратор'

    // DropDown
    private ElementsCollection qualificationsDropDownList = $$x("//label[contains(text(),'Квалификация')]/following-sibling::div//li[@class='multiselect__element']");    // 'Квалификация'
    private ElementsCollection educatorsDropDownList = $$x("//label[contains(text(),'Куратор')]/following-sibling::div//li[@class='multiselect__element']");              // 'Куратор'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                                            // '№ в таблице'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                                         // 'Название'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                                            // 'Квалификация'
    private SelenideElement courseTable = $x("//th[contains(text(),'Курс')]");                                                           // 'Курс'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");                                       // 'Язык обучения'
    private SelenideElement numberOfStudentsTable = $x("//th[contains(text(),'Количество студентов')]");                                 // 'Количество студентов'
    private SelenideElement educatorTable = $x("//th[contains(text(),'Куратор')]");                                                      // 'Куратор'
    private SelenideElement operationsOnTable = $x("//th[contains(text(),'Операции')]");                                                 // 'Операции'

    //Таблица операции
    private SelenideElement viewBtn = $x("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"]"); // Кнопка просмотра, первой строки в таблице
    private ElementsCollection selectGroupName = $$x("//td[@data-table-head='Название']");

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}
