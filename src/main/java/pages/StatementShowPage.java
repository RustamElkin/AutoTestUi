package pages;// Приемная комиссия_Просмотр заявки
//  /ru/tko/control/statement/show/16654
//    akml.coll.hr.13

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StatementShowPage {

    // Тайтл
    private SelenideElement titleToPage                     = $x("//h1[contains(text(),'Просмотр заявки')]");

    // Табы на странице
    private SelenideElement backTab                         = $x("//span[contains(text(),'Назад')]/..");                         // 'Назад'

    // Тайтлы на странице
    private SelenideElement applicantInformation            = $x("//h3[contains(text(),'Сведения об абитуриенте')]");            // 'Сведения об абитуриенте'
    private SelenideElement educationInformation            = $x("//h3[contains(text(),'Сведения об образовании')]");            // 'Сведения об образовании'
    private SelenideElement documents                       = $x("//h3[contains(text(),'Документы')]");                          // 'Документы'

    // image-viewer
    private SelenideElement viewerZoomIn                    = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-in']");
    private SelenideElement viewerZoomOut                   = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-out']");
    private SelenideElement viewerOneToOne                  = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-one-to-one']");
    private SelenideElement viewerReset                     = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-reset']");
    private SelenideElement viewerFullLarge                 = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-play viewer-large']");
    private SelenideElement viewerRotateLeft                = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-left']");
    private SelenideElement viewerRotateRight               = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-right']");
    private SelenideElement viewerFlipHorizontal            = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-horizontal']");
    private SelenideElement viewerFlipVertical              = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-vertical']");
    private SelenideElement viewerClose                     = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//div[contains(@class,'viewer-close') and @role='button']");


}