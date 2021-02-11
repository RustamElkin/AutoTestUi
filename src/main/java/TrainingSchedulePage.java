// Расписание
//  /ru/tko/control/training-schedule

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TrainingSchedulePage {

    // Тайтл
    private SelenideElement titleToPage            = $x("//h1[contains(text(),'Расписание')]");

    // Табы на странице
    private SelenideElement backTab                = $x("//span[contains(text(),'Назад')]/..");                                    // 'Назад'

    // Кнопки
    private SelenideElement addBtn                 = $x("//div[contains(text(),'Добавить')]");                                     // 'Добавить'
    private SelenideElement settingsBtn            = $x("//div[contains(text(),'График занятий')]/..");                            // 'График занятий'
    private SelenideElement filteringListBtn       = $x("//span[contains(text(),'Фильтрация списка')]/..");                        // 'Фильтрация списка'
    private SelenideElement filteringApplyBtn      = $x("//div[contains(@class,'button-philter')]/button[@type='submit']");        // 'Применить'
    private SelenideElement filteringResetBtn      = $x("//button[contains(@class, 's-btn--thm-orange')]");                        // 'Сбросить'

    // Инпуты
    private SelenideElement nameInput              = $x("//input[@name='filters[name]' and @class='s-form__input']");              // 'Название'
    private SelenideElement groupInput             = $x("//input[@name='filters[group_id]' and @class='multiselect__input']");     // 'Группа'
    private SelenideElement eduLangInput           = $x("//input[@name='filters[locale]' and @class='multiselect__input']");       // 'Язык обучения'
    private SelenideElement eduFormInput           = $x("//input[@name='filters[edu_form]' and @class='multiselect__input']");     // 'Форма обучения'

    // Dropdown (кликнув на инпут выподают списки, далее по поиск имени)
    private SelenideElement dropdownLists          = $x("//div[@class=\"multiselect__content-wrapper\"]//span/span");

    // Таблица
    private SelenideElement numberOnTable           = $x("//th[contains(text(),'№')]");                                             // '№'
    private SelenideElement groupSlashName          = $x("//th[contains(text(),'Группа/Название')]");                               // 'Группа/Название'
    private SelenideElement trainingScheduleType    = $x("//th[contains(text(),'Тип расписания')]");                                // 'Тип расписания'
    private SelenideElement eduLang                 = $x("//th[contains(text(),'Язык обучения')]");                                 // 'Язык обучения'
    private SelenideElement eduForm                 = $x("//th[contains(text(),'Форма обучения')]");                                // 'Форма обучения'
    private SelenideElement operations              = $x("//th[contains(text(),'Операции')]");                                      // 'Операции'

    // Поиск в таблице по названию
    private ElementsCollection selectScheduleByName = $$x("//td[@data-table-head='Группа/Название']");

    // Таблица операции
    private ElementsCollection viewBtn              = $$x("//a[@title='Посмотреть']");                                              // 'Кнопки посмотреть'
    private ElementsCollection editBtn              = $$x("//a[@title='Редактировать']");                                           // 'Кнопки редактировать'
    private ElementsCollection deleteBtn            = $$x("//a[@title='Удалить']");                                                 // 'Кнопки удалить'

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn         = $x("//a[contains(text(),'‹')]");                                              // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn        = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn       = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn        = $x("//ul[@role='navigation']//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn       = $x("//ul[@role='navigation']//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn        = $x("//ul[@role='navigation']//a[contains(text(),'5')]");
    private ElementsCollection selectPaginateBtn    = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn         = $x("//a[contains(text(),'›')]");

}
