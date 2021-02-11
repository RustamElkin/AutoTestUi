// Гос. заказ_Заявки
//  /ru/tko/control/gov-order-statement

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GovOrderStatementsListPage {

    // Тайтл
    private SelenideElement titleToPage              = $x("//h1[contains(text(),'Заявление')]");

    // Табы на странице
    private SelenideElement applicationTab           = $x("//a[@class='container-content-head__tab-item is-active']/span[contains(text(),'Заявки')]/..");       // текущая страница
    private SelenideElement applicationsProcessedTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Обработанные заявки')]/..");
    private SelenideElement archiveTab               = $x("//a[@class='container-content-head__tab-item ']/span[contains(text(),'Архив')]/..");
    // Таблица
    private SelenideElement numberTable              = $x("//th[contains(text(),'№')]");                                                                        // '№'
    private SelenideElement dateAddedTable           = $x("//th[contains(text(),'Дата добавления')]");                                                          // 'Дата добавления'
    private SelenideElement applicationsTypeTable    = $x("//th[contains(text(),'Тип заявки')]");                                                               // 'Тип заявки'
    private SelenideElement statusTable              = $x("//th[contains(text(),'Статус')]");                                                                   // 'Статус'
    private SelenideElement operationsTable          = $x("//th[contains(text(),'Операции')]");                                                                 // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn                  = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Посмотреть']");                                   // Кнопка "Посмотреть"
    // List of applications | список заявок
    private ElementsCollection listOfApplications    = $$x("//tbody/tr");

}
