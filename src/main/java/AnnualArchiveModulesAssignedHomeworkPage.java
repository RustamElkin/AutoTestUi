// Архив_Назначенного задания
//  /ru/tko/control/annual-archive/modules/4/assigned-homeworks/280

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AnnualArchiveModulesAssignedHomeworkPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Лекция для обычного журнала')]"));
    private SelenideElement backBtn = $(By.xpath("//*[@id=\"vue-container\"]/div[1]//div/a"));

}
