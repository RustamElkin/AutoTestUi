// Календарно-тематические планы
//  /ru/tko/control/calendar-thematic-plan

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CalendarThematicPlansPage {

    // Тайтл
    private SelenideElement titleToPage         = $x("//h1[contains(text(),'Календарно-тематические планы')]");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn    = $x("//span[contains(text(),'Фильтрация списка')]/..");
    private SelenideElement addBtn              = $x("//div[text() = 'Добавить']/..");

    private SelenideElement applyBtn            = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn            = $x("//span[contains(text(),'Сбросить')]/..");

    // Фильтр Инпуты
    private SelenideElement nameInput           = $x("//label[contains(text(),'Название')]/following-sibling::input");                                  // 'Название'
    private SelenideElement groupInput          = $x("//label[contains(text(),'Группа')]/following-sibling::div//input[@name='group_id']");             // 'Группа'
    private SelenideElement disciplineInput     = $x("//label[contains(text(),'Дисциплина')]/following-sibling::div//input[@name='discipline_Id']");    // 'Дисциплина'
    private SelenideElement moduleIndexInput    = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div//input[@name='personnel_id']");  // 'Преподаватель'

    // Dropdown фильтры
    private SelenideElement groupDropdown       = $x("//label[contains(text(),'Группа')]/following-sibling::div");             // 'Группа'
    private SelenideElement disciplineDropdown  = $x("//label[contains(text(),'Дисциплина')]/following-sibling::div");         // 'Дисциплина'
    private SelenideElement moduleIndexDropdown = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div");      // 'Преподаватель'

    // List
    private ElementsCollection groupList        = $$x("//label[contains(text(),'Группа')]/following-sibling::div//li/span/span");
    private ElementsCollection disciplineList   = $$x("//label[contains(text(),'Дисциплина')]/following-sibling::div//li/span/span");
    private ElementsCollection teacherList      = $$x("//label[contains(text(),'Преподаватель')]/..//li[@class='multiselect__element']//span/span");

    // Таблица
    private SelenideElement numberTable         = $x("//th[contains(text(),'№')]");                                            // '№'
    private SelenideElement nameTable           = $x("//th[contains(text(),'Название')]");                                     // 'Название'
    private SelenideElement qualificationTable  = $x("//th[contains(text(),'Квалификация')]");                                 // 'Квалификация'
    private SelenideElement groupTable          = $x("//th[contains(text(),'Группа')]");                                       // 'Группа'
    private SelenideElement disciplineTable     = $x("//th[contains(text(),'Дисциплина')]");                                   // 'Дисциплина'
    private SelenideElement operationsTable     = $x("//th[contains(text(),'Операции')]");                                     // 'Операции'

    // Кнопки в таблице, колонка "Операции" | фильтровать по индексу, изменив его
    private ElementsCollection viewBtns         = $$x("//a[@title='Посмотреть']");                                             // Кнопка "Посмотреть"
    private ElementsCollection editBtns         = $$x("//a[@title='Редактровать']");                                           // Кнопка "Редактровать"
    private ElementsCollection deleteBtns       = $$x("//a[@title='Удалить']");                                                // Кнопка "Удалить"

}
