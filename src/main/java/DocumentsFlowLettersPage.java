// Документооборот_Входящие письма
//  /ru/tko/document-flow/letters

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DocumentsFlowLettersPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Письма')]"));

    // Табы на странице
    // Таб "Входящие письма" не кликабельный,так как мы на текущей странице.
    private SelenideElement incomingEmailsTab = $(byXpath("//span[contains(text(),'Входящие письма')]/.."));                    // 'Входящие письма'
    private SelenideElement outgoingEmailsTab = $(byXpath("//span[contains(text(),'Исходящие письма')]/.."));                   // 'Исходящие письма'



    // Кнопка "Отправить письмо"
    private SelenideElement sendLetterBtn = $(byXpath("//div[contains(text(),'Отправить письмо')]/.."));

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                             // '№'
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Название')]"));                                        // 'Название'
    private SelenideElement senderTable = $(byXpath("//th[contains(text(),'Отправитель')]"));                                   // 'Отправитель'
    private SelenideElement retirementDateTable = $(byXpath("//th[contains(text(),'Дата')]"));                                  // 'Дата'
    private SelenideElement dateTable = $(byXpath("//th[contains(text(),'Статус')]"));                                          // 'Статус'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[@data-table-head='Операции']//a[@title='Посмотреть']"));            // Кнопка "Посмотреть"

}
