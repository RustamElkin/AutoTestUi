// view_training_schedule
//  /ru/tko/control/training-schedule/135

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DirectorViewTrainingSchedulePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Расписание')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Назад')]/..");                       // 'Назад'

    // Таблица (Можно проверить есть ли расписание)
    private SelenideElement tableSchedule = $x("//table [@class=\"s-table-schedule\"]");

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                // 'Экспортировать'

    // multiselect input group
    private SelenideElement groupNameInput = $x("//input[@placeholder='Группа/Название']");                // 'Группа/Название'

    // multiselect input semester
    private SelenideElement semesterInput = $x("//input[@placeholder='Семестр']");                         // 'Семестр'

    // multiselect input week
    private SelenideElement weekInput = $x("//input[@placeholder='Неделя']");                              // 'Неделя'

}
