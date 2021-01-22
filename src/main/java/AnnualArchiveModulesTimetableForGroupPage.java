// Архив_ Расписание на группу
//  /ru/tko/control/annual-archive/modules/4/training-schedules/121

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AnnualArchiveModulesTimetableForGroupPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'ЭВ19-30к')]"));
    //private SelenideElement backBtn = $(By.xpath("//span[contains(text(),'Назад')]"));
    private SelenideElement backBtn = $(By.cssSelector("div.container-content-head a")); //Если xpath будет гнать
    //private SelenideElement exportBtn = $(By.xpath("//span[contains(text(),'Экспортировать')]"));
    private SelenideElement exportBtn = $(By.cssSelector("div.s-group.s-table-schedule__group.mb-20 > a")); //Если xpath будет гнать

    //добить выбор группы, семестров и недель из списков
}
