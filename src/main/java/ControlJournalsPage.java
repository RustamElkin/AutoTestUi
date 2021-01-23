// Журналы
//  /ru/tko/control/journals

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ControlJournalsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал')]");

    // Табы на странице
    private SelenideElement openListTab = $x("//a[contains(text(),'Открытые')]");                                                      // 'Открытые'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]/a[contains(text(),'Архив')]");     // 'Архив'

    // Кнопка "Добавить"
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");           // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                           // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                            // 'Сбросить'

    // Фильтр Инпуты
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");                // 'Название'
    private SelenideElement moduleNameInput = $x("//label[contains(text(),'Название модуля')]/following-sibling::input");   // 'Название модуля'
    private SelenideElement moduleIndexInput = $x("//label[contains(text(),'Индекс модуля')]/following-sibling::input");    // 'Индекс модуля'


    //Dropdown фильтры
    private SelenideElement selectGroupDropDownList = $x("//label[contains(text(),'Группа')]/following-sibling::div");                   // "Группа"
    private SelenideElement selectSubjectDropDownList = $x("//label[contains(text(),'Предмет')]/following-sibling::div");                // "Предмет"
    private SelenideElement selectTeacherDropDownList = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div");          // "Преподаватель"
    private SelenideElement selectTypeDropDownList = $x("//label[contains(text(),'Тип')]/following-sibling::div");                       // "Тип"
    private SelenideElement selectJournalTypeDropDownList = $x("//label[contains(text(),'Тип журнала')]/following-sibling::div");        // "Тип журнала"
    private SelenideElement selectProgramDropDownList = $x("//label[contains(text(),'Программа')]/following-sibling::div");              // "Программа"


    // Таблица
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                     // '№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                // 'Название'
    private SelenideElement TypeTable = $x("//th[contains(text(),'Тип')][1]");                                  // 'Тип'
    private SelenideElement journalTypeTable = $x("//th[contains(text(),'Тип журнала')][1]");                   // 'Тип журнала'
    private SelenideElement trainingProgramTable = $x("//th[contains(text(),'Программа')]");                    // 'Программа'
    private SelenideElement modulesTable= $x("//th[contains(text(),'Модули')]");                                // 'Модули'
    private SelenideElement groupSubgroupTable = $x("//th[contains(text(),'Группа / Подгруппа')]");             // 'Группа / Подгруппа'
    private SelenideElement disciplineTable = $x("//th[contains(text(),'Дисциплина')]");                        // 'Дисциплина'
    private SelenideElement teacherTable = $x("//th[contains(text(),'Преподаватель')]");                        // 'Преподаватель'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                          // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]/td[10]//a[@title=\"Посмотреть\"]");                           // Кнопка "Посмотреть"
    private SelenideElement editBtn = $x("//tr[1]/td[10]//a[@title=\"Редактировать\"]");                        // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("//tr[1]/td[10]//a[@title=\"Удалить\"]");                            // Кнопка "Удалить"

    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'‹')]");        // не работает на первой (текущей) странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'7')]");
    private SelenideElement eighthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'8')]");
    private SelenideElement nextPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'›')]");


}
