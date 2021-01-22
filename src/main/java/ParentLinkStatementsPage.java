// Заявки на подключение детей
//  /ru/tko/control/parent-link-statements

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ParentLinkStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Заявки на подключение детей')]"));

    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   //'№'
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'ФИО')]"));                                 //'ФИО'
    private SelenideElement parentIINTable = $(byXpath("//th[contains(text(),'ИИН Родителя')]"));                       //'ИИН Родителя'
    private SelenideElement childIINTable = $(byXpath("//th[contains(text(),'ИИН Ребенка')]"));                         //'ИИН Ребенка'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//tr[1]//td//a"));                                                     // Кнопка "Посмотреть"


}
