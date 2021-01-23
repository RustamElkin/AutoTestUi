// Дистанционное обучение_Редактирование задания
//  /ru/tko/control/assigned-homeworks/473/edit   Если перейти на эту страницу студентом, 403

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AssignedHomeworksEditPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Назначенные задания')]");
    private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]/..");
    private SelenideElement cancelBtn = $x("//div[@class=\"col-12 col-sm-auto mb-20\"]/a[contains(text(),'Отмена')] ");
    private SelenideElement submitBtn = $x("//span[contains(text(),'Сохранить')]/..");
    private SelenideElement dateForGrades = $x("//div[8]/div/div[2]/span/..");
    private SelenideElement selectLastDateForGrade = $x("//div[8]/div/div[2]/span/../..//li[1]");

}
