// Сведения и редактирование кафедры
//  /ru/tko/control/education-department/28/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EducationDepartmentEditPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                                                // 'Полный список'
    private SelenideElement groupsTab = $(byXpath("//span[contains(text(),'Группы')]/.."));                                                         // 'Группы'
    private SelenideElement subgroupsTab = $(byXpath("//span[contains(text(),'Подгруппы')]/.."));                                                   // 'Подгруппы'
    private SelenideElement cathedraTab = $(byXpath("//span[contains(text(),'Кафедры')]/.."));                                                      // 'Кафедры' (Текущий таб не кликабельный)
    private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/.."));   // 'Архив'

    // Инпуты
    private SelenideElement nameInput = $(byXpath("//input[@name='education_department[name]']"));                                                  // 'Название'
    private SelenideElement specializationInput = $(byXpath("//input[@type='search']"));                                                            // 'Специализация'

    // Если в поле специализация больше одной, можно удалить лишнии по номеру в li[...]
    // Для примера удалю второй
    private SelenideElement removeSpecializationInput = $(byXpath("//ul/li[2]/span[@class=\"select2-selection__choice__remove\"]"));                // 'Удаление Специализации'

    // Dropdown element
    private SelenideElement headDepartmentDropdown = $(byXpath("//label[contains(text(),'Зав. кафедрой')]/../select"));                             // 'Зав. кафедрой'

    // List headDepartment
    private ElementsCollection headDepartmentList = $$(byXpath("//select[@id='education_department.personnel_id']/option"));                        //'список Зав. кафедрой'

    // Зав. кафедрой можно фильтровать по имени и выбрать нужного.
    private SelenideElement selectHeadDepartment = $(byXpath("//select[@id=\"education_department.personnel_id\"]/option[contains(text(),'Башкинцева Ольга Ивановна')]"));

    // Кнопка "Сохранить"
    private SelenideElement addBtn = $(byXpath("//span[contains(text(),'Сохранить')]/.."));

    // validation error-message
    //Если не заполнить оба поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameErrorMessage = $(byXpath("//input[@name='education_department[name]']//following-sibling::div[contains(text(),'Поле \"Название\" обязательно для заполнения')]"));
    private SelenideElement emptySpecializationErrorMessage = $(byXpath("//select[@name=\"specialities[]\"]/..//div[contains(text(),'Поле \"Название\" обязательно для заполнения')]"));


}
