// Экзаменационные вопросы
//  /ru/tko/exam-questions

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ExamQuestionsPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Экзаменационные вопросы')]"));

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));                                   // 'Фильтрация списка'
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));                                                   // 'Применить'
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));                                                    // 'Сбросить'

    // Кнопка добавить
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));                                                       // 'Добавить'

    // Фильтр
    private SelenideElement nameInput = $(byXpath("//label[contains(text(),'Название')]/following-sibling::input"));                            // Инпут Фильтра 'Название'

    // Инпуты с дропдаунами в фильтре
    private SelenideElement subjectsInput = $(byXpath("//label[contains(text(),'Предмет')]/following-sibling::div//input"));                    // 'Предмет'

    private SelenideElement CreatorInput = $(byXpath("//label[contains(text(),'Создатель')]//following-sibling::div//input"));                  // 'Создатель'

    private SelenideElement languageEducationInput = $(byXpath("//label[contains(text(),'Язык обучения')]//following-sibling::div//input"));    // 'Язык обучения'

    // дропдауны со списками элементов
    private SelenideElement subjectsList = $(byXpath("//label[contains(text(),'Предмет')]/following-sibling::div"));                    // 'Предмет'
    private SelenideElement CreatorsList = $(byXpath("//label[contains(text(),'Создатель')]//following-sibling::div"));                  // 'Создатель'
    private SelenideElement languageEducationsList = $(byXpath("//label[contains(text(),'Язык обучения')]//following-sibling::div"));    // 'Язык обучения'
    // в тесте искать selectSubject = $(byText())


    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   // '№'
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'Название')]"));                            // 'Название'
    private SelenideElement subjectsTable = $(byXpath("//th[contains(text(),'Дисциплина')]"));                          // 'Дисциплина'
    private SelenideElement creatorTable = $(byXpath("//th[contains(text(),'Создатель')]"));                            // 'Создатель'
    private SelenideElement languageEducationTable = $(byXpath("//th[contains(text(),'Язык обучения')]"));              // 'Язык обучения'
    private SelenideElement numberOfQuestionsTable = $(byXpath("//th[contains(text(),'Количетво вопросов')]"));         // 'Количетво вопросов'
    private SelenideElement OperationsOnTable = $(byXpath("//th[contains(text(),'Операции')]"));                        // 'Операции'


    // Кнопки в таблице, колонка "Операции"
    // Заменив номер в ("//....")[1], меняется строка
    private SelenideElement viewBtn = $(byXpath("(//tr/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"])[1]"));               // Кнопка "Посмотреть"
    private SelenideElement editBtn = $(byXpath("(//tr/td[@data-table-head=\"Операции\"]//a[@title=\"Редактировать\"])[1]"));            // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("(//tr/td[@data-table-head=\"Операции\"]//a[@title=\"Удалить\"])[1]"));                // Кнопка "Удалить"








}
