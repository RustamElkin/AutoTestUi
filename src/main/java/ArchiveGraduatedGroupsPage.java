// Архив_Выпускные группы
//  /ru/tko/control/contingent/archive/graduated-groups

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ArchiveGraduatedGroupsPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Контингент')]");
    private SelenideElement archiveTabItem = $(By.cssSelector("a.container-content-head__tab-item.is-active > span"));
    private SelenideElement chairTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(4)"));
    private SelenideElement SubgroupsTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(3)"));
    private SelenideElement GroupsMeTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(2)"));
    private SelenideElement groupListTabItem = $(By.cssSelector("div.container-content-head > div > div > a:nth-child(1)"));
    //private SelenideElement filteringListBtn = $x()("//span[contains(text(),'Фильтрация списка')]");
    private SelenideElement filteringListBtn = $(By.cssSelector("div.row.justify-content-between.mb-10.mt-30  button")); //Если xpath будет гнать
    //private SelenideElement applyBtn = $x()("//span[contains(text(),'Применить')]");
    private SelenideElement applyBtn = $(By.cssSelector("form div:nth-child(1) > button"));  //Если xpath будет гнать
    //private SelenideElement resetBtn = $x()("//span[contains(text(),'Сбросить')]");
    private SelenideElement resetBtn = $(By.cssSelector("form div:nth-child(2) > button"));   //Если xpath будет гнать
    private SelenideElement firstRowBtn = $(By.cssSelector("tr:nth-child(1) > td:nth-child(8) a"));
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");   //не работает на первой странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//a[contains(text(),'4')]");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");


}
