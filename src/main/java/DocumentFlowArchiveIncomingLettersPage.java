// Архив_Входящие письма
//  /ru/tko/document-flow/archive/incoming-letters

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DocumentFlowArchiveIncomingLettersPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Письма')]"));

    // Табы на странице
    private SelenideElement documentFlowTab = $(byXpath("//a/span[contains(text(),'Документооборот')]/.."));                                                 // 'Документооборот'
    private SelenideElement ordersTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Приказы')]/.."));                  // 'Приказы'
    private SelenideElement outgoingEmailsTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Исходящие письма')]/..")); // 'Исходящие письма'

    // Таб "Входящие письма" не кликабельный. так как мы на текущей странице
    private SelenideElement incomingEmailsTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Входящие письма')]/.."));  // 'Входящие письма'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                     // '№'
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Название')]"));                                // 'Название'
    private SelenideElement senderTable = $(byXpath("//th[contains(text(),'Отправитель')]"));                           // 'Отправитель'
    private SelenideElement dateTable = $(byXpath("//th[contains(text(),'Дата')]"));                                    // 'Дата'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          // 'Операции'

}
