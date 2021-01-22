// Документооборот_Оставить заявку
//  /ru/tko/document-flow/statements/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DocumentFlowStatementsCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Оставить заявку')]"));

    // Табы на странице
    private SelenideElement backBtnTab = $(byXpath("//span[contains(text(),'Назад')]/.."));

    // Dropdown list
    private SelenideElement selectDocumentType = $(byXpath("//label[contains(text(),'Тип документа')]/following-sibling::select[@class=\"mb-10 select2-hidden-accessible\"]"));  // 'Тип документа'

    // List Document Type
    private SelenideElement vacationDocumentType = $(byXpath("//li[contains(text(),'Отпуск')]"));
    private SelenideElement applicationPurchaseOfOfficeSuppliesDocumentType = $(byXpath("//li[contains(text(),'Заявка на закуп канцелярских товаров')]"));
    private SelenideElement EquipmentApplicationDocumentType = $(byXpath("//li[contains(text(),'Заявка на оборудование')]"));

    // Кнопки

    // Выбрав тип документа "Отпуск", появится две кнопки "Добавить" файл: 'Заявление на отпуск', 'Удостоверение'.
    private SelenideElement vacationApplicationAddBtn = $(byXpath("//label[contains(text(),'Заявление на отпуск')]/following-sibling::div/div[contains(text(),'Добавить')]"));
    private SelenideElement identityAddBtn = $(byXpath("//label[contains(text(),'Удостоверение')]/following-sibling::div/div[contains(text(),'Добавить')]"));
    private SelenideElement identityDeleteBtn = $(byXpath("//label[contains(text(),'Удостоверение')]/following-sibling::div/div[@class='button button_type_file remove_uploaded_file']"));

    // Выбрав тип документа "Заявка на закуп канцелярских товаров", появится две кнопки "Добавить" файл: 'Удостоверение', 'Заявка на покупку канцелярских товаров'.
    // Кнопка добавить 'Удостоверение' одна  на все три типа документов
    private SelenideElement applicationPurchaseOfOfficeSuppliesAddBtn = $(byXpath("//label[contains(text(),'Заявка на покупку канцелярских товаров')]/following-sibling::div/div[contains(text(),'Добавить')]"));
    private SelenideElement applicationPurchaseOfOfficeSuppliesDeleteBtn = $(byXpath("//label[contains(text(),'Заявка на покупку')]/following-sibling::div/div[@class='button button_type_file remove_uploaded_file']"));
    // Выбрав тип документа "Заявка на оборудование", появится две кнопки "Добавить" файл: 'Удостоверение', 'Заявка на выдачу нового компьютера'.
    private SelenideElement applicationForNewComputerAddBtn = $(byXpath("//label[contains(text(),'Заявка на выдачу нового компьютера')]/following-sibling::div/div[contains(text(),'Добавить')]"));
    private SelenideElement applicationForNewComputerDeleteBtn = $(byXpath("//label[contains(text(),'Заявка на выдачу')]/following-sibling::div/div[@class='button button_type_file remove_uploaded_file']"));


    // Выбор уже имеющегося файла в модалке
    private SelenideElement selectAvailableFile = $(byXpath("//div[@class='row']/div[2]"));

    // В модалке, выбор файла из папки
    private SelenideElement selectFile = $(byXpath("//div/div[@class='row'][1]//input"));
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");

    // Кнопка Сохранить в модалке
    private SelenideElement submitInModalBtn = $(byXpath("//div[contains(text(),'Сохранить')]/../../../.. //div[@class='col-12 col-sm-auto']"));     // кнопка 'Сохранить'

    // Кнопка "Закрыть" в модалке
    private SelenideElement modalCloseBtn = $(byXpath("//div[contains(text(),'Ваши файлы')]/following-sibling::div"));

    // Удаление первого файла, нажав на белую кнопку
    private SelenideElement deleteFileBtn = $(byXpath("//div[@class='button button_type_file remove_uploaded_file']"));                              // кнопка 'Удалить файл'

    // Кнопка "Отправить"
    private SelenideElement submitBtn = $(byXpath("//button[@type='submit']"));                                                                      // кнопка 'Отправить'


}

