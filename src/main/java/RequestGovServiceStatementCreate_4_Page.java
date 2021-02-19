// Заявление на выдачу дубликатов документов   - Сведения об абитуриенте
//  /ru/shy/college/19195/gov-service-statement/create?type=4

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementCreate_4_Page {

    // Тайтл
    private SelenideElement titleToPage               = $x("//div[contains(text(),'Подача заявления')]");

    // Поля в таблице залочены и заполнены по умолчанию
    // Кнопка "Далее"
    private SelenideElement nextBtn                   = $x("//button[contains(text(),'Далее')]");

}
