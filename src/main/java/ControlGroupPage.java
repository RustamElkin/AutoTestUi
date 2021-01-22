// Группы
//  /ru/tko/control/group

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlGroupPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Контингент')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                    // 'Полный список'
    private SelenideElement groupsTab = $(byXpath("//span[contains(text(),'Группы')]/.."));                             // 'Группы'
    private SelenideElement subgroupsTab = $(byXpath("//span[contains(text(),'Подгруппы')]/.."));                       // 'Подгруппы'
    private SelenideElement cathedraTab = $(byXpath("//span[contains(text(),'Кафедры')]/.."));                          // 'Кафедры'
    private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/.."));   //'Архив'


    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));                                //Кнопка "Добавить"

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));           // 'Фильтрация списка'
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));                           // 'Применить'
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));                            // 'Сбросить'


    //Фильтр Инпуты
    private SelenideElement nameInput = $(byXpath("//label[contains(text(),'Название: ')]/following-sibling::input"));  // 'Название'

    //Dropdown фильтры
    private SelenideElement selectQualificationDropDownList = $(byXpath("//label[contains(text(),'Квалификация')]/following-sibling::div"));   //"Квалификация"

    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   //'№'
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Название')]"));                                //'Название'
    private SelenideElement qualificationTable = $(byXpath("//th[contains(text(),'Квалификация')]"));                   //'Квалификация'
    private SelenideElement courseTable = $(byXpath("//th[contains(text(),'Курс')]"));                                  //'Курс'
    private SelenideElement languageEducation= $(byXpath("//th[contains(text(),'Язык обучения')]"));                   //'Язык обучения'
    private SelenideElement numberOfStudentsTable = $(byXpath("//th[contains(text(),'Количество учащихся')]"));         //'Количество учащихся'
    private SelenideElement curatorTable = $(byXpath("//th[contains(text(),'Куратор')]"));                              //'Куратор'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[8]//a[@title=\"Посмотреть\"]"));                                  // Кнопка "Посмотреть"
    private SelenideElement groupManagementBtn = $(byXpath("//tr[1]/td[8]//a[@title=\"Управление группой\"]"));               // Кнопка "Управление группой"
    private SelenideElement transferToNextCourseBtn = $(byXpath("//tr[1]/td[8]//a[@title=\"Перевести на следующий курс\"]")); // Кнопка " Перевести на следующий курс"
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[6]//a[@title=\"Удалить\"]"));                                   // Кнопка "Удалить"

    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $(By.xpath("//a[contains(text(),'‹')]"));   //не работает на первой (текущей) странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $(By.xpath("//a[contains(text(),'1')]"));
    private SelenideElement secondPaginateBtn = $(By.xpath("//a[contains(text(),'2')]"));
    private SelenideElement thirdPaginateBtn = $(By.xpath("//a[contains(text(),'3')]"));
    private SelenideElement fourthPaginateBtn = $(By.xpath("//a[contains(text(),'4')]"));
    private SelenideElement fifthPaginateBtn = $(By.xpath("//a[contains(text(),'5')]"));
    private SelenideElement nextPaginateBtn = $(By.xpath("//a[contains(text(),'›')]"));

}
