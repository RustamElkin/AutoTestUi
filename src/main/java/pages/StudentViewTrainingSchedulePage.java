package pages;// view_training_schedule
//  ru/tko/control/training-schedule/7423

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StudentViewTrainingSchedulePage {

    // Тайтл
    private SelenideElement titleToPage       = $x("//h1[contains(text(),'Расписание')]");

    // Табы на странице
    private SelenideElement backTab           = $x("//span[contains(text(),'Назад')]/..");                    // 'Назад'

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn         = $x("//span[contains(text(),'Экспортировать')]/..");           // 'Экспортировать'

    // Инпуты
    // multiselect input group
    private SelenideElement groupNameInput    = $x("//input[@placeholder='Группа/Название']");                // 'Группа/Название'
    // multiselect input semester
    private SelenideElement semesterInput     = $x("//input[@placeholder='Семестр']");                        // 'Семестр'
    // multiselect input week
    private SelenideElement weekInput         = $x("//input[@placeholder='Неделя']");                         // 'Неделя'

    // dropdown list.
    // multiselect input group
    private SelenideElement groupNameDropdown = $x("//input[@placeholder='Группа/Название']/ancestor::div[@class='multiselect mb-10']");                // 'Группа/Название'
    // multiselect input semester
    private SelenideElement semesterDropdown  = $x("//input[@placeholder='Семестр']/ancestor::div[@class='multiselect mb-10']");                        // 'Семестр'
    // multiselect input week
    private SelenideElement weekDropdown      = $x("//input[@placeholder='Неделя']/ancestor::div[@class='multiselect mb-10']");                         // 'Неделя'

    // Таблица (Можно проверить есть ли расписание)
    private SelenideElement tableSchedule     = $x("//table [@class='s-table-schedule']");



}
