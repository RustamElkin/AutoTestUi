package pages;// Итоги группы
//  /ru/tko/control/summary/115

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ControlSummaryGroupPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Итоги группы')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");


}
