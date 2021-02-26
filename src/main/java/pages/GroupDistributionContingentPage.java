package pages;// Приемная комиссия_Распределение по группам
//  /ru/tko/control/distribution-contingent/164

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class GroupDistributionContingentPage {

    // Тайтл
    private SelenideElement titleToPage  = $x("//h1[contains(text(),'Распределение по группам')]");

    // Табы на странице
    private SelenideElement fullListTab  = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Полный список'
    private SelenideElement groupsTab    = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab  = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры'
    private SelenideElement archiveTab   = $x("//div[@class='container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");   // 'Архив'

    // Таблица
    private SelenideElement nameTable    = $x("//th[contains(text(),'Название')]");                                                            //'Название'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                                               //'Квалификация'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");                                          //'Язык обучения'
    private SelenideElement numberOfStudentsTable = $x("//th[contains(text(),'Количество учащихся')]");                                     //'Количество учащихся'
    private SelenideElement curatorTable = $x("//th[contains(text(),'Куратор')]");                                                          //'Куратор'

    // кнопка "Посмотреть"
    private SelenideElement viewBtn      = $x("//td[@data-table-head = 'Операции']//a");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public GroupDistributionContingentPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Распределение по группам"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
