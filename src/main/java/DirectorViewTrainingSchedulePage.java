// view_training_schedule
//  /ru/tko/control/training-schedule/135

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DirectorViewTrainingSchedulePage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Расписание')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                            // 'Назад'

    // Таблица (Можно проверить есть ли расписание)
    private SelenideElement tableSchedule = $(byXpath("//table [@class=\"s-table-schedule\"]"));

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $(byXpath("//span[contains(text(),'Экспортировать')]/.."));                     // 'Экспортировать'

    // multiselect input group
    private SelenideElement groupNameInput = $(byXpath("//input[@placeholder='Группа/Название']"));                     // 'Группа/Название'

    // multiselect input semester
    private SelenideElement semesterInput = $(byXpath("//input[@placeholder='Семестр']"));                              // 'Семестр'

    // multiselect input week
    private SelenideElement weekInput = $(byXpath("//input[@placeholder='Неделя']"));                                   // 'Неделя'

}
