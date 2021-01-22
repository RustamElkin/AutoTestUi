// Журналы
//  /ru/tko/control/journals

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlJournalsPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Журнал')]"));

    // Табы на странице
    private SelenideElement openListTab = $(byXpath("//a[contains(text(),'Открытые')]"));                                                      // 'Открытые'
    private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]/a[contains(text(),'Архив')]"));     // 'Архив'

    // Кнопка "Добавить"
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));           // 'Фильтрация списка'
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));                           // 'Применить'
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));                            // 'Сбросить'

    // Фильтр Инпуты
    private SelenideElement nameInput = $(byXpath("//label[contains(text(),'Название')]/following-sibling::input"));                // 'Название'
    private SelenideElement moduleNameInput = $(byXpath("//label[contains(text(),'Название модуля')]/following-sibling::input"));   // 'Название модуля'
    private SelenideElement moduleIndexInput = $(byXpath("//label[contains(text(),'Индекс модуля')]/following-sibling::input"));    // 'Индекс модуля'


    //Dropdown фильтры
    private SelenideElement selectGroupDropDownList = $(byXpath("//label[contains(text(),'Группа')]/following-sibling::div"));                   //"Группа"
    private SelenideElement selectSubjectDropDownList = $(byXpath("//label[contains(text(),'Предмет')]/following-sibling::div"));                //"Предмет"
    private SelenideElement selectTeacherDropDownList = $(byXpath("//label[contains(text(),'Преподаватель')]/following-sibling::div"));          //"Преподаватель"
    private SelenideElement selectTypeDropDownList = $(byXpath("//label[contains(text(),'Тип')]/following-sibling::div"));                       //"Тип"
    private SelenideElement selectJournalTypeDropDownList = $(byXpath("//label[contains(text(),'Тип журнала')]/following-sibling::div"));        //"Тип журнала"
    private SelenideElement selectProgramDropDownList = $(byXpath("//label[contains(text(),'Программа')]/following-sibling::div"));               //"Программа"


    // Таблица
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                     //'№'
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Название')]"));                                //'Название'
    private SelenideElement TypeTable = $(byXpath("//th[contains(text(),'Тип')][1]"));                           //'Тип'
    private SelenideElement journalTypeTable = $(byXpath("//th[contains(text(),'Тип журнала')][1]"));                   //'Тип журнала'
    private SelenideElement trainingProgramTable = $(byXpath("//th[contains(text(),'Программа')]"));                    //'Программа'
    private SelenideElement modulesTable= $(byXpath("//th[contains(text(),'Модули')]"));                                //'Модули'
    private SelenideElement groupSubgroupTable = $(byXpath("//th[contains(text(),'Группа / Подгруппа')]"));             //'Группа / Подгруппа'
    private SelenideElement disciplineTable = $(By.xpath("//th[contains(text(),'Дисциплина')]"));                       //'Дисциплина'
    private SelenideElement teacherTable = $(byXpath("//th[contains(text(),'Преподаватель')]"));                        //'Преподаватель'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[10]//a[@title=\"Посмотреть\"]"));                           // Кнопка "Посмотреть"
    private SelenideElement editBtn = $(byXpath("//tr[1]/td[10]//a[@title=\"Редактировать\"]"));                        // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[10]//a[@title=\"Удалить\"]"));                            // Кнопка "Удалить"

    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'‹')]"));       //не работает на первой (текущей) странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'1')]"));
    private SelenideElement secondPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'2')]"));
    private SelenideElement thirdPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'3')]"));
    private SelenideElement fourthPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'4')]"));
    private SelenideElement fifthPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'5')]"));
    private SelenideElement sixthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'6')]"));
    private SelenideElement seventhPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'7')]"));
    private SelenideElement eighthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'8')]"));
    private SelenideElement nextPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'›')]"));


}
