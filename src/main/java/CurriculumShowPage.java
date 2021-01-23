// Просмотр учебного плана
//  /ru/tko/control/curriculum/220/show

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CurriculumShowPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Учебный план')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Назад')]/..");                       // 'Назад'

    // Таблица
    private SelenideElement categoryOnTable = $x("//th[contains(text(),'Категория')]");
    private SelenideElement descriptionOnTable = $x("//th[contains(text(),'Описание')]");

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]");                      // 'Экспортировать'


}
