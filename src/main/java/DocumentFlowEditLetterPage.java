// Документооборот_Редактировать письмо
//  /ru/tko/document-flow/letters/18/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowEditLetterPage {

    // Тайтл
    private SelenideElement titleToPage               = $x("//h1[contains(text(),'Редактировать письмо')]");

    // Табы на странице
    private SelenideElement backBtnTab                = $x("//span[contains(text(),'Назад')]/..");                     // 'Назад'

    // Инпуты
    private SelenideElement themeLetterInput          = $x("//div[contains(text(),'Тема письма')]/.. //input");        // 'Тема письма'
    private SelenideElement documentNumberInput       = $x("//div[contains(text(),'Номер документа')]/.. //input");    // 'Номер документа'
    private SelenideElement descriptionLetterInput    = $x("//div/textarea[@aria-label='Описание письма']");           // 'Описание письма'
    private SelenideElement searchByOrganizationInput = $x(" input[placeholder='Поиск по организациям']");             // 'Поиск по организациям'

    // Список колледжей //  фильтровать можно по посленему диву или тексту
    private ElementsCollection listOfColleges         = $$x("//div[contains(text(),'Выберите колледж')]/..//div[@class='s-doc-flow-form__organizations-list']/div");

    // Чекбокс
    private SelenideElement selectAllCheckBox         = $x("//input[@type='checkbox']/../..");                         // чекбокс  'Выбрать все'

    // Кнопки
    private SelenideElement cancelBtn                 = $x("//span[contains (text(), 'Отменить')]/..");                // кнопка 'Отменить'
    private SelenideElement downloadBtn               = $x("//button//div[contains(text(),'Загрузить')]/../..");       // кнопка 'Загрузить'

    // Кнопка "Сохранить" активируется после того как будут заполнены обязательные поля
    private SelenideElement submitBtn                 = $x("//button//div[contains(text(),'Сохранить')]/../..");       // кнопка 'Сохранить'

    // Выбор уже имеющегося файла в модалке
    private SelenideElement selectAvailableFile       = $x("//div/div[@class='s-file-select'][2]");

    // В модалке, выбор файла из папки
    private SelenideElement selectFile                = $x("//div[@class='s-file-select']//input");
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");

    // Кнопка Сохранить в модалке
    private SelenideElement submitInModalBtn          = $x("//div[contains(text(),'Сохранить')]/ancestor::button[contains(@class,'s-btn--mw-200' )]");        // кнопка 'Сохранить'

    // Кнопка "Закрыть" в модалке
    private SelenideElement modalCloseBtn             = $x("//div[@class='s-modal__head']/div[contains(text(), 'Вы уверены')]//following-sibling::div[@data-target = '#modal-control-confirm']");

    // После того как выбрали файл, можно его удалить, нажав на белую кнопку
    private ElementsCollection deleteFileBtn          = $$x("//button[@type='button']//i[@class='s-ico--thm-close s-ico s-pos-on-left']/ancestor::button");   // кнопки 'Удалить файл'

}
