package pages;// Архив_Итоги
//  /ru/tko/control/annual-archive/modules/4/summary

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchiveModulesSummaryPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Итоги')]");
    private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]");
    // private SelenideElement backBtn = $("//div.container-content-head a"); //Если xpath будет гнать
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]");
    // private SelenideElement filteringListBtn = $(" div.row.justify-content-between.mb-10.mt-30  button"); //Если xpath будет гнать
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]");
    // private SelenideElement applyBtn = $("form div:nth-child(1) > button");  //Если xpath будет гнать
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]");
    //private SelenideElement resetBtn = $("form div:nth-child(2) > button");   //Если xpath будет гнать
    private SelenideElement firstLookAtBtn = $("table tr:nth-child(1) a");


}
