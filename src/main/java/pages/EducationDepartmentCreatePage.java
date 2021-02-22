package pages;// Создание кафедры
//  /ru/tko/control/education-department/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class EducationDepartmentCreatePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры' (Текущий таб не кликабельный)
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   // 'Архив'

    // Инпуты
    private SelenideElement nameInput = $x("//input[@name='education_department[name]']");                                                  // 'Название'
    private SelenideElement specializationInput = $x("//input[@type='search']");                                                            // 'Специализация'

    // Если в поле специализация больше одной, можно удалить лишнии по номеру в li[...]
    // Для примера удалю второй
    private SelenideElement removeSpecializationInput = $x("//ul/li[2]/span[@class=\"select2-selection__choice__remove\"]");                // 'Удаление Специализации'

    // Dropdown element
    private SelenideElement headDepartmentDropdown = $x("//label[contains(text(),'Зав. кафедрой')]/../select");                             // 'Зав. кафедрой'

    // List headDepartment
    private ElementsCollection headDepartmentList = $$x("//select[@id='education_department.personnel_id']/option");                         //'список Зав. кафедрой'

    // Зав. кафедрой можно фильтровать по имени и выбрать нужного.
    private SelenideElement selectHeadDepartment = $x("//select[@id=\"education_department.personnel_id\"]/option[contains(text(),'Башкинцева Ольга Ивановна')]");

    // Кнопка "Сохранить"
    private SelenideElement addBtn = $x("//span[contains(text(),'Сохранить')]/..");

    // validation error-message
    //Если не заполнить оба поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameErrorMessage = $x("//input[@name='education_department[name]']//following-sibling::div[contains(text(),'Поле \"Название\" обязательно для заполнения')]");
    private SelenideElement emptySpecializationErrorMessage = $x("//select[@name=\"specialities[]\"]/..//div[contains(text(),'Поле \"Название\" обязательно для заполнения')]");

}
