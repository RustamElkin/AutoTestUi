// Заявление на предоставление общежития  - Прикрепление документов
//  /ru/shy/request/gov-service-statement-files/create?type=3

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementFilesCreate_3_Page {

    // Тайтл
    private SelenideElement titleToPage                             = $x("//div[contains(text(),'Подача заявления')]");

    // Кнопки добавления файлов
    private SelenideElement applicationForPlaceInHostel             = $x("//label[contains(text(), 'Заявление о предоставлении места в общежитии')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement electronicCopyOfTheStatusDocument       = $x("//label[contains(text(), 'Электронная копия документа')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement informationAboutTheDocuments            = $x("//label[contains(text(), 'Сведения о документах')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement informationAboutTheDeathOfParent        = $x("//label[contains(text(), 'Сведения о смерти родителя')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement informationAboutThePresenceInTheFamily  = $x("//label[contains(text(), 'Сведения о наличии в семье')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement informationAboutDisabilityConfirmation  = $x("//label[contains(text(), 'Сведения о подтверждении инвалидности')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement informationForReceivingSocialAssistance = $x("//label[contains(text(), 'Сведения о подтверждении права')]/following-sibling::div/div[contains(text(), 'Добавить')]");

    // Кнопки удаления прикрепленных файлов
    private ElementsCollection removeUploadedFile                   = $$x("//div[contains(@class, 'button_type_file remove_uploaded_file')]");

    // error message
    private SelenideElement emptyApplicationForPlaceInHostel        = $x("//div[contains(text(), 'Заявление о предоставлении места в общежитии') and @class = 's-form__error-message']");

    // Кнопка "Далее"
    private SelenideElement sendFormStatementBtn                    = $x("//button[contains(text(),'Отправить заявку')]");

}
