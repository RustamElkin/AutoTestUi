// Документооборот_Входящие заявки
//  /ru/tko/document-flow/statements

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DocumentFlowStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Входящие заявки')]"));

    // Кнопка "Оставить Заявку"
    private SelenideElement leaveRequestBtn = $(byXpath("//div[contains(text(),'Оставить заявку')]/.."));

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                             // '№'
    private SelenideElement dateAddedTable = $(byXpath("//th[contains(text(),'Дата добавления')]"));                            // 'Дата добавления'
    private SelenideElement senderTable = $(byXpath("//th[contains(text(),'Тип документа')]"));                                 // 'Тип документа'
    private SelenideElement dateTable = $(byXpath("//th[contains(text(),'Статус')]"));                                          // 'Статус'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"]"));        // Кнопка "Посмотреть"

}
