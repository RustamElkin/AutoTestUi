package pages;// Расписание экзаменов
//  /ru/tko/control/exam-training-schedule

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ExamTrainingSchedulePage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Расписание')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]");

    // Инпуты
    private SelenideElement backInput = $x("//div[@class='exam-training-schedule-group']//input[@class='multiselect__input' and  @type='text']");
    private SelenideElement weekInput = $x("//div[@class='exam-training-schedule-week']//input[@class='multiselect__input' and  @type='text']");

    // Дропдауны
    private SelenideElement groupDropdown = $x("//div[@class='exam-training-schedule-group']");
    private SelenideElement weekDropdown = $x("//div[@class='exam-training-schedule-week']");

    // Списоки
    private ElementsCollection groupList = $$x("//div[@class='exam-training-schedule-group']//li/span/span");
    private ElementsCollection weekList = $$x("//div[@class='exam-training-schedule-week']//li/span/span");

    private ElementsCollection selectGroup = $$x("//div[@class='exam-training-schedule-week']//span[contains(text(), 'КП19-30р')]");
    private ElementsCollection selectWeek = $$x("//div[@class='exam-training-schedule-week']//span/span[contains(text(), '28.12.2020 - 03.01.2021')]");

}
