// Дистанционное обучение_Создание задания
//  /ru/tko/control/assigned-homeworks/create

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AssignedHomeworkCreatePage<cancelBtn> {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Назначенные задания')]");
    private SelenideElement nameInput = $x("//*[@id=\"vue-container\"]//form/div[2]/input");
    private SelenideElement selectJournalDropDownList = $x("//input[@name = \"journal_id\" and @type=\"text\"]");
    private SelenideElement selectFirstJournal = $x("//*[@id=\"vue-container\"]//form/div[3]/div/div[3]/ul/li[1]");
    //private SelenideElement selectByIndexJournal = $x()("//*[@id='vue-container']//form/div[3]/div/div[3]/ul/li[1]");
    private SelenideElement selectTaskDropDownList = $(By.cssSelector("div:nth-child(5) > div > div.multiselect__tags"));
    private SelenideElement selectFirstTask = $x("//span[text()=\"Домашнее задание 1\"]");
    private SelenideElement dateEndInput = $x("//input[@name = \"date_end\" and @type=\"text\"]");
    private SelenideElement timeInput = $x("//*[@id=\"vue-container\"]//form/div[6]/input");
    private SelenideElement dateForGrades = $x("//div[8]/div/div[2]/span/..");
    private SelenideElement selectLastDateForGrade = $x("//div[8]/div/div[2]/span/../..//li[1]");
    private SelenideElement selectCheckbox = $x("//input[@id='field-input-select_all_students']");
    private SelenideElement cancelBtn = $x("//a[contains(text(),'Отмена')]");
    private SelenideElement submitBtn = $x("//span[contains(text(),'Сохранить')]/..");

}
