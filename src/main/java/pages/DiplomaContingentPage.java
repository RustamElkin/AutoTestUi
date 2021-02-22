package pages;// Просмотр дипломной работы
//  /ru/tko/control/diploma-contingent/4

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DiplomaContingentPage {

    // Тайтл
    private SelenideElement titleToPage           = $x("//h1[contains(text(),'Дипломные работы')]");

    // Табы на странице
    private SelenideElement backTab               = $x("//span[contains(text(),'Назад')]/..");                        // 'Назад'

    // Получение списока строк в таблице
    private ElementsCollection selectAllTd        = $$x("//table/tbody//tr/td[1]");

    // Можно проверить ФИО и группу студента
    private SelenideElement fullNameAndGroupCheck = $x("//h3[contains(@class,'s-title--double-line s-upper s-light')]/span");

    // Таблица
    private SelenideElement themeThesisWork       = $x("//td[@class='s-table__col--to-right' and text()= 'Тема дипломной работы:']/following-sibling::td");  // 'Тема дипломной работы'
    private SelenideElement personnelName         = $x("//td[@class='s-table__col--to-right' and text()= 'Руководитель:']/following-sibling::td");           // 'Руководитель'
    private SelenideElement protectionDate        = $x("//td[@class='s-table__col--to-right' and text()= 'Дата защиты :']/following-sibling::td");           // 'Дата защиты'
    private SelenideElement point                 = $x("//td[@class='s-table__col--to-right' and text()= 'Оценка:']/following-sibling::td");                 // 'Оценка'


}
