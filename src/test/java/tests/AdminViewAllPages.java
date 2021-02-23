package tests;

import org.junit.jupiter.api.*;
import pages.*;
import testconfigs.AppConfig;

import static com.codeborne.selenide.Selenide.open;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminViewAllPages extends AppConfig {

    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = new MainPage();
        open("/");
    }

    @Test
    @Order(1)
    // Заявки на подключение детей
    // https://college.dev-snation.kz/ru/tko/control/parent-link-statements

    public void mainPageView() {
        mainPage.viewModal().clickSelectRegion();
//        mainPage.clickRegionSelectBtn().clickSelectRegion();
        LoginPage loginPage = mainPage.clickSignInBtn().headingText().clickLoginFormTab()
                .typeLoginInput("shym.coll.as.1").typePasswordInput("123456");
        SelectRolePage selectRolePage = loginPage.clickSubmitBtn();
        selectRolePage
                .clickSelectRoleList()
                .clickSelectAdmin()
                .clickSubmitBtn();
        SelectOrganizationPage selectOrganizationPage = new SelectOrganizationPage();
        selectOrganizationPage
                .shouldBeOrganizationTitle()
                .clickOrganizationDropDownList()
                .clickOrganizationName()
                .clickSubmitBtn();
        // тест signInAdmin может падать, если в админке убрали доп Организации.
        mainPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(2)
    // Профиль
    // /account/profile
    public void accountProfilePageView() {
        AccountProfilePage accountProfilePage = mainPage
                .clickMenuBtn()
                .clickProfileMenu()
                .checkTitleToPage();
        mainPage = accountProfilePage.mainPageLink();
    }

    @Test
    @Order(3)
    // Заявки на подключение детей
    //  /ru/tko/control/parent-link-statements
    public void parentLinkStatementsView() {
        open("https://college.dev-snation.kz/ru/tko/control/parent-link-statements");
        ParentLinkStatementsPage parentLinkStatementsPage= new ParentLinkStatementsPage();
        parentLinkStatementsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(4)
    // Профиль колледжа
    //  /ru/tko/organization-profile
    public void organizationProfileView() {
        open("https://college.dev-snation.kz/ru/tko/organization-profile");
        OrganizationProfilePage organizationProfilePage = new OrganizationProfilePage();
        organizationProfilePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(5)
    // Персонал
    //  /ru/tko/control/personnel
    public void controlPersonnelPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/personnel");
        ControlPersonnelPage controlPersonnelPage = new ControlPersonnelPage();
        controlPersonnelPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(6)
    //  Контингент
    //  /ru/tko/control/contingent
    public void contingentPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/contingent");
        ContingentPage contingentPage = new ContingentPage();
        contingentPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(7)
    //   Учебный план
    //  /ru/tko/control/curriculum
    public void controlCurriculumPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/curriculum");
        ControlCurriculumPage controlCurriculumPage = new ControlCurriculumPage();
        controlCurriculumPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(8)
    //   Календарно-тематические планы
    //  /ru/tko/control/calendar-thematic-plan
    public void calendarThematicPlansPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/calendar-thematic-plan");
        CalendarThematicPlansPage calendarThematicPlansPage = new CalendarThematicPlansPage();
        calendarThematicPlansPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(9)
    //   Расписание
    //  /ru/tko/control/training-schedule
    public void trainingSchedulePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/training-schedule");
        TrainingSchedulePage trainingSchedulePage = new TrainingSchedulePage();
        trainingSchedulePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(10)
    //   Журнал
    //  /ru/tko/control/journals
    public void controlJournalsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/journals");
        ControlJournalsPage controlJournalsPage = new ControlJournalsPage();
        controlJournalsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(11)
    //   Дипломные работы
    //  /ru/tko/control/diplomas
    public void controlDiplomasPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/diplomas");
        ControlDiplomasPage controlDiplomasPage = new ControlDiplomasPage();
        controlDiplomasPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(12)
    //   Итоги
    //  /ru/tko/control/diplomas
    public void controlSummaryPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/summary");
        ControlSummaryPage controlSummaryPage = new ControlSummaryPage();
        controlSummaryPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(13)
    //   Модули
    //  /ru/tko/control/education-module
    public void controlEducationModulePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/education-module");
        ControlEducationModulePage controlEducationModulePage = new ControlEducationModulePage();
        controlEducationModulePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(14)
    //   Мониторинг
    //  /ru/tko/control/monitoring
    public void controlMonitoringPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring");
        ControlMonitoringPage controlMonitoringPage = new ControlMonitoringPage();
        controlMonitoringPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(15)
    //   Гос. услуги - Заявки через портал
    //  /ru/tko/control/gov-service-statement
    public void govServiceAllStatementsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-service-statement");
        GovServiceAllStatementsPage govServiceAllStatementsPage = new GovServiceAllStatementsPage();
        govServiceAllStatementsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(16)
    //   Гос. услуги - Заявки на гос.услуги с внешних сервисов
    //  /ru/tko/control/external-statement-services
    public void externalStatementServicesPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-statement-services");
        ExternalStatementServicesPage externalStatementServicesPage = new ExternalStatementServicesPage();
        externalStatementServicesPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(17)
    //   Госзаказ - Заявки через портал
    //  /ru/tko/control/gov-order-statement
    public void govOrderStatementsListPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-order-statement");
        GovOrderStatementsListPage govOrderStatementsListPage = new GovOrderStatementsListPage();
        govOrderStatementsListPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(18)
    //   Госзаказ - Заявки на гос.услуги с внешних сервисов
    //  /ru/tko/control/external-gov-order
    public void externalGovOrderPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-gov-order");
        ExternalGovOrderPage externalGovOrderPage = new ExternalGovOrderPage();
        externalGovOrderPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(19)
    //   Приемная комиссия - Комиссия
    //  /ru/tko/control/statements-admissions
    public void statementsAdmissionsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/statements-admissions");
        StatementsAdmissionsPage statementsAdmissionsPage = new StatementsAdmissionsPage();
        statementsAdmissionsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(20)
    //   Приемная комиссия - Заявки с внешних сервисов
    //  /ru/tko/control/external-statements
    public void externalStatementsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-statements");
        ExternalStatementsPage externalStatementsPage = new ExternalStatementsPage();
        externalStatementsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(21)
    //   Приемная комиссия - Вступительные экзамены
    //  /ru/tko/control/entrance-exam
    public void activeEntranceExamPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/entrance-exam");
        ActiveEntranceExamPage activeEntranceExamPage = new ActiveEntranceExamPage();
        activeEntranceExamPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(22)
    //   Приемная комиссия - Поступившие
    //  /ru/tko/control/distribution-contingent
    public void distributionContingentPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/distribution-contingent");
        DistributionContingentPage distributionContingentPage = new DistributionContingentPage();
        distributionContingentPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(23)
    //  Дистанционное обучение - Шаблоны заданий
    //  /ru/tko/control/homeworks
    public void homeworksTemplatesPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/homeworks");
        HomeworksTemplatesPage homeworksTemplatesPage = new HomeworksTemplatesPage();
        homeworksTemplatesPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(24)
    //  Дистанционное обучение - Назначенные задания
    //  /ru/tko/control/assigned-homeworks
    public void viewAssignedHomeworksListPage() {
        open("https://college.dev-snation.kz/ru/tko/control/assigned-homeworks");
        ViewAssignedHomeworksListPage viewAssignedHomeworksListPage = new ViewAssignedHomeworksListPage();
        viewAssignedHomeworksListPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(25)
    //  Документооборот - Приказы
    //  /ru/tko/document-flow/orders
    public void documentFlowOrdersPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/orders");
        DocumentFlowOrdersPage documentFlowOrdersPage = new DocumentFlowOrdersPage();
        documentFlowOrdersPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(26)
    //  Документооборот - Письма
    //  /ru/tko/document-flow/letters
    public void documentsFlowLettersPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/letters");
        DocumentsFlowLettersPage documentsFlowLettersPage = new DocumentsFlowLettersPage();
        documentsFlowLettersPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(27)
    //  Документооборот - Входящие заявки
    //  /ru/tko/document-flow/statements
    public void documentFlowStatementsPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/statements");
        DocumentFlowStatementsPage documentFlowStatementsPage = new DocumentFlowStatementsPage();
        documentFlowStatementsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(28)
    //  Документооборот - Архив
    //  /ru/tko/document-flow/archive/statements
    public void documentFlowArchiveStatementsPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/archive/statements");
        DocumentFlowArchiveStatementsPage documentFlowArchiveStatementsPage = new DocumentFlowArchiveStatementsPage();
        documentFlowArchiveStatementsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(29)
    //  Блог
    //  /ru/tko/organization-posts
    public void organizationPostsPageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-posts");
        OrganizationPostsPage organizationPostsPage = new OrganizationPostsPage();
        organizationPostsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(30)
    //  Библиотека
    //  /ru/tko/library
    public void libraryPageView() {
        open("https://college.dev-snation.kz/ru/tko/library");
        LibraryPage libraryPage = new LibraryPage();
        libraryPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(31)
    //  Экзамены - Экзамены
    //  /ru/tko/control/exams
    public void examsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/exams");
        ExamsPage examsPage = new ExamsPage();
        examsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(32)
    //  Экзамены - Экзаменационные вопросы
    //  /ru/tko/exam-questions
    public void examQuestionsPageView() {
        open("https://college.dev-snation.kz/ru/tko/exam-questions");
        ExamQuestionsPage examQuestionsPage = new ExamQuestionsPage();
        examQuestionsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(33)
    //  Экзамены - Экзаменационные билеты
    //  /ru/tko/control/exam-ticket-groups
    public void examTicketGroupsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/exam-ticket-groups");
        ExamTicketGroupsPage examTicketGroupsPage = new ExamTicketGroupsPage();
        examTicketGroupsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(34)
    //  Архив
    //  /ru/tko/control/annual-archive
    public void annualArchivePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/annual-archive");
        AnnualArchivePage annualArchivePage = new AnnualArchivePage();
        annualArchivePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(35)
    //  Мои дети - Добавить ребенка
    //  /ru/tko/account/children/create
    public void childrenCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/account/children/create");
        ChildrenCreatePage childrenCreatePage = new ChildrenCreatePage();
        childrenCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(36)
    //  Личный кабинет (Уведомления) - Уведомления
    //  /ru/tko/profile/notifications
    public void profileNotificationsPageView() {
        open("https://college.dev-snation.kz/ru/tko/profile/notifications");
        ProfileNotificationsPage profileNotificationsPage = new ProfileNotificationsPage();
        profileNotificationsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(37)
    //  Сменить организацию
    //  /ru/tko/select-organization/college
    public void selectOrganizationPageView() {
        open("https://college.dev-snation.kz/ru/tko/select-organization/college");
        SelectOrganizationPage  selectOrganizationPage  = new SelectOrganizationPage ();
        selectOrganizationPage .checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(38)
    //  Сменить роль
    //  /ru/tko/select-role
    public void SelectRolePageView() {
        open("https://college.dev-snation.kz/ru/tko/select-role");
        SelectRolePage  selectRolePage  = new SelectRolePage ();
        selectRolePage.checkTitleToPage().mainPageLink();
    }

}
