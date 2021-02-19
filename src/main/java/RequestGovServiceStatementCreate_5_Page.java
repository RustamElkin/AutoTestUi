// Заявление на перевод/восстановление   - Сведения об абитуриенте
//  /ru/shy/college/19195/gov-service-statement/create?type=5

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementCreate_5_Page {

    // Тайтл
    private SelenideElement titleToPage               = $x("//div[contains(text(),'Подача заявления')]");

    // dropdown
    private SelenideElement TypeOfTransferDropdown    = $x("//label[contains(text(), 'Тип перевода')]/following-sibling::div[@name = 'statement[reason_transfer]']");

    // input
    private SelenideElement TypeOfTransferInput       = $x("//label[contains(text(), 'Тип перевода')]/following-sibling::div//input");

    // growl-message Если уже подавали заявку на данную гос. услугу
    private SelenideElement youSendingGovServiceGrowl = $x("//div[@class = 'growl-message']");

    // Поля в таблице залочены и заполнены по умолчанию
    // Кнопка "Далее"
    private SelenideElement nextBtn                   = $x("//button[contains(text(),'Далее')]");

}
