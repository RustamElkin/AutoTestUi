package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

//Главная страница
//     /ru/tko
public class MainPage {

    private SelenideElement titleToPage                  = $x("//div[@class='s-jumbotron__title mb-30']");
    private SelenideElement regionSelectBtn              = $x("//div[@class='s-main-header__right-panel']/div[@data-toggle='modal']");
    private SelenideElement modalRegionSelecting         = $x("//div[@class='s-modal__container']//a[text() = 'Туркестанская область' or href='/ru/tko?region=15']");
    private SelenideElement signInBtn                    = $x("//div[@class='s-main-header__right-panel']//a[text() = 'Вход' and @href='/ru/tko/login']");
    private SelenideElement viewModal                    = $x("//div[@class='s-modal__container']//div[@class = 's-modal__title' and text() = 'Выберите ваш регион']");

    // Меню
    private SelenideElement menuBtn                      = $x("//div[contains(text(),'Меню')]");                                                                             // 'Меню'
    private SelenideElement exitBtnMenu                  = $x("//span[text() = 'Выйти']/..");                                                                                // 'Выйти'
    private SelenideElement profileMenu                  = $x("//span[text() = 'Профиль']/..");                                                                              // 'Профиль'
    private SelenideElement parentLinkStatementsMenu     = $x("//span[text() = 'Заявки на подключение детей']/..");                                                          // 'Заявки на подключение детей'
    // вложенные селекты в "Мой колледж"
    private SelenideElement myCollegeMenu                = $x("//span[text() = 'Мой колледж']/ancestor::div[contains(@class,'s-dropdown__link--multi')]");                   // 'Мой колледж'
    //
    private SelenideElement organizationProfileMenu      = $x("//span[text() = 'Профиль колледжа']/..");                                                                     // 'Профиль колледжа'
    private SelenideElement personnelMenu                = $x("//span[text() = 'Персонал']/..");                                                                             // 'Персонал'
    private SelenideElement contingentMenu               = $x("//span[text() = 'Контингент']/..");                                                                           // 'Контингент'
    // вложенные селекты в "Образовательный процесс"
    private SelenideElement educationalProcessMenu       = $x("//span[text() = 'Образовательный процесс']/ancestor::div[contains(@class,'s-dropdown__link--multi')]");       // 'Образовательный процесс'
    //
    private SelenideElement curriculumMenu               = $x("//span[text() = 'Учебный план']/..");                                                                         // 'Учебный план'
    private SelenideElement calendarThematicPlansMenu    = $x("//span[text() = 'Календарно-тематические планы']/..");                                                        // 'Календарно-тематические планы'
    private SelenideElement trainingScheduleMenu         = $x("//span[text() = 'Расписание']/..");                                                                           // 'Расписание'
    private SelenideElement journalsMenu                 = $x("//span[text() = 'Журнал']/..");                                                                               // 'Журнал'
    private SelenideElement diplomasMenu                 = $x("//span[text() = 'Дипломные работы']/..");                                                                     // 'Дипломные работы'
    private SelenideElement summaryMenu                  = $x("//span[text() = 'Итоги']/..");                                                                                // ' Итоги'
    private SelenideElement educationModuleMenu          = $x("//span[text() = 'Модули']/..");                                                                               // ' Модули'
    //
    private SelenideElement monitoringMenu               = $x("//span[text() = 'Мониторинг']/..");                                                                           // 'Мониторинг'
    //
    private SelenideElement stateServicesMenu            = $x("//span[text() = 'Гос. услуги']/.. ");                                                                         // 'Гос. услуги'
    // вложенные селекты в "Гос. услуги"
    private SelenideElement govServiceStatementMenu      = $x("//span[text() = 'Заявки через портал']/parent::a[@href = '/ru/tko/control/gov-service-statement']");          // 'Заявки через портал'
    private SelenideElement externalStatementServicesMenu= $x("//span[text() = 'Заявки с вн. сервисов']/parent::a[@href = '/ru/tko/control/external-statement-services']");  // 'Заявки с вн. сервисов'
    //
    private SelenideElement admissionsCommitteeMenu      = $x("//span[text() = 'Приемная комиссия']/parent::div");                                                           // 'Приемная комиссия'
    // вложенные селекты в "Приемная комиссия"
    private SelenideElement statementsAdmissionsMenu     = $x("//span[text() = 'Комиссия']/parent::a");                                                                      // 'Комиссия'
    private SelenideElement externalStatementsMenu       = $x("//span[text() = 'Заявки с внешних сервисов']/parent::div");                                                   // 'Заявки с внешних сервисов'
    private SelenideElement entranceExamMenu             = $x("//span[text() = 'Вступительные экзамены']/parent::div");                                                      // 'Вступительные экзамены'
    private SelenideElement distributionContingentMenu   = $x("//span[text() = 'Поступившие']/parent::a");                                                                   // 'Поступившие'
    //
    private SelenideElement distanceLearningMenu         = $x("//span[text() = 'Дистанционное обучение']/parent::div");                                                      // 'Дистанционное обучение'
    // вложенные селекты в 'Дистанционное обучение'
    private SelenideElement homeworksMenu                = $x("//span[text() = 'Шаблоны заданий']/parent::a");                                                               // 'Шаблоны заданий'
    private SelenideElement assignedHomeworksMenu        = $x("//span[text() = 'Назначенные задания']/parent::a");                                                           // 'Назначенные задания'
    //
    private SelenideElement documentFlowMenu             = $x("//span[text() = 'Документооборот']/parent::div");                                                             // 'Документооборот'
    // вложенные селекты в 'Документооборот'
    private SelenideElement documentFlowOrdersMenu       = $x("//a[@href = '/ru/tko/document-flow/orders' and @class='s-dropdown__link ']");                                 // 'Приказы'
    private SelenideElement documentFlowLettersMenu      = $x("//a[@href = '/ru/tko/document-flow/letters' and @class='s-dropdown__link ']");                                // 'Письма'
    private SelenideElement documentFlowStatementsMenu   = $x("//a[@href = '/ru/tko/document-flow/statements' and @class='s-dropdown__link ']");                             // 'Заявки'
    private SelenideElement archiveStatementsMenu        = $x("//a[@href = '/ru/tko/document-flow/archive/statements' and @class='s-dropdown__link ']");                     // 'Архив'
    //









    public MainPage clickMenuBtn() {
        menuBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPage viewMyCollegeDropdownMenu() {
        actions().moveToElement(myCollegeMenu).moveToElement(organizationProfileMenu).click();
        return this;
    }

    public AccountProfilePage clickProfileMenu() {
        profileMenu.shouldBe(Condition.visible).click();
        return new AccountProfilePage();
    }

    public ParentLinkStatementsPage clickParentLinkStatementsMenu() {
        parentLinkStatementsMenu.shouldBe(Condition.visible).click();
        return new ParentLinkStatementsPage();
    }

    public MainPage clickMenuExit() {
        exitBtnMenu.shouldBe(visible).click();
        return this;
    }
    public MainPage viewModal() {
        viewModal.shouldBe(visible);
        return this;
    }

    public MainPage clickRegionSelectBtn() {
        regionSelectBtn.shouldBe(visible).click();
        return this;
    }


    public MainPage clickSelectRegion() {
        modalRegionSelecting.shouldBe(Condition.visible).click();
        return this;
    }

    public LoginPage clickSignInBtn() {
        signInBtn.click();
        return new LoginPage();
    }

    public MainPage checkTitleToPage() {
        titleToPage.shouldHave(text("Единый портал государственных услуг"));
        return this;
    }

}
