// Персонал
//  /ru/tko/control/personnel

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ControlPersonnelPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Персонал')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                    // 'Открытые'
    private SelenideElement administrationTab = $x("//div/a/span[contains(text(),'Администрация')]/..");        // 'Администрация'
    private SelenideElement ppsTab = $x("//div/a/span[contains(text(),'ППС')]/..");                             // 'ППС'
    private SelenideElement employeesTab = $x("//div/a/span[contains(text(),'Сотрудники')]/..");                // 'Сотрудники'

    // Кнопка "Добавить"
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");           // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                           // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                            // 'Сбросить'
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                     // 'Экспортировать'

    // Фильтры
    // Кнопки "Показать и свернуть" чтоб развернуть фильтры
    private SelenideElement  informationOnSocialStatusViewBtn= $x("/span[contains(text(),'Сведения по социальному статусу')]/.. //button");                                              // "Сведения по социальному статусу"
    private SelenideElement  informationAboutConscriptionViewBtn= $x("//span[contains(text(),'Сведения о воинской обязанности')]/.. /span[@class=\"s-combine-title__line\"]/button");    // "Сведения о воинской обязанности"
    private SelenideElement  positionInformationViewBtn= $x("//span[contains(text(),'Сведения по должности')]/.. /span[@class=\"s-combine-title__line\"]/button");                       // "Сведения по должности"
    private SelenideElement  arrivalInformationViewBtn= $x("//span[contains(text(),'Сведения по месту прибытия')]/.. /span[@class=\"s-combine-title__line\"]/button");                   // "Сведения по месту прибытия"


    private SelenideElement organizationFilter= $x("//label[contains(text(),'Организация')]/following-sibling::div/div[@class=\"multiselect__tags\"]");                                 //'Организация'
    //Выбираем "Индустриально-технический колледж" в фильтре организаций
    private SelenideElement selectIndustrialCollege= $x("//span[contains(text(),'ГККП «Индустриально-технический колледж»')]/../..");

    private SelenideElement surnameFilter= $x("//label[contains(text(),'Фамилия: ')]/following-sibling::input");                                                                         // 'Фамилия'
    private SelenideElement nameFilter= $x("//label[contains(text(),'Имя: ')]/following-sibling::input[@name=\"filters[firstname]\"]");                                                  // 'Имя'
    private SelenideElement patronymicFilter= $x("//label[contains(text(),'Отчество: ')]/following-sibling::input[@name=\"filters[lastname]\"]");                                        // 'Отчество'

    // Фильтры с диапазоном
    // "Возраст"
    private SelenideElement ageFromFilter= $x("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][from]']"); // "Возраст от"
    private SelenideElement ageToFilter= $x("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][to]']"); // "Возраст до"
    // "Количество детей"
    private SelenideElement numberOfChildrenFromFilter= $x("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][from]']");
    private SelenideElement numberOfChildrenToFilter= $x("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][to]']");
    // "Педагогический стаж"
    private SelenideElement pedagogicalExperienceFromFilter= $x("//label[contains(text(),'Педагогический стаж: ')]/following-sibling::div/div/input[@name='filters[pedagogical_experience][from]']");
    private SelenideElement pedagogicalExperienceToFilter= $x("//label[contains(text(),'Педагогический стаж: ')]/following-sibling::div/div/input[@name='filters[pedagogical_experience][to]']");
    // "Срок окончания договора с ТиПО"
    private SelenideElement contractExpirationDateFromFilter= $x("//label[contains(text(),'Срок окончания договора с ТиПО: ')]/following-sibling::div/div/input[@name='filters[contract_expiration_date][from]']");
    private SelenideElement contractExpirationDateToFilter= $x("//label[contains(text(),'Срок окончания договора с ТиПО: ')]/following-sibling::div/div/input[@name='filters[contract_expiration_date][to]']");


    // Фильтры со списком
    private SelenideElement genderFilter= $x("//label[contains(text(),'Пол')]/following-sibling::div");                          // "Пол"
    private SelenideElement citizenshipFilter= $x("//label[contains(text(),'Гражданство')]/following-sibling::div");              // "Гражданство"
    private SelenideElement nationalityFilter= $x("//label[contains(text(),'Национальность')]/following-sibling::div");          // "Национальность"

    private SelenideElement healthStatusFilter= $x("//label[contains(text(),'Состояние здоровья')]/following-sibling::div");       // "Состояние здоровья"
    private SelenideElement familyStatusFilter= $x("//label[contains(text(),'Семейное положение')]/following-sibling::div");      // "Семейное положение"

    private SelenideElement academicDegreeFilter= $x("//label[contains(text(),'Ученая степень')]/following-sibling::div");         // "Ученая степень"
    private SelenideElement academicRankFilter= $x("//label[contains(text(),'Ученое звание')]/following-sibling::div");            // "Ученое звание"

    private SelenideElement militaryRegistrationGroupFilter= $x("//label[contains(text(),'Группа воинского учета')]/following-sibling::div");                   // "Группа воинского учета"
    private SelenideElement academicYearFilter= $x("//label[contains(text(),'Состав')]/following-sibling::div");                   // "Состав"
    private SelenideElement cathedraFilter= $x("//label[contains(text(),'Воинское звание')]/following-sibling::div");              // "Воинское звание"
    private SelenideElement specialtyFilter= $x("//label[contains(text(),'Военная пригодность')]/following-sibling::div");         // "Военная пригодность"

    private SelenideElement numberOfEmployeesFilter= $x("//label[contains(text(),'Численность в штате сотрудников')]/following-sibling::div");                  // 'Численность в штате сотрудников'
    private SelenideElement environmentalImpactCoefficientFilter= $x("//label[contains(text(),'Коэффициент экологического влияния')]/following-sibling::input");// 'Коэффициент экологического влияния
    private SelenideElement jobTypeFilter= $x("//label[contains(text(),'Тип должности')]/following-sibling::div");                                              // 'Тип должности'
    private SelenideElement sourceOfFinancingFilter= $x("//label[contains(text(),'Источник финансирования')]/following-sibling::div");                          // 'Источник финансирования'
    private SelenideElement categoryFilter= $x("//label[contains(text(),'Категория')]/following-sibling::div");                                                 // 'Категория'
    private SelenideElement raisingQualificationFilter= $x("//label[contains(text(),'Повышение квалификации')]/following-sibling::div");                        // 'Повышение квалификации'

    private SelenideElement countryFilter= $x("//label[contains(text(),'Страна')]/following-sibling::div");                        // "Страна"
    private SelenideElement regionFilter= $x("//label[contains(text(),'Область')]/following-sibling::div");                        // "Область"
    private SelenideElement districtFilter= $x("//label[contains(text(),'Район')]/following-sibling::div");                        // "Район"
    private SelenideElement cityLocalityFilter= $x("//label[contains(text(),'Город/населенный пункт')]/following-sibling::div");   // "Город/населенный пункт"

    // Таблица
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                                          //'№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                                      //'ФИО'
    private SelenideElement nameTable = $x("//th[contains(text(),'Должность')]");                                                    //'Должность'
    private SelenideElement TypeTable = $x("//th[contains(text(),'Группы')]");                                                       //'Группы'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                               //'Операции'


    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]/td[10]//a[@title=\"Посмотреть\"]");                                                // Кнопка "Посмотреть"
    private SelenideElement editBtn = $x("//tr[1]/td[10]//a[@title=\"Редактировать\"]");                                             // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("//tr[1]/td[10]//a[@title=\"Удалить\"]");                                                 // Кнопка "Удалить"
    private SelenideElement changePasswordBtn = $x("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Сменить пароль\"]");       // Кнопка "Сменить пароль"


    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'‹')]");       //не работает на текущей странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'7')]");
    private SelenideElement eighthPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'8')]");
    private SelenideElement nextPaginateBtn = $x("//ul[@role='navigation']//a[contains(text(),'›')]");


}
