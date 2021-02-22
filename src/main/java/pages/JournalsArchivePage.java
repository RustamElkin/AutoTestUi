package pages;// Архив журналов
//  /ru/tko/control/journals/archive

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class JournalsArchivePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал')]");

    // Табы на странице
    private SelenideElement openTab = $x("//a[contains(text(),'Открытые')]");                                                      // 'Открытые'
    private SelenideElement archiveTab = $x("//a[contains(text(),'Архив')][@href = '/ru/tko/control/journals/archive']");          // 'Архив'
    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");
    // Фильтр Инпуты
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");                       // 'Название'
    private SelenideElement moduleNameInput = $x("//label[contains(text(),'Название модуля')]/following-sibling::input");          // 'Название модуля'
    private SelenideElement moduleIndexInput = $x("//label[contains(text(),'Индекс модуля')]/following-sibling::input");           // 'Индекс модуля'
    // Dropdown фильтр
    private SelenideElement groupDropDown = $x("//label[contains(text(),'Группа')]/following-sibling::div");                       // "Группа"
    private SelenideElement subjectDropDown = $x("//label[contains(text(),'Предмет')]/following-sibling::div");                    // "Предмет"
    private SelenideElement teacherDropDown = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div");              // "Преподаватель"
    private SelenideElement typeDropDown = $x("//label[contains(text(),'Тип')]/following-sibling::div");                           // "Тип"
    private SelenideElement journalTypeDropDown = $x("//label[contains(text(),'Тип журнала')]/following-sibling::div");            // "Тип журнала"
    private SelenideElement programDropDown = $x("//label[contains(text(),'Программа')]/following-sibling::div");                  // "Программа"

    // List
    private ElementsCollection groupList = $$x("//label[contains(text(),'Группа')]/..//li[@class='multiselect__element']//span/span");
    private ElementsCollection subjectList = $$x("//label[contains(text(),'Предмет')]/..//li[@class='multiselect__element']//span/span");
    private ElementsCollection teacherList = $$x("//label[contains(text(),'Преподаватель')]/..//li[@class='multiselect__element']//span/span");
    private ElementsCollection typeList = $$x("//label[contains(text(),'Тип:')]/..//li[@class='multiselect__element']//span/span");                            // "Тип"
    private ElementsCollection journalList = $$x("//label[contains(text(),'Тип журнала:')]/..//li[@class='multiselect__element']//span/span");
    private ElementsCollection programList = $$x("//label[contains(text(),'Программа')]/..//li[@class='multiselect__element']//span/span");

    // Таблица
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                     // '№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                // 'Название'
    private SelenideElement typeTable = $x("//th[contains(text(),'Тип')][1]");                                  // 'Тип'
    private SelenideElement journalTypeTable = $x("//th[contains(text(),'Тип журнала')][1]");                   // 'Тип журнала'
    private SelenideElement trainingProgramTable = $x("//th[contains(text(),'Программа')]");                    // 'Программа'
    private SelenideElement modulesTable= $x("//th[contains(text(),'Модули')]");                                // 'Модули'
    private SelenideElement groupSubgroupTable = $x("//th[contains(text(),'Группа / Подгруппа')]");             // 'Группа / Подгруппа'
    private SelenideElement disciplineTable = $x("//th[contains(text(),'Дисциплина')]");                        // 'Дисциплина'
    private SelenideElement teacherTable = $x("//th[contains(text(),'Преподаватель')]");                        // 'Преподаватель'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                          // 'Операции'

    // Кнопки в таблице, колонка "Операции" | фильтровать по индексу, изменив его
    private SelenideElement viewBtn = $x("(//a[@title='Посмотреть'])[1]");                                      // Кнопка "Посмотреть"
    private SelenideElement restoreBtn = $x("(//a[@title='Восстановить'])[1]");                                 // Кнопка "Восстановить"
    private ElementsCollection viewBtns = $$x("//a[@title='Посмотреть']");
    private ElementsCollection restoreBtns = $$x("//a[@title='Восстановить']");


}
