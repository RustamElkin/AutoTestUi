// Дистанционное обучение_Создание задания
//  /ru/tko/control/assigned-homeworks/create

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AssignedHomeworkCreatePage<cancelBtn> {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Назначенные задания')]"));
    private SelenideElement nameInput = $(By.xpath("//*[@id=\"vue-container\"]//form/div[2]/input"));
    private SelenideElement selectJournalDropDownList = $(By.xpath("//input[@name = \"journal_id\" and @type=\"text\"]"));
    private SelenideElement selectFirstJournal = $(By.xpath("//*[@id=\"vue-container\"]//form/div[3]/div/div[3]/ul/li[1]"));
    //private SelenideElement selectByIndexJournal = $(By.xpath("//*[@id='vue-container']//form/div[3]/div/div[3]/ul/li[1]"));
    private SelenideElement selectTaskDropDownList = $(By.cssSelector("div:nth-child(5) > div > div.multiselect__tags"));
    private SelenideElement selectFirstTask = $(By.xpath("//span[text()=\"Домашнее задание 1\"]"));
    private SelenideElement dateEndInput = $(By.xpath("//input[@name = \"date_end\" and @type=\"text\"]"));
    private SelenideElement timeInput = $(By.xpath("//*[@id=\"vue-container\"]//form/div[6]/input"));
    private SelenideElement dateForGrades = $(By.xpath("//div[8]/div/div[2]/span/.."));
    private SelenideElement selectLastDateForGrade = $(By.xpath("//div[8]/div/div[2]/span/../..//li[1]"));
    private SelenideElement selectCheckbox = $(By.xpath("//input[@id='field-input-select_all_students']"));
    private SelenideElement cancelBtn = $(By.xpath("//a[contains(text(),'Отмена')]"));
    private SelenideElement submitBtn = $(By.xpath("//span[contains(text(),'Сохранить')]/.."));

}
