package pages;// Документооборот_Приказы
//  /ru/tko/document-flow/orders

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowOrdersPage {

    // Тайтл
    private SelenideElement titleToPage          = $x("//h1[contains(text(),'Приказы')]");

    // Кнопка "Отправить приказ"
    private SelenideElement sendOrderBtn         = $x("//div[contains(text(),'Отправить приказ')]/..");                      // кнопка 'Отправить приказ'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable          = $x("//th[contains(text(),'№')]");                                         // '№'
    private SelenideElement nameTable            = $x("//th[contains(text(),'Название')]");                                  // 'Название'
    private SelenideElement senderTable          = $x("//th[contains(text(),'Отправитель')]");                               // 'Отправитель'
    private SelenideElement operationsTable      = $x("//th[contains(text(),'Операции')]");                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn              = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Посмотреть']");    // Кнопка "Посмотреть"

    // image-viewer
    private SelenideElement viewerZoomIn         = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-in']");
    private SelenideElement viewerZoomOut        = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-out']");
    private SelenideElement viewerOneToOne       = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-one-to-one']");
    private SelenideElement viewerReset          = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-reset']");
    private SelenideElement viewerFullLarge      = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-play viewer-large']");
    private SelenideElement viewerRotateLeft     = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-left']");
    private SelenideElement viewerRotateRight    = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-right']");
    private SelenideElement viewerFlipHorizontal = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-horizontal']");
    private SelenideElement viewerFlipVertical   = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-vertical']");
    private SelenideElement viewerClose          = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//div[contains(@class,'viewer-close') and @role='button']");


}
