package pages;// Мониторинг
//  /ru/tko/control/monitoring

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ControlMonitoringPage {

    // Тайтл
    private SelenideElement titleToPage                      = $x("//h1[contains(text(),'Мониторинг')]");

    // Таблица
    private SelenideElement activityTable                    = $x("//td[contains(text(),'Активность')]");                                                                                      //'Активность'
    private SelenideElement monitoringCollegeActivityTable   = $x("//td[contains(text(),'Мониторинг активности колледжей')]");                                                                 //'Мониторинг активности колледжей'
    private SelenideElement progressTable                    = $x("//td[contains(text(),'Успеваемость')]");                                                                                    //'Успеваемость'
    private SelenideElement attendanceTable                  = $x("//td[contains(text(),'Посещаемость')]");                                                                                    //'Посещаемость'
    private SelenideElement onlineClassesTable               = $x("//td[contains(text(),'Онлайн занятия')]");                                                                                  //'Онлайн занятия'
    private SelenideElement distanceLearningTable            = $x("//td[contains(text(),'Дистанционное обучение')]");                                                                          //'Дистанционное обучение'
    private SelenideElement monitoringApplicationsForAdmissionsCommissionsTable = $x("//td[contains(text(),'Мониторинг заявлений по приемным комиссиям')]");                                   //'Мониторинг заявлений по приемным комиссиям'
    private SelenideElement monitoringRequestsFromExternalServicesTable = $x("//td[contains(text(),'Мониторинг заявок с внешних сервисов')]");                                                 //'Мониторинг заявок с внешних сервисов'

    // Кнопки в таблице
    private SelenideElement viewActivityBtn                  = $x("//td[contains(text(),'Активность')]/..//following-sibling::td/a");                                                          // Кнопка "Посмотреть Активность"
    private SelenideElement viewMonitoringCollegeActivityBtn = $x("//td[contains(text(),'Мониторинг активности колледжей')]/..//following-sibling::td/a");                                     // Кнопка "Посмотреть Мониторинг активности колледжей"
    private SelenideElement viewProgressBtn                  = $x("//td[contains(text(),'Успеваемость')]/..//following-sibling::td/a");                                                        // Кнопка "Посмотреть Успеваемость"
    private SelenideElement viewAttendanceBtn                = $x("//td[contains(text(),'Посещаемость')]/..//following-sibling::td/a");                                                        // Кнопка "Посмотреть Посещаемость"
    private SelenideElement viewOnlineClassesBtn             = $x("//td[contains(text(),'Дистанционное обучение')]/..//following-sibling::td/a");                                              // Кнопка "Посмотреть Онлайн занятия"
    private SelenideElement viewDistanceLearningBtn          = $x("//tr[1]/td[10]//a[@title=\"Посмотреть\"]");                                                                                 // Кнопка "Посмотреть Дистанционное обучение"
    private SelenideElement viewMonitoringApplicationsForAdmissionsCommissionsBtn = $x("//td[contains(text(),'Мониторинг заявлений по приемным комиссиям')]/..//following-sibling::td/a");     // Кнопка "Посмотреть Мониторинг заявлений по приемным комиссиям"
    private SelenideElement viewMonitoringRequestsFromExternalServicesBtn = $x("//td[contains(text(),'Мониторинг заявок с внешних сервисов')]/..//following-sibling::td/a");                   // Кнопка "Посмотреть Мониторинг заявок с внешних сервисов"
    private SelenideElement mainPageLink                     = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public ControlMonitoringPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Мониторинг"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
