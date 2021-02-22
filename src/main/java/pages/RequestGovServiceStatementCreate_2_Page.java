package pages;// Заявление на выдачу справки о неоконченном образовании  - Сведения об абитуриенте
//  /ru/shy/college/19195/gov-service-statement/create?type=2

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RequestGovServiceStatementCreate_2_Page {

    // Тайтл
    private SelenideElement titleToPage = $x("//div[contains(text(),'Подача заявления')]");

    // Поля в таблице залочены и заполнены по умолчанию
    // Кнопка "Далее"
    private SelenideElement nextBtn     = $x("//button[contains(text(),'Далее')]");


}
