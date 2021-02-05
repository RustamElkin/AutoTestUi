// Мониторинг_Онлайн занятия_Журнал событий сотрудника
// Сотрудник ОУ
//  /ru/tko/control/monitoring/people/details/28615531

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MonitoringPeopleDetailsOUPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал событий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"
    private SelenideElement eventLogTab = $x("//span[contains(text(),'Журнал событий')]/..");              // Таб "Журнал событий"

    // Название организации
    private SelenideElement  organizationNameTitle= $x("//h3[contains(@class,'s-title s-upper')]");

    // ФИО сотрудника
    private SelenideElement  fullNameTitle= $x("//h3[@class='s-light mt-15 mb-20']");

    // Таблицы у которых одинаковые поля.
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                             // '№'
    private SelenideElement typeLogTable = $x("//div[contains(text(),'Тип лога')]");                       // 'Тип лога'
    private SelenideElement timeLogTable = $x("//div[contains(text(),'Время лога')]");                     // 'Время лога'

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("(//ul[@role=\"navigation\"]//a[contains(text(),'2')])[1]");
    private SelenideElement thirdPaginateBtn = $x("(//ul[@role=\"navigation\"]//a[contains(text(),'3')])[1]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'4')]");
    private SelenideElement fifthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'5')]");
    private SelenideElement sixthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'6')]");
    private SelenideElement seventhPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'7')]");
    private SelenideElement eighthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'8')]");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");


}
