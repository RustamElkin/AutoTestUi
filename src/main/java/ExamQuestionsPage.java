// Экзаменационные вопросы
//  /ru/tko/exam-questions

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExamQuestionsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Экзаменационные вопросы')]");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");                                   // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                   // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                                                    // 'Сбросить'

    // Кнопка добавить
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");                                                       // 'Добавить'

    // Фильтр
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");                            // Инпут Фильтра 'Название'

    // Инпуты с дропдаунами в фильтре
    private SelenideElement subjectsInput = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");                    // 'Предмет'

    private SelenideElement creatorInput = $x("//label[contains(text(),'Создатель')]//following-sibling::div//input");                  // 'Создатель'

    private SelenideElement languageEducationInput = $x("//label[contains(text(),'Язык обучения')]//following-sibling::div//input");    // 'Язык обучения'

    // дропдауны со списками элементов
    private SelenideElement subjectsList = $x("//label[contains(text(),'Предмет')]/following-sibling::div");                    // 'Предмет'
    private SelenideElement creatorsList = $x("//label[contains(text(),'Создатель')]//following-sibling::div");                  // 'Создатель'
    private SelenideElement languageEducationsList = $x("//label[contains(text(),'Язык обучения')]//following-sibling::div");    // 'Язык обучения'
    // в тесте искать selectSubject = $(byText())


    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   // '№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'Название')]");                            // 'Название'
    private SelenideElement subjectsTable = $x("//th[contains(text(),'Дисциплина')]");                          // 'Дисциплина'
    private SelenideElement creatorTable = $x("//th[contains(text(),'Создатель')]");                            // 'Создатель'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");              // 'Язык обучения'
    private SelenideElement numberOfQuestionsTable = $x("//th[contains(text(),'Количетво вопросов')]");         // 'Количетво вопросов'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                        // 'Операции'


    // Кнопки в таблице, колонка "Операции"
    // Заменив номер в ("//....")[1], меняется строка
    private SelenideElement viewBtn = $x("(//tr/td[@data-table-head='Операции']//a[@title='Посмотреть'])[1]");               // Кнопка "Посмотреть"
    private SelenideElement editBtn = $x("(//tr/td[@data-table-head='Операции']//a[@title='Редактировать'])[1]");            // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("(//tr/td[@data-table-head='Операции']//a[@title='Удалить'])[1]");                // Кнопка "Удалить"








}
