// Архив_Журналы
//  /ru/tko/control/annual-archive/modules/4/journals

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchiveModulesJournalsPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал')]");
    private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]");
    // private SelenideElement backBtn = $("//div.container-content-head  a");                          //Если xpath будет гнать
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]");
    // private SelenideElement filteringListBtn = $(" div.row.justify-content-between.mb-10.mt-30  button");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]");
    // private SelenideElement applyBtn = $("form div:nth-child(1) > button");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]");
    //private SelenideElement resetBtn = $("form div:nth-child(2) > button");
    private SelenideElement firstLookAtBtn = $("table tr:nth-child(1) a");
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}