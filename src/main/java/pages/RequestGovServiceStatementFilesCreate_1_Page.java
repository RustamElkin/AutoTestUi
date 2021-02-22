package pages;//  Заявление на подачу заявление на академический отпуск - Прикрепление документов
//  /ru/shy/request/gov-service-statement-files/create?type=1

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementFilesCreate_1_Page {

    // Тайтл
    private SelenideElement titleToPage                   = $x("//div[contains(text(),'Подача заявления')]");

    // Кнопки добавления файлов
    private SelenideElement FreeFormApplicationFileAddBtn = $x("//label[contains(text(), 'Заявление в свободной форме')]/following-sibling::div/div[contains(text(), 'Добавить')]");
    private SelenideElement decisionCommissionAddBtn      = $x("//label[contains(text(), 'Решение Централизованной врачебно')]/following-sibling::div/div[contains(text(), 'Добавить')]");

    // Кнопки удаления прикрепленных файлов
    private ElementsCollection removeUploadedFile         = $$x("//div[contains(@class, 'button_type_file remove_uploaded_file')]");

    // error message
    private SelenideElement emptyFreeFormApplicationFile  = $x("//div[contains(text(), 'Заявление в свободной форме') and @class='s-form__error-message']");
    private SelenideElement emptyDecisionCommissionFile   = $x("//div[contains(text(), 'Решение Централизованной врачебно') and @class='s-form__error-message']");

    // Кнопка "Далее"
    private SelenideElement sendFormStatementBtn          = $x("//button[contains(text(),'Отправить заявку')]");
}
