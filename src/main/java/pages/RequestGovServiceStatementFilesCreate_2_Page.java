package pages;// Заявление на выдачу справки о неоконченном образовании  - Прикрепление документов
//  /ru/shy/request/gov-service-statement-files/create?type=2

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementFilesCreate_2_Page {

    // Тайтл
    private SelenideElement titleToPage           = $x("//div[contains(text(),'Подача заявления')]");

    // Кнопки добавления файлов
    private SelenideElement applicationFileAddBtn = $x("//label[contains(text(), 'Заявление установленной формы')]/following-sibling::div/div[contains(text(), 'Добавить')]");

    // Кнопки удаления прикрепленных файлов
    private ElementsCollection removeUploadedFile = $$x("//div[contains(@class, 'button_type_file remove_uploaded_file')]");

    // error message
    private SelenideElement emptyApplicationFile  = $x("//div[contains(text(), 'Заявление установленной формы') and @class = 's-form__error-message']");

    // Кнопка "Далее"
    private SelenideElement sendFormStatementBtn  = $x("//button[contains(text(),'Отправить заявку')]");
}
