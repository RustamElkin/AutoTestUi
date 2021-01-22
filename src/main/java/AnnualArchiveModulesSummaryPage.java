// Архив_Итоги
//  /ru/tko/control/annual-archive/modules/4/summary

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AnnualArchiveModulesSummaryPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Итоги')]"));
    private SelenideElement backBtn = $(By.xpath("//span[contains(text(),'Назад')]"));
    // private SelenideElement backBtn = $(By.cssSelector("//div.container-content-head a")); //Если xpath будет гнать
    private SelenideElement filteringListBtn = $(By.xpath("//span[contains(text(),'Фильтрация списка')]"));
    // private SelenideElement filteringListBtn = $(By.cssSelector(" div.row.justify-content-between.mb-10.mt-30  button")); //Если xpath будет гнать
    private SelenideElement applyBtn = $(By.xpath("//span[contains(text(),'Применить')]"));
    // private SelenideElement applyBtn = $(By.cssSelector("form div:nth-child(1) > button"));  //Если xpath будет гнать
    private SelenideElement resetBtn = $(By.xpath("//span[contains(text(),'Сбросить')]"));
    //private SelenideElement resetBtn = $(By.cssSelector("form div:nth-child(2) > button"));   //Если xpath будет гнать
    private SelenideElement firstLookAtBtn = $(By.cssSelector("table tr:nth-child(1) a"));


}
