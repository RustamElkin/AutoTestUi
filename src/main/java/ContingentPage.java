// Контингент_полный список
//  /ru/tko/control/contingent

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ContingentPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]"));


    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                    // 'Полный список'
    private SelenideElement groupsTab = $(byXpath("//span[contains(text(),'Группы')]/.."));                             // 'Группы'
    private SelenideElement subgroupsTab = $(byXpath("//span[contains(text(),'Подгруппы')]/.."));                       // 'Подгруппы'
    private SelenideElement cathedraTab = $(byXpath("//span[contains(text(),'Кафедры')]/.."));                          // 'Кафедры'
    private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/.."));   //'Архив'


    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));
    private SelenideElement exportBtn = $(byXpath("//span[contains(text(),'Экспортировать')]/.."));


    // Кнопка добавить
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));


    // Фильтры
    // Кнопки "Показать и свернуть" чтоб развернуть фильтры
    private SelenideElement  informationOnStudentsViewBtn= $(byXpath("/span[contains(text(),'Общие сведения по студентам')]/.. //button"));
    private SelenideElement  informationOnSocialStatusViewBtn= $(byXpath("/span[contains(text(),'Сведения по социальному статусу')]/.. //button"));
    private SelenideElement  arrivalInformationViewBtn= $(byXpath("/span[contains(text(),'Сведения по месту прибытия')]/.. //button"));
    private SelenideElement  studentCharacteristicsViewBtn= $(byXpath("/span[contains(text(),'Характеристика студента')]/.. //button"));


    private SelenideElement organizationFilter= $(byXpath("//label[contains(text(),'Организация')]/following-sibling::div/div[@class=\"multiselect__tags\"]")); //'Организация'
    //Выбираем "Индустриально-технический колледж" в фильтре организаций
    private SelenideElement selectIndustrialCollege= $(byXpath("//span[contains(text(),'ГККП «Индустриально-технический колледж»')]/../.."));

    private SelenideElement dateForGrades = $(By.xpath("//div[8]/div/div[2]/span/.."));
    private SelenideElement selectLastDateForGrade = $(By.xpath("//div[8]/div/div[2]/span/../..//li[1]"));

    private SelenideElement surnameFilter= $(byXpath("//label[contains(text(),'Фамилия: ')]/following-sibling::input")); // 'Фамилия'
    private SelenideElement nameFilter= $(byXpath("//label[contains(text(),'Имя: ')]/following-sibling::input[@name=\"filters[firstname]\"]")); // 'Имя'
    private SelenideElement patronymicFilter= $(byXpath("//label[contains(text(),'Отчество: ')]/following-sibling::input[@name=\"filters[lastname]\"]")); // 'Отчество'

    // Фильтры с диапазоном
    // "Дата выбытия"
    private SelenideElement retirementDateFromFilter= $(byXpath("//label[contains(text(),'Дата выбытия: ')]/following-sibling::div/div/input[@name='filters[retirement_date][from]']")); // "От"
    private SelenideElement retirementDateToFilter= $(byXpath("//label[contains(text(),'Дата выбытия: ')]/following-sibling::div/div/input[@name='filters[retirement_date][to]']"));     // "До"

    // "Возраст"
    private SelenideElement ageFromFilter= $(byXpath("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][from]']")); // "Возраст от"
    private SelenideElement ageToFilter= $(byXpath("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][to]']")); // "Возраст до"

    // "Количество детей"
    private SelenideElement numberOfChildrenFromFilter= $(byXpath("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][from]']"));
    private SelenideElement numberOfChildrenToFilter= $(byXpath("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][to]']"));


    // Фильтры со списком
    private SelenideElement academicYearFilter= $(byXpath("//label[contains(text(),'Учебный год: ')]/following-sibling::div"));
    private SelenideElement cathedraFilter= $(byXpath("//label[contains(text(),'Кафедра: ')]/following-sibling::div"));
    private SelenideElement specialtyFilter= $(byXpath("//label[contains(text(),'Специальность: ')]/following-sibling::div"));
    private SelenideElement qualificationFilter= $(byXpath("//label[contains(text(),'Квалификация: ')]/following-sibling::div"));
    private SelenideElement courseFilter= $(byXpath("//label[contains(text(),'Курс: ')]/following-sibling::div"));
    private SelenideElement languageEducationFilter= $(byXpath("//label[contains(text(),'Язык обучения: ')]/following-sibling::div"));
    private SelenideElement formOfStudyFilter= $(byXpath("//label[contains(text(),'Форма обучения: ')]/following-sibling::div"));
    private SelenideElement groupFilter= $(byXpath("//label[contains(text(),'Группа: ')]/following-sibling::div"));
    private SelenideElement considerInActivityMonitoringFilter= $(byXpath("//label[contains(text(),'Учитывать в мониторинге активности: ')]/following-sibling::div"));

    private SelenideElement genderFilter= $(byXpath("//label[contains(text(),'Пол:: ')]/following-sibling::div"));
    private SelenideElement citizenshipFilter= $(byXpath("//label[contains(text(),'Гражданство: ')]/following-sibling::div"));
    private SelenideElement nationalityFilter= $(byXpath("//label[contains(text(),'Национальность:: ')]/following-sibling::div"));
    private SelenideElement scholarshipRecipientFilter= $(byXpath("//label[contains(text(),'Получатель стипендии:: ')]/following-sibling::div"));
    private SelenideElement healthStatusFilter= $(byXpath("//label[contains(text(),'Состояние здоровья: ')]/following-sibling::div"));
    private SelenideElement sportAchievementsFilter= $(byXpath("//label[contains(text(),'Спорт. достижения:: ')]/following-sibling::div"));
    private SelenideElement participationInCollegeLifeFilter= $(byXpath("//label[contains(text(),'Участие в жизни колледжа: ')]/following-sibling::div"));
    private SelenideElement familyStatusFilter= $(byXpath("//label[contains(text(),'Семейное положение:: ')]/following-sibling::div"));
    private SelenideElement achievementsFilter= $(byXpath("//label[contains(text(),'Достижения: ')]/following-sibling::div"));

    private SelenideElement ActualPlaceOfResidenceFilter= $(byXpath("//label[contains(text(),'Фактическое место проживания:: ')]/following-sibling::div"));
    private SelenideElement familyInformationFilter= $(byXpath("//span[contains(text(),'полная семья')]/../../../../../div[@class=\"multiselect__tags\"]"));
    private SelenideElement financialSituationFilter= $(byXpath("//label[contains(text(),'Материальное положение:: ')]/following-sibling::div"));
    private SelenideElement fatherInformationFilter= $(byXpath("//label[contains(text(),'Информация об отце:: ')]/following-sibling::div"));
    private SelenideElement fatherDisabilityFilter= $(byXpath("//label[contains(text(),'Инвалидность отца:: ')]/following-sibling::div"));
    private SelenideElement needForSocialSupport= $(byXpath("//label[contains(text(),'Необходимость в соц. поддержке:: ')]/following-sibling::div"));
    private SelenideElement motherInformationFilter= $(byXpath("//label[contains(text(),'Информация о матери:: ')]/following-sibling::div"));
    private SelenideElement maternalDisabilityFilter= $(byXpath("//label[contains(text(),'Инвалидность матери:: ')]/following-sibling::div"));
    private SelenideElement returnedHomeFilter= $(byXpath("//label[contains(text(),'Оралман:: ')]/following-sibling::div"));
    private SelenideElement dysfunctionalFamilyFilter= $(byXpath("//label[contains(text(),'Неблагополучная семья:: ')]/following-sibling::div"));

    private SelenideElement countryFilter= $(byXpath("//label[contains(text(),'Страна: ')]/following-sibling::div"));
    private SelenideElement regionFilter= $(byXpath("//label[contains(text(),'Область: ')]/following-sibling::div"));
    private SelenideElement districtFilter= $(byXpath("//label[contains(text(),'Район: ')]/following-sibling::div"));
    private SelenideElement cityLocalityFilter= $(byXpath("//label[contains(text(),'Город/населенный пункт: ')]/following-sibling::div"));

    private SelenideElement positiveCharacterTraitsActiveFilter= $(byXpath("//label[contains(text(),'Активный, отличные организаторские способности, инициативный (инициативный), честный, трудолюбивый:: ')]/following-sibling::div"));
    private SelenideElement positiveCharacterTraitsLowActivityFilter= $(byXpath("//label[contains(text(),'Активность невысокая, стабильный самоконтроль, уверенность в себе - нормальная, критично относится к себе:: ')]/following-sibling::div"));
    private SelenideElement registeredWithALawEnforcementAgencyFilter= $(byXpath("//label[contains(text(),'Состоит на учете в правоохранительном органе:: ')]/following-sibling::div"));
    private SelenideElement isOnTheIntracollegiateAccountInConnectionWithOffensesFilter= $(byXpath("//label[contains(text(),'Состоит на внутриколледжном учете в связи с правонарушениями:: ')]/following-sibling::div"));
    private SelenideElement kleptomaniaFilter= $(byXpath("//label[contains(text(),'Склонность к краже (клептомания):: ')]/following-sibling::div"));
    private SelenideElement stubbornnessArroganceFilter= $(byXpath("//label[contains(text(),'Упрямство, высокомерие:: ')]/following-sibling::div"));
    private SelenideElement propensityToLiePrideHypocrisyFilter= $(byXpath("//label[contains(text(),'Склонность к лжи, гордыня, лицемерие:: ')]/following-sibling::div"));
    private SelenideElement closednessFilter= $(byXpath("//label[contains(text(),'Замкнутость:: ')]/following-sibling::div"));
    private SelenideElement evasionFilter= $(byXpath("//label[contains(text(),'Уклончивость:: ')]/following-sibling::div"));
    private SelenideElement studentsUnderTheSupervisionOfACollegeInspectorFilter= $(byXpath("//label[contains(text(),'Студенты под контролем инспектора колледжа:: ')]/following-sibling::div"));


    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   //'№'
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'ФИО')]"));                                 //'ФИО'
    private SelenideElement languageEducationTable = $(byXpath("//th[contains(text(),'Язык обучения')]"));              //'Язык обучения'
    private SelenideElement qualificationTable = $(byXpath("//th[contains(text(),'Квалификация')]"));                   //'Квалификация'
    private SelenideElement checkedNotChecked = $(byXpath("//th[contains(text(),'Группа')]"));                          //'Группа'
    private SelenideElement appointmentTime = $(byXpath("//th[contains(text(),'Форма обучения')]"));                    //'Форма обучения'
    private SelenideElement OperationsOnTable = $(byXpath("//th[contains(text(),'Операции')]"));                        //'Операции'


    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"]"));               // Кнопка просмотра
    private SelenideElement editBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Редактировать\"]"));            // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Удалить\"]"));                // Кнопка "Удалить"
    private SelenideElement changePasswordBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Сменить пароль\"]")); // Кнопка "Сменить пароль"


    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $(byXpath("//a[contains(text(),'‹')]"));  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'1')]"));
    private SelenideElement secondPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'2')]"));
    private SelenideElement thirdPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'3')]"));
    private SelenideElement fourthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'4')]"));
    private SelenideElement fifthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'5')]"));
    private SelenideElement sixthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'6')]"));
    private SelenideElement seventhPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'7')]"));
    private SelenideElement eighthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'8')]"));
    private SelenideElement nextPaginateBtn = $(byXpath("//a[contains(text(),'›')]"));

}
