// Дистанционное обучение_Редактирование задания
//  /ru/tko/control/assigned-homeworks/473/edit   Если перейти на эту страницу студентом, 403

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AssignedHomeworksEditPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Назначенные задания')]"));
    private SelenideElement backBtn = $(By.xpath("//span[contains(text(),'Назад')]/.."));
    private SelenideElement cancelBtn = $(By.xpath("//div[@class=\"col-12 col-sm-auto mb-20\"]/a[contains(text(),'Отмена')] "));
    private SelenideElement submitBtn = $(By.xpath("//span[contains(text(),'Сохранить')]/.."));
    private SelenideElement dateForGrades = $(By.xpath("//div[8]/div/div[2]/span/.."));
    private SelenideElement selectLastDateForGrade = $(By.xpath("//div[8]/div/div[2]/span/../..//li[1]"));

}
