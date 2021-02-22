package pages;// Мониторинг_Дистанционное обучение
// МОН РК
//  /ru/tko/control/monitoring/people?homework=1

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringDistanceLearningMONPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мониторинг приемных комиссий')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                         // Таб "Назад"

    // Таблицы у которых одинаковые поля.
    private SelenideElement numberOnTable = $x("//div[contains(text(),'№')]");                                             // '№'
    private SelenideElement areaTable = $x("//div[contains(text(),'Название организации')]");                              // 'Название организации'
    private SelenideElement districtTable = $x("//div[contains(text(),'Количество студентов')]");                          // 'Количество студентов'
    private SelenideElement specialtyTable = $x("//div[contains(text(),'Количество персонала')]");                         // 'Количество персонала'
    private SelenideElement qualificationTable = $x("//div[contains(text(),'Количество назначенных заданий')]");           // 'Количество назначенных заданий'

    // Кнопки просмотра в таблицах.
    private ElementsCollection viewBtn = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");                           // Кнопки 'Посмотреть'

    // Таблицы с тайтлами
    private SelenideElement tkoRegionTable = $x("//span[contains(text(),'Туркестанская область')]/../..//table");          // 'Туркестанская область'
    private SelenideElement shyRegionTable = $x("//span[contains(text(),'Шымкент')]/../..//table");                        // 'Шымкент'
    private SelenideElement krgRegionTable = $x("//span[contains(text(),'Карагандинская область')]/../..//table");         // 'Карагандинская область'
    private SelenideElement almatyRegionTable = $x("//span[contains(text(),'Алматы')]/../..//table");                      // 'Алматы'
    private SelenideElement almRegionTable = $x("//span[contains(text(),'Алматинская область')]/../..//table");            // 'Алматинская область'
    private SelenideElement kzlRegionTable = $x("//span[contains(text(),'Кызылординская область')]/../..//table");         // 'Кызылординская область'
    private SelenideElement zkoRegionTable = $x("//span[contains(text(),'Западно-Казахстанская область')]/../..//table");  // 'Западно-Казахстанская область'
    private SelenideElement aktRegionTable = $x("//span[contains(text(),'Актюбинская область')]/../..//table");            // 'Актюбинская область'
    private SelenideElement akmRegionTable = $x("//span[contains(text(),'Акмолинская область')]/../..//table");            // 'Акмолинская область'
    private SelenideElement vkoRegionTable = $x("//span[contains(text(),'Восточно-Казахстанская область')]/../..//table"); // 'Восточно-Казахстанская область'



}
