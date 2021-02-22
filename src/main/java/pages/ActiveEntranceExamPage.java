package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// Вступительные экзамены_Активные
//  /ru/tko/control/entrance-exam

public class ActiveEntranceExamPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Вступительные экзамены')]");
    private SelenideElement activeExamsTabItem = $x("//span[contains(text(),'Активные')]");
    private SelenideElement archiveTabItem = $x("//*[@id=\"vue-container\"]//div/a[2]/span");
    private SelenideElement addExamTabItem = $x("//span[contains(text(),'Добавить')]");

}
