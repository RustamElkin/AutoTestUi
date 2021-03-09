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
    //  Регистрация
    //  /ru/tko/registrations
    public void registrationPageView() {
        mainPage.viewModal().clickSelectRegion();
        open("https://college.dev-snation.kz/ru/tko/registrations");
        RegistrationPage  registrationPage  = new RegistrationPage();
        registrationPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(2)
    // mainPage
    // https://college.dev-snation.kz/ru/tko

    public void mainPageView() {
//        mainPage.viewModal().clickSelectRegion();
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
    @Order(3)
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
    //  Контингент - полный список
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
    //   Приемная комиссия - Список приемных комиссий -  Комиссия
    //  /ru/tko/control/statements-admissions
    public void statementsAdmissionsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/statements-admissions");
        StatementsAdmissionsPage statementsAdmissionsPage = new StatementsAdmissionsPage();
        statementsAdmissionsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(20)
    //   Приемная комиссия - Гос. услуги_Заявки с внешних сервисов_Необработанные
    //  /ru/tko/control/external-statements
    public void externalStatementsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-statements");
        ExternalStatementsPage externalStatementsPage = new ExternalStatementsPage();
        externalStatementsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(21)
    //   Приемная комиссия - Вступительные экзамены - Активные
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
    //  Документооборот - Документооборот_Входящие письма
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

    @Test
    @Order(39)
    //  Результаты работы конкурсной комиссии
    //  /ru/tko/statement-admissions
    public void competitionResultPageView() {
        open("https://college.dev-snation.kz/ru/tko/statement-admissions");
        CompetitionResultPage  competitionResultPage  = new CompetitionResultPage ();
        competitionResultPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(40)
    //  Колледжи
    //  /ru/tko/colleges
    public void collegesPageView() {
        open("https://college.dev-snation.kz/ru/tko/colleges");
        CollegesPage  collegesPage  = new CollegesPage();
        collegesPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(41)
    //  Информация о колледже
    //  /ru/tko/college/19181/about
    public void collegesInformationPageView() {
        open("https://college.dev-snation.kz/ru/tko/college/19181/about");
        CollegesInformationPage  collegesInformationPage  = new CollegesInformationPage();
        collegesInformationPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(42)
    //  Онлайн курсы для студентов
    //  /ru/tko/course/lists
    public void courseListPageView() {
        open("https://college.dev-snation.kz/ru/tko/course/lists");
        CourseListPage  courseListPage  = new CourseListPage();
        courseListPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(43)
    //  Статистика
    //  /ru/tko/statistics
    public void statisticsPageView() {
        open("https://college.dev-snation.kz/ru/tko/statistics");
        StatisticsPage  statisticsPage  = new StatisticsPage();
        statisticsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(44)
    //  Инструкции
    //  /ru/tko/faq
    public void faqPageView() {
        open("https://college.dev-snation.kz/ru/tko/faq");
        FaqPage  faqPage  = new FaqPage();
        faqPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(45)
    //  Прием документов в организации
    //  /ru/tko/colleges/faq/info?type=6
    public void faqInfoTypePageView() {
        open("https://college.dev-snation.kz/ru/tko/colleges/faq/info?type=6");
        FaqInfoTypePage  faqInfoTypePage  = new FaqInfoTypePage();
        faqInfoTypePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(46)
    // Заявки на подключение детей
    //  /ru/tko/control/parent-link-statements
    public void parentLinkStatementsView() {
        open("https://college.dev-snation.kz/ru/tko/control/parent-link-statements");
        ParentLinkStatementsPage parentLinkStatementsPage= new ParentLinkStatementsPage();
        parentLinkStatementsPage.checkTitleToPage().mainPageLink();
    }


    @Test
    @Order(47)
    //  Вход
    //  /ru/tko/login
    public void loginPageView() {
        open("https://college.dev-snation.kz/ru/tko/login");
        LoginPage  loginPage  = new LoginPage();
        loginPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(48)
    //  Мои файлы
    //  /ru/tko/account/files
    public void accountFilesPageView() {
        open("https://college.dev-snation.kz/ru/tko/account/files");
        AccountFilesPage  accountFilesPage  = new AccountFilesPage();
        accountFilesPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(49)
    //  Сменить пароль
    //  /ru/tko/profile/settings/password
    public void settingsPasswordPageView() {
        open("https://college.dev-snation.kz/ru/tko/profile/settings/password");
        SettingsPasswordPage  settingsPasswordPage  = new SettingsPasswordPage();
        settingsPasswordPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(50)
    //  Редактировать профиль
    //  /ru/tko/account/profile/edit
    public void accountProfileEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/account/profile/edit");
        AccountProfileEditPage  accountProfileEditPage  = new AccountProfileEditPage();
        accountProfileEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(51)
    //  Просмотр заявки
    //  /ru/tko/control/parent-link-statements/86
    public void controlParentLinkStatementsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/parent-link-statements/86");
        ControlParentLinkStatementsPage  controlParentLinkStatementsPage  = new ControlParentLinkStatementsPage();
        controlParentLinkStatementsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(52)
    //  Профиль колледжа
    //  /ru/tko/organization-profile
    public void organizationProfilePageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-profile");
        OrganizationProfilePage  organizationProfilePage  = new OrganizationProfilePage();
        organizationProfilePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(53)
    //  Редактирование профиля колледжа
    //  /ru/tko/organization-profile/edit
    public void organizationProfileEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-profile/edit");
        OrganizationProfileEditPage  organizationProfileEditPage  = new OrganizationProfileEditPage();
        organizationProfileEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(54)
    //  Регистрационные сведения колледжа
    //  /ru/tko/organization-reg-info
    public void organizationRegInfoPageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-reg-info");
        OrganizationRegInfoPage  organizationRegInfoPage  = new OrganizationRegInfoPage();
        organizationRegInfoPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(55)
    //  Редактирование регистрационных сведений колледжа
    //  /ru/tko/organization-reg-info/edit
    public void organizationRegInfoEditView() {
        open("https://college.dev-snation.kz/ru/tko/organization-reg-info/edit");
        OrganizationRegInfoEdit  organizationRegInfoEdit  = new OrganizationRegInfoEdit();
        organizationRegInfoEdit.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(56)
    // МТБ колледжа
    //  /ru/tko/organization-mtb
    public void organizationMtbPageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-mtb");
        OrganizationMtbPage  organizationMtbPage  = new OrganizationMtbPage();
        organizationMtbPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(57)
    // Редактирование МТБ колледжа
    //  /ru/tko/organization-mtb/edit
    public void organizationMtbEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-mtb/edit");
        OrganizationMtbEditPage  organizationMtbEditPage  = new OrganizationMtbEditPage();
        organizationMtbEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(58)
    // Добавить сотрудника
    //  /ru/tko/control/personnel/create
    public void personnelCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/personnel/create");
        PersonnelCreatePage  personnelCreatePage  = new PersonnelCreatePage();
        personnelCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(59)
    // Сведения о сотруднике
    //  /ru/tko/control/personnel/2812
    public void personnelIntelligencePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/personnel/2812");
        PersonnelIntelligencePage  personnelIntelligencePage  = new PersonnelIntelligencePage();
        personnelIntelligencePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(60)
    // Администрация
    //  /ru/tko/control/personnel?type=administration
    public void personnelTypeAdministrationPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/personnel?type=administration");
        PersonnelTypeAdministrationPage  personnelTypeAdministrationPage  = new PersonnelTypeAdministrationPage();
        personnelTypeAdministrationPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(61)
    // ППС (Преподаватели)
    //  /ru/tko/control/personnel?type=educator
    public void personnelTypeEducatorPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/personnel?type=educator");
        PersonnelTypeEducatorPage  personnelTypeEducatorPage  = new PersonnelTypeEducatorPage();
        personnelTypeEducatorPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(62)
    // Сотрудники
    //  /ru/tko/control/personnel?type=staff
    public void personnelTypeStaffPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/personnel?type=staff");
        PersonnelTypeStaffPage  personnelTypeStaffPage  = new PersonnelTypeStaffPage();
        personnelTypeStaffPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(63)
    // Добавление в контингент
    //  /ru/tko/control/contingent/create
    public void contingentCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/contingent/create");
        ContingentCreatePage  contingentCreatePage = new ContingentCreatePage();
        contingentCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(64)
    // Контингент_редактирование
    //  /ru/tko/control/contingent/edit/8072
    public void contingentEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/contingent/edit/8072");
        ContingentEditPage  contingentEditPage = new ContingentEditPage();
        contingentEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(65)
    // Сведения о контингенте
    //  /ru/tko/control/contingent/8072
    public void contingentInformationPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/contingent/8072");
        ContingentInformationPage  contingentInformationPage = new ContingentInformationPage();
        contingentInformationPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(66)
    // Группы
    //  /ru/tko/control/group
    public void controlGroupPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/group");
        ContingentInformationPage  contingentInformationPage = new ContingentInformationPage();
        contingentInformationPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(67)
    // Создание групп
    //  /ru/tko/control/group/create
    public void groupCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/group/create");
        ContingentInformationPage  contingentInformationPage = new ContingentInformationPage();
        contingentInformationPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(68)
    // Сведения о группе
    //  /ru/tko/control/group/183/show
    public void groupShowPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/group/183/show");
        ContingentInformationPage  contingentInformationPage = new ContingentInformationPage();
        contingentInformationPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(69)
    // Редактирование группы
    //  /ru/tko/control/group/115/edit
    public void groupEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/group/115/edit");
        GroupEditPage  groupEditPage = new GroupEditPage();
        groupEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(70)
    // Выбытие выпускников
    //  /ru/tko/control/group/1456/graduate-contingent
    public void groupGraduateContingentPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/group/1456/graduate-contingent");
        GroupGraduateContingentPage  groupGraduateContingentPage = new GroupGraduateContingentPage();
        groupGraduateContingentPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(71)
    // Управление группой
    //  /ru/tko/control/group/115/management
    public void groupManagementPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/group/115/management");
        GroupManagementPage  groupManagementPage = new GroupManagementPage();
        groupManagementPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(72)
    // Подгруппы
    //  /ru/tko/control/subgroup
    public void subgroupPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/subgroup");
        SubgroupPage  subgroupPage = new SubgroupPage();
        subgroupPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(73)
    // Создание подгрупп
    //  /ru/tko/control/subgroup/create
    public void subgroupCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/subgroup/create");
        SubgroupCreatePage  subgroupCreatePage = new SubgroupCreatePage();
        subgroupCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(74)
    // Управление подгруппой
    //  /ru/tko/control/subgroup/813/management
    public void subgroupManagementPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/subgroup/813/management");
        SubgroupManagementPage  subgroupManagementPage = new SubgroupManagementPage();
        subgroupManagementPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(75)
    // Сведения о подгруппе
    //  /ru/tko/control/subgroup/813/show
    public void subgroupShowPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/subgroup/813/show");
        SubgroupShowPage  subgroupShowPage = new SubgroupShowPage();
        subgroupShowPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(76)
    // Редактирование подгруппы
    //  /ru/tko/control/subgroup/813/edit
    public void subgroupEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/subgroup/813/edit");
        SubgroupEditPage  subgroupEditPage = new SubgroupEditPage();
        subgroupEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(77)
    // Контингент_Кафедры
    //  /ru/tko/control/education-department
    public void educationDepartmentPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/education-department");
        EducationDepartmentPage  educationDepartmentPage = new EducationDepartmentPage();
        educationDepartmentPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(78)
    // Создание кафедры
    //  /ru/tko/control/education-department/create
    public void educationDepartmentCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/education-department/create");
        EducationDepartmentCreatePage  educationDepartmentCreatePage = new EducationDepartmentCreatePage();
        educationDepartmentCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(79)
    // Сведения и редактирование кафедры
    //  /ru/tko/control/education-department/28/edit
    public void educationDepartmentEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/education-department/28/edit");
        EducationDepartmentEditPage  educationDepartmentEditPage = new EducationDepartmentEditPage();
        educationDepartmentEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(80)
    // Контингент_Архив
    // /ru/tko/control/contingent/archive
    public void contingentArchivePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/contingent/archive");
        ContingentArchivePage  contingentArchivePage = new ContingentArchivePage();
        contingentArchivePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(81)
    // Архив_Выпускные группы
    // /ru/tko/control/contingent/archive/graduated-groups
    public void archiveGraduatedGroupsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/contingent/archive/graduated-groups");
        ArchiveGraduatedGroupsPage  archiveGraduatedGroupsPage = new ArchiveGraduatedGroupsPage();
        archiveGraduatedGroupsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(82)
    // Архив_Сведения о выпускной группе
    // /ru/tko/control/group/12705/show
    public void archiveGraduatedGroupShowPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/group/12705/show");
        ArchiveGraduatedGroupShowPage  archiveGraduatedGroupShowPage = new ArchiveGraduatedGroupShowPage();
        archiveGraduatedGroupShowPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(83)
    // Архив_Выбывшие
    // /ru/tko/control/contingent/archive/expelled-students
    public void contingentArchiveExpelledStudentsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/contingent/archive/expelled-students");
        ContingentArchiveExpelledStudentsPage  contingentArchiveExpelledStudentsPage = new ContingentArchiveExpelledStudentsPage();
        contingentArchiveExpelledStudentsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(84)
    // Просмотр учебного плана
    // /ru/tko/control/curriculum/2670/show
    public void curriculumShowPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/curriculum/2670/show");
        CurriculumShowPage  curriculumShowPage = new CurriculumShowPage();
        curriculumShowPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(85)
    // Редактирование учебного плана
    // /ru/tko/control/curriculum/2670/edit
    public void curriculumEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/curriculum/2670/edit");
        CurriculumEditPage  curriculumEditPage = new CurriculumEditPage();
        curriculumEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(86)
    // График учебного процесса
    // /ru/tko/control/curriculum-schedule
    public void curriculumScheduleGupPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/curriculum-schedule");
        CurriculumScheduleGupPage  curriculumScheduleGupPage = new CurriculumScheduleGupPage();
        curriculumScheduleGupPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(87)
    // Просмотр графика учебного процесса
    // /ru/tko/control/curriculum-schedule-year?year=2020
    public void curriculumScheduleYearView() {
        open("https://college.dev-snation.kz/ru/tko/control/curriculum-schedule-year?year=2020");
        CurriculumScheduleYear  curriculumScheduleYear = new CurriculumScheduleYear();
        curriculumScheduleYear.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(88)
    // График занятий
    // /ru/tko/control/org-education-time-group
    public void orgEducationTimeGroupPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/org-education-time-group");
        OrgEducationTimeGroupPage  orgEducationTimeGroupPage = new OrgEducationTimeGroupPage();
        orgEducationTimeGroupPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(89)
    // Добавление графика занятий
    // /ru/tko/control/org-education-time-group/create
    public void orgEducationTimeGroupCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/org-education-time-group/create");
        OrgEducationTimeGroupCreatePage  orgEducationTimeGroupCreatePage = new OrgEducationTimeGroupCreatePage();
        orgEducationTimeGroupCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(90)
    // Просмотр графика занятий
    // /ru/tko/control/org-education-time-group/1056
    public void orgEducationTimeGroupShowPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/org-education-time-group/1056");
        OrgEducationTimeGroupShowPage  orgEducationTimeGroupShowPage = new OrgEducationTimeGroupShowPage();
        orgEducationTimeGroupShowPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(91)
    // Редактирование графика занятий
    // /ru/tko/control/org-education-time-group/1056/edit
    public void orgEducationTimeGroupEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/org-education-time-group/1056/edit");
        OrgEducationTimeGroupEditPage  orgEducationTimeGroupEditPage = new OrgEducationTimeGroupEditPage();
        orgEducationTimeGroupEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(92)
    // Создание расписания
    // /ru/tko/control/training-schedule/create
    public void trainingScheduleCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/training-schedule/create");
        TrainingScheduleCreatePage  trainingScheduleCreatePage = new TrainingScheduleCreatePage();
        trainingScheduleCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(93)
    // Создание журнала
    // /ru/tko/control/journal/create
    public void journalCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/journal/create");
        JournalCreatePage  journalCreatePage = new JournalCreatePage();
        journalCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(94)
    // Журнал
    // /ru/tko/control/journal/208701/show
    public void journalShowPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/journal/208701/show");
        JournalShowPage  journalShowPage = new JournalShowPage();
        journalShowPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(95)
    // Редактирование журнала
    // /ru/tko/control/journal/208701/edit
    public void journalEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/journal/208701/edit");
        JournalEditPage  journalEditPage = new JournalEditPage();
        journalEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(96)
    // Архив журналов
    // /ru/tko/control/journals/archive
    public void journalsArchivePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/journals/archive");
        JournalsArchivePage  journalsArchivePage = new JournalsArchivePage();
        journalsArchivePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(97)
    // Персонал_редактирование
    // /ru/tko/control/personnel/2812/edit
    public void personnelEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/personnel/2812/edit");
        PersonnelEditPage  personnelEditPage = new PersonnelEditPage();
        personnelEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(98)
    // Добавление дипломных работ
    // /ru/tko/control/diploma/create
    public void diplomaCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/diploma/create");
        DiplomaCreatePage  diplomaCreatePage = new DiplomaCreatePage();
        diplomaCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(99)
    // Просмотр дипломной работы
    // /ru/tko/control/diploma-contingent/375
    public void diplomaContingentPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/diploma-contingent/375");
        DiplomaContingentPage  diplomaContingentPage = new DiplomaContingentPage();
        diplomaContingentPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(100)
    // Редактирование дипломной работы
    // /ru/tko/control/diploma-contingent/375/edit
    public void diplomaContingentEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/diploma-contingent/375/edit");
        DiplomaContingentEditPage  diplomaContingentEditPage = new DiplomaContingentEditPage();
        diplomaContingentEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(101)
    // Итоги группы
    // /ru/tko/control/summary/115
    public void controlSummaryGroupPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/summary/115");
        ControlSummaryGroupPage  controlSummaryGroupPage = new ControlSummaryGroupPage();
        controlSummaryGroupPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(102)
    // Создание модуля
    // /ru/tko/control/education-module/create
    public void educationModuleCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/education-module/create");
        EducationModuleCreatePage  educationModuleCreatePage = new EducationModuleCreatePage();
        educationModuleCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(103)
    // Редактирование модуля
    // /ru/tko/control/education-module/28/edit
    public void educationModuleEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/education-module/28/edit");
        EducationModuleCreatePage  educationModuleCreatePage = new EducationModuleCreatePage();
        educationModuleCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(104)
    // Активность организаций
    // /ru/tko/control/monitoring/activity
    public void monitoringActivityPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/activity");
        MonitoringActivityPage  monitoringActivityPage = new MonitoringActivityPage();
        monitoringActivityPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(105)
    // Активность организации_контингент
    // /ru/tko/control/monitoring/activity/19195/contingent
    public void monitoringActivityCollegeContingentPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/activity/19195/contingent");
        MonitoringActivityCollegeContingentPage  monitoringActivityCollegeContingentPage = new MonitoringActivityCollegeContingentPage();
        monitoringActivityCollegeContingentPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(106)
    // Активность организации_персонал
    // /ru/tko/control/monitoring/activity/19195/personnel
    public void monitoringActivityCollegePersonnelPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/activity/19195/personnel");
        MonitoringActivityCollegePersonnelPage  monitoringActivityCollegePersonnelPage = new MonitoringActivityCollegePersonnelPage();
        monitoringActivityCollegePersonnelPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(107)
    // Мониторинг_Успеваемость
    // /ru/tko/control/monitoring/academic_performance
    public void monitoringAcademicPerformancePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/academic_performance");
        MonitoringAcademicPerformancePage  monitoringAcademicPerformancePage = new MonitoringAcademicPerformancePage();
        monitoringAcademicPerformancePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(108)
    // Мониторинг_Посещаемость
    // /ru/tko/control/monitoring/attendance
    public void monitoringAttendancePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/attendance");
        MonitoringAttendancePage  monitoringAttendancePage = new MonitoringAttendancePage();
        monitoringAttendancePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(109)
    // Мониторинг_Онлайн занятия
    // /ru/tko/control/monitoring/people/groups/19195
    public void monitoringPeopleGroupsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/people/groups/19195");
        MonitoringPeopleGroupsPage  monitoringPeopleGroupsPage = new MonitoringPeopleGroupsPage();
        monitoringPeopleGroupsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(110)
    // Мониторинг_Онлайн занятия_Список студентов_в группе
    // /ru/tko/control/monitoring/people/students/115
    public void monitoringPeopleStudentsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/people/students/115");
        MonitoringPeopleStudentsPage  monitoringPeopleStudentsPage = new MonitoringPeopleStudentsPage();
        monitoringPeopleStudentsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(111)
    // Мониторинг_Онлайн занятия_Журнал событий студента
    // /ru/tko/control/monitoring/people/details/28716996
    public void monitoringStudentsDetailsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/people/details/28716996");
        MonitoringStudentsDetailsPage  monitoringStudentsDetailsPage = new MonitoringStudentsDetailsPage();
        monitoringStudentsDetailsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(112)
    // Мониторинг_Онлайн занятия_Список персонала
    // /ru/tko/control/monitoring/people/personnel/19195
    public void monitoringPeoplePersonnelListPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/people/personnel/19195");
        MonitoringPeoplePersonnelListPage  monitoringPeoplePersonnelListPage = new MonitoringPeoplePersonnelListPage();
        monitoringPeoplePersonnelListPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(113)
    // Мониторинг_Онлайн занятия_Журнал событий педагога
    // /ru/tko/control/monitoring/people/details/28615531
    public void monitoringStaffDetailsAdminPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/people/details/28615531");
        MonitoringStaffDetailsAdminPage  monitoringStaffDetailsAdminPage = new MonitoringStaffDetailsAdminPage();
        monitoringStaffDetailsAdminPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(114)
    // Мониторинг_Дистанционное обучение
    // /ru/tko/control/monitoring/homework/list/19195
    public void monitoringHomeworkListCollegePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/homework/list/19195");
        MonitoringHomeworkListCollegePage  monitoringHomeworkListCollegePage = new MonitoringHomeworkListCollegePage();
        monitoringHomeworkListCollegePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(115)
    // Мониторинг_Дистанционное обучение_Назначенное задание
    // /ru/tko/control/monitoring/homework/494000
    public void monitoringHomeworkGroupPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/homework/494000");
        MonitoringHomeworkGroupPage  monitoringHomeworkGroupPage = new MonitoringHomeworkGroupPage();
        monitoringHomeworkGroupPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(116)
    // Мониторинг_Дистанционное обучение_Ответ студента
    // /ru/tko/control/monitoring/homework/answer/9765934
    public void monitoringStudentHomeworkAnswerPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/homework/answer/9765934");
        MonitoringStudentHomeworkAnswerPage  monitoringStudentHomeworkAnswerPage = new MonitoringStudentHomeworkAnswerPage();
        monitoringStudentHomeworkAnswerPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(117)
    // Мониторинг заявлений по приемным комиссиям
    // /ru/tko/control/monitoring/statements-admissions
    public void monitoringStatementsAdmissionsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/statements-admissions");
        MonitoringStatementsAdmissionsPage  monitoringStatementsAdmissionsPage = new MonitoringStatementsAdmissionsPage();
        monitoringStatementsAdmissionsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(118)
    // Мониторинг заявлений по приемным комиссиям организации
    // /ru/tko/control/monitoring/statements-admissions/19195
    public void monitoringCollegeStatementsAdmissionsPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/monitoring/statements-admissions/19195");
        MonitoringCollegeStatementsAdmissionsPage  monitoringCollegeStatementsAdmissionsPage = new MonitoringCollegeStatementsAdmissionsPage();
        monitoringCollegeStatementsAdmissionsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(119)
    // Гос. услуги_Обработанные заявки
    // /ru/tko/control/gov-service-statement?type=processed
    public void govServiceStatementProcessedPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-service-statement?type=processed");
        GovServiceStatementProcessedPage  govServiceStatementProcessedPage = new GovServiceStatementProcessedPage();
        govServiceStatementProcessedPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(120)
    // Гос. услуги_Заявление студента
    // /ru/tko/control/gov-service-statement/4974
    public void govServiceStudentStatementPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-service-statement/4974");
        GovServiceStudentStatementPage  govServiceStudentStatementPage = new GovServiceStudentStatementPage();
        govServiceStudentStatementPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(121)
    // Гос. услуги_Заявки_Архив
    // /ru/tko/control/gov-service-statement?type=archive
    public void govServiceStatementArchivePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-service-statement?type=archive");
        GovServiceStatementArchivePage  govServiceStatementArchivePage = new GovServiceStatementArchivePage();
        govServiceStatementArchivePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(122)
    // Заявки с внешних сервисов_Сведения
    // /ru/tko/control/external-statement-services/311
    public void studentExternalStatementServicesPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-statement-services/311");
        StudentExternalStatementServicesPage  studentExternalStatementServicesPage = new StudentExternalStatementServicesPage();
        studentExternalStatementServicesPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(123)
    // Обработанные заявки на гос.услуги с внешних сервисов
    // /ru/tko/control/external-statement-services-processed
    public void processedApplicationsListFromExternalServicesPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-statement-services-processed");
        ProcessedApplicationsListFromExternalServicesPage  processedApplicationsListFromExternalServicesPage = new ProcessedApplicationsListFromExternalServicesPage();
        processedApplicationsListFromExternalServicesPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(124)
    // Гос. заказ_Заявка
    // /ru/tko/control/gov-order-statement/4977
    public void govOrderStatementPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-order-statement/4977");
        GovOrderStatementPage  govOrderStatementPage = new GovOrderStatementPage();
        govOrderStatementPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(125)
    // Гос. заказ_Обработанные заявки
    // /ru/tko/control/gov-order-statement?type=processed
    public void govOrderStatementsProcessedPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-order-statement?type=processed");
        GovOrderStatementsProcessedPage  govOrderStatementsProcessedPage = new GovOrderStatementsProcessedPage();
        govOrderStatementsProcessedPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(126)
    // Гос. заказ_Архив заявок
    // /ru/tko/control/gov-order-statement?type=archive
    public void govOrderStatementsArchivePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/gov-order-statement?type=archive");
        GovOrderStatementsArchivePage  govOrderStatementsArchivePage = new GovOrderStatementsArchivePage();
        govOrderStatementsArchivePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(127)
    // Просмотр приемной комиссии
    // /ru/tko/control/statements-admissions/934
    public void ReviewStatementAdmissionPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/statements-admissions/934");
        ReviewStatementAdmissionPage  reviewStatementAdmissionPage = new ReviewStatementAdmissionPage();
        reviewStatementAdmissionPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(128)
    // Редактирование приемной комиссии
    // /ru/tko/control/statements-admissions/934/edit
    public void statementAdmissionEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/statements-admissions/934/edit");
        StatementAdmissionEditPage  statementAdmissionEditPage = new StatementAdmissionEditPage();
        statementAdmissionEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(129)
    // Закрытые приемные комиссии
    // /ru/tko/control/statements-admissions-closed
    public void statementsAdmissionsListClosedPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/statements-admissions-closed");
        StatementsAdmissionsListClosedPage  statementsAdmissionsListClosedPage = new StatementsAdmissionsListClosedPage();
        statementsAdmissionsListClosedPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(130)
    // Гос. услуги_Заявки с внешних сервисов_Обработанные
    // /ru/tko/control/external-statements-processed
    public void externalStatementsProcessedPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-statements-processed");
        ExternalStatementsProcessedPage  externalStatementsProcessedPage = new ExternalStatementsProcessedPage();
        externalStatementsProcessedPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(131)
    // Просмотр заявки с внешних сервисов
    // /ru/tko/control/external-statements/3072
    public void reviewExternalStatementPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/external-statements/3072");
        ReviewExternalStatementPage  reviewExternalStatementPage = new ReviewExternalStatementPage();
        reviewExternalStatementPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(132)
    // Вступительные экзамены в архиве
    // /ru/tko/control/entrance-exam-archive
    public void entranceExamListInArchivePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/entrance-exam-archive");
        EntranceExamListInArchivePage  entranceExamListInArchivePage = new EntranceExamListInArchivePage();
        entranceExamListInArchivePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(133)
    // Вступительный экзамен
    // /ru/tko/control/entrance-exam/339
    public void entranceExamPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/entrance-exam/339");
        EntranceExamPage  entranceExamPage = new EntranceExamPage();
        entranceExamPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(134)
    // Создание вступительного экзамена
    // /ru/tko/control/entrance-exam/create
    public void entranceExamCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/entrance-exam/create");
        EntranceExamCreatePage  entranceExamCreatePage = new EntranceExamCreatePage();
        entranceExamCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(135)
    // Приемная комиссия_Распределение по группам
    // /ru/tko/control/distribution-contingent/164
    public void groupDistributionContingentPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/distribution-contingent/164");
        GroupDistributionContingentPage  groupDistributionContingentPage = new GroupDistributionContingentPage();
        groupDistributionContingentPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(136)
    // Дистанционное обучение_Создание шаблона задания
    // /ru/tko/control/homeworks/create
    public void homeworkTemplateCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/homeworks/create");
        HomeworkTemplateCreatePage  homeworkTemplateCreatePage = new HomeworkTemplateCreatePage();
        homeworkTemplateCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(137)
    // Дистанционное обучение_Просмотр шаблона задания
    // /ru/tko/control/homeworks/1369874
    public void homeworkTemplatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/homeworks/1369874");
        ViewHomeworkTemplatePage  viewHomeworkTemplatePage = new ViewHomeworkTemplatePage();
        viewHomeworkTemplatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(138)
    // Дистанционное обучение_Редактирование шаблона задания
    // /ru/tko/control/homeworks/1369874/edit
    public void homeworkTemplateEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/homeworks/1369874/edit");
        ViewHomeworkTemplatePage  viewHomeworkTemplatePage = new ViewHomeworkTemplatePage();
        viewHomeworkTemplatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(139)
    // Дистанционное обучение_Онлайн лекции
    // /ru/tko/control/online-lectures
    public void onlineLecturesTemplatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/online-lectures");
        OnlineLecturesTemplatePage  onlineLecturesTemplatePage = new OnlineLecturesTemplatePage();
        onlineLecturesTemplatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(140)
    // Дистанционное обучение_Просмотр онлайн лекции
    // /ru/tko/control/online-lectures/25956
    public void viewOnlineLectureTemplatePage() {
        open("https://college.dev-snation.kz/ru/tko/control/online-lectures/25956");
        ViewOnlineLectureTemplatePage  viewOnlineLectureTemplatePage = new ViewOnlineLectureTemplatePage();
        viewOnlineLectureTemplatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(141)
    // Дистанционное обучение_Редактирование онлайн лекции
    // /ru/tko/control/online-lectures/25950/edit
    public void editOnlineLecturesTemplatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/online-lectures/25950/edit");
        EditOnlineLecturesTemplatePage  editOnlineLecturesTemplatePage = new EditOnlineLecturesTemplatePage();
        editOnlineLecturesTemplatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(142)
    // Дистанционное обучение_Создание онлайн лекции
    // /ru/tko/control/online-lectures/create
    public void createOnlineLecturesTemplatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/online-lectures/create");
        CreateOnlineLecturesTemplatePage  createOnlineLecturesTemplatePage = new CreateOnlineLecturesTemplatePage();
        createOnlineLecturesTemplatePage.checkTitleToPage().mainPageLink();
    }


    @Test
    @Order(143)
    // Дистанционное обучение_Назначенное задание
    // /ru/tko/control/assigned-homeworks/494010
    public void viewAssignedHomeworkPage() {
        open("https://college.dev-snation.kz/ru/tko/control/assigned-homeworks/494010");
        ViewAssignedHomeworkPage  viewAssignedHomeworkPage = new ViewAssignedHomeworkPage();
        viewAssignedHomeworkPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(144)
    // Дистанционное обучение_Создание задания
    // /ru/tko/control/assigned-homeworks/create
    public void assignedHomeworkCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/assigned-homeworks/create");
        AssignedHomeworkCreatePage  assignedHomeworkCreatePage = new AssignedHomeworkCreatePage();
        assignedHomeworkCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(145)
    // Дистанционное обучение_Редактирование задания
    // /ru/tko/control/assigned-homeworks/494001/edit
    public void assignedHomeworksEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/assigned-homeworks/494001/edit");
        AssignedHomeworksEditPage  assignedHomeworksEditPage = new AssignedHomeworksEditPage();
        assignedHomeworksEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(146)
    // Дистанционное обучение_Закрытые назначенные задания
    // /ru/tko/control/assigned-homeworks?closed=1
    public void closedAssignedHomeworksPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/assigned-homeworks/494001/edit");
        ClosedAssignedHomeworksPage  closedAssignedHomeworksPage = new ClosedAssignedHomeworksPage();
        closedAssignedHomeworksPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(147)
    // Дистанционное обучение_Удаленные назначенные задания
    // /ru/tko/control/assigned-homeworks?trashed=1
    public void trashedAssignedHomeworksPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/assigned-homeworks?trashed=1");
        TrashedAssignedHomeworksPage  trashedAssignedHomeworksPage = new TrashedAssignedHomeworksPage();
        trashedAssignedHomeworksPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(148)
    // Дистанционное обучение_Ответ на задание
    // /ru/tko/control/assigned-homework/494005/assigned-homework-contingent/9766029
    public void studentHomeworkAnswerPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/assigned-homework/494005/assigned-homework-contingent/9766029");
        StudentHomeworkAnswerPage  studentHomeworkAnswerPage = new StudentHomeworkAnswerPage();
        studentHomeworkAnswerPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(149)
    // Документооборот_Просмотр приказа
    // /ru/tko/document-flow/orders/4
    public void viewDocumentFlowOrderPage() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/orders/4");
        ViewDocumentFlowOrderPage  viewDocumentFlowOrderPage = new ViewDocumentFlowOrderPage();
        viewDocumentFlowOrderPage.checkTitleToPage().mainPageLink();
    }


    @Test
    @Order(150)
    // Документооборот_Просмотр входящего письма
    // /ru/tko/document-flow/letters/8
    public void viewDocumentsFlowLetterPage() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/letters/8");
        ViewDocumentsFlowLetterPage  viewDocumentsFlowLetterPage = new ViewDocumentsFlowLetterPage();
        viewDocumentsFlowLetterPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(151)
    // Документооборот_Создать и отправить письмо
    // /ru/tko/document-flow/letters/create
    public void documentFlowLetterCreateAndSubmitPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/letters/create");
        DocumentFlowLetterCreateAndSubmitPage  documentFlowLetterCreateAndSubmitPage = new DocumentFlowLetterCreateAndSubmitPage();
        documentFlowLetterCreateAndSubmitPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(152)
    // Документооборот_Исходящие письма
    // /ru/tko/document-flow/letters-outgoing
    public void documentFlowLettersOutgoingPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/letters-outgoing");
        DocumentFlowLettersOutgoingPage  documentFlowLettersOutgoingPage = new DocumentFlowLettersOutgoingPage();
        documentFlowLettersOutgoingPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(153)
    // Документооборот_Оставить заявку
    // /ru/tko/document-flow/statements/create
    public void documentFlowStatementsCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/statements/create");
        DocumentFlowStatementsCreatePage  documentFlowStatementsCreatePage = new DocumentFlowStatementsCreatePage();
        documentFlowStatementsCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(154)
    // Документооборот
    // /ru/tko/document-flow/statements/109
    public void viewDocumentFlowStatementPage() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/statements/109");
        ViewDocumentFlowStatementPage  viewDocumentFlowStatementPage = new ViewDocumentFlowStatementPage();
        viewDocumentFlowStatementPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(155)
    // Документооборот_История изменения заявки
    // /ru/tko/document-flow/statements/109?history=1
    public void viewDocumentFlowStatementHistoryPage() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/statements/109?history=1");
        ViewDocumentFlowStatementHistoryPage  viewDocumentFlowStatementHistoryPage = new ViewDocumentFlowStatementHistoryPage();
        viewDocumentFlowStatementHistoryPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(156)
    // Архив_Приказы
    // /ru/tko/document-flow/archive/orders
    public void documentFlowArchiveOrdersPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/archive/orders");
        DocumentFlowArchiveOrdersPage  documentFlowArchiveOrdersPage = new DocumentFlowArchiveOrdersPage();
        documentFlowArchiveOrdersPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(157)
    // Архив_Исходящие письма
    // /ru/tko/document-flow/archive/outgoing-letters
    public void documentFlowArchiveOutgoingLettersPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/archive/outgoing-letters");
        DocumentFlowArchiveOutgoingLettersPage  documentFlowArchiveOutgoingLettersPage = new DocumentFlowArchiveOutgoingLettersPage();
        documentFlowArchiveOutgoingLettersPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(158)
    // Архив_Входящие письма
    // /ru/tko/document-flow/archive/incoming-letters
    public void documentFlowArchiveIncomingLettersPageView() {
        open("https://college.dev-snation.kz/ru/tko/document-flow/archive/incoming-letters");
        DocumentFlowArchiveIncomingLettersPage  documentFlowArchiveIncomingLettersPage = new DocumentFlowArchiveIncomingLettersPage();
        documentFlowArchiveIncomingLettersPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(159)
    // Добавить пост
    // /ru/tko/organization-posts/create
    public void organizationPostsCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-posts/create");
        OrganizationPostsCreatePage  organizationPostsCreatePage = new OrganizationPostsCreatePage();
        organizationPostsCreatePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(160)
    // Просмотр поста
    // /ru/tko/organization-posts/90
    public void viewPostsPage() {
        open("https://college.dev-snation.kz/ru/tko/organization-posts/90");
        ViewPostsPage  viewPostsPage = new ViewPostsPage();
        viewPostsPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(161)
    // Редактирование поста
    // /ru/tko/organization-posts/90/edit
    public void organizationPostsEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-posts/90/edit");
        OrganizationPostsEditPage  organizationPostsEditPage = new OrganizationPostsEditPage();
        organizationPostsEditPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(162)
    // Блог_Вопрос-ответ
    // /ru/tko/organization-issues
    public void organizationIssuesPageView() {
        open("https://college.dev-snation.kz/ru/tko/organization-issues");
        OrganizationIssuesPage  organizationIssuesPage = new OrganizationIssuesPage();
        organizationIssuesPage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(163)
    // Расписание экзаменов
    // /ru/tko/control/exam-training-schedule
    public void examTrainingSchedulePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/exam-training-schedule");
        ExamTrainingSchedulePage  examTrainingSchedulePage = new ExamTrainingSchedulePage();
        examTrainingSchedulePage.checkTitleToPage().mainPageLink();
    }

    @Test
    @Order(164)
    // Ответ студента_тестирование
    // /ru/tko/5870/ticket-assignment/106/check
    public void ticketAssignmentCheckPageView() {
        open("https://college.dev-snation.kz/ru/tko/5870/ticket-assignment/106/check");
        TicketAssignmentCheckPage  ticketAssignmentCheckPage = new TicketAssignmentCheckPage();
        ticketAssignmentCheckPage.checkTitlesToPage().mainPageLink();
    }

    @Test
    @Order(165)
    // Экзамен
    // /ru/tko/control/exams/36223
    public void examCheckPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/exams/36223");
        ExamCheckPage  examCheckPage = new ExamCheckPage();
        examCheckPage.checkTitlesToPage().mainPageLink();
    }

    @Test
    @Order(166)
    // Создание экзамена
    // /ru/tko/control/exams/create
    public void examsCreatePageView() {
        open("https://college.dev-snation.kz/ru/tko/control/exams/create");
        ExamsCreatePage  examsCreatePage = new ExamsCreatePage();
        examsCreatePage.checkTitlesToPage().mainPageLink();
    }

    @Test
    @Order(167)
    // Просмотр и редактирование экзаменационных вопросов
    // /ru/tko/exam-questions/6528/exam-edit
    public void examQuestionsExamEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/exam-questions/6528/exam-edit");
        ExamQuestionsExamEditPage  examQuestionsExamEditPage = new ExamQuestionsExamEditPage();
        examQuestionsExamEditPage.checkTitlesToPage().mainPageLink();
    }

    @Test
    @Order(168)
    // Редактирование информаций по экзаменационным вопросам
    // /ru/tko/exam-questions/5882/edit
    public void examQuestionsInfoEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/exam-questions/5882/edit");
        ExamQuestionsInfoEditPage  examQuestionsInfoEditPage = new ExamQuestionsInfoEditPage();
        examQuestionsInfoEditPage.checkElementsToPage().mainPageLink();
    }

    @Test
    @Order(169)
    // Создание группы экзаменационных билетов
    // /ru/tko/control/exam-ticket-groups/create
    public void examTicketGroupsCreatePage() {
        open("https://college.dev-snation.kz/ru/tko/control/exam-ticket-groups/create");
        ExamTicketGroupsCreatePage  examTicketGroupsCreatePage = new ExamTicketGroupsCreatePage();
        examTicketGroupsCreatePage.checkElementsToPage().mainPageLink();
    }

    @Test
    @Order(170)
    // Просмотр и редактирование экзаменационных билетов
    // /ru/tko/control/exam-ticket-groups/5545
    public void examTicketsEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/exam-ticket-groups/5545");
        ExamTicketsEditPage  examTicketsEditPage = new ExamTicketsEditPage();
        examTicketsEditPage.checkElementsToPage().mainPageLink();
    }

    @Test
    @Order(171)
    // Редактирование информаций по экзаменационным билетам
    // /ru/tko/control/exam-ticket-groups/5545/edit
    public void examTicketGroupsEditPageView() {
        open("https://college.dev-snation.kz/ru/tko/control/exam-ticket-groups/5545/edit");
        ExamTicketGroupsEditPage  examTicketGroupsEditPage = new ExamTicketGroupsEditPage();
        examTicketGroupsEditPage.checkElementsToPage().mainPageLink();
    }
//
//    @Test
//    @Order(172)
//    // Архив_Модули за учебный год
//    // /ru/tko/control/annual-archive/modules/1796
//    public void annualArchiveModulesPageView() {
//        open("https://college.dev-snation.kz/ru/tko/control/annual-archive/modules/1796");
//        AnnualArchiveModulesPage  annualArchiveModulesPage = new AnnualArchiveModulesPage();
//        annualArchiveModulesPage.checkElementsToPage().mainPageLink();
//    }
//
//    @Test
//    @Order(173)
//    // Архив_Журналы
//    // /ru/tko/control/annual-archive/modules/1796/journals
//    public void annualArchiveModulesJournalsPageView() {
//        open("https://college.dev-snation.kz/ru/tko/control/annual-archive/modules/1796/journals");
//        AnnualArchiveModulesJournalsPage  annualArchiveModulesJournalsPage = new AnnualArchiveModulesJournalsPage();
//        annualArchiveModulesJournalsPage.checkElementsToPage().mainPageLink();
//    }
//
//    @Test
//    @Order(174)
//    // Архив_Журнал
//    // /ru/tko/control/annual-archive/modules/1796/journals/132906/show
//    public void viewAnnualArchiveJournalPage() {
//        open("https://college.dev-snation.kz/ru/tko/control/annual-archive/modules/1796/journals/132906/show");
//        ViewAnnualArchiveJournalPage  viewAnnualArchiveJournalPage = new ViewAnnualArchiveJournalPage();
//        viewAnnualArchiveJournalPage.checkElementsToPage().mainPageLink();
//    }
//
//    @Test
//    @Order(175)
//    // Архив_Назначенные задания
//    // /ru/tko/control/annual-archive/modules/1796/assigned-homeworks
//    public void annualArchiveModulesAssignedHomeworksPageView() {
//        open("https://college.dev-snation.kz/ru/tko/control/ru/tko/control/annual-archive/modules/1796/assigned-homeworks");
//        AnnualArchiveModulesAssignedHomeworksPage  annualArchiveModulesAssignedHomeworksPage = new AnnualArchiveModulesAssignedHomeworksPage();
//        annualArchiveModulesAssignedHomeworksPage.checkElementsToPage().mainPageLink();
//    }
//
//    @Test
//    @Order(176)
//    // Архив_Назначенного задания
//    // /ru/tko/control/annual-archive/modules/1796/assigned-homeworks/494007
//    public void annualArchiveModulesAssignedHomeworkPageView() {
//        open("https://college.dev-snation.kz/ru/tko/control/annual-archive/modules/1796/assigned-homeworks/494007");
//        AnnualArchiveModulesAssignedHomeworkPage  annualArchiveModulesAssignedHomeworkPage = new AnnualArchiveModulesAssignedHomeworkPage();
//        annualArchiveModulesAssignedHomeworkPage.checkElementsToPage().mainPageLink();
//    }
//
//    @Test
//    @Order(177)
//    // Архив_Просмотр ответа сутдента на назначенное задание
//    // /ru/tko/control/annual-archive/modules/4/assigned-homeworks/494009/9766100
//    public void viewAnnualArchiveStudentAnswerToHomeworkPage() {
//        open("https://college.dev-snation.kz/ru/tko/control/annual-archive/modules/1796/assigned-homeworks/494007");
//        ViewAnnualArchiveStudentAnswerToHomeworkPage  viewAnnualArchiveStudentAnswerToHomeworkPage = new ViewAnnualArchiveStudentAnswerToHomeworkPage();
//        viewAnnualArchiveStudentAnswerToHomeworkPage.checkElementsToPage().mainPageLink();
//    }


}
