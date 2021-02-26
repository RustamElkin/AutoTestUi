package pages;// Дистанционное обучение_Ответ на задание
//  /ru/tko/control/assigned-homework/467/assigned-homework-contingent/3377

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class StudentHomeworkAnswerPage {

    // Тайтл
    private SelenideElement titleToPage          = $x("//h1[contains(text(),'Ответ на задание')]");

    // Табы на странице
    private SelenideElement backToTab            = $x("//span[contains(text(),'Назад')]/..");                                                          // Таб "Назад"

    // Вложенные файлы
    private ElementsCollection viewBtns          = $$x("//button[contains(@class,'s-btn-table')]");                                                    // Кнопки "Посмотреть"

    // Кнопки
    private SelenideElement set_pointBtn         = $x("//a[contains(text(),'Выставить оценку')]");                                                     // 'Выставить оценку'
    private SelenideElement notApprovedBtn       = $x("//div[contains(text(),'На доработку') and @data-target='#modal-confirm-revision-homework']");   // 'На доработку'

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

    // Модалка отправив на доработку

    // Кнопки
    private SelenideElement closeBtn             = $x("//div[@class = 's-modal__close' and @data-target='#modal-confirm-revision-homework']");
    private SelenideElement addBtn               = $x("//div[contains(text(),'Добавить')]");
    private SelenideElement deleteBtn            = $x("//div[contains(@class,'button_type_file remove_uploaded_file')]");
    private SelenideElement cancelBtn            = $x("//a[ contains(text(), 'Отмена') and contains(@class, 's-btn--thm-blue s-btn--w-200')]");
    private SelenideElement saveBtn              = $x("//span[contains(text(), 'Сохранить')]/parent::button[@type = 'submit' and contains(@class, 's-btn--thm-aqua')]");

    // text area - 'Описание'

    private SelenideElement descriptionArea      = $x("//label[contains(text(), 'Описание')]/following-sibling::div//div[@role = 'textbox']");

    private SelenideElement mainPageLink         = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public StudentHomeworkAnswerPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Ответ на задание"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }



}
