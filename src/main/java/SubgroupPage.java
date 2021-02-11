// Подгруппы
//  /ru/tko/control/subgroup

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SubgroupPage {

    // Тайтл
    private SelenideElement titleToPage        = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab        = $x("//span[contains(text(),'Полный список')]/..");                                               // 'Полный список'
    private SelenideElement groupsTab          = $x("//span[contains(text(),'Группы')]/..");                                                      // 'Группы'
    private SelenideElement subgroupsTab       = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab        = $x("//span[contains(text(),'Кафедры')]/..");                                                     // 'Кафедры'
    private SelenideElement archiveTab         = $x("//div[@class='container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");   // 'Архив'

    // Кнопки
    private SelenideElement filteringListBtn   = $x("//span[contains(text(),'Фильтрация списка')]/..");                                           // 'Фильтрация списка'
    private SelenideElement addBtn             = $x("//div[contains(text(),'Добавить')]/..");                                                     // Кнопка 'Добавить'

    // Кнопки для фильтра
    private SelenideElement applyBtn           = $x("//span[contains(text(),'Применить')]/..");                                                   // 'Применить'
    private SelenideElement resetBtn           = $x("//span[contains(text(),'Сбросить')]/..");                                                    // 'Сбросить'

    // Фильтр Инпуты
    private SelenideElement nameInput          = $x("//label[contains(text(),'Название')]/following-sibling::input");                             // 'Название'
    private SelenideElement groupInput         = $x("//label[contains(text(),'Группа')]/following-sibling::div//input");                          // 'Группа'
    private SelenideElement qualificationInput = $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");                    // 'Квалификация'

    // Dropdown фильтры
    private SelenideElement groupDropDown               = $x("//label[contains(text(),'Группа')]/following-sibling::div");                        // 'Группа'
    private SelenideElement selectQualificationDropDown = $x("//label[contains(text(),'Квалификация')]/following-sibling::div");                  // 'Квалификация'

    // Таблица
    private SelenideElement numberOnTable         = $x("//th[contains(text(),'№')]");                                                             // '№'
    private SelenideElement nameTable             = $x("//th[contains(text(),'Название')]");                                                      // 'Название'
    private SelenideElement qualificationTable    = $x("//th[contains(text(),'Квалификация')]");                                                  // 'Квалификация'
    private SelenideElement courseTable           = $x("//th[contains(text(),'Курс')]");                                                          // 'Курс'
    private SelenideElement languageEducation     = $x("//th[contains(text(),'Язык обучения')]");                                                 // 'Язык обучения'
    private SelenideElement numberOfStudentsTable = $x("//th[contains(text(),'Количество учащихся')]");                                           // 'Количество учащихся'
    private SelenideElement curatorTable          = $x("//th[contains(text(),'Куратор')]");                                                       // 'Куратор'
    private SelenideElement operationsTable       = $x("//th[contains(text(),'Операции')]");                                                      // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private ElementsCollection viewBtn            = $$x("//a[@title='Посмотреть']");                                                              // Кнопки "Посмотреть'
    private ElementsCollection editBtn            = $$x("//a[@title='Редактировать']");                                                           // Кнопки 'Редактировать'
    private ElementsCollection deleteBtn          = $$x("//a[@title='Удалить']");                                                                 // Кнопки 'Удалить'
    private ElementsCollection changePasswordBtn  = $$x("//a[@title='Сменить пароль']");                                                          // Кнопки 'Сменить пароль'

    // Кнопки пагинации
    private SelenideElement backPaginateBtn       = $x("//a[contains(text(),'‹')]");                        // не работает на первой (текущей) странице, кнопка не активна
    private SelenideElement firstPaginateBtn      = $x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn     = $x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn      = $x("//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn     = $x("//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn      = $x("//a[contains(text(),'5')]");
    private ElementsCollection selectPaginateBtn  = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn       = $x("//a[contains(text(),'›')]");

}
