// Гос. услуги_Заявление студента
//  /ru/tko/control/gov-service-statement/4974

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GovServiceStudentStatementPage {

    // Тайтл
    private SelenideElement titleToPage    = $x("//h1[contains(text(),'Заявление')]");

    // Таб на странице "Назад"
    private SelenideElement backToTab      = $x("//span[contains(text(),'Назад')]/..");

    // Тайтлы в таблицах
    private SelenideElement commonInformationTitle = $x("//span[contains(text(),'Общие сведения')]");
    private SelenideElement documentsTitle = $x("//span[contains(text(),'Документы')]");
    private SelenideElement documentsNotAttachedTitle = $x("//span[contains(text(),'Не были вложены')]");
    private SelenideElement statusTitle    = $x("//span[contains(text(),'Статус')]");

}
