// Просмотр учебного плана
//  /ru/tko/control/curriculum/220/show

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CurriculumShowPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Учебный план')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                            // 'Назад'

    // Таблица
    private SelenideElement categoryOnTable = $(byXpath("//th[contains(text(),'Категория')]"));
    private SelenideElement descriptionOnTable = $(byXpath("//th[contains(text(),'Описание')]"));

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $(byXpath("//a[contains(text(),'Экспортировать')]"));                           // 'Экспортировать'


}
