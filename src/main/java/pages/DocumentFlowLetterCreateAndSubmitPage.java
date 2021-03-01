package pages;// Документооборот_Создать и отправить письмо
//  /ru/tko/document-flow/letters/create

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowLetterCreateAndSubmitPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Отправить письмо')]");

    // Табы на странице
    private SelenideElement backBtnTab = $x("//span[contains(text(),'Назад')]/..");                             // 'Назад'

    // Инпуты
    private SelenideElement themeLetterInput = $x("//div[contains(text(),'Тема письма')]/.. //input");         // 'Тема письма'
    private SelenideElement documentNumberInput = $x("//div[contains(text(),'Номер документа')]/.. //input");   // 'Номер документа'
    private SelenideElement descriptionLetterInput = $x("//div/textarea[@aria-label='Описание письма']");       // 'Описание письма'
    private SelenideElement searchByOrganizationInput = $x("input[placeholder='Поиск по организациям']");      // 'Поиск по организациям'

    // Список колледжей //  фильтровать можно по посленему диву или тексту
    private ElementsCollection listOfColleges = $$x("//div[contains(text(),'Выберите колледж')]/..//div[@class='s-doc-flow-form__organizations-list']/div");

    // Чекбокс
    private SelenideElement selectAllCheckBox = $x("//input[@type='checkbox']/../..");                        // чекбокс  'Выбрать все'

    // Кнопки
    private SelenideElement cancelBtn = $x("//span[contains (text(), 'Отменить')]/..");                         // кнопка 'Отменить'
    private SelenideElement downloadBtn = $x("//button//div[contains(text(),'Загрузить')]/../..");              // кнопка 'Загрузить'

    // Кнопка "Отправить письмо" активируется после того как будут заполнены обязательные поля
    private SelenideElement submitBtn = $x("//button//div[contains(text(),'Отправить письмо')]/../..");                // кнопка 'Отправить письмо'

    // Выбор уже имеющегося файла в модалке
    private SelenideElement selectAvailableFile = $x("//div/div[@class='s-file-select'][2]");

    // В модалке, выбор файла из папки
    private SelenideElement selectFile = $x("//div/div[@class='s-file-select'][1]//input");
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");

    // Кнопка "Сохранить" в модалке
    private SelenideElement submitInModalBtn = $x("//div[contains(text(),'Сохранить')]/../../../.. //div[@class='col-12 col-sm-auto']");     // кнопка 'Сохранить'

    // Кнопка "Закрыть" в модалке
    private SelenideElement modalCloseBtn = $x("//div[@class='s-modal__head']/div[@class='s-modal__close'][1]");

    // После того как выбрали файл, можно его удалить, нажав на белую кнопку
    private SelenideElement deleteFileBtn = $x("//button[@type='button']//i[@class='s-ico--thm-close s-ico s-pos-on-left']/../..");        // кнопка 'Удалить файл'

    private SelenideElement mainPageLink  = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public DocumentFlowLetterCreateAndSubmitPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Отправить письмо"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

