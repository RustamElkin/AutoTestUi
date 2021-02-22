package pages;// Заявление на предоставление бесплатного питания - Сведения об абитуриенте
//   /ru/shy/request/gov-service-statement/create?type=0

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementCreate_0_Page {

    // Тайтл
    private SelenideElement titleToPage               = $x("//div[contains(text(),'Подача заявления')]");

    // Поля в таблице залочены и заполнены по умолчанию
    // Кнопка "Далее"
    private SelenideElement nextBtn                   = $x("//button[contains(text(),'Далее')]");

}
