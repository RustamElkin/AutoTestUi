// Архив_Сведения о выпускной группе
//  /ru/tko/control/group/1070/show

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ArchiveGraduatedGroupShowPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Контингент')]");
    private SelenideElement archiveTabItem = $("a.container-content-head__tab-item.is-active > span");
    private SelenideElement chairTabItem = $("div.container-content-head > div > div > a:nth-child(4)");
    private SelenideElement subgroupsTabItem = $("div.container-content-head > div > div > a:nth-child(3)");
    private SelenideElement groupsMeTabItem = $("div.container-content-head > div > div > a:nth-child(2)");
    private SelenideElement groupListTabItem = $("div.container-content-head > div > div > a:nth-child(1)");
    private SelenideElement firstRowBtn = $("td:nth-child(5) > div > a");
}
