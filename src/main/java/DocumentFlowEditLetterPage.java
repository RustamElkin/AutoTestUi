// Документооборот_Редактировать письмо
//  /ru/tko/document-flow/letters/18/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DocumentFlowEditLetterPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Редактировать письмо')]"));

    // Табы на странице
    private SelenideElement backBtnTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                             // 'Назад'

    // Инпуты
    private SelenideElement themeLetterInput = $(byXpath("//div[contains(text(),'Тема письма')]/.. //input"));         // 'Тема письма'
    private SelenideElement documentNumberInput = $(byXpath("//div[contains(text(),'Номер документа')]/.. //input"));   // 'Номер документа'
    private SelenideElement descriptionLetterInput = $(byXpath("//div/textarea[@aria-label='Описание письма']"));       // 'Описание письма'
    private SelenideElement searchByOrganizationInput = $(byXpath(" input[placeholder='Поиск по организациям']"));      // 'Поиск по организациям'

    // Список колледжей //  фильтровать можно по посленему диву или тексту
    private ElementsCollection listOfColleges = $$(byXpath("//div[contains(text(),'Выберите колледж')]/..//div[@class='s-doc-flow-form__organizations-list']/div"));

    // Чекбокс
    private SelenideElement selectAllCheckBox = $(byXpath("//input[@type=\"checkbox\"]/../.."));                        // чекбокс  'Выбрать все'

    // Кнопки
    private SelenideElement cancelBtn = $(byXpath("//span[contains (text(), 'Отменить')]/.."));                         // кнопка 'Отменить'
    private SelenideElement downloadBtn = $(byXpath("//button//div[contains(text(),'Загрузить')]/../.."));              // кнопка 'Загрузить'

    // Кнопка "Сохранить" активируется после того как будут заполнены обязательные поля
    private SelenideElement submitBtn = $(byXpath("//button//div[contains(text(),'Сохранить')]/../.."));                // кнопка 'Сохранить'

    // Выбор уже имеющегося файла в модалке
    private SelenideElement selectAvailableFile = $(byXpath("//div/div[@class='s-file-select'][2]"));

    // В модалке, выбор файла из папки
    private SelenideElement selectFile = $(byXpath("//div/div[@class='s-file-select'][1]//input"));
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");

    // Кнопка Сохранить в модалке
    private SelenideElement submitInModalBtn = $(byXpath("//div[contains(text(),'Сохранить')]/../../../.. //div[@class=\"col-12 col-sm-auto\"]"));     // кнопка 'Сохранить'

    // Кнопка "Закрыть" в модалке
    private SelenideElement modalCloseBtn = $(byXpath("//div[@class='s-modal__head']/div[@class='s-modal__close'][1]"));

    // После того как выбрали файл, можно его удалить, нажав на белую кнопку
    private SelenideElement deleteFileBtn = $(byXpath("//button[@type=\"button\"]//i[@class=\"s-ico--thm-close s-ico s-pos-on-left\"]/../.."));        // кнопка 'Удалить файл'

}
