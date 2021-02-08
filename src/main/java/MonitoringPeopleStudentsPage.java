// Мониторинг_Онлайн занятия_Список студентов_в группе
//  /ru/tko/control/monitoring/people/students/115

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringPeopleStudentsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Список студентов')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                   // Таб "Назад"

    // Кнопка
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]");                                // 'Экспортировать'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                        // '№ в таблице'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                      // 'ФИО'
    private SelenideElement timeOfLastActivityTable = $x("//th[contains(text(),'Время последней активности')]");     // 'Время последней активности'
    private SelenideElement numberOfAuthorizationsTable = $x("//th[contains(text(),'Количество авторизаций')]");     // 'Количество авторизаций'
    private SelenideElement completedHomeworkTable = $x("//th[contains(text(),'Выполненные домашние задания')]");    // 'Выполненные домашние задания'
    private SelenideElement notCompletedClosedTable = $x("//th[contains(text(),'Не выполнено (закрытые)')]");        // 'Не выполнено (закрытые)'
    private SelenideElement notCompletedOpenTable = $x("//th[contains(text(),'Не выполнено (открытые)')]");          // 'Не выполнено (открытые)'
    private SelenideElement detailsOnTable = $x("//th[contains(text(),'Подробнее')]");                               // 'Подробнее'

    //Таблица операции
    private SelenideElement firstViewBtn = $x("//tr[1]/td[@data-table-head='Подробнее']//a[@title='Посмотреть']");   // Кнопка просмотра, первой строки в таблице
    private ElementsCollection selectFullName = $$x("//td[@data-table-head='ФИО']");
    private ElementsCollection viewBtns = $$x("//td[@data-table-head='Подробнее']");


}
