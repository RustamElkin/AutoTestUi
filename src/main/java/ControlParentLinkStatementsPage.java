// Просмотр заявки
//  /ru/tko/control/parent-link-statements/25

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlParentLinkStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Журнал')]"));

    // Кнопки "Подтвердить" и "Отказать"
    private SelenideElement сonfirmBtn = $(byXpath("//div[@class=\"s-group\"]/a[contains(text(),'Подтвердить')]"));
    private SelenideElement refuseBtn = $(byXpath("//div[@class=\"s-group\"]/a[contains(text(),'Отказать')]"));

    // Таблица
    private SelenideElement commonInformationInTable = $(byXpath("//h4/span[contains(text(),'Общие сведения')]"));                                                                        //'Активность'
    private SelenideElement informationAboutTheChildInTable = $(byXpath("//h4/span[contains(text(),'Информация о ребенке')]"));                                  //'Мониторинг активности колледжей'
    private SelenideElement documentsInTable = $(byXpath("//h4/span[contains(text(),'Документы')]"));                                                                      //'Успеваемость'

}
