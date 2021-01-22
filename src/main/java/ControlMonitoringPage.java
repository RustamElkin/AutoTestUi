// Мониторинг
//  /ru/tko/control/monitoring

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlMonitoringPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Мониторинг')]"));

    // Таблица
    private SelenideElement activityTable = $(byXpath("//td[contains(text(),'Активность')]"));                                                                        //'Активность'
    private SelenideElement monitoringCollegeActivityTable = $(byXpath("//td[contains(text(),'Мониторинг активности колледжей')]"));                                  //'Мониторинг активности колледжей'
    private SelenideElement progressTable = $(byXpath("//td[contains(text(),'Успеваемость')]"));                                                                      //'Успеваемость'
    private SelenideElement attendanceTable = $(byXpath("//td[contains(text(),'Посещаемость')]"));                                                                    //'Посещаемость'
    private SelenideElement onlineClassesTable = $(byXpath("//td[contains(text(),'Онлайн занятия')]"));                                                               //'Онлайн занятия'
    private SelenideElement distanceLearningTable = $(byXpath("//td[contains(text(),'Дистанционное обучение')]"));                                                    //'Дистанционное обучение'
    private SelenideElement monitoringApplicationsForAdmissionsCommissionsTable = $(byXpath("//td[contains(text(),'Мониторинг заявлений по приемным комиссиям')]"));  //'Мониторинг заявлений по приемным комиссиям'
    private SelenideElement monitoringRequestsFromExternalServicesTable = $(byXpath("//td[contains(text(),'Мониторинг заявок с внешних сервисов')]"));                //'Мониторинг заявок с внешних сервисов'

    // Кнопки в таблице
    private SelenideElement viewActivityBtn = $(byXpath("//td[contains(text(),'Активность')]/..//following-sibling::td/a"));                                           // Кнопка "Посмотреть Активность"
    private SelenideElement viewMonitoringCollegeActivityBtn = $(byXpath("//td[contains(text(),'Мониторинг активности колледжей')]/..//following-sibling::td/a"));     // Кнопка "Посмотреть Мониторинг активности колледжей"
    private SelenideElement viewProgressBtn = $(byXpath("//td[contains(text(),'Успеваемость')]/..//following-sibling::td/a"));                                         // Кнопка "Посмотреть Успеваемость"
    private SelenideElement viewAttendanceBtn = $(byXpath("//td[contains(text(),'Посещаемость')]/..//following-sibling::td/a"));                                       // Кнопка "Посмотреть Посещаемость"
    private SelenideElement viewOnlineClassesBtn = $(byXpath("//td[contains(text(),'Дистанционное обучение')]/..//following-sibling::td/a"));                          // Кнопка "Посмотреть Онлайн занятия"
    private SelenideElement viewDistanceLearningBtn = $(byXpath("//tr[1]/td[10]//a[@title=\"Посмотреть\"]"));                                                          // Кнопка "Посмотреть Дистанционное обучение"
    private SelenideElement viewMonitoringApplicationsForAdmissionsCommissionsBtn = $(byXpath("//td[contains(text(),'Мониторинг заявлений по приемным комиссиям')]/..//following-sibling::td/a"));     // Кнопка "Посмотреть Мониторинг заявлений по приемным комиссиям"
    private SelenideElement viewMonitoringRequestsFromExternalServicesBtn = $(byXpath("//td[contains(text(),'Мониторинг заявок с внешних сервисов')]/..//following-sibling::td/a"));                   // Кнопка "Посмотреть Мониторинг заявок с внешних сервисов"



}
