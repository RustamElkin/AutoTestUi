// Заявление на предоставление бесплатного питания - Прикрепление документов
//   /ru/shy/request/gov-service-statement-files/create?type=0

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementFilesCreate_0_Page {

    // Тайтл
    private SelenideElement titleToPage                        = $x("//div[contains(text(),'Подача заявления')]");

    // Кнопки добавления файлов
    private SelenideElement applicationFileAddBtn              = $x("//label[contains(text(), 'Заявление установленной формы: ')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement birthCertificateFileAddBtn         = $x("//label[contains(text(), 'Свидетельство о рождении')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement guardianshipFileAddBtn             = $x("//label[contains(text(), 'для детей-сирот и детей,')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement disabilityCertificatesFileAddBtn   = $x("//label[contains(text(), 'инвалидам и инвалидам с детства')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement targetedSocialAssistanceFileAddBtn = $x("//label[contains(text(), 'адресной социальной помощи')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement incomeReceivedFileAddBtn           = $x("//label[contains(text(), 'Сведения о полученных доходах')]/following-sibling::div/div[contains(text(), 'Добавить')]");

    // Кнопки удаления прикрепленных файлов
    private ElementsCollection removeUploadedFile              = $$x("//div[contains(@class, 'button_type_file remove_uploaded_file')]");

    // error message
    private SelenideElement emptyApplicationFile               = $x("//div[contains(text(), 'Заявление установленной формы') and @class='s-form__error-message']");

    // Кнопка "Далее"
    private SelenideElement sendFormStatementBtn               = $x("//button[contains(text(),'Отправить заявку')]");

}
