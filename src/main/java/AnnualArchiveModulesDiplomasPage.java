import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

// Архив_Дипломные работы
//  /ru/tko/control/annual-archive/modules/4/diplomas
public class AnnualArchiveModulesDiplomasPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Дипломные работы')]"));
    private SelenideElement backBtn = $(By.xpath("//span[contains(text(),'Назад')]"));
    private SelenideElement fieldSearchInput = $(By.cssSelector("input[placeholder='Поиск']"));
    private SelenideElement fullscreenBtn = $(By.cssSelector(".sn--items-center > button"));
    private SelenideElement firstLookAtBtn = $(By.xpath("//*[@id=\"v-diploma-list-app\"]//tbody/tr[1]/td[8]/div/a[1]"));
    private SelenideElement backPageBtn = $(By.cssSelector("div:nth-child(4) > button:nth-child(2)"));
    private SelenideElement nextPageBtn = $(By.cssSelector("div:nth-child(4) > button:nth-child(3)"));


}
