// Гос. заказ_Заявка
//  /ru/tko/control/gov-order-statement/4977

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GovOrderStatementPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Заявление')]");

    // Таб на странице "Назад"
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");

    // Тайтлы в таблицах
    private SelenideElement commonInformationTitle = $x("//span[contains(text(),'Общие сведения')]");
    private SelenideElement documentsTitle = $x("//span[contains(text(),'Документы')]");
    private SelenideElement statusTitle = $x("//span[contains(text(),'Статус')]");


}
