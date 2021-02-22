package pages;// Мониторинг_Активность колледжей
// Сотрудник ОУ
//  /ru/tko/control/monitoring/activity-college

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MonitoringActivityCollegesPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Активность колледжей')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                   // Таб "Назад"

    // Кнопки
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]");                                                // 'Экспортировать'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                                        // '№'
    private SelenideElement nameOfCompanyTable = $x("//th[contains(text(),'Наименование организации')]");                            // 'Наименование организации'
    private SelenideElement numberOfStudentsTable = $x("//th[contains(text(),'Количество студентов')]");                             // 'Количество студентов'
    private SelenideElement activatedByStudentsTable = $x("//th[contains(text(),'Активировано студентов')]");                        // 'Активировано студентов'
    private SelenideElement activatedByStudentsPercentTable = $x("//th[contains(text(),'Активировано студентов(%)')]");              // 'Активировано студентов(%)'
    private SelenideElement numberOfTeachersTable = $x("//th[contains(text(),'Количество преподавателей')]");                        // 'Количество преподавателей'
    private SelenideElement activatedByTeachersTable = $x("//th[contains(text(),'Активировано преподавателей')]");                   // 'Активировано преподавателей'
    private SelenideElement activatedByTeachersPercentTable = $x("//th[contains(text(),'Активировано преподавателей(%)')]");         // 'Активировано преподавателей(%)'
    private SelenideElement numberOfTasksTable = $x("//th[contains(text(),'Количество заданий, внесенных')]");                       // 'Количество заданий, внесенных педагогами и требующ''
    private SelenideElement assignmentForEachStudentTable = $x("//th[contains(text(),'Назначено заданий (назначение на каждого студента')]"); // ''Назначено заданий (назначение на каждого студента''
    private SelenideElement completedTasksTable = $x("//th[contains(text(),'Выполнено заданий')]");                                  // 'Выполнено заданий'
    private SelenideElement tasksGradedTable = $x("//th[contains(text(),'Оценено заданий')]");                                       // 'Оценено заданий'
    private SelenideElement ratingTable = $x("//th[contains(text(),'Рейтинг')]");                                                    // 'Рейтинг'

}
