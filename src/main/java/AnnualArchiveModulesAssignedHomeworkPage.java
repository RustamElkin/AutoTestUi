// Архив_Назначенного задания
//  /ru/tko/control/annual-archive/modules/4/assigned-homeworks/280

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchiveModulesAssignedHomeworkPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Лекция для обычного журнала')]");
    private SelenideElement backBtn = $x("//*[@id='vue-container']/div[1]//div/a");

}
