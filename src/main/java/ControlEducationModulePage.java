// Модули
//  /ru/tko/control/education-module

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlEducationModulePage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Модули')]"));

    // Табы на странице
    private SelenideElement backButtonTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                          // 'Назад'

    // Кнопка добавить
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));

    // Кнопки для фильтра
    private SelenideElement filteringListBtn  = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));

    //Фильтр Инпуты
    private SelenideElement nameInput = $(byXpath("//label[contains(text(),'Название: ')]/following-sibling::input"));  // 'Название'
    private SelenideElement indexInput = $(byXpath("//label[contains(text(),'Индекс: ')]/following-sibling::input"));   // 'Индекс'

    //Dropdown фильтры
    private SelenideElement selectSubjectDropDownList = $(byXpath("//label[contains(text(),'Предмет')]//following-sibling::div"));   //"Предмет"
    private SelenideElement selectCreatorDropDownList = $(byXpath("//label[contains(text(),'Создатель')]//following-sibling::div")); //"Создатель"

    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   //'№'
    private SelenideElement NameTable = $(byXpath("//th[contains(text(),'Название')]"));                                //'Название'
    private SelenideElement indexTable = $(byXpath("//th[contains(text(),'Индекс')]"));                                 //'Индекс'
    private SelenideElement creatorTable = $(byXpath("//th[contains(text(),'Создатель')]"));                            //'Создатель'
    private SelenideElement subjectTable = $(byXpath("//th[contains(text(),'Предметы')]"));                             //'Предметы'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement editBtn = $(byXpath("//tr[1]/td[6]//a[@title=\"Редактировать\"]"));                         // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[6]//a[@title=\"Удалить\"]"));                             // Кнопка "Удалить"







}
