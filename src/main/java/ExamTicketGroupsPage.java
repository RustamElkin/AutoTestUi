// Экзаменационные билеты
//  /ru/tko/control/exam-ticket-groups

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ExamTicketGroupsPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Экзаменационные билеты')]");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");

    // Кнопка добавить
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");

    // Input
    private SelenideElement nameInput = $x("//label[contains(text(),'Название:')]/following-sibling::input");

    // Multiselect input, мультиселект инпуты, фильтр
    private SelenideElement subjectsInput = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");                                // 'Предмет'
    private SelenideElement creatorTeacherInput = $x("//label[contains(text(),'Создатель')]/following-sibling::div//input");                        // 'Создатель'
    private SelenideElement languageEducationInput = $x("//label[contains(text(),'Язык обучения')]/following-sibling::div//input");                 // 'Язык обучения'

    // Dropdown list
    private ElementsCollection subjectList = $$x("//label[contains(text(),'Предмет')]/.. //li[@class=\"multiselect__element\"]");                   // список 'Предмет'
    private ElementsCollection creatorTeacherList = $$x("//label[contains(text(),'Создатель')]/.. //li[@class=\"multiselect__element\"]");          // список 'Создатель'
    private ElementsCollection languageEducationList = $$x("//label[contains(text(),'Язык обучения')]/.. //li[@class=\"multiselect__element\"]");   // список 'Язык обучения'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   // '№'
    private SelenideElement nameOnTable = $x("//th[contains(text(),'Название')]");                              // 'Название'
    private SelenideElement disciplineTable = $x("//th[contains(text(),'Дисциплина')]");                        // 'Дисциплина'
    private SelenideElement CreatorTable = $x("//th[contains(text(),'Создатель')]");                            // 'Создатель'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");              // 'Язык обучения'
    private SelenideElement numberOfTicketsTable = $x("//th[contains(text(),'Количество билетов')]");           // 'Количество билетов'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                          // 'Операции'


    // Кнопки в таблице, колонка "Операции"

    private ElementsCollection viewBtn = $$x("//span[@class=\"s-ico s-ico--thm-eye\"]/../.. /a");                   // Список кнопок просмотра
    private ElementsCollection editBtn = $$x("//span[@class=\"s-ico s-ico--thm-pencil\"]/..");                      // Кнопки "Редактировать"
    private ElementsCollection deleteBtn = $$x("//span[@class=\"s-ico s-ico--thm-trash\"]/..");                     // Кнопки "Удалить"
    // в тетсте
    // ElementsCollection viewBtnCollection == $$("collectionLocator");
    // viewBtnCollection.first();
    // viewBtnCollection.last();

    // Кнопки на первой строке, можно выбрать строку поменяв индекс
    private SelenideElement firstViewBtn = $x("(//span[@class=\"s-ico s-ico--thm-eye\"]/../.. /a)[1]");                   // Первая кнопка просмотра
    private SelenideElement firstEditBtn = $x("(//span[@class=\"s-ico s-ico--thm-pencil\"]/..)[1]");                      // Кнопка "Редактировать"
    private SelenideElement firstDeleteBtn = $x("(//span[@class=\"s-ico s-ico--thm-trash\"]/..)[1]");                     // Кнопка "Удалить"








}
