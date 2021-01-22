// Просмотр графика учебного процесса
//  /ru/tko/control/curriculum-schedule-year?year=2020

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CurriculumScheduleYear {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Учебный план')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                            // 'Назад'

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $(byXpath("//span[contains(text(),'Экспортировать')]/.."));                     // 'Экспортировать'


}
