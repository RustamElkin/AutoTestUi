package pages;// Архив_ Расписание на группу
//  /ru/tko/control/annual-archive/modules/4/training-schedules/121

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchiveModulesTimetableForGroupPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'ЭВ19-30к')]");
    //private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]");
    private SelenideElement backBtn = $("div.container-content-head a");
    //private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]");
    private SelenideElement exportBtn = $("div.s-group.s-table-schedule__group.mb-20 > a");

    // Добить выбор группы, семестров и недель из списков
}
