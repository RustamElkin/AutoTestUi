// Архив_Документооборот
//  /ru/tko/document-flow/archive/statements

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DocumentFlowArchiveStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Архив')]"));

    // Табы на странице
    // Таб "Документооборот" не кликабельный,так как мы на текущей странице.
    private SelenideElement documentFlowTab = $(byXpath("//a/span[contains(text(),'Документооборот')]/.."));                                                  // 'Документооборот'
    private SelenideElement ordersTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Приказы')]/.."));                  // 'Приказы'
    private SelenideElement outgoingEmailsTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Исходящие письма')]/..")); // 'Исходящие письма'
    private SelenideElement incomingEmailsTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Входящие письма')]/.."));  // 'Входящие письма'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                     // '№'
    private SelenideElement dateAddedTable = $(byXpath("//th[contains(text(),'Дата добавления')]"));                    // 'Дата добавления'
    private SelenideElement senderTable = $(byXpath("//th[contains(text(),'Тип документа')]"));                         // 'Тип документа'
    private SelenideElement dateTable = $(byXpath("//th[contains(text(),'Статус')]"));                                  // 'Статус'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          // 'Операции'

    // Список Документов //  фильтровать можно по tr поднявшись
    private ElementsCollection listOfDocuments = $$(byXpath("//tbody/tr/td[@data-table-head=\"Операции\"]/div"));       // найдёт список документов
    // далее в самом тесте .filterBy(text("...."))
    // или get(int) - возвращает n-ый элемент какSelenideElement, далее .click();
    // либо вот первый элемент//tbody/tr[1]/td[@data-table-head="Операции"]/div

}
