// Администрация
//  /ru/tko/control/personnel?type=administration

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PersonnelTypeAdministrationPage {

    // Тайтл
    private SelenideElement titleToPage       = $x("//h1[contains(text(),'Персонал')]");

    // Табы на странице
    private SelenideElement fullListTab       = $x("//span[contains(text(),'Полный список')]/..");                    // 'Полный список'
    private SelenideElement administrationTab = $x("//div/a/span[contains(text(),'Администрация')]/..");              // 'Администрация'
    private SelenideElement ppsTab            = $x("//div/a/span[contains(text(),'ППС')]/..");                        // 'ППС'
    private SelenideElement employeesTab      = $x("//div/a/span[contains(text(),'Сотрудники')]/..");                 // 'Сотрудники'

    // Кнопка "Добавить"
    private SelenideElement addBtn            = $x("//div[contains(text(),'Добавить')]/..");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn  = $x("//span[contains(text(),'Фильтрация списка')]/..");                // 'Фильтрация списка'
    private SelenideElement applyBtn          = $x("//span[contains(text(),'Применить')]/..");                        // 'Применить'
    private SelenideElement resetBtn          = $x("//span[contains(text(),'Сбросить')]/..");                         // 'Сбросить'
    private SelenideElement exportBtn         = $x("//span[contains(text(),'Экспортировать')]/..");                   // 'Экспортировать'

    // Фильтры
    private SelenideElement surnameInput      = $x("//label[contains(text(),'Фамилия')]/following-sibling::input");                                                                        // 'Фамилия'
    private SelenideElement nameInput         = $x("//label[contains(text(),'Имя')]/following-sibling::input[@name='filters[firstname]']");                                                // 'Имя'
    private SelenideElement patronymicInput   = $x("//label[contains(text(),'Отчество')]/following-sibling::input[@name='filters[lastname]']");                                            // 'Отчество'
    private SelenideElement citizenshipInput  = $x("//label[contains(text(),'Гражданство')]/following-sibling::div//input");                                                               // 'Гражданство'
    private SelenideElement nationalityInput  = $x("//label[contains(text(),'Национальность')]/following-sibling::div//input");                                                            // 'Национальность'

    // Фильтры с диапазоном
    // "Возраст"
    private SelenideElement ageFromFilter     = $x("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][from]']");                                  // "Возраст от"
    private SelenideElement ageToFilter       = $x("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][to]']");                                    // "Возраст до"

    // Кнопки "Показать и свернуть" чтоб развернуть фильтры
    private SelenideElement informationOnSocialStatusViewBtn    = $x("/span[contains(text(),'Сведения по социальному статусу')]/.. //button");                                             // "Сведения по социальному статусу"
    private SelenideElement informationAboutConscriptionViewBtn = $x("//span[contains(text(),'Сведения о воинской обязанности')]/.. /span[@class='s-combine-title__line']/button");        // "Сведения о воинской обязанности"
    private SelenideElement positionInformationViewBtn          = $x("//span[contains(text(),'Сведения по должности')]/.. /span[@class='s-combine-title__line']/button");                  // "Сведения по должности"
    private SelenideElement arrivalInformationViewBtn           = $x("//span[contains(text(),'Сведения по месту прибытия')]/.. /span[@class='s-combine-title__line']/button");             // "Сведения по месту прибытия"

    // Фильтры с диапазоном
    // "Количество детей"
    private SelenideElement numberOfChildrenFromFilter          = $x("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][from]']");
    private SelenideElement numberOfChildrenToFilter            = $x("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][to]']");
    // "Педагогический стаж"
    private SelenideElement pedagogicalExperienceFromFilter     = $x("//label[contains(text(),'Педагогический стаж: ')]/following-sibling::div/div/input[@name='filters[pedagogical_experience][from]']");
    private SelenideElement pedagogicalExperienceToFilter       = $x("//label[contains(text(),'Педагогический стаж: ')]/following-sibling::div/div/input[@name='filters[pedagogical_experience][to]']");
    // "Срок окончания договора с ТиПО"
    private SelenideElement contractExpirationDateFromFilter    = $x("//label[contains(text(),'Срок окончания договора с ТиПО: ')]/following-sibling::div/div/input[@name='filters[contract_expiration_date][from]']");
    private SelenideElement contractExpirationDateToFilter      = $x("//label[contains(text(),'Срок окончания договора с ТиПО: ')]/following-sibling::div/div/input[@name='filters[contract_expiration_date][to]']");

    // Фильтры со списком
    private SelenideElement genderFilter                        = $x("//label[contains(text(),'Пол')]/following-sibling::div");                                  // 'Пол'+
    private SelenideElement citizenshipFilter                   = $x("//label[contains(text(),'Гражданство')]/following-sibling::div");                          // 'Гражданство'+
    private SelenideElement nationalityFilter                   = $x("//label[contains(text(),'Национальность')]/following-sibling::div");                       // 'Национальность'+
    private SelenideElement healthStatusFilter                  = $x("//label[contains(text(),'Состояние здоровья')]/following-sibling::div");                   // 'Состояние здоровья'+
    private SelenideElement familyStatusFilter                  = $x("//label[contains(text(),'Семейное положение')]/following-sibling::div");                   // 'Семейное положение'+
    private SelenideElement educationFilter                     = $x("//label[contains(text(),'Образование')]/following-sibling::div");                          // 'Образование'+
    private SelenideElement academicDegreeFilter                = $x("//label[contains(text(),'Ученая степень')]/following-sibling::div");                       // 'Ученая степень'+
    private SelenideElement academicRankFilter                  = $x("//label[contains(text(),'Ученое звание')]/following-sibling::div");                        // 'Ученое звание'+
    private SelenideElement achievementsFilter                  = $x("//label[contains(text(),'Группа воинского учета')]/following-sibling::div");               // 'Группа воинского учета'+
    private SelenideElement academicYearFilter                  = $x("//label[contains(text(),'Состав')]/following-sibling::div");                               // 'Состав'+
    private SelenideElement cathedraFilter                      = $x("//label[contains(text(),'Воинское звание')]/following-sibling::div");                      // 'Воинское звание'+
    private SelenideElement specialtyFilter                     = $x("//label[contains(text(),'Военная пригодность')]/following-sibling::div");                  // 'Военная пригодность'+
    private SelenideElement numberOfEmployeesFilter             = $x("//label[contains(text(),'Численность в штате сотрудников')]/following-sibling::div");      // 'Численность в штате сотрудников'+
    private SelenideElement environmentalImpactCoefficientFilter= $x("//label[contains(text(),'Коэффициент экологического влияния')]/following-sibling::input"); // 'Коэффициент экологического влияния'+
    private SelenideElement jobTypeFilter                       = $x("//label[contains(text(),'Тип должности')]/following-sibling::div");                        // 'Тип должности'+
    private SelenideElement sourceOfFinancingFilter             = $x("//label[contains(text(),'Источник финансирования')]/following-sibling::div");              // 'Источник финансирования'+
    private SelenideElement categoryFilter                      = $x("//label[contains(text(),'Категория')]/following-sibling::div");                            // 'Категория'+
    private SelenideElement raisingQualificationFilter          = $x("//label[contains(text(),'Повышение квалификации')]/following-sibling::div");               // 'Повышение квалификации'+
    private SelenideElement countryFilter                       = $x("//label[contains(text(),'Страна')]/following-sibling::div");                               // 'Страна'+
    private SelenideElement regionFilter                        = $x("//label[contains(text(),'Область')]/following-sibling::div");                              // 'Область'+
    private SelenideElement districtFilter                      = $x("//label[contains(text(),'Район')]/following-sibling::div");                                // 'Район'+
    private SelenideElement cityLocalityFilter                  = $x("//label[contains(text(),'Город/населенный пункт')]/following-sibling::div");               // 'Город/населенный пункт'+

    // Таблица
    private SelenideElement numberTable                         = $x("//th[contains(text(),'№')]");                                                              // '№'
    private SelenideElement fullNameTable                       = $x("//th[contains(text(),'ФИО')]");                                                            // 'ФИО'
    private SelenideElement nameTable                           = $x("//th[contains(text(),'Должность')]");                                                      // 'Должность'
    private SelenideElement typeTable                           = $x("//th[contains(text(),'Группы')]");                                                         // 'Группы'
    private SelenideElement operationsTable                     = $x("//th[contains(text(),'Операции')]");                                                       // 'Операции'

    // Кнопки в таблице, колонка "Операци
    private ElementsCollection viewBtn                          = $$x("//a[@title='Посмотреть']");                                                               // Кнопки "Посмотреть'
    private ElementsCollection editBtn                          = $$x("//a[@title='Редактировать']");                                                            // Кнопки 'Редактировать'
    private ElementsCollection deleteBtn                        = $$x("//a[@title='Удалить']");                                                                  // Кнопки 'Удалить'
    private ElementsCollection changePasswordBtn                = $$x("//a[@title='Сменить пароль']");                                                           // Кнопки 'Сменить пароль'

    // Кнопки пагинации на страни
    private SelenideElement backPaginateBtn                     = $x("//a[contains(text(),'‹')]");                                                               // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn                    = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn                   = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private ElementsCollection selectPaginateBtn                = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn                     = $x("//a[contains(text(),'›')]");

}
