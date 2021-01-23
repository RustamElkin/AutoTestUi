// Архив_Сведения о выпускной группе
//  /ru/tko/control/group/1070/show

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ArchiveGraduatedGroupShowPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Контингент')]");
    private SelenideElement archiveTabItem = $(By.cssSelector("a.container-content-head__tab-item.is-active > span"));
    private SelenideElement chairTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(4)"));
    private SelenideElement SubgroupsTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(3)"));
    private SelenideElement GroupsMeTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(2)"));
    private SelenideElement groupListTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(1)"));
    private SelenideElement firstRowBtn = $(By.cssSelector("td:nth-child(5) > div > a"));
}
