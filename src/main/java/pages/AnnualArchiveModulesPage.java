package pages;// Архив_Модули за учебный год
//  /ru/tko/control/annual-archive/modules/4

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchiveModulesPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'2020 - 2020 учебный год')]");
    private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]");
    // private SelenideElement backBtn = $("//div.container-content-head a"); //Если xpath будет гнать


    //для теста, проверяющего есть ли на странице эти поля
    private SelenideElement titleJournal = $x("//td[contains(text(),'Журнал')]");
    private SelenideElement titleScheduledTasks = $x("//td[contains(text(),'Назначенные задания')]");
    private SelenideElement titleExams = $x("//td[contains(text(),'Экзамены')]");
    private SelenideElement titleSchedule = $x("//td[contains(text(),'Расписание')]");
    private SelenideElement titleGraduateWork = $x("//td[contains(text(),'Дипломные работы')]");
    private SelenideElement titleOutcome = $x("//td[contains(text(),'Итоги')]");

    private SelenideElement viewJournalBtn = $x("//tr[1]/td[2]/a[1]/button[1]");
    private SelenideElement viewScheduledTasksBtn = $x("//tr[2]/td[2]/a[1]/button[1]");
    private SelenideElement viewExamsBtn = $x("//tr[3]/td[2]/a[1]/button[1]");
    private SelenideElement viewScheduleBtn = $x("//tr[4]/td[2]/a[1]/button[1]");
    private SelenideElement viewGraduateWorkBtn = $x("//tr[5]/td[2]/a[1]/button[1]");
    private SelenideElement viewOutcomeBtn = $x("//tr[6]/td[2]/a[1]/button[1]");



}
