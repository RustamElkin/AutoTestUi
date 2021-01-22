// Персонал
//  /ru/tko/control/personnel

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ControlPersonnelPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Персонал')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                    // 'Открытые'
    private SelenideElement administrationTab = $(byXpath("//div/a/span[contains(text(),'Администрация')]/.."));        // 'Администрация'
    private SelenideElement ppsTab = $(byXpath("//div/a/span[contains(text(),'ППС')]/.."));                             // 'ППС'
    private SelenideElement employeesTab = $(byXpath("//div/a/span[contains(text(),'Сотрудники')]/.."));                // 'Сотрудники'

    // Кнопка "Добавить"
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));           // 'Фильтрация списка'
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));                           // 'Применить'
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));                            // 'Сбросить'
    private SelenideElement exportBtn = $(byXpath("//span[contains(text(),'Экспортировать')]/.."));                     // 'Экспортировать'

    // Фильтры
    // Кнопки "Показать и свернуть" чтоб развернуть фильтры
    private SelenideElement  informationOnSocialStatusViewBtn= $(byXpath("/span[contains(text(),'Сведения по социальному статусу')]/.. //button"));                                              // "Сведения по социальному статусу"
    private SelenideElement  informationAboutConscriptionViewBtn= $(byXpath("//span[contains(text(),'Сведения о воинской обязанности')]/.. /span[@class=\"s-combine-title__line\"]/button"));    // "Сведения о воинской обязанности"
    private SelenideElement  positionInformationViewBtn= $(byXpath("//span[contains(text(),'Сведения по должности')]/.. /span[@class=\"s-combine-title__line\"]/button"));                       // "Сведения по должности"
    private SelenideElement  arrivalInformationViewBtn= $(byXpath("//span[contains(text(),'Сведения по месту прибытия')]/.. /span[@class=\"s-combine-title__line\"]/button"));                   // "Сведения по месту прибытия"


    private SelenideElement organizationFilter= $(byXpath("//label[contains(text(),'Организация')]/following-sibling::div/div[@class=\"multiselect__tags\"]"));                                 //'Организация'
    //Выбираем "Индустриально-технический колледж" в фильтре организаций
    private SelenideElement selectIndustrialCollege= $(byXpath("//span[contains(text(),'ГККП «Индустриально-технический колледж»')]/../.."));

    private SelenideElement surnameFilter= $(byXpath("//label[contains(text(),'Фамилия: ')]/following-sibling::input"));                                                                         // 'Фамилия'
    private SelenideElement nameFilter= $(byXpath("//label[contains(text(),'Имя: ')]/following-sibling::input[@name=\"filters[firstname]\"]"));                                                  // 'Имя'
    private SelenideElement patronymicFilter= $(byXpath("//label[contains(text(),'Отчество: ')]/following-sibling::input[@name=\"filters[lastname]\"]"));                                        // 'Отчество'

    // Фильтры с диапазоном
    // "Возраст"
    private SelenideElement ageFromFilter= $(byXpath("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][from]']")); // "Возраст от"
    private SelenideElement ageToFilter= $(byXpath("//label[contains(text(),'Возраст: ')]/following-sibling::div/div/input[@name='filters[age][to]']")); // "Возраст до"
    // "Количество детей"
    private SelenideElement numberOfChildrenFromFilter= $(byXpath("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][from]']"));
    private SelenideElement numberOfChildrenToFilter= $(byXpath("//label[contains(text(),'Количество детей: ')]/following-sibling::div/div/input[@name='filters[children][to]']"));
    // "Педагогический стаж"
    private SelenideElement pedagogicalExperienceFromFilter= $(byXpath("//label[contains(text(),'Педагогический стаж: ')]/following-sibling::div/div/input[@name='filters[pedagogical_experience][from]']"));
    private SelenideElement pedagogicalExperienceToFilter= $(byXpath("//label[contains(text(),'Педагогический стаж: ')]/following-sibling::div/div/input[@name='filters[pedagogical_experience][to]']"));
    // "Срок окончания договора с ТиПО"
    private SelenideElement contractExpirationDateFromFilter= $(byXpath("//label[contains(text(),'Срок окончания договора с ТиПО: ')]/following-sibling::div/div/input[@name='filters[contract_expiration_date][from]']"));
    private SelenideElement contractExpirationDateToFilter= $(byXpath("//label[contains(text(),'Срок окончания договора с ТиПО: ')]/following-sibling::div/div/input[@name='filters[contract_expiration_date][to]']"));


    // Фильтры со списком
    private SelenideElement genderFilter= $(byXpath("//label[contains(text(),'Пол:: ')]/following-sibling::div"));                          // "Пол"
    private SelenideElement citizenshipFilter= $(byXpath("//label[contains(text(),'Гражданство: ')]/following-sibling::div"));              // "Гражданство"
    private SelenideElement nationalityFilter= $(byXpath("//label[contains(text(),'Национальность:: ')]/following-sibling::div"));          // "Национальность"

    private SelenideElement healthStatusFilter= $(byXpath("//label[contains(text(),'Состояние здоровья: ')]/following-sibling::div"));       // "Состояние здоровья"
    private SelenideElement familyStatusFilter= $(byXpath("//label[contains(text(),'Семейное положение:: ')]/following-sibling::div"));      // "Семейное положение"

    private SelenideElement academicDegreeFilter= $(byXpath("//label[contains(text(),'Ученая степень: ')]/following-sibling::div"));         // "Ученая степень"
    private SelenideElement academicRankFilter= $(byXpath("//label[contains(text(),'Ученое звание: ')]/following-sibling::div"));            // "Ученое звание"

    private SelenideElement achievementsFilter= $(byXpath("//label[contains(text(),'Группа воинского учета')]/following-sibling::div"));     // "Группа воинского учета"
    private SelenideElement academicYearFilter= $(byXpath("//label[contains(text(),'Состав: ')]/following-sibling::div"));                   // "Состав"
    private SelenideElement cathedraFilter= $(byXpath("//label[contains(text(),'Воинское звание: ')]/following-sibling::div"));              // "Воинское звание"
    private SelenideElement specialtyFilter= $(byXpath("//label[contains(text(),'Военная пригодность: ')]/following-sibling::div"));         // "Военная пригодность"

    private SelenideElement numberOfEmployeesFilter= $(byXpath("//label[contains(text(),'Численность в штате сотрудников: ')]/following-sibling::div"));                  // 'Численность в штате сотрудников'
    private SelenideElement environmentalImpactCoefficientFilter= $(byXpath("//label[contains(text(),'Коэффициент экологического влияния: ')]/following-sibling::input"));// 'Коэффициент экологического влияния
    private SelenideElement jobTypeFilter= $(byXpath("//label[contains(text(),'Тип должности: ')]/following-sibling::div"));                                              // 'Тип должности'
    private SelenideElement sourceOfFinancingFilter= $(byXpath("//label[contains(text(),'Источник финансирования: ')]/following-sibling::div"));                          // 'Источник финансирования'
    private SelenideElement categoryFilter= $(byXpath("//label[contains(text(),'Категория: ')]/following-sibling::div"));                                                 // 'Категория'
    private SelenideElement raisingQualificationFilter= $(byXpath("//label[contains(text(),'Повышение квалификации: ')]/following-sibling::div"));                        // 'Повышение квалификации'

    private SelenideElement countryFilter= $(byXpath("//label[contains(text(),'Страна: ')]/following-sibling::div"));                        // "Страна"
    private SelenideElement regionFilter= $(byXpath("//label[contains(text(),'Область: ')]/following-sibling::div"));                        // "Область"
    private SelenideElement districtFilter= $(byXpath("//label[contains(text(),'Район: ')]/following-sibling::div"));                        // "Район"
    private SelenideElement cityLocalityFilter= $(byXpath("//label[contains(text(),'Город/населенный пункт: ')]/following-sibling::div"));   // "Город/населенный пункт"

    // Таблица
    private SelenideElement numberTable = $(byXpath("//th[contains(text(),'№')]"));                                     //'№'
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'ФИО')]"));                                 //'ФИО'
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'Должность')]"));                               //'Должность'
    private SelenideElement TypeTable = $(byXpath("//th[contains(text(),'Группы')]"));                                  //'Группы'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          //'Операции'


    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[10]//a[@title=\"Посмотреть\"]"));                                          // Кнопка "Посмотреть"
    private SelenideElement editBtn = $(byXpath("//tr[1]/td[10]//a[@title=\"Редактировать\"]"));                                       // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[10]//a[@title=\"Удалить\"]"));                                           // Кнопка "Удалить"
    private SelenideElement changePasswordBtn = $(byXpath("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Сменить пароль\"]")); // Кнопка "Сменить пароль"


    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'‹')]"));       //не работает на текущей странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'1')]"));
    private SelenideElement secondPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'2')]"));
    private SelenideElement thirdPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'3')]"));
    private SelenideElement fourthPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'4')]"));
    private SelenideElement fifthPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'5')]"));
    private SelenideElement sixthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'6')]"));
    private SelenideElement seventhPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'7')]"));
    private SelenideElement eighthPaginateBtn = $(byXpath("//ul[@role=\"navigation\"]//a[contains(text(),'8')]"));
    private SelenideElement nextPaginateBtn = $(By.xpath("//ul[@role=\"navigation\"]//a[contains(text(),'›')]"));


}
