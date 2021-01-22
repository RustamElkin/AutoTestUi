// Учебный план
//  /ru/tko/control/curriculum

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlCurriculumPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Учебный план')]"));


    // Табы на странице
    private SelenideElement educationalPlanTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span/.."));                           // 'Учебный план'
    private SelenideElement studyProgressGraphTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'ГУП')]/.."));   // 'ГУП'

    // Кнопка Создать РУП
    private SelenideElement creatingNewRUPBtn = $(byXpath("//span[contains(text(),'Создать РУП')]/.."));

    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   //'№'
    private SelenideElement specialtyTable = $(byXpath("//th[contains(text(),'Специальность')]"));                      //'Специальность'
    private SelenideElement qualificationTable = $(byXpath("//th[contains(text(),'Квалификация')]"));                   //'Квалификация'
    private SelenideElement CreatorTable = $(byXpath("//th[contains(text(),'Создатель')]"));                            //'Создатель'
    private SelenideElement dateOfCreationTable = $(byXpath("//th[contains(text(),'Дата создания')]"));                 //'Дата создания'
    private SelenideElement startYearOfTable = $(byXpath("//th[contains(text(),'Год начала обучения')]"));              //'Год начала обучения'
    private SelenideElement statusTable = $(byXpath("//th[contains(text(),'Статус')]"));                                //'Статус'
    private SelenideElement actionTable = $(byXpath("//th[contains(text(),'Действие')]"));                             //'Действие'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//span[@class=\"s-ico s-ico--thm-eye\"]/../.. /a"));                   // Первая кнопка просмотра
    private SelenideElement editBtn = $(byXpath("//span[@class=\"s-ico s-ico--thm-pencil\"]/.."));                      // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("//span[@class=\"s-ico s-ico--thm-trash\"]/.."));                     // Кнопка "Удалить"




}
