// Дистанционное обучение_Закрытые назначенные задания
//  /ru/tko/control/assigned-homeworks?closed=1

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ClosedAssignedHomeworksPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Назначенные задания')]");                   // Тайтл на странице
    private SelenideElement openTasksTab = $x("//span[contains(text(),'Открытые')]/..");                        // Табы на странице
    private SelenideElement closedTasksTab = $x("//span[contains(text(),'Закрытые')]/..");
    private SelenideElement deletedTasksTab = $x("//span[contains(text(),'Удаленные')]/..");

    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");           // Кнопки для фильтра
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");

    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");   // Инпуты Фильтра
    private SelenideElement dateAndTimeEndFromInput = $x("//label[contains(text(),'Дата и время завершения приёма')]/following-sibling::div//input[@name=\"filters[date_and_time_end][from]\"]");
    private SelenideElement dateAndTimeEndToInput = $x("//label[contains(text(),'Дата и время завершения приёма')]/following-sibling::div//input[@name=\"filters[date_and_time_end][to]\"]");


    private SelenideElement groupInput = $x("//label[contains(text(),'Группа')]/following-sibling::div//input"); //multiselect input, мультиселект инпуты фильтр
    private SelenideElement subjectInput = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");
    private SelenideElement teacherInput = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div//input");

    private SelenideElement checkBox = $x("//label[contains(text(),'Имеются непроверенные работы')]");          //чекбокс

    private SelenideElement firstRowLookBtn = $x("//tr[1]/td[9]//a[1]");                                        // Таблица, операции
    private SelenideElement firstRowDeleteBtn = $x("//tr[1]//a[@title=\"Удалить\"]");

    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   // Таблица
    private SelenideElement nameOnTable = $x("//th[contains(text(),'Название')]");
    private SelenideElement journalOnTable = $x("//th[contains(text(),'Журнал')]");
    private SelenideElement groupSubgroupOnTable = $x("//th[contains(text(),'Группа / Подгруппа')]");
    private SelenideElement Teacher = $x("//th[contains(text(),'Преподаватель')]");
    private SelenideElement checkedNotChecked = $x("//th[contains(text(),'Проверено / Не проверено')]");
    private SelenideElement appointmentTime = $x("//th[contains(text(),'Дата и время назначения')]");
    private SelenideElement completionTimeTable = $x("//th[contains(text(),'Дата и время завершения приёма')]");
    private SelenideElement OperationsOnTable = $x("//th[contains(text(),'Операции')]");
    
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//a[contains(text(),'4')]");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}
