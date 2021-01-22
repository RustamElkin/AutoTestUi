// Документооборот_Просмотр исходящего письма
//  /ru/tko/document-flow/letters-outgoing

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DocumentFlowLettersOutgoingPage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Письма')]"));

    // Табы на странице
    // Таб "Исходящие письма" не кликабельный,так как мы на текущей странице.
    private SelenideElement outgoingEmailsTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Исходящие письма')]/..")); // 'Исходящие письма'
    private SelenideElement incomingEmailsTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Входящие письма')]/.."));  // 'Входящие письма'

    // Кнопка 'Отправить письмо'
    private SelenideElement sendLetterBtn = $(byXpath("//div[contains(text(),'Отправить письмо')]/.."));                // 'Отправить письмо'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                     // '№'
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Название')]"));                                // 'Название'
    private SelenideElement senderTable = $(byXpath("//th[contains(text(),'Отправитель')]"));                           // 'Отправитель'
    private SelenideElement dateTable = $(byXpath("//th[contains(text(),'Дата')]"));                                    // 'Дата'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"]"));        // Кнопка "Посмотреть"
    private SelenideElement editBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Редактировать\"]"));     // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Удалить\"]"));         // Кнопка "Удалить"


}
