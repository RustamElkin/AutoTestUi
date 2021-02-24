package pages;// Контингент_Кафедры
//  /ru/tko/control/education-department

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class EducationDepartmentPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[@class = 's-title-head'][contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры' (Текущий таб не кликабельный)
    private SelenideElement archiveTab = $x("//div[@class = 'container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");    // 'Архив'

    // Кнопка добавить
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");

    // Таблица
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                // 'Название'
    private SelenideElement specializationTable = $x("//th[contains(text(),'Специализация')]");                 // 'Специализация'
    private SelenideElement groupsTable = $x("//th[contains(text(),'Группы')]");                                // 'Группы'
    private SelenideElement headDepartmentTable = $x("//th[contains(text(),'Зав. кафедрой')]");                 // 'Зав. кафедрой'
    private SelenideElement operationsOnTable = $x("//th[contains(text(),'Операции')]");                        // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]/td[@data-table-head = 'Операции']//a[@title = 'Просмотреть']");                            // Кнопка просмотра
    private SelenideElement deleteBtn = $x("//tr[1]/td[@data-table-head = 'Операции']//a[@data-method = 'DELETE']");                           // Кнопка "Удалить

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");

    public EducationDepartmentPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Контингент"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
