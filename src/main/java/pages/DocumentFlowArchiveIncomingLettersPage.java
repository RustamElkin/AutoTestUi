package pages;// Архив_Входящие письма
//  /ru/tko/document-flow/archive/incoming-letters

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowArchiveIncomingLettersPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Письма')]");

    // Табы на странице
    private SelenideElement documentFlowTab = $x("//a/span[contains(text(),'Документооборот')]/..");                                                  // 'Документооборот'
    private SelenideElement ordersTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Приказы')]/..");                  // 'Приказы'
    private SelenideElement outgoingEmailsTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Исходящие письма')]/.."); // 'Исходящие письма'

    // Таб "Входящие письма" не кликабельный. так как мы на текущей странице
    private SelenideElement incomingEmailsTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Входящие письма')]/..");  // 'Входящие письма'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                 // '№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                            // 'Название'
    private SelenideElement senderTable = $x("//th[contains(text(),'Отправитель')]");                       // 'Отправитель'
    private SelenideElement dateTable = $x("//th[contains(text(),'Дата')]");                                // 'Дата'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                      // 'Операции'

}
