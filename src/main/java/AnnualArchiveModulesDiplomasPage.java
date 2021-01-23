import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// Архив_Дипломные работы
//  /ru/tko/control/annual-archive/modules/4/diplomas
public class AnnualArchiveModulesDiplomasPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Дипломные работы')]");
    private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]");
    private SelenideElement fieldSearchInput = $("input[placeholder='Поиск']");
    private SelenideElement fullscreenBtn = $(".sn--items-center > button");
    private SelenideElement firstLookAtBtn = $x("//*[@id=\"v-diploma-list-app\"]//tbody/tr[1]/td[8]/div/a[1]");
    private SelenideElement backPageBtn = $("div:nth-child(4) > button:nth-child(2)");
    private SelenideElement nextPageBtn = $("div:nth-child(4) > button:nth-child(3)");


}
