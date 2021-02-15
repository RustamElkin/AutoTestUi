// Просмотр заявки с внешних сервисов
//  /ru/tko/control/external-statements/10

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ReviewExternalStatementPage {

    // Тайтл
    private SelenideElement titleToPage      = $x("//h1[contains(text(),'Просмотр заявки с внешних сервисов')]");

    // Табы на странице
    private SelenideElement backTab          = $x("//span[contains(text(),'Назад')]/..");

    // Кнопки
    private SelenideElement approveBtn       = $x("//div[contains(text(),'Подтвердить')]");
    private SelenideElement RejectBtn        = $x("//div[contains(text(),'Отклонить')]");

    // Тайтлы таблиц
    private SelenideElement  parentInfo      = $x("//h3[contains(text(),'Сведения о законом представителе')]");
    private SelenideElement  student_info    = $x("//h3[contains(text(),'Сведения об абитуриенте')]");
    private SelenideElement  educationInfo   = $x("//h3[contains(text(),'Сведения об образовании')]");
    private SelenideElement  documentsInfo   = $x("//h3[contains(text(),'Документы')]");

    // Модалка - Подтвердить
    // Кнопки
    private SelenideElement closeBtn         = $x("//label[contains(text(),'бесплатное питание')]/ancestor::div[@class='s-modal__container']//div[@class = 's-modal__close']");
    private SelenideElement cancelBtn        = $x("//div[@class='s-btn s-btn--thm-grey s-btn--w-150' and text() = 'Отмена']");
    private SelenideElement sendBtn          = $x("//div[contains(@class,'s-btn--thm-green') and text()= 'Отправить' and @data-action='send-ajax']");

    // Чекбоксы в модалке
    private SelenideElement freeFoodTrue     = $x("//input[@name='free-food' and @value='true']");
    private SelenideElement freeFoodFalse    = $x("//input[@name='free-food' and @value='false']");

    // Модалка - Отклонить
    private SelenideElement  rejectionReason = $x("//select[@id='code']");                                 // 'Причина отказа'
    private SelenideElement  textarea        = $x("//textarea[contains(@class,'s-form__textarea mb-10')]");


}
