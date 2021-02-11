// Экзамены
//  /ru/tko/control/exams

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ExamsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Экзамены')]");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");           // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                           // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                            // 'Сбросить'

    // Кнопки
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");                               // 'Добавить'
    private SelenideElement scheduleBtn = $x("//div[contains(text(),'Расписание')]/..");                        //'Расписание'

    // Фильтры инпуты
    private SelenideElement qualificationFilter = $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input"); // 'Квалификация'
    private SelenideElement groupFilter = $x("//label[contains(text(),'Группа')]/following-sibling::div//input");                     // 'Группа'
    private SelenideElement disciplineFilter = $x("//label[contains(text(),'Дисциплина')]/following-sibling::div//input");            // 'Дисциплина'
    private SelenideElement examTypeFilter = $x("//label[contains(text(),'Вид экзамена')]/following-sibling::div//input");            // 'Вид экзамена'
    private SelenideElement statusFilter = $x("//label[contains(text(),'Статус')]/following-sibling::div//input");                    // 'Статус'
    private SelenideElement creatorFilter = $x("//label[contains(text(),'Создатель')]/following-sibling::div//input");                // 'Создатель'

    // Фильтры со списком
    private ElementsCollection qualificationList = $$x("//label[contains(text(),'Квалификация')]/following-sibling::div//li[@class='multiselect__element']");  // 'список 'Квалификация'
    private ElementsCollection groupList = $$x("//label[contains(text(),'Группа')]/following-sibling::div//li[@class='multiselect__element']");                // 'список 'Группа'
    private ElementsCollection disciplineList = $$x("//label[contains(text(),'Дисциплина')]/following-sibling::div//li[@class='multiselect__element']");       // 'список 'Дисциплина'
    private ElementsCollection examTypeList = $$x("//label[contains(text(),'Вид экзамена')]/following-sibling::div//li[@class='multiselect__element']");       // 'список 'Вид экзамена'
    private ElementsCollection statusList = $$x("//label[contains(text(),'Статус')]/following-sibling::div//li[@class='multiselect__element']");               // 'список 'Статус'
    private ElementsCollection creatorList = $$x("//label[contains(text(),'Создатель')]/following-sibling::div//li[@class='multiselect__element']");           // 'список 'Создатель'

    // Для теста готовые селекты
    private SelenideElement selectQualification = $x("//li[@class='multiselect__element']//span[contains(text(),'1013062 - Слесарь по')]");
    private SelenideElement selectGroup = $x("//li[@class='multiselect__element']//span[contains(text(),'КП19-30р')]");
    private SelenideElement selectDiscipline = $x("//li[@class='multiselect__element']//span[contains(text(),'Информатика')]");
    private SelenideElement selectExamType = $x("//li[@class='multiselect__element']//span[contains(text(),'В форме тестирования')]");
    private SelenideElement selectStatus = $x("//li[@class='multiselect__element']//span[contains(text(),'Создан')]");
    private SelenideElement selectCreator = $x("//li[@class='multiselect__element']//span[contains(text(),'Ниязов Марат Абдужаппарович')]");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   //'№'
    private SelenideElement specialtyTable = $x("//th[contains(text(),'Специальность')]");                      //'Специальность'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                   //'Квалификация'
    private SelenideElement creatorTable = $x("//th[contains(text(),'Создатель')]");                            //'Создатель'
    private SelenideElement dateOfCreationTable = $x("//th[contains(text(),'Дата создания')]");                 //'Дата создания'
    private SelenideElement startYearOfTable = $x("//th[contains(text(),'Год начала обучения')]");              //'Год начала обучения'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                                //'Статус'
    private SelenideElement actionTable = $x("//th[contains(text(),'Действие')]");                              //'Действие'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("(//a[@title='Редактировать'])[1]");                                 // Первая кнопка просмотра
    private SelenideElement deleteBtn = $x("(//a[@title='Удалить'])[1] ");                                    // Кнопка "Удалить"


    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'7')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");


}
