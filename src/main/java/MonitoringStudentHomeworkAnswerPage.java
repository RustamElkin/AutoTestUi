// Мониторинг_Дистанционное обучение_Ответ студента
//  /ru/tko/control/monitoring/homework/answer/181

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringStudentHomeworkAnswerPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Ответ студента')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Таблица
    private SelenideElement statusTable = $x("//td[contains(text(),'Статус')]");                           // 'Статус'
    private SelenideElement fullNameTable = $x("//td[contains(text(),'ФИО ответившего')]");                // 'ФИО ответившего'
    private SelenideElement gradeTable = $x("//td[contains(text(),'Оценка')]");                            // 'Оценка'

    private ElementsCollection revisionAttachmentsList = $$x("//td[contains(text(),'Вложенные файлы доработки')]/../following-sibling::tr/td[contains(text(),'Вложение')]");  // 'Вложенные файлы доработки'
    private ElementsCollection attachedFilesList = $$x("//td[contains(text(),'Вложенные файлы')]/../following-sibling::tr//a[contains(text(),'Просмотреть')]");               // 'Вложенные файлы'

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
