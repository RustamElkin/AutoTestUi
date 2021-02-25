package pages;// Активность организаций
//  /ru/tko/control/monitoring/activity

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringActivityPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Активность организаций')]");

    // Табы на странице
    private SelenideElement backToTab                            = $x("//span[contains(text(),'Назад')]/..");                                                   // Таб "Назад"

    // Кнопки
    private SelenideElement applyBtn                             = $x("//button[contains(text(),'Применить')]");                                                                            // 'Применить'
    private SelenideElement resetBtn                             = $x("//a[contains(text(),'Сбросить')]");                                                                                  // 'Сбросить'
    private SelenideElement exportBtn                            = $x("//a[contains(text(),'Экспортировать')]");                                                                            // 'Экспортировать'

    // Таблица
    private SelenideElement numberOnTable                        = $x("//th[contains(text(),'№')]");                                                                                         // '№'
    private SelenideElement areaTable                            = $x("//th[contains(text(),'Область')]");                                                                                   // 'Область'
    private SelenideElement districtTable                        = $x("//th[contains(text(),'Район')]");                                                                                     // 'Район'
    private SelenideElement localityTable                        = $x("//th[contains(text(),'Населенный пункт')]");                                                                          // 'Населенный пункт'
    private SelenideElement nameOfCompany                        = $x("//th[contains(text(),'Наименование организации')]");                                                                  // 'Наименование организации'
    private SelenideElement typesOfEducationalOrganizations      = $x("//th[contains(text(),'Виды организаций образования')]");                                                              // 'Виды организаций образования'
    private SelenideElement numberOfStudentAccountsCreated       = $x("//th[contains(text(),'количество созданных учетных записей роль студент')]");                                         // '«В СИСТЕМЕ» -количество созданных учетных записей роль студент'
    private SelenideElement numberOfActivatedStudentAccounts     = $x("//th[contains(text(),'количество активированных учетных записей роль студент')]");                                    // '«АКТИВИРОВАНО» - количество активированных учетных записей роль студент'
    private SelenideElement numberOfAccountsCreatedRoleTeacher   = $x("//th[contains(text(),'количество созданных учетных записей роль преподаватель')]");                                   // '«В СИСТЕМЕ» - количество созданных учетных записей роль преподаватель'
    private SelenideElement numberOfActivatedAccountsTeacherRole = $x("//th[contains(text(),'количество активированных учетных записей роль преподавательа')]");                             // '«АКТИВИРОВАНО» - количество активированных учетных записей роль преподаватель'
    private SelenideElement estimateAssessments                  = $x("//th[contains(text(),'ВЫСТАВЛЕННЫЕ ОЦЕНКИ, которые были выставлены педагогами в Системе')]");                         // 'ВЫСТАВЛЕННЫЕ ОЦЕНКИ, которые были выставлены педагогами в Системе'
    private SelenideElement numberOfHomeworkAssignments          = $x("//th[contains(text(),'ДОМАШНИЕ ЗАДАНИЯ, количество домашних заданий, которые были внесены педагогами в Системе')]");  // 'ДОМАШНИЕ ЗАДАНИЯ, количество домашних заданий, которые были внесены педагогами в Системе'
    private SelenideElement numberOfOnlineLessonsDelivered       = $x("//th[contains(text(),'КОЛИЧЕСТВО проведенных онлайн уроков')]");                                                      // 'КОЛИЧЕСТВО проведенных онлайн уроков'
    private SelenideElement uniqueLoginsToTheSystem              = $x("//th[contains(text(),'КОЛИЧЕСТВО совершенных пользователями уникальных входов в Систему')]");                         // 'КОЛИЧЕСТВО совершенных пользователями уникальных входов в Систему'

    private SelenideElement mainPageLink                         = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public MonitoringActivityPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Активность организаций"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
