package pages;// Дистанционное обучение_Просмотр шаблона задания
//  /ru/tko/control/homeworks/1369871

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ViewHomeworkTemplatePage {

    // Тайтл
    private SelenideElement titleToPage                        = $x("//h1[contains(text(),'Шаблоны заданий')]");

    // Табы на странице
    private SelenideElement backButtonTab                      = $x("//span[contains(text(),'Назад')]/..");             // 'Назад'

    // Тайтлы на странице
    private SelenideElement lectureTitle                       = $x("//span[contains(text(),'Лекция')]");               // 'Лекция'
    private SelenideElement taskTitle                          = $x("//span[contains(text(),'Задание')]");              // 'Задание'

    // Лекция - Вложенные файлы
    private ElementsCollection lectureAttachmentsFilesView     = $$x("//span[contains(text(),'Лекция')]/ancestor::div[@class='profile-content__block']//button");

    // Задание - Вложенные файлы
    private ElementsCollection homeworkAttachmentsFilesView    = $$x("//span[contains(text(),'Задание')]/ancestor::div[@class='profile-content__block']//button");

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
