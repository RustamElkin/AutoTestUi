// Архив_Журналы
//  /ru/tko/control/annual-archive/modules/4/journals

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

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

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn         = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn        = $x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn       = $x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn        = $x("//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn       = $x("//a[contains(text(),'4')]");
    private ElementsCollection selectPaginateBtn    = $$x("//ul[@role = 'navigation']//a");
    private SelenideElement nextPaginateBtn         = $x("//a[contains(text(),'›')]");
}