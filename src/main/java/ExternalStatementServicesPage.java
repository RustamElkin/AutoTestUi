// Необработанные заявки на гос.услуги с внешних сервисов
//  /ru/tko/control/external-statement-services

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExternalStatementServicesPage {

    // Тайтл
    private SelenideElement titleToPage          = $x("//h1[contains(text(),'Заявки на гос.услуги')]");

    // Табы на странице
    private SelenideElement unprocessedTab       = $x("//span[contains(text(),'Необработанные')]/..");             // 'Необработанные'
    private SelenideElement processedTab         = $x("//span[contains(text(),'Обработанные')]/..");               // 'Обработанные'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement dateAddedTable       = $x("//th[contains(text(),'Дата добавления')]");                 // 'Дата добавления'
    private SelenideElement organizationTable    = $x("//th[contains(text(),'Организация')]");                     // 'Организация'
    private SelenideElement applicationTypeTable = $x("//th[contains(text(),'Тип заявки')]");                      // 'Тип заявки'
    private SelenideElement dateTable            = $x("//th[contains(text(),'Статус')]");                          // 'Статус'
    private SelenideElement operationsTable      = $x("//th[contains(text(),'Операции')]");                        // 'Операции'

    // Кнопка в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn              = $x("(//a[@class='s-btn-table'])[1]");                           // Кнопка "Посмотреть"



}
