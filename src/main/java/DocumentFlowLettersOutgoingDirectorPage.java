// Документооборот_Исходящие письма
//  /ru/tko/document-flow/letters-outgoing

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowLettersOutgoingDirectorPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Письма')]");

    // Табы на странице
    // Таб "Исходящие письма" не кликабельный,так как мы на текущей странице.
    private SelenideElement outgoingEmailsTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Исходящие письма')]/.."); // 'Исходящие письма'
    private SelenideElement incomingEmailsTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Входящие письма')]/..");  // 'Входящие письма'

    // Кнопка 'Отправить письмо'
    private SelenideElement sendLetterBtn = $x("//div[contains(text(),'Отправить письмо')]/..");                    // 'Отправить письмо'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                         // '№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                    // 'Название'
    private SelenideElement senderTable = $x("//th[contains(text(),'Отправитель')]");                               // 'Отправитель'
    private SelenideElement dateTable = $x("//th[contains(text(),'Дата')]");                                        // 'Дата'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                              // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Посмотреть']");        // Кнопка "Посмотреть"
    private SelenideElement editBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Редактировать']");     // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Удалить']");         // Кнопка "Удалить"


}
