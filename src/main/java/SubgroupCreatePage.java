// Создание подгрупп
//  /ru/tko/control/subgroup/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SubgroupCreatePage {

    // Тайтл
    private SelenideElement titleToPage           = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab           = $x("//span[contains(text(),'Полный список')]/..");                                               // 'Полный список'
    private SelenideElement groupsTab             = $x("//span[contains(text(),'Группы')]/..");                                                      // 'Группы'
    private SelenideElement subgroupsTab          = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab           = $x("//span[contains(text(),'Кафедры')]/..");                                                     // 'Кафедры'
    private SelenideElement archiveTab            = $x("//div[@class='container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");   // 'Архив'

    // Кнопки
    private SelenideElement cancelBtn             = $x("//div[@class=\"row-sort-between-btn\"]/a[contains(text(),'Отмена')]");                       // Кнопка 'Отмена'
    private SelenideElement addBtn                = $x("//div[@class=\"row-sort-between-btn\"]/button[contains(text(),'Сохранить')]");               // Кнопка 'Сохранить'

    // Инпуты
    private SelenideElement nameInput             = $x("//label[contains(text(),'Название')]/following-sibling::input");                             // 'Название'
    private SelenideElement qualificationInput    = $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");                    // 'Квалификация'

    // Dropdown фильтры
    private SelenideElement qualificationDropDown = $x("//label[contains(text(),'Квалификация')]/following-sibling::div");                           // 'Квалификация'

    // validation error-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameErrorMessage = $x("//div[contains(text(),'Поле \"Название') and @class='s-form__error-message']");              // Поле "Название" обязательно для заполнения
    private SelenideElement emptyQualificationErrorMessage = $x("//div[contains(text(),'Поле \"Квалификация') and @class='s-form__error-message']"); // Поле "Квалификация" обязательно для заполнения
    private SelenideElement emtyAllAreaGrowlMessage =$x("//div[@class='growl-message']");                                                            // 'Ошибка и тд.'
}
