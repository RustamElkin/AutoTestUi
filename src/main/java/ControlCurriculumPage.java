// Учебный план
//  /ru/tko/control/curriculum

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ControlCurriculumPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[@class=\"s-title-head\"][contains(text(),'Учебный план')]");


    // Табы на странице
    private SelenideElement educationalPlanTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span/..");                              // 'Учебный план'
    private SelenideElement studyProgressGraphTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'ГУП')]/..");   // 'ГУП'

    // Кнопка Создать РУП
    private SelenideElement creatingNewRUPBtn = $x("//span[contains(text(),'Создать РУП')]/..");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   // '№'
    private SelenideElement specialtyTable = $x("//th[contains(text(),'Специальность')]");                      // 'Специальность'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                   // 'Квалификация'
    private SelenideElement CreatorTable = $x("//th[contains(text(),'Создатель')]");                            // 'Создатель'
    private SelenideElement dateOfCreationTable = $x("//th[contains(text(),'Дата создания')]");                 // 'Дата создания'
    private SelenideElement startYearOfTable = $x("//th[contains(text(),'Год начала обучения')]");              // 'Год начала обучения'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                                // 'Статус'
    private SelenideElement actionTable = $x("//th[contains(text(),'Действие')]");                              // 'Действие'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//span[@class=\"s-ico s-ico--thm-eye\"]/../.. /a");                   // Первая кнопка просмотра
    private SelenideElement editBtn = $x("//span[@class=\"s-ico s-ico--thm-pencil\"]/..");                      // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("//span[@class=\"s-ico s-ico--thm-trash\"]/..");                     // Кнопка "Удалить"




}
