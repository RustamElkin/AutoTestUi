import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

// Архив_Назначенные задания
//  /ru/tko/control/annual-archive/modules/4/assigned-homeworks
public class AnnualArchiveModulesAssignedHomeworksPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Назначенные задания')]"));
    private SelenideElement backBtn = $(By.xpath("//span[contains(text(),'Назад')]"));
    private SelenideElement filteringListBtn = $(By.xpath("//span[contains(text(),'Фильтрация списка')]"));
    private SelenideElement applyBtn = $(By.xpath("//span[contains(text(),'Применить')]"));
    private SelenideElement resetBtn = $(By.xpath("//span[contains(text(),'Сбросить')]"));
    private SelenideElement firstLookAtBtn = $(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]"));

}
