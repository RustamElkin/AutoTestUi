package pages;// Документооборот_Отправить приказ
//  /ru/tko/document-flow/orders/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowOrdersCreatePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Отправить приказ')]");

    // Табы на странице
    private SelenideElement backBtnTab = $x("//span[contains(text(),'Назад')]/..");                             // 'Назад'

    // Инпуты
    private SelenideElement themeOrderInput = $x("//div[contains(text(),'Название приказа')]/.. //input");      // 'Название приказа'
    private SelenideElement orderNumberInput = $x("//div[contains(text(),'Номер приказа')]/.. //input");        // 'Номер приказа'
    private SelenideElement descriptionOrderInput = $x("//div/textarea[@aria-label='Описание приказа']");       // 'Описание приказа'
    private SelenideElement searchByOrganizationInput = $x("input[placeholder='Поиск по организациям']");       // 'Поиск по организациям'

    // Список колледжей //  фильтровать можно по посленему диву или тексту
    private ElementsCollection listOfColleges = $$x("//div[contains(text(),'Выберите колледж')]/..//div[@class='s-doc-flow-form__organizations-list']/div");

    // Чекбокс
    private SelenideElement selectAllCheckBox = $x("//input[@type=\"checkbox\"]/../..");                        // чекбокс  'Выбрать все'

    // Кнопки
    private SelenideElement cancelBtn = $x("//span[contains (text(), 'Отменить')]/..");                         // кнопка 'Отменить'
    private SelenideElement downloadBtn = $x("//button//div[contains(text(),'Загрузить')]/../..");              // кнопка 'Загрузить'

    // Кнопка "Сохранить" активируется после того как будут заполнены обязательные поля
    private SelenideElement sendOrderBtn = $x("//button//div[contains(text(),'Отправить приказ')]/../..");         // кнопка 'Отправить приказ'

    // Выбор уже имеющегося файла в модалке
    private SelenideElement selectAvailableFile = $x("//div/div[@class='s-file-select'][2]");

    // В модалке, выбор файла из папки
    private SelenideElement selectFile = $x("//div/div[@class='s-file-select'][1]//input");
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");

    // Кнопка Сохранить в модалке
    private SelenideElement submitInModalBtn = $x("//div[contains(text(),'Сохранить')]/../../../.. //div[@class=\"col-12 col-sm-auto\"]");     // кнопка 'Сохранить'

    // Кнопка "Закрыть" в модалке
    private SelenideElement modalCloseBtn = $x("//div[@class='s-modal__head']/div[@class='s-modal__close'][1]");

    // После того как выбрали файл, можно его удалить, нажав на белую кнопку
    private SelenideElement deleteFileBtn = $x("//button[@type=\"button\"]//i[@class=\"s-ico--thm-close s-ico s-pos-on-left\"]/../..");        // кнопка 'Удалить файл'

}
