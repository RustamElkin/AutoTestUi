// Просмотр заявки
//  /ru/tko/control/parent-link-statements/25

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ControlParentLinkStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал')]");

    // Кнопки "Подтвердить" и "Отказать"
    private SelenideElement confirmBtn = $x("//div[@class=\"s-group\"]/a[contains(text(),'Подтвердить')]");
    private SelenideElement refuseBtn = $x("//div[@class=\"s-group\"]/a[contains(text(),'Отказать')]");

    // Таблица
    private SelenideElement commonInformationInTable = $x("//h4/span[contains(text(),'Общие сведения')]");                                                                        //'Активность'
    private SelenideElement informationAboutTheChildInTable = $x("//h4/span[contains(text(),'Информация о ребенке')]");                                  //'Мониторинг активности колледжей'
    private SelenideElement documentsInTable = $x("//h4/span[contains(text(),'Документы')]");                                                                      //'Успеваемость'

}
