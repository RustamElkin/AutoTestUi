// Мониторинг_Дистанционное обучение_Назначенное задание
//  /ru/tko/control/monitoring/homework/13

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringHomeworkGroupPage {

    // Тайтл
    private SelenideElement titleToPage             = $x("//h1[contains(text(),'Назначенное задание')]");

    // Табы на странице
    private SelenideElement backToTab               = $x("//span[contains(text(),'Назад')]/..");                     // Таб "Назад"

    // Тайтл "Задание"
    private SelenideElement titleContentBlock       = $x("//span[contains(text(),'Задание')]");

    // ССылка на журнал
    private SelenideElement journalLink             = $x("//h3//following-sibling::table//a[contains(text(),'Перейти')]");

    // Список Вложенных файлов
    private ElementsCollection listOfAttachments    = $$x("// a[contains(text(),'Просмотреть')]");

    // Тайтл "Участники"
    private SelenideElement titleParticipants       = $x("//span[contains(text(),'Участники')]");

    // Таблица
    private SelenideElement numberOnTable           = $x("//th[@class='s-to-center s-table__col-1']");               // '№ в таблице'
    private SelenideElement fullNameTable           = $x("//th[contains(text(),'ФИО')]");                            // 'ФИО'
    private SelenideElement statusTable             = $x("//th[contains(text(),'Статус')]");                         // 'Статус'
    private SelenideElement operationsTable         = $x("//th[contains(text(),'Операции')]");                       // 'Операции'

    private ElementsCollection studentsFullNameList = $$x("//tr/td[@data-table-head='ФИО']");
    private  ElementsCollection viewScheduledTaskBtn= $$x("//a[@title='Посмотреть'][contains(@class,'s-btn--ico')]");

    // image-viewer
    private SelenideElement viewerZoomIn            = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-in']");
    private SelenideElement viewerZoomOut           = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-out']");
    private SelenideElement viewerOneToOne          = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-one-to-one']");
    private SelenideElement viewerReset             = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-reset']");
    private SelenideElement viewerFullLarge         = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-play viewer-large']");
    private SelenideElement viewerRotateLeft        = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-left']");
    private SelenideElement viewerRotateRight       = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-right']");
    private SelenideElement viewerFlipHorizontal    = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-horizontal']");
    private SelenideElement viewerFlipVertical      = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-vertical']");
    private SelenideElement viewerClose             = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//div[contains(@class,'viewer-close') and @role='button']");

}
