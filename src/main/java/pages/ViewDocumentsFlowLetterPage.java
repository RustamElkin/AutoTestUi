package pages;// Документооборот_Просмотр входящего письма
//  /ru/tko/document-flow/letters/8
//   логин: 810718400891 - user_id: 28712431

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ViewDocumentsFlowLetterPage {

    // Тайтл
    private SelenideElement titleToPage             = $x("//h1[contains(text(),'Письма')]");

    // Табы на странице
    private SelenideElement backToTab               = $x("//span[contains(text(),'Назад')]/..");           // Таб "Назад"

    // Тайтлы таблиц
    private SelenideElement senderTitle             = $x("//h3[contains(text(),'Отправитель')]");
    private SelenideElement informationAboutLetter  = $x("//h3[contains(text(),'Общие сведения')]");
    private SelenideElement descriptionLetterTitle  = $x("//h3[contains(text(),'Описание письма')]");
    private SelenideElement documentsTitle          = $x("//h3[contains(text(),'Документы')]");

    // Кнопки в таблице, ДОКУМЕНТЫ
    private SelenideElement viewBtn                 = $x("//button[contains(@class,'s-btn-table')]");      // Кнопка "Посмотреть"

    // Кнопка 'Подтвердить'
    private SelenideElement sendLetterBtn           = $x("//div[contains(text(),'Подтвердить')]/..");      // 'Подтвердить'

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

    // Модалка - Подтвердить
    // Кнопки
    private SelenideElement closeBtn                = $x("//div[@class='s-modal__head']/div[contains(text(), 'Вы уверены')]//following-sibling::div[@data-target='#modal-control-confirm']");
    private SelenideElement cancelBtn               = $x("//a[text() = 'Отмена' and @data-target = '#modal-control-confirm-js']");
    private SelenideElement sendBtn                 = $x("//a[@data-target = '#modal-control-confirm-js']/following-sibling::a[text() = 'Подтвердить' and @data-action = 'send_user_confirm']");

    private SelenideElement mainPageLink            = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");

    public ViewDocumentsFlowLetterPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Письма"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
