// Документооборот_Входящие письма
//  /ru/tko/document-flow/letters

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentsFlowLettersPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Письма')]");

    // Табы на странице
    // Таб "Входящие письма" не кликабельный,так как мы на текущей странице.
    private SelenideElement incomingEmailsTab = $x("//span[contains(text(),'Входящие письма')]/..");                    // 'Входящие письма'
    private SelenideElement outgoingEmailsTab = $x("//span[contains(text(),'Исходящие письма')]/..");                   // 'Исходящие письма'



    // Кнопка "Отправить письмо"
    private SelenideElement sendLetterBtn = $x("//div[contains(text(),'Отправить письмо')]/..");

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                             // '№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                        // 'Название'
    private SelenideElement senderTable = $x("//th[contains(text(),'Отправитель')]");                                   // 'Отправитель'
    private SelenideElement retirementDateTable = $x("//th[contains(text(),'Дата')]");                                  // 'Дата'
    private SelenideElement dateTable = $x("//th[contains(text(),'Статус')]");                                          // 'Статус'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Посмотреть']");            // Кнопка "Посмотреть"

}
