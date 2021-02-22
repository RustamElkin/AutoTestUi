package pages;// Создание КТП
//  /ru/tko/control/calendar-thematic-plan/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateCalendarThematicPlanPage {

    // Тайтл
    private SelenideElement titleToPage             = $x("//h1[contains(text(),'Календарно-тематические планы')]");

    // Инпуты
    private SelenideElement nameInput               = $x("//label[contains(text(),'Название')]/following-sibling::input");                                           // 'Название'
    private SelenideElement semesterInput           = $x("//label[contains(text(),'Семестр: ')]/following-sibling::div//input");                                     // 'Семестр'
    private SelenideElement disciplineInput         = $x("//label[contains(text(),'Дисциплина:')]/following-sibling::div//input");                                   // 'Дисциплина'
    private SelenideElement qualificationInput      = $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");                                  // 'Квалификация'
    private SelenideElement groupInput              = $x("//label[contains(text(),'Группа')]/following-sibling::div//input");                                        // 'Группа'
    private SelenideElement teacherInput            = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div//input[@name='personnel_id']");           // 'Преподаватель'
    private SelenideElement hourCountInput          = $x("//label[contains(text(),'Количество часов')]/following-sibling::input[@name='hour_count']");               // 'Количество часов'
    private SelenideElement creditCountInput        = $x("//label[contains(text(),'Количество кредитов')]/following-sibling::input[@name='credit_count']");          // 'Группа'

    // dropdowns
    private SelenideElement semesterDropdown        = $x("//label[contains(text(),'Семестр')]/following-sibling::div[@class = 'multiselect mb-10']");
    private SelenideElement disciplineDropdown      = $x("//label[contains(text(),'Дисциплина')]/following-sibling::div[@class = 'multiselect mb-10']");
    private SelenideElement qualificationDropdown   = $x("//label[contains(text(),'Квалификация')]/following-sibling::div[@class = 'multiselect mb-10']");
    private SelenideElement groupDropdown           = $x("//label[contains(text(),'Группа')]/following-sibling::div[@class = 'multiselect mb-10']");
    private SelenideElement teacherDropdown         = $x("//label[contains(text(),'Преподаватель:')]/following-sibling::div[@class='multiselect mb-10']");           // 'Преподаватель'

    // checkbox
    private SelenideElement forModuleCheckbox       = $x("//label[contains(text(),'Для модуля')]/preceding-sibling::input[@name = 'is_for_module' and @class = 's-form__checkbox']");

    // error message
    private SelenideElement nameInputEmpty          = $x("//label[contains(text(),'Название')]/following-sibling::div[@class='s-form__error-message']");             // 'Название'
    private SelenideElement semesterInputEmpty      = $x("//label[contains(text(),'Семестр: ')]/following-sibling::div[@class='s-form__error-message']");            // 'Семестр'
    private SelenideElement disciplineInputEmpty    = $x("//label[contains(text(),'Дисциплина:')]/following-sibling::div[@class='s-form__error-message']");          // 'Дисциплина'
    private SelenideElement qualificationInputEmpty = $x("//label[contains(text(),'Квалификация')]/following-sibling::div[@class='s-form__error-message']");         // 'Квалификация'
    private SelenideElement teacherInputEmpty       = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div[@class='s-form__error-message']");        // 'Преподаватель'
    private SelenideElement hourCountInputEmpty     = $x("//label[contains(text(),'Количество часов')]/following-sibling::div[@class='s-form__error-message']");     // 'Количество часов'
    private SelenideElement creditCountInputEmpty   = $x("//label[contains(text(),'Количество кредитов')]/following-sibling::div[@class='s-form__error-message']");  // 'Группа'

    // Кнопки
    private SelenideElement cancelBtn               = $x("//div[@class = 'row justify-content-between']//a[contains(text(),'Отмена')]");
    private SelenideElement saveBtn                 = $x("//div[@class = 'row justify-content-between']//span[contains(text(),'Сохранить')]/..");
}
