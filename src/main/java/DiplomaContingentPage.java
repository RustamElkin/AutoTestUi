// Просмотр дипломной работы
//  /ru/tko/control/diploma-contingent/4

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DiplomaContingentPage {


    // Тайтл
    private SelenideElement titleToPage =$x("//h1[contains(text(),'Дипломные работы')]");

    // Табы на странице
    private SelenideElement backTab =$x("//span[contains(text(),'Назад')]/..");                        // 'Назад'

    // Получение списока строк в таблице
    private ElementsCollection selectAllTd = $$x("//table/tbody//tr/td[1]");

}
