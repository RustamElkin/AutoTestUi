// Документооборот_Приказы
//  /ru/tko/document-flow/orders

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowOrdersPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Приказы')]");

    // Кнопка "Отправить приказ"
    private SelenideElement sendOrderBtn = $x("//div[contains(text(),'Отправить приказ')]/..");                         // кнопка 'Отправить приказ'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                             // '№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                        // 'Название'
    private SelenideElement senderTable = $x("//th[contains(text(),'Отправитель')]");                                   // 'Отправитель'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Посмотреть']");        // Кнопка "Посмотреть"


}
