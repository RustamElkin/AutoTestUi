package pages;// Гос. услуги_Заявление студента
//  /ru/tko/control/gov-service-statement/4974

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GovServiceStudentStatementPage {

    // Тайтл
    private SelenideElement titleToPage    = $x("//h1[contains(text(),'Заявление')]");

    // Таб на странице "Назад"
    private SelenideElement backToTab      = $x("//span[contains(text(),'Назад')]/..");

    // Тайтлы в таблицах
    private SelenideElement commonInformationTitle = $x("//span[contains(text(),'Общие сведения')]");
    private SelenideElement documentsTitle = $x("//span[contains(text(),'Документы')]");
    private SelenideElement documentsNotAttachedTitle = $x("//span[contains(text(),'Не были вложены')]");
    private SelenideElement statusTitle    = $x("//span[contains(text(),'Статус')]");

    // image-viewer
    private SelenideElement viewerZoomIn                       = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-in']");
    private SelenideElement viewerZoomOut                      = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-out']");
    private SelenideElement viewerOneToOne                     = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-one-to-one']");
    private SelenideElement viewerReset                        = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-reset']");
    private SelenideElement viewerFullLarge                    = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-play viewer-large']");
    private SelenideElement viewerRotateLeft                   = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-left']");
    private SelenideElement viewerRotateRight                  = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-right']");
    private SelenideElement viewerFlipHorizontal               = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-horizontal']");
    private SelenideElement viewerFlipVertical                 = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-vertical']");
    private SelenideElement viewerClose                        = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//div[contains(@class,'viewer-close') and @role='button']");


}
