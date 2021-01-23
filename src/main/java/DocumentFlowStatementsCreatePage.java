// Документооборот_Оставить заявку
//  /ru/tko/document-flow/statements/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DocumentFlowStatementsCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Оставить заявку')]");

    // Табы на странице
    private SelenideElement backBtnTab = $x("//span[contains(text(),'Назад')]/..");

    // Dropdown list
    private SelenideElement selectDocumentType = $x("//label[contains(text(),'Тип документа')]/following-sibling::select[@class=\"mb-10 select2-hidden-accessible\"]");  // 'Тип документа'

    // List Document Type
    private SelenideElement vacationDocumentType = $x("//li[contains(text(),'Отпуск')]");
    private SelenideElement applicationPurchaseOfOfficeSuppliesDocumentType = $x("//li[contains(text(),'Заявка на закуп канцелярских товаров')]");
    private SelenideElement equipmentApplicationDocumentType = $x("//li[contains(text(),'Заявка на оборудование')]");

    // Кнопки

    // Выбрав тип документа "Отпуск", появится две кнопки "Добавить" файл: 'Заявление на отпуск', 'Удостоверение'.
    private SelenideElement vacationApplicationAddBtn = $x("//label[contains(text(),'Заявление на отпуск')]/following-sibling::div/div[contains(text(),'Добавить')]");
    private SelenideElement identityAddBtn = $x("//label[contains(text(),'Удостоверение')]/following-sibling::div/div[contains(text(),'Добавить')]");
    private SelenideElement identityDeleteBtn = $x("//label[contains(text(),'Удостоверение')]/following-sibling::div/div[@class='button button_type_file remove_uploaded_file']");

    // Выбрав тип документа "Заявка на закуп канцелярских товаров", появится две кнопки "Добавить" файл: 'Удостоверение', 'Заявка на покупку канцелярских товаров'.
    // Кнопка добавить 'Удостоверение' одна  на все три типа документов
    private SelenideElement applicationPurchaseOfOfficeSuppliesAddBtn = $x("//label[contains(text(),'Заявка на покупку канцелярских товаров')]/following-sibling::div/div[contains(text(),'Добавить')]");
    private SelenideElement applicationPurchaseOfOfficeSuppliesDeleteBtn = $x("//label[contains(text(),'Заявка на покупку')]/following-sibling::div/div[@class='button button_type_file remove_uploaded_file']");
    // Выбрав тип документа "Заявка на оборудование", появится две кнопки "Добавить" файл: 'Удостоверение', 'Заявка на выдачу нового компьютера'.
    private SelenideElement applicationForNewComputerAddBtn = $x("//label[contains(text(),'Заявка на выдачу нового компьютера')]/following-sibling::div/div[contains(text(),'Добавить')]");
    private SelenideElement applicationForNewComputerDeleteBtn = $x("//label[contains(text(),'Заявка на выдачу')]/following-sibling::div/div[@class='button button_type_file remove_uploaded_file']");


    // Выбор уже имеющегося файла в модалке
    private SelenideElement selectAvailableFile = $x("//div[@class='row']/div[2]");

    // В модалке, выбор файла из папки
    private SelenideElement selectFile = $x("//div/div[@class='row'][1]//input");
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");

    // Кнопка Сохранить в модалке
    private SelenideElement submitInModalBtn = $x("//div[contains(text(),'Сохранить')]/../../../.. //div[@class='col-12 col-sm-auto']");     // кнопка 'Сохранить'

    // Кнопка "Закрыть" в модалке
    private SelenideElement modalCloseBtn = $x("//div[contains(text(),'Ваши файлы')]/following-sibling::div");

    // Удаление первого файла, нажав на белую кнопку
    private SelenideElement deleteFileBtn = $x("//div[@class='button button_type_file remove_uploaded_file']");                              // кнопка 'Удалить файл'

    // Кнопка "Отправить"
    private SelenideElement submitBtn = $x("//button[@type='submit']");                                                                      // кнопка 'Отправить'


}

