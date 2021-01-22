// Дистанционное обучение_Закрытые назначенные задания
//  /ru/tko/control/assigned-homeworks?closed=1

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ClosedAssignedHomeworksPage {

    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Назначенные задания')]"));                   // Тайтл на странице
    private SelenideElement openTasksTab = $(byXpath("//span[contains(text(),'Открытые')]/.."));                        // Табы на странице
    private SelenideElement closedTasksTab = $(byXpath("//span[contains(text(),'Закрытые')]/.."));
    private SelenideElement deletedTasksTab = $(byXpath("//span[contains(text(),'Удаленные')]/.."));

    private SelenideElement filteringListBtn = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));           // Кнопки для фильтра
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));

    private SelenideElement nameInput = $(byXpath("//label[contains(text(),'Название')]/following-sibling::input"));   // Инпуты Фильтра
    private SelenideElement dateAndTimeEndFromInput = $(byXpath("//label[contains(text(),'Дата и время завершения приёма')]/following-sibling::div//input[@name=\"filters[date_and_time_end][from]\"]"));
    private SelenideElement dateAndTimeEndToInput = $(byXpath("//label[contains(text(),'Дата и время завершения приёма')]/following-sibling::div//input[@name=\"filters[date_and_time_end][to]\"]"));


    private SelenideElement groupInput = $(byXpath("//label[contains(text(),'Группа')]/following-sibling::div//input")); //multiselect input, мультиселект инпуты фильтр
    private SelenideElement subjectInput = $(byXpath("//label[contains(text(),'Предмет')]/following-sibling::div//input"));
    private SelenideElement teacherInput = $(byXpath("//label[contains(text(),'Преподаватель')]/following-sibling::div//input"));

    private SelenideElement checkBox = $(byXpath("//label[contains(text(),'Имеются непроверенные работы')]"));          //чекбокс

    private SelenideElement firstRowLookBtn = $(byXpath("//tr[1]/td[9]//a[1]"));                                        // Таблица, операции
    private SelenideElement firstRowDeleteBtn = $(byXpath("//tr[1]//a[@title=\"Удалить\"]"));

    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   // Таблица
    private SelenideElement nameOnTable = $(byXpath("//th[contains(text(),'Название')]"));
    private SelenideElement journalOnTable = $(byXpath("//th[contains(text(),'Журнал')]"));
    private SelenideElement groupSubgroupOnTable = $(byXpath("//th[contains(text(),'Группа / Подгруппа')]"));
    private SelenideElement Teacher = $(byXpath("//th[contains(text(),'Преподаватель')]"));
    private SelenideElement checkedNotChecked = $(byXpath("//th[contains(text(),'Проверено / Не проверено')]"));
    private SelenideElement appointmentTime = $(byXpath("//th[contains(text(),'Дата и время назначения')]"));
    private SelenideElement completionTimeTable = $(byXpath("//th[contains(text(),'Дата и время завершения приёма')]"));
    private SelenideElement OperationsOnTable = $(byXpath("//th[contains(text(),'Операции')]"));
    
    private SelenideElement backPaginateBtn = $(byXpath("//a[contains(text(),'‹')]"));  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $(byXpath("//a[contains(text(),'1')]"));
    private SelenideElement secondPaginateBtn = $(byXpath("//a[contains(text(),'2')]"));
    private SelenideElement thirdPaginateBtn = $(byXpath("//a[contains(text(),'3')]"));
    private SelenideElement fourthPaginateBtn = $(byXpath("//a[contains(text(),'4')]"));
    private SelenideElement nextPaginateBtn = $(byXpath("//a[contains(text(),'›')]"));

}
