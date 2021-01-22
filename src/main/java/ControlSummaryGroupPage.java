// Итоги группы
//  /ru/tko/control/summary/115

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlSummaryGroupPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Итоги группы')]"));

    // Табы на странице
    private SelenideElement backToTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                              // Таб "Назад"

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $(byXpath("//span[contains(text(),'Экспортировать')]/.."));


}
