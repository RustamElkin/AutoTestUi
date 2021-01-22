// Архив_Модули за учебный год
//  /ru/tko/control/annual-archive/modules/4

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AnnualArchiveModulesPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'2020 - 2020 учебный год')]"));
    private SelenideElement backBtn = $(By.xpath("//span[contains(text(),'Назад')]"));
    // private SelenideElement backBtn = $(By.cssSelector("//div.container-content-head a")); //Если xpath будет гнать


    //для теста, проверяющего есть ли на странице эти поля
    private SelenideElement titleJournal = $(By.xpath("//td[contains(text(),'Журнал')]"));
    private SelenideElement titleScheduledTasks = $(By.xpath("//td[contains(text(),'Назначенные задания')]"));
    private SelenideElement titleExams = $(By.xpath("//td[contains(text(),'Экзамены')]"));
    private SelenideElement titleSchedule = $(By.xpath("//td[contains(text(),'Расписание')]"));
    private SelenideElement titleGraduateWork = $(By.xpath("//td[contains(text(),'Дипломные работы')]"));
    private SelenideElement titleOutcome = $(By.xpath("//td[contains(text(),'Итоги')]"));

    private SelenideElement viewJournalBtn = $(By.xpath("//tr[1]/td[2]/a[1]/button[1]"));
    private SelenideElement viewScheduledTasksBtn = $(By.xpath("//tr[2]/td[2]/a[1]/button[1]"));
    private SelenideElement viewExamsBtn = $(By.xpath("//tr[3]/td[2]/a[1]/button[1]"));
    private SelenideElement viewScheduleBtn = $(By.xpath("//tr[4]/td[2]/a[1]/button[1]"));
    private SelenideElement viewGraduateWorkBtn = $(By.xpath("//tr[5]/td[2]/a[1]/button[1]"));
    private SelenideElement viewOutcomeBtn = $(By.xpath("//tr[6]/td[2]/a[1]/button[1]"));



}
