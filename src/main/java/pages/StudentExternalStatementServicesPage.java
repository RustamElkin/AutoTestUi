package pages;// Заявки с внешних сервисов_Сведения
//  /ru/tko/control/external-statement-services/311

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StudentExternalStatementServicesPage {

    // Тайтл
    private SelenideElement titleToPage      = $x("//h1[contains(text(),'Заявки на гос.услуги с внешних сервисов')]");

    // Табы на странице
    private SelenideElement backTab          = $x("//span[contains(text(),'Назад')]/..");

    // Кнопки
    private SelenideElement approveBtn       = $x("//div[contains(text(),'Подтвердить')]");
    private SelenideElement RejectBtn        = $x("//div[contains(text(),'Отклонить')]");

    // Тайтлы таблиц
    private SelenideElement  student_info    = $x("//h3[contains(text(),'Сведения об абитуриенте')]");
    private SelenideElement  documentsInfo   = $x("//h3[contains(text(),'Документы')]");
    private SelenideElement  educationInfo   = $x("//h3[contains(text(),'Сведения о заявке')]");

    // Модалка - Подтвердить
    // Кнопки
    private SelenideElement closeBtn         = $x("//label[contains(text(),'Кабинет услугодателя')]/ancestor::div[@class='s-modal__container']//div[@class = 's-modal__close']");
    private SelenideElement sendBtn          = $x("//div[@class='s-group']/div[contains(@class,'s-btn--thm-green') and text() = 'Отправить']");
    private SelenideElement cancelBtn        = $x("//div[@class='s-group']/div[contains(@class,'s-btn--thm-grey') and text() = 'Отмена']");

    // Инпут
    private SelenideElement cabinetNumInput  = $x("//input[@name='cabinet_num']");                         // 'Кабинет услугодателя'

    // Модалка - Отклонить
    private SelenideElement  rejectionReason = $x("//select[@id='code']");                                 // 'Причина отказа'
    private SelenideElement  textarea        = $x("//textarea[contains(@class,'s-form__textarea mb-10')]");



}
