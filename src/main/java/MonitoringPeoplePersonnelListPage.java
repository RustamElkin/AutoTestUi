// Мониторинг_Онлайн занятия_Список персонала
//  /ru/tko/control/monitoring/people/personnel/19195

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringPeoplePersonnelListPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Список персонала')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                       // Таб "Назад"
    private SelenideElement contingentTab = $x("//span[contains(@class,'s-str-ico--wider')][contains(text(),'Контингент')]/..");         // Таб "Контингент"
    private SelenideElement teachersTab = $x("//span[contains(@class,'s-str-ico--wider')][contains(text(),'Педагоги')]/.. ");            // Таб "Педагоги"

    // Кнопки для фильтра
    private SelenideElement searchBtn = $x("//button[contains(text(),'Найти')]/..");
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]/..");

    // Фильтры
    private SelenideElement fullNameInput = $x("//input[@type='search'][@aria-label='Filter \"ФИО\" column by...']");                                   // 'ФИО'
    private SelenideElement timeOfLastActivityInput = $x("//input[@type='search'][@aria-label='Filter \"Время последней активности\" column by...']");  // 'Время последней активности'
    private SelenideElement numberOfAuthorizationsInput = $x("//input[@type='search'][@aria-label='Filter \"Количество авторизаций\" column by...']");  // 'Количество авторизаций'

    // DropDown
    private ElementsCollection categoryDropDownList = $$x("//select[@name = 'type']/option");                                            // список 'тип сотрудников'

    // Таблица
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')] ");                                                          // '№ в таблице'
    private SelenideElement fullNameTable = $x("//div[contains(text(),'ФИО')]");                                                         // 'ФИО'
    private SelenideElement categoryTable = $x("//div[contains(text(),'Категория')] ");                                                  // 'Категория'
    private SelenideElement timeOfLastActivityTable = $x("//div[contains(text(),'Время последней активности')]");                        // 'Время последней активности'
    private SelenideElement numberOfAuthorizationsTable = $x("//div[contains(text(),'Количество авторизаций')]");                        // 'Количество авторизаций'
    private SelenideElement detailsOnTable = $x("//div[contains(text(),'Подробнее')]");                                                  // 'Подробнее'

    //Таблица операции
    private SelenideElement firstViewBtn = $x("//tr[1]/td[@data-table-head='Подробнее']//a[@title='Посмотреть']"); // Кнопка просмотра, первой строки в таблице
    private ElementsCollection viewBtns = $$x("//td[@data-table-head='Подробнее']");


    // Кнопки пагинации на странице (на деве 11 стр )
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}
