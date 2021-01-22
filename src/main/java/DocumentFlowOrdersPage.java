// Документооборот_Приказы
//  /ru/tko/document-flow/orders

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DocumentFlowOrdersPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Приказы')]"));

    // Кнопка "Отправить приказ"
    private SelenideElement sendOrderBtn = $(byXpath("//div[contains(text(),'Отправить приказ')]/.."));                 // кнопка 'Отправить приказ'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                     // '№'
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Название')]"));                                // 'Название'
    private SelenideElement senderTable = $(byXpath("//th[contains(text(),'Отправитель')]"));                           // 'Отправитель'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"]"));        // Кнопка "Посмотреть"









}
