package pages;// Архив_Сведения о выпускной группе
//  /ru/tko/control/group/12705/show

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
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

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public ArchiveGraduatedGroupShowPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Контингент"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
