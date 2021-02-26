package pages;// Мониторинг_Онлайн занятия_Журнал событий студента
//  /ru/tko/control/monitoring/people/details/28716996

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringStudentsDetailsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал событий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"
    private SelenideElement eventLogTab = $x("//span[contains(text(),'Журнал событий')]/..");              // Таб "Журнал событий"

    // Название организации
    private SelenideElement organizationNameTitle = $x("//h3[contains(@class,'s-title s-upper')]");

    // ФИО студента
    private SelenideElement fullNameTitle = $x("//h3[@class='s-light mt-15 mb-20']");

    // Таблица
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                             // '№'
    private SelenideElement typeLogTable = $x("//div[contains(text(),'Тип лога')]");                       // 'Тип лога'
    private SelenideElement timeLogTable = $x("//div[contains(text(),'Время лога')]");                     // 'Время лога'

    // Список логов
    private ElementsCollection logList = $$x("//tbody//td[@data-table-head='№']");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public MonitoringStudentsDetailsPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Журнал событий"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
