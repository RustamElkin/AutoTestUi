// Выбытие выпускников
//  /ru/tko/control/group/183/graduate-contingent

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GroupGraduateContingentPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   // 'Архив'

    // Таблица
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                              //'ФИО'
    private SelenideElement docOfEduTable = $x("//th[@id='doc_of_edu']");                                                    //'Вид диплома/справка'
    private SelenideElement seriesAndNumberDiplomTable = $x("//th[contains(text(),'Серия и № диплома')]");                   //'Серия и № диплома'
    private SelenideElement employmentTable = $x("//th[@id='employment']");                                                  //'Трудоустройство'
    private SelenideElement countryOfDepartureTable = $x("//th[@id='country_departure']");                                   //'Страна выбытия'

    // Список студентов
    private ElementsCollection studentList = $$x("//tbody/tr/td[@data-table-head='ФИО']"); //можно фильтровать по имени

    // Список Видов диплома/справок. Далее выбераем по индексу от 1 до 4
    private ElementsCollection docOfEduList = $$x("//td[contains(text(),'Абдалимов Камбарали Бакытбекугли')]/following-sibling::td/select[@name='contingent[0][doc_of_edu]']/option");

    // Инпут Серия и № диплома выбрав студента
    private SelenideElement seriesAndNumberDiplomInput = $x("//td[contains(text(),'Абдалимов Камбарали Бакытбекугли')]/following-sibling::td/input");

    // Список "Трудоустройство"
    private ElementsCollection employmentList = $$x("//td[contains(text(),'Абдалимов Камбарали Бакытбекугли')]/following-sibling::td[@data-table-head='Трудоустройство']//option");

    // Список стран появляется только при выборе варианта "Выехал за пределы страны"
    private ElementsCollection countryList = $$x("//td[contains(text(),'Абдалимов Камбарали Бакытбекугли')]/following-sibling::td[@data-table-head='Страна выбытия']//option");

    // Инпуты
    private SelenideElement nameInput = $x("//label[contains(text(),'Номер приказа')]/following-sibling::input");            // 'Номер приказа выбытия'
    private SelenideElement cathedraInput = $x("(//label[contains(text(),'Дата выбытия')]/following-sibling::input)[1]");    // 'Дата выбытия'

    // Кнопки
    private SelenideElement cancelBtn = $x("(//a[contains(text(),'Отмена')])[1]");                                           // 'Отмена'
    private SelenideElement confirmBtn = $x("//button[contains(text(),'Подтвердить')]");                                     // 'Подтвердить'


}

