// Мониторинг_Педагоги_Журнал событий
// МОН РК
//  /ru/tko/control/monitoring/people/details/28615531

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MonitoringEventLogMONPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал событий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"
    private SelenideElement eventLogTab = $x("//span[contains(text(),'Журнал событий')]/..");              // Таб "Журнал событий"

    // Название организации
    private SelenideElement organizationNameTitle= $x("//h3[contains(@class,'s-title s-upper')]");
    private SelenideElement nameTitle= $x("//h3[@class='s-light mt-15 mb-20']");

    // Таблицы у которых одинаковые поля.
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                             // '№'
    private SelenideElement areaTable = $x("//div[contains(text(),'Тип лога')]");                          // 'Тип лога'
    private SelenideElement districtTable = $x("//div[contains(text(),'Время лога')]");                    // 'Время лога'


}

