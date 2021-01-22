// Просмотр дипломной работы
//  /ru/tko/control/diploma-contingent/4

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DiplomaContingentPage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Дипломные работы')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                            // 'Назад'

    // Получение списока строк в таблице
    private ElementsCollection selectAllTd = $$(byXpath("//table/tbody//tr/td[1]"));

}
