package pages;//  Заявление на подачу заявление на академический отпуск - Сведения об абитуриенте
//  /ru/shy/request/gov-service-statement/create?type=1

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementCreate_1_Page {

    // Тайтл
    private SelenideElement titleToPage               = $x("//div[contains(text(),'Подача заявления')]");

    // dropdown
    private SelenideElement reasonLeaveDropdown       = $x("//label[contains(text(), 'предоставления академического отпуска')]/following-sibling::div[@name='statement[reason_leave]']");

    // input
    private SelenideElement reasonLeaveInput          = $x("//label[contains(text(), 'предоставления академического отпуска')]/following-sibling::div//input");

    // growl-message Если уже подавали заявку на данную гос. услугу
    private SelenideElement youSendingGovServiceGrowl = $x("//div[@class='growl-message']");

    // Поля в таблице залочены и заполнены по умолчанию
    // Кнопка "Далее"
    private SelenideElement nextBtn                   = $x("//button[contains(text(),'Далее')]");

}
