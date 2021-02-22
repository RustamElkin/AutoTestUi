package pages;// Дистанционное обучение_Удаленные назначенные задания
// /ru/tko/control/assigned-homeworks?trashed=1

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TrashedAssignedHomeworksPage {

    ///Эту страницу решили убрать - не могут восстановить из-за связей, где вручную удаленные дз из базы\\\

    // Тайтл
    private SelenideElement titleToPage             = $x("//h1[contains(text(),'Назначенные задания')]");

    // Табы на странице
    private SelenideElement openTasksTab            = $x("//span[contains(text(),'Открытые')]/..");
    private SelenideElement closedTasksTab          = $x("//span[contains(text(),'Закрытые')]/..");
    private SelenideElement deletedTasksTab         = $x("//span[contains(text(),'Удаленные')]/..");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn        = $x("//span[contains(text(),'Фильтрация списка')]/..");
    private SelenideElement applyBtn                = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn                = $x("//span[contains(text(),'Сбросить')]/..");

    // Инпуты Фильтра
    private SelenideElement nameInput               = $x("//label[contains(text(),'Название')]/following-sibling::input");
    private SelenideElement dateAndTimeEndFromInput = $x("//label[contains(text(),'Дата и время завершения приёма')]/following-sibling::div//input[@name='filters[date_and_time_end][from]']");
    private SelenideElement dateAndTimeEndToInput   = $x("//label[contains(text(),'Дата и время завершения приёма')]/following-sibling::div//input[@name='filters[date_and_time_end][to]']");

    // multiselect input, мультиселект инпуты фильтр
    private SelenideElement groupInput              = $x("//label[contains(text(),'Группа')]/following-sibling::div//input");
    private SelenideElement subjectInput            = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");
    private SelenideElement teacherInput            = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div//input");

    // Чекбокс
    private SelenideElement checkBox                = $x("//label[contains(text(),'Имеются непроверенные работы')]");

    // Таблица
    private SelenideElement numberOnTable           = $x("//th[contains(text(),'№')]");
    private SelenideElement nameOnTable             = $x("//th[contains(text(),'Название')]");
    private SelenideElement journalOnTable          = $x("//th[contains(text(),'Журнал')]");
    private SelenideElement groupSubgroupOnTable    = $x("//th[contains(text(),'Группа / Подгруппа')]");
    private SelenideElement teacherTable            = $x("//th[contains(text(),'Преподаватель')]");
    private SelenideElement checkedNotCheckedTable  = $x("//th[contains(text(),'Проверено / Не проверено')]");
    private SelenideElement appointmentTimeTable    = $x("//th[contains(text(),'Дата и время назначения')]");
    private SelenideElement completionTimeTable     = $x("//th[contains(text(),'Дата и время завершения приёма')]");
    private SelenideElement operationsOnTable       = $x("//th[contains(text(),'Операции')]");

    // Таблица, операции
    private ElementsCollection viewBtns             = $$x("//a[@title='Посмотреть']");
    private ElementsCollection deleteBtns           = $$x("//a[@title='Удалить']");

    private SelenideElement firstRowViewBtn         = $x("(//a[@title='Посмотреть'])[1]");
    private SelenideElement firstRowDeleteBtn       = $x("(//a[@title='Удалить'])[1]");

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn         = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn        = $x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn       = $x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn        = $x("//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn       = $x("//a[contains(text(),'4')]");
    private ElementsCollection selectPaginateBtn    = $$x("//ul[@role = 'navigation']//a");
    private SelenideElement nextPaginateBtn         = $x("//a[contains(text(),'›')]");

}
