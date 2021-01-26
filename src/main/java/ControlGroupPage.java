// Группы
//  /ru/tko/control/group

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ControlGroupPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                    // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                             // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                       // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                          // 'Кафедры'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   //'Архив'


    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");                                //Кнопка "Добавить"

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");           // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                           // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                            // 'Сбросить'


    //Фильтр Инпуты
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");  // 'Название'

    //Dropdown фильтры
    private SelenideElement selectQualificationDropDownList = $x("//label[contains(text(),'Квалификация')]/following-sibling::div");   //"Квалификация"

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   //'№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                //'Название'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                   //'Квалификация'
    private SelenideElement courseTable = $x("//th[contains(text(),'Курс')]");                                  //'Курс'
    private SelenideElement languageEducation= $x("//th[contains(text(),'Язык обучения')]");                   //'Язык обучения'
    private SelenideElement numberOfStudentsTable = $x("//th[contains(text(),'Количество учащихся')]");         //'Количество учащихся'
    private SelenideElement curatorTable = $x("//th[contains(text(),'Куратор')]");                              //'Куратор'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]/td[8]//a[@title=\"Посмотреть\"]");                                  // Кнопка "Посмотреть"
    private SelenideElement groupManagementBtn = $x("//tr[1]/td[8]//a[@title=\"Управление группой\"]");               // Кнопка "Управление группой"
    private SelenideElement transferToNextCourseBtn = $x("//tr[1]/td[8]//a[@title=\"Перевести на следующий курс\"]"); // Кнопка " Перевести на следующий курс"
    private SelenideElement deleteBtn = $x("//tr[1]/td[6]//a[@title=\"Удалить\"]");                                   // Кнопка "Удалить"

    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");   //не работает на первой (текущей) странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//a[contains(text(),'5')]");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}
