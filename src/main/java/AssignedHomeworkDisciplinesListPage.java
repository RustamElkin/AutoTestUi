// Назначенные задания
//  /ru/shy/control/assigned-homework/disciplines-list

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AssignedHomeworkDisciplinesListPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Назначенные задания')]"));
    private SelenideElement disciplineFromTableOnPage = $(By.xpath("//th[contains(text(),'Дисциплина')]"));
    private SelenideElement totalTasksFromTableOnPage = $(By.xpath("//th[contains(text(),'Всего заданий')]"));
    private SelenideElement completedTasksFromTableOnPage = $(By.xpath("//th[contains(text(),'Выполнено заданий')]"));
    private SelenideElement failedOpenFromTableOnPage = $(By.xpath("//th[contains(text(),'Не выполнено (открытые)')]"));
    private SelenideElement failedClosedFromTableOnPage = $(By.xpath("//th[contains(text(),'Не выполнено (закрытые)')]"));
    private SelenideElement OperationsFromTableOnPage = $(By.xpath("//th[contains(text(),'Операции')]"));
    private SelenideElement viewFirstRowBtn = $(By.xpath("//table//tr[1]/td[6]/div"));

}
