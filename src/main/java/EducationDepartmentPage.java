// Контингент_Кафедры
//  /ru/tko/control/education-department

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EducationDepartmentPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                                                // 'Полный список'
    private SelenideElement groupsTab = $(byXpath("//span[contains(text(),'Группы')]/.."));                                                         // 'Группы'
    private SelenideElement subgroupsTab = $(byXpath("//span[contains(text(),'Подгруппы')]/.."));                                                   // 'Подгруппы'
    private SelenideElement cathedraTab = $(byXpath("//span[contains(text(),'Кафедры')]/.."));                                                      // 'Кафедры' (Текущий таб не кликабельный)
    private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/.."));   // 'Архив'

    // Кнопка добавить
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));

    // Таблица
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Название')]"));                                // 'Название'
    private SelenideElement specializationTable = $(byXpath("//th[contains(text(),'Специализация')]"));                 // 'Специализация'
    private SelenideElement groupsTable = $(byXpath("//th[contains(text(),'Группы')]"));                                // 'Группы'
    private SelenideElement headDepartmentTable = $(byXpath("//th[contains(text(),'Зав. кафедрой')]"));                 // 'Зав. кафедрой'
    private SelenideElement OperationsOnTable = $(byXpath("//th[contains(text(),'Операции')]"));                        // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Просмотреть\"]"));                            // Кнопка просмотра
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[@data-table-head='Операции']//a[@data-method=\"DELETE\"]"));                           // Кнопка "Удалить
}
