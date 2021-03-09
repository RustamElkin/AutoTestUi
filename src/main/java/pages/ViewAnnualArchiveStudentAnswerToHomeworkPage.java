package pages;// Архив_Просмотр ответа студента на назначенное задание
//  /ru/tko/control/annual-archive/modules/4/assigned-homeworks/493998/9765922

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ViewAnnualArchiveStudentAnswerToHomeworkPage {

    // Тайтл
    private SelenideElement titleToPage                  = $x("//h1[@class='s-title-head']");

    // Табы на странице
    private SelenideElement backTab                      = $x("//span[contains(text(),'Назад')]/..");      // 'Назад'

    // Таблица
    private SelenideElement table                        = $x("//table[@class='s-table-simple']");

    private ElementsCollection viewBtn                   = $$x("//a[text()='Просмотреть']");

    // image-viewer
    private SelenideElement viewerZoomIn                 = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-in']");
    private SelenideElement viewerZoomOut                = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-zoom-out']");
    private SelenideElement viewerOneToOne               = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-one-to-one']");
    private SelenideElement viewerReset                  = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-reset']");
    private SelenideElement viewerFullLarge              = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-play viewer-large']");
    private SelenideElement viewerRotateLeft             = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-left']");
    private SelenideElement viewerRotateRight            = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-rotate-right']");
    private SelenideElement viewerFlipHorizontal         = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-horizontal']");
    private SelenideElement viewerFlipVertical           = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//li[@class = 'viewer-flip-vertical']");
    private SelenideElement viewerClose                  = $x("//div[contains(@class,'viewer-fade') and @id = 'viewer0']//div[contains(@class,'viewer-close') and @role='button']");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public ViewAnnualArchiveStudentAnswerToHomeworkPage checkElementsToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Заявки на подключение детей"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
