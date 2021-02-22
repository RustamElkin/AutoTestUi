package pages;// Дистанционное обучение_Шаблоны заданий
//  /ru/tko/control/homeworks

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HomeworksTemplatesPage {

    // Тайтл
    private SelenideElement titleToPage               = $x("//h1[contains(text(),'Шаблоны заданий')]");

    // Табы на странице
    private SelenideElement jobTemplatesTab           = $x("//a[contains(text(),'Шаблоны заданий')][@class='container-content-head__tab-item is-active']");  // 'Шаблоны заданий'
    private SelenideElement groupsTab                 = $x("//a[contains(text(),'Лекции')]");                                                                // 'Лекции'

    // Кнопка добавить
    private SelenideElement addBtn                    = $x("//div[contains(text(),'Добавить')]/..");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn          = $x("//span[contains(text(),'Фильтрация списка')]/..");                                               // 'Фильтрация списка
    private SelenideElement applyBtn                  = $x("//span[contains(text(),'Применить')]/..");                                                       // 'Применить'
    private SelenideElement resetBtn                  = $x("//span[contains(text(),'Сбросить')]/..");                                                        // 'Сбросить'

    // Фильтр Инпуты
    private SelenideElement nameInput                 = $x("//label[contains(text(),'Название')]/following-sibling::input");                                 // 'Название'
    private SelenideElement subjectsInput             = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");                             // 'Предмет'
    private SelenideElement creatorInput              = $x("//label[contains(text(),'Создатель')]/following-sibling::div//input");                           // 'Создатель'

    // Dropdown фильтры
    private SelenideElement selectSubjectDropDownList = $x("//label[contains(text(),'Предмет')]//following-sibling::div");                                   // "Предмет"
    private SelenideElement selectCreatorDropDownList = $x("//label[contains(text(),'Создатель')]//following-sibling::div");                                 // "Создатель"

    // Checkbox
    private SelenideElement showOnlyDeletedCheckBox   = $x("//input[@id='field-input-filters[trashed]']");                                                   // чекбокс 'показать только удаленные'

    // Таблица
    private SelenideElement numberTable               = $x("//th[contains(text(),'№')]");                                                                    // '№'
    private SelenideElement nameOnTable               = $x("//th[contains(text(),'Название')]");                                                             // 'Название'
    private SelenideElement creatorTable              = $x("//th[contains(text(),'Создатель')]");                                                            // 'Создатель'
    private SelenideElement subjectTable              = $x("//th[contains(text(),'Предметы')]");                                                             // 'Предметы'
    private SelenideElement dateOfCreationTable       = $x("//th[contains(text(),'Дата создания')]");                                                        // 'Дата создания'
    private SelenideElement operationsTable           = $x("//th[contains(text(),'Операции')]");                                                             // 'Операции'

    // Таблица, список заданий
    private ElementsCollection studentList            = $$x("//tbody/tr");                                                                                   // 'Список заданий'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn                   = $x("(//tr/td[@data-table-head='Операции']//a[@title='Посмотреть'])[1]");                         // Кнопка "Посмотреть"
    private SelenideElement editBtn                   = $x("(//tr/td[@data-table-head='Операции']//a[@title='Редактировать'])[1]");                      // Кнопка "Редактировать"
    private SelenideElement deleteBtn                 = $x("(//tr/td[@data-table-head='Операции']//a[@title='Удалить'])[1]");                            // Кнопка "Удалить"


    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn           = $x("//a[contains(text(),'‹')]");                                                                     // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn          = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn         = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn          = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn         = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn          = $x("//ul[@role='navigation']//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn          = $x("//ul[@role='navigation']//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn        = $x("//ul[@role='navigation']//a[contains(text(),'7')]");
    private ElementsCollection selectPaginateBtn      = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn           = $x("//a[contains(text(),'›')]");


}
