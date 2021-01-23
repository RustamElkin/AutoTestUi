// Документооборот_Входящие заявки
//  /ru/tko/document-flow/statements

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Входящие заявки')]");

    // Кнопка "Оставить Заявку"
    private SelenideElement leaveRequestBtn = $x("//div[contains(text(),'Оставить заявку')]/..");

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                             // '№'
    private SelenideElement dateAddedTable = $x("//th[contains(text(),'Дата добавления')]");                            // 'Дата добавления'
    private SelenideElement senderTable = $x("//th[contains(text(),'Тип документа')]");                                 // 'Тип документа'
    private SelenideElement dateTable = $x("//th[contains(text(),'Статус')]");                                          // 'Статус'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $x("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"]");        // Кнопка "Посмотреть"

}
