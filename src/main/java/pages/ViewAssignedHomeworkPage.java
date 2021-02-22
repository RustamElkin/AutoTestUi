package pages;// Дистанционное обучение_Назначенное задание
//  /ru/tko/control/assigned-homeworks/13

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ViewAssignedHomeworkPage {

    // Тайтл
    private SelenideElement titleToPage                        = $x("//h1[contains(text(),'Назначенные задания')]");

    // Табы на странице
    private SelenideElement backTab                            = $x("//span[contains(text(),'Назад')]/..");               // 'Назад'

    // Тайтлы таблиц
    private SelenideElement lectureTitle                       = $x("//span[contains(text(),'Лекция')]");                 // 'Лекция'
    private SelenideElement taskTitle                          = $x("//h3[contains(text(),'Задание')]");                  // 'Задание'
    private SelenideElement participantsTitle                  = $x("//span[contains(text(),'Участники')]");              // 'Участники'

    // Ссылка - Журнал (Перейти)
    private SelenideElement goToLink                           = $x("//td/a[(text() ='Перейти') and @target='_blank']");  // 'Перейти'

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

    // Кнопка "Закрыть"
    private SelenideElement closeBtn                           = $x("//a[contains(text(),'Закрыть')]");

    // Таблица - Участники
    private SelenideElement fullNameOnTable                    = $x("//th[contains(text(),'ФИО')]");                      // 'ФИО'
    private SelenideElement timeOfDispatchTable                = $x("//th[contains(text(),'Время отправки')]");           // 'Время отправки'
    private SelenideElement statusTable                        = $x("//th[contains(text(),'Статус')]");                   // 'Статус'
    private SelenideElement gradeTable                         = $x("//th[contains(text(),'Оценка')]");                   // 'Оценка'
    private SelenideElement operationsTable                    = $x("//th[contains(text(),'Операции')]");                 // 'Операции

    // Кнопки просмотра в столбце операции
    private ElementsCollection viewBtns                        = $$x("//a[@class='s-btn-table s-btn--ico']");


}
