// Контингент_полный список
//  /ru/tko/control/contingent

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ContingentPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]");


    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                    // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                             // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                       // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                          // 'Кафедры'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   //'Архив'


    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");


    // Кнопка добавить
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");


    // Фильтры
    // Кнопки "Показать и свернуть" чтоб развернуть фильтры
    private SelenideElement  informationOnStudentsViewBtn= $x("/span[contains(text(),'Общие сведения по студентам')]/.. //button");
    private SelenideElement  informationOnSocialStatusViewBtn= $x("/span[contains(text(),'Сведения по социальному статусу')]/.. //button");
    private SelenideElement  arrivalInformationViewBtn= $x("/span[contains(text(),'Сведения по месту прибытия')]/.. //button");
    private SelenideElement  studentCharacteristicsViewBtn= $x("/span[contains(text(),'Характеристика студента')]/.. //button");


    private SelenideElement organizationFilter= $x("//label[contains(text(),'Организация')]/following-sibling::div/div[@class=\"multiselect__tags\"]"); //'Организация'
    //Выбираем "Индустриально-технический колледж" в фильтре организаций
    private SelenideElement selectIndustrialCollege= $x("//span[contains(text(),'ГККП «Индустриально-технический колледж»')]/../..");

    private SelenideElement dateForGrades = $x("//div[8]/div/div[2]/span/..");
    private SelenideElement selectLastDateForGrade = $x("//div[8]/div/div[2]/span/../..//li[1]");

    private SelenideElement surnameFilter= $x("//label[contains(text(),'Фамилия: ')]/following-sibling::input"); // 'Фамилия'
    private SelenideElement nameFilter= $x("//label[contains(text(),'Имя: ')]/following-sibling::input[@name=\"filters[firstname]\"]"); // 'Имя'
    private SelenideElement patronymicFilter= $x("//label[contains(text(),'Отчество: ')]/following-sibling::input[@name=\"filters[lastname]\"]"); // 'Отчество'

    // Фильтры с диапазоном
    // "Дата выбытия"
    private SelenideElement retirementDateFromFilter= $x("//label[contains(text(),'Дата выбытия: ')]/following-sibling::div/div/input[@name='filters[retirement_date][from]']"); // "От"
    private SelenideElement retirementDateToFilter= $x("//label[contains(text(),'Дата выбытия: ')]/following-sibling::div/div/input[@name='filters[retirement_date][to]']");     // "До"

    // "Возраст"
    private SelenideElement ageFromFilter= $x("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][from]']"); // "Возраст от"
    private SelenideElement ageToFilter= $x("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][to]']"); // "Возраст до"

    // "Количество детей"
    private SelenideElement numberOfChildrenFromFilter= $x("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][from]']");
    private SelenideElement numberOfChildrenToFilter= $x("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][to]']");


    // Фильтры со списком
    private SelenideElement academicYearFilter= $x("//label[contains(text(),'Учебный год')]/following-sibling::div");
    private SelenideElement cathedraFilter= $x("//label[contains(text(),'Кафедра')]/following-sibling::div");
    private SelenideElement specialtyFilter= $x("//label[contains(text(),'Специальность')]/following-sibling::div");
    private SelenideElement qualificationFilter= $x("//label[contains(text(),'Квалификация')]/following-sibling::div");
    private SelenideElement courseFilter= $x("//label[contains(text(),'Курс: ')]/following-sibling::div");
    private SelenideElement languageEducationFilter= $x("//label[contains(text(),'Язык обучения')]/following-sibling::div");
    private SelenideElement formOfStudyFilter= $x("//label[contains(text(),'Форма обучения')]/following-sibling::div");
    private SelenideElement groupFilter= $x("//label[contains(text(),'Группа')]/following-sibling::div");
    private SelenideElement considerInActivityMonitoringFilter= $x("//label[contains(text(),'Учитывать в мониторинге активности')]/following-sibling::div");

    private SelenideElement genderFilter= $x("//label[contains(text(),'Пол')]/following-sibling::div");
    private SelenideElement citizenshipFilter= $x("//label[contains(text(),'Гражданство')]/following-sibling::div");
    private SelenideElement nationalityFilter= $x("//label[contains(text(),'Национальность')]/following-sibling::div");
    private SelenideElement scholarshipRecipientFilter= $x("//label[contains(text(),'Получатель стипендии')]/following-sibling::div");
    private SelenideElement healthStatusFilter= $x("//label[contains(text(),'Состояние здоровья')]/following-sibling::div");
    private SelenideElement sportAchievementsFilter= $x("//label[contains(text(),'Спорт. достижения')]/following-sibling::div");
    private SelenideElement participationInCollegeLifeFilter= $x("//label[contains(text(),'Участие в жизни колледжа')]/following-sibling::div");
    private SelenideElement familyStatusFilter= $x("//label[contains(text(),'Семейное положение')]/following-sibling::div");
    private SelenideElement achievementsFilter= $x("//label[contains(text(),'Достижения')]/following-sibling::div");

    private SelenideElement actualPlaceOfResidenceFilter= $x("//label[contains(text(),'Фактическое место проживания')]/following-sibling::div");
    private SelenideElement familyInformationFilter= $x("//span[contains(text(),'полная семья')]/../../../../../div[@class=\"multiselect__tags\"]");
    private SelenideElement financialSituationFilter= $x("//label[contains(text(),'Материальное положение')]/following-sibling::div");
    private SelenideElement fatherInformationFilter= $x("//label[contains(text(),'Информация об отце')]/following-sibling::div");
    private SelenideElement fatherDisabilityFilter= $x("//label[contains(text(),'Инвалидность отца')]/following-sibling::div");
    private SelenideElement needForSocialSupport= $x("//label[contains(text(),'Необходимость в соц. поддержке')]/following-sibling::div");
    private SelenideElement motherInformationFilter= $x("//label[contains(text(),'Информация о матери')]/following-sibling::div");
    private SelenideElement maternalDisabilityFilter= $x("//label[contains(text(),'Инвалидность матери')]/following-sibling::div");
    private SelenideElement returnedHomeFilter= $x("//label[contains(text(),'Оралман')]/following-sibling::div");
    private SelenideElement dysfunctionalFamilyFilter= $x("//label[contains(text(),'Неблагополучная семья')]/following-sibling::div");

    private SelenideElement countryFilter= $x("//label[contains(text(),'Страна')]/following-sibling::div");
    private SelenideElement regionFilter= $x("//label[contains(text(),'Область')]/following-sibling::div");
    private SelenideElement districtFilter= $x("//label[contains(text(),'Район')]/following-sibling::div");
    private SelenideElement cityLocalityFilter= $x("//label[contains(text(),'Город/населенный пункт')]/following-sibling::div");

    private SelenideElement positiveCharacterTraitsActiveFilter= $x("//label[contains(text(),'Активный, отличные организаторские способности')]/following-sibling::div");
    private SelenideElement positiveCharacterTraitsLowActivityFilter= $x("//label[contains(text(),'Активность невысокая')]/following-sibling::div");
    private SelenideElement registeredWithALawEnforcementAgencyFilter= $x("//label[contains(text(),'Состоит на учете')]/following-sibling::div");
    private SelenideElement isOnTheIntracollegiateAccountInConnectionWithOffensesFilter= $x("//label[contains(text(),'Состоит на внутриколледжном')]/following-sibling::div");
    private SelenideElement kleptomaniaFilter= $x("//label[contains(text(),'Склонность к краже (клептомания)')]/following-sibling::div");
    private SelenideElement stubbornnessArroganceFilter= $x("//label[contains(text(),'Упрямство, высокомерие')]/following-sibling::div");
    private SelenideElement propensityToLiePrideHypocrisyFilter= $x("//label[contains(text(),'Склонность к лжи')]/following-sibling::div");
    private SelenideElement closednessFilter= $x("//label[contains(text(),'Замкнутость')]/following-sibling::div");
    private SelenideElement evasionFilter= $x("//label[contains(text(),'Уклончивость')]/following-sibling::div");
    private SelenideElement studentsUnderTheSupervisionOfACollegeInspectorFilter= $x("//label[contains(text(),'Студенты под контролем')]/following-sibling::div");


    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                   //'№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                 //'ФИО'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");              //'Язык обучения'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                   //'Квалификация'
    private SelenideElement checkedNotChecked = $x("//th[contains(text(),'Группа')]");                          //'Группа'
    private SelenideElement appointmentTime = $x("//th[contains(text(),'Форма обучения')]");                    //'Форма обучения'
    private SelenideElement OperationsOnTable = $x("//th[contains(text(),'Операции')]");                        //'Операции'


    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Посмотреть']");               // Кнопка просмотра
    private SelenideElement editBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Редактировать']");            // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Удалить']");                // Кнопка "Удалить"
    private SelenideElement changePasswordBtn = $x("//tr[1]/td[@data-table-head='Операции']//a[@title='Сменить пароль']"); // Кнопка "Сменить пароль"


    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'7')]");
    private SelenideElement eighthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'8')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}
