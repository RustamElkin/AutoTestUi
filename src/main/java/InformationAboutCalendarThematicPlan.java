// Сведения о КТП
//  /ru/tko/control/calendar-thematic-plan/3

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class InformationAboutCalendarThematicPlan {

    // Тайтл
    private SelenideElement titleToPage           = $x("//h1[contains(text(),'Сведения о календарно-тематическом плане')]");

    // Табы на странице
    private SelenideElement openTab               = $x("//a[contains(@class, 'container-content-head__tab-item')]");                     // 'Назад'

    // Кнопки
    private SelenideElement addBtn                = $x("//span[contains(text(), 'Добавить')]/..");
    private SelenideElement exportBtn             = $x("//span[contains(text(), 'Экспортировать')]/..");

    // Таблица
    private SelenideElement numberTable           = $x("//th[contains(text(),'#')]");                                                    // '#'
    private SelenideElement dateTable             = $x("//th[contains(text(),'Дата')]");                                                 // 'Дата'
    private SelenideElement themeTable            = $x("//th[contains(text(),'Наименование темы')]");                                    // 'Наименование темы'
    private SelenideElement hourCountTable        = $x("//th[contains(text(),'Количество часов')]");                                     // 'Количество часов'
    private SelenideElement typeOfLessonsTable    = $x("//th[contains(text(),'Тип занятия')]");                                          // 'Тип занятия'
    private SelenideElement assignedHomeworkTable = $x("//th[contains(text(),'Домашнее задание')]");                                     // 'Домашнее задание'
    private SelenideElement notationTable         = $x("//th[contains(text(),'Примечание')]");                                           // 'Примечание'
    private SelenideElement operationsTable       = $x("//th[contains(text(),'Операции')]");                                             // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private ElementsCollection editBtns           = $$x("//span[contains(@class, 's-ico--thm-pencil')]/..");                             // Кнопи "Редактировать"
    private SelenideElement deleteBtns            = $x("//span[contains(@class, 's-ico--thm-trash')]/..");                               // Кнопки "Удалить"

    // Модалка
    // Инпуты в модалке
    private SelenideElement nameInput             = $x("//label[contains(text(),'Название')]/following-sibling::div//input");            // 'Тип'
    private SelenideElement dateInput             = $x("//label[contains(text(),'Дата')]/following-sibling::div//input");                // 'Предмет'
    private SelenideElement hourCountInput        = $x("//label[contains(text(),'Количество часов')]/following-sibling::div//input");    // 'Тип'
    private SelenideElement typeOfLessonsInput    = $x("//label[contains(text(),'Тип занятия')]/following-sibling::div//input");         // 'Предмет'
    private SelenideElement assignedHomework      = $x("//label[contains(text(),'Домашнее задание')]/following-sibling::div//input");    // 'Тип'
    private SelenideElement notationInput         = $x("//label[contains(text(),'Примечание')]/following-sibling::div//input");          // 'Предмет'
    // Кнопки
    private SelenideElement closeBtn              = $x("(//div[@class='s-modal__close'])[1]");
    private SelenideElement cancelBtn             = $x("//button[contains(text(), 'Отмена') and contains(@class, 's-btn--thm-blue')]");
    private SelenideElement approveBtn            = $x("//button[contains(text(), 'Отмена') and contains(@class, 's-btn--thm-blue')]/following-sibling::button");
}
