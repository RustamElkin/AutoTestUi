// Редактирование подгруппы
//  /ru/tko/control/subgroup/813/edit

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SubgroupEditPage {

    // Тайтл
    private SelenideElement titleToPage  = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab  = $x("//span[contains(text(),'Полный список')]/..");                                                       // 'Полный список'
    private SelenideElement groupsTab    = $x("//span[contains(text(),'Группы')]/..");                                                              // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                           // 'Подгруппы'
    private SelenideElement cathedraTab  = $x("//span[contains(text(),'Кафедры')]/..");                                                             // 'Кафедры'
    private SelenideElement archiveTab   = $x("//div[@class='container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");           // 'Архив'

    // Инпуты
    private SelenideElement nameInput     = $x("//label[contains(text(),'Название')]/following-sibling::input");                                    // 'Название'

    // Кнопки
    private SelenideElement cancelBtn     = $x("//div[@class=\"row-sort-between-btn\"]/a[contains(text(),'Отмена')]");                              // Кнопка 'Отмена'
    private SelenideElement addBtn        = $x("//div[@class=\"row-sort-between-btn\"]/button[contains(text(),'Сохранить')]");                      // Кнопка 'Сохранить'

    // validation error-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameErrorMessage = $x("//div[contains(text(),'обязательно для заполнения') and @class='s-form__error-message']");  // Поле "Название" обязательно для заполнения



}
