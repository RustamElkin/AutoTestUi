package pages;// Редактирование КТП
//  /ru/tko/control/calendar-thematic-plan/3/edit

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EditCalendarThematicPlanPage {

    // Тайтл
    private SelenideElement titleToPage           = $x("//h1[contains(text(),'Календарно-тематические планы')]");

    // Инпуты
    private SelenideElement nameInput             = $x("//label[contains(text(),'Название')]/following-sibling::input");                                             // 'Название'
    private SelenideElement semesterInput         = $x("//label[contains(text(),'Семестр: ')]/following-sibling::div//input");                                       // 'Семестр'
    private SelenideElement teacherInput          = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div//input[@name = 'personnel_id']");           // 'Преподаватель'
    private SelenideElement hourCountInput        = $x("//label[contains(text(),'Количество часов')]/following-sibling::input[@name = 'hour_count']");               // 'Количество часов'
    private SelenideElement creditCountInput      = $x("//label[contains(text(),'Количество кредитов')]/following-sibling::input[@name = 'credit_count']");          // 'Группа'

    // dropdowns
    private SelenideElement semesterDropdown      = $x("//label[contains(text(),'Семестр')]/following-sibling::div[@class = 'multiselect mb-10']");
    private SelenideElement teacherDropdown       = $x("//label[contains(text(),'Преподаватель:')]/following-sibling::div[@class='multiselect mb-10']");             // 'Преподаватель'

    // error message
    private SelenideElement nameInputEmpty        = $x("//label[contains(text(),'Название')]/following-sibling::div[@class = 's-form__error-message']");             // 'Название'
    private SelenideElement semesterInputEmpty    = $x("//label[contains(text(),'Семестр: ')]/following-sibling::div[@class = 's-form__error-message']");            // 'Семестр'
    private SelenideElement teacherInputEmpty     = $x("//label[contains(text(),'Преподаватель')]/following-sibling::div[@class = 's-form__error-message']");        // 'Преподаватель'
    private SelenideElement hourCountInputEmpty   = $x("//label[contains(text(),'Количество часов')]/following-sibling::div[@class = 's-form__error-message']");     // 'Количество часов'
    private SelenideElement creditCountInputEmpty = $x("//label[contains(text(),'Количество кредитов')]/following-sibling::div[@class = 's-form__error-message']");  // 'Группа'

    // Кнопки
    private SelenideElement cancelBtn             = $x("//div[@class = 'row justify-content-between']//a[contains(text(),'Отмена')]");
    private SelenideElement saveBtn               = $x("//div[@class = 'row justify-content-between']//span[contains(text(),'Сохранить')]/..");




}
