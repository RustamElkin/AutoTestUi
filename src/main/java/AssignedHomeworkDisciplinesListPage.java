// Назначенные задания
//  /ru/shy/control/assigned-homework/disciplines-list

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AssignedHomeworkDisciplinesListPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Назначенные задания')]");
    private SelenideElement disciplineFromTableOnPage = $x("//th[contains(text(),'Дисциплина')]");
    private SelenideElement totalTasksFromTableOnPage = $x("//th[contains(text(),'Всего заданий')]");
    private SelenideElement completedTasksFromTableOnPage = $x("//th[contains(text(),'Выполнено заданий')]");
    private SelenideElement failedOpenFromTableOnPage = $x("//th[contains(text(),'Не выполнено (открытые)')]");
    private SelenideElement failedClosedFromTableOnPage = $x("//th[contains(text(),'Не выполнено (закрытые)')]");
    private SelenideElement OperationsFromTableOnPage = $x("//th[contains(text(),'Операции')]");
    private SelenideElement viewFirstRowBtn = $x("//table//tr[1]/td[6]/div");

}
