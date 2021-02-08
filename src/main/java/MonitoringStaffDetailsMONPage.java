// Мониторинг_Онлайн занятия_Журнал событий педагога
// МОН РК
//  /ru/tko/control/monitoring/people/details/28615531

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MonitoringStaffDetailsMONPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал событий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"
    private SelenideElement eventLogTab = $x("//span[contains(text(),'Журнал событий')]/..");              // Таб "Журнал событий"

    // Название организации
    private SelenideElement organizationNameTitle = $x("//h3[contains(@class,'s-title s-upper')]");

    // ФИО сотрудника
    private SelenideElement nameTitle = $x("//h3[@class='s-light mt-15 mb-20']");

    // Таблицы у которых одинаковые поля.
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                              // '№'
    private SelenideElement areaTable = $x("//th[contains(text(),'Тип лога')]");                           // 'Тип лога'
    private SelenideElement districtTable = $x("//th[contains(text(),'Время лога')]");                     // 'Время лога'


    // Кнопки пагинации на странице (на деве до 37 стр )
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");                             // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'3')]");
    private SelenideElement fourthPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'4')]");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

}
