package pages;// Архив_Приказы
//  /ru/tko/document-flow/archive/orders

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowArchiveOrdersPage {

    // Тайтл
    private SelenideElement titleToPage       = $x("//h1[contains(text(),'Архив')]");

    // Табы на странице
    private SelenideElement documentFlowTab   = $x("//a/span[contains(text(),'Документооборот')]/..");                                               // 'Документооборот'

    // Таб "Приказы" не кликабельный,так как мы на текущей странице.
    private SelenideElement ordersTab         = $x("//a[@class = 'container-content-head__tab-item']/span[contains(text(),'Приказы')]/..");          // 'Приказы'
    private SelenideElement outgoingEmailsTab = $x("//a[@class = 'container-content-head__tab-item']/span[contains(text(),'Исходящие письма')]/.."); // 'Исходящие письма'
    private SelenideElement incomingEmailsTab = $x("//a[@class = 'container-content-head__tab-item']/span[contains(text(),'Входящие письма')]/..");  // 'Входящие письма'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable       = $x("//th[contains(text(),'№')]");                                   // '№'
    private SelenideElement nameTable         = $x("//th[contains(text(),'Название')]");                            // 'Название'
    private SelenideElement senderTable       = $x("//th[contains(text(),'Отправитель')]");                         // 'Отправитель'
    private SelenideElement dateTable         = $x("//th[contains(text(),'Дата')]");                                // 'Дата'
    private SelenideElement operationsTable   = $x("//th[contains(text(),'Операции')]");                            // 'Операции'

    private SelenideElement mainPageLink      = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public DocumentFlowArchiveOrdersPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Архив"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
