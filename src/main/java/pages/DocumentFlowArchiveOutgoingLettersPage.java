package pages;// Архив_Исходящие письма
//  /ru/tko/document-flow/archive/outgoing-letters

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowArchiveOutgoingLettersPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Письма')]");

    // Табы на странице
    private SelenideElement documentFlowTab = $x("//a/span[contains(text(),'Документооборот')]/..");                                                  // 'Документооборот'
    private SelenideElement ordersTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Приказы')]/..");                  // 'Приказы'

    // Таб "Исходящие письма" не кликабельный,так как мы на текущей странице.
    private SelenideElement outgoingEmailsTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Исходящие письма')]/.."); // 'Исходящие письма'
    private SelenideElement incomingEmailsTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Входящие письма')]/..");  // 'Входящие письма'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                // '№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                           // 'Название'
    private SelenideElement senderTable = $x("//th[contains(text(),'Отправитель')]");                      // 'Отправитель'
    private SelenideElement dateTable = $x("//th[contains(text(),'Дата')]");                               // 'Дата'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                     // 'Операции'

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public DocumentFlowArchiveOutgoingLettersPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Письма"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
