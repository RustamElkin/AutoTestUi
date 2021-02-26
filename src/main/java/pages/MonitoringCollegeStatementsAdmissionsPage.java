package pages;// Мониторинг заявлений по приемным комиссиям организации
//  /ru/tko/control/monitoring/statements-admissions/19195

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringCollegeStatementsAdmissionsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг заявлений по приемным комиссиям')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                   // Таб "Назад"

    // Кнопки фильтр
    private SelenideElement nameInput = $x("//span[contains(text(),'Фильтрация списка')]/..");                                       // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                                                 // 'Сбросить'
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                                          // 'Экспортировать'

    // Инпуты
    private SelenideElement specialtyFilter= $x("//label[contains(text(),'Специальность')]/following-sibling::div//input");          // 'Специальность'
    private SelenideElement qualificationFilter= $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");       // 'Квалификация'
    private SelenideElement statusFilter = $x("//label[contains(text(),'Статус')]/following-sibling::div//input");                   // 'Статус'
    private SelenideElement sourceFilter= $x("//label[contains(text(),'Источник')]/following-sibling::div//input");                  // 'Источник'
    private SelenideElement typeOfEducationFilter= $x("//label[contains(text(),'Тип образования')]/following-sibling::div//input");  // 'Тип образования'

    // Фильтры с диапазоном
    // "Дата"
    private SelenideElement dateFromFilter= $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name='filters[created_at][from]']"); // "От"
    private SelenideElement dateToFilter= $x("//label[contains(text(),'Дата')]/following-sibling::div//input[@name='filters[created_at][to]']");     // "До"

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                                             // '№'
    private SelenideElement areaTable = $x("//th[contains(text(),'Дата подачи')]");                                                  // 'Дата подачи'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                                      // 'ФИО'
    private SelenideElement specialtyTable = $x("//th[contains(text(),'Специальность')]");                                           // 'Специальность'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                                        // 'Квалификация'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                                                     // 'Статус'
    private SelenideElement sourceTable = $x("//th[contains(text(),'Источник')]");                                                   // 'Источник'
    private SelenideElement typeOfEducationTable = $x("//th[contains(text(),'Тип образования')]");                                   // 'Тип образования'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                               // 'Операции'

    // Кнопки просмотра в таблице.
    private ElementsCollection viewBtn = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");                                     // Кнопки 'Посмотреть'

    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'‹')]");                             // не работает на первой (текущей) странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'7')]");
    private SelenideElement eighthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'8')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'›')]");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public MonitoringCollegeStatementsAdmissionsPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Мониторинг заявлений по приемным комиссиям"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
