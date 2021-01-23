// Заявки на подключение детей
//  /ru/tko/control/parent-link-statements

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ParentLinkStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Заявки на подключение детей')]");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   //'№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                 //'ФИО'
    private SelenideElement parentIINTable = $x("//th[contains(text(),'ИИН Родителя')]");                       //'ИИН Родителя'
    private SelenideElement childIINTable = $x("//th[contains(text(),'ИИН Ребенка')]");                         //'ИИН Ребенка'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]//td//a");                                                     // Кнопка "Посмотреть"


}
