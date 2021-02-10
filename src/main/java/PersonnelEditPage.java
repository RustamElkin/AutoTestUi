// Персонал_редактирование
//  /ru/tko/control/personnel/2812/edit

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PersonnelEditPage {

    // Тайтл
    private SelenideElement titleToPage       = $x("//h1[contains(text(),'Редактирование')]");

    // Табы на странице
    private SelenideElement backTab           = $x("//span[contains(text(),'Назад')]/..");                                   // 'Назад'

    // Кнопки
    private SelenideElement saveBtn           = $x("//button[contains(@class, 's-btn--thm-aqua') and @type='submit']");      // 'Сохранить'
    private SelenideElement cancelBtn         = $x("//button[contains(@class, 's-btn-table')]");                             // 'Отмена'

    // Checkboxes
    private SelenideElement isUsageActiveMonitoringCheckBox = $x("//input[@id='field-input-lecture_homework']");             // чекбокс 'Учитывать в мониторинге активности'
    private SelenideElement maleSexCheckBox                 = $x("//input[@id='user[sex]-0' and @name='user[sex]']");        // чекбокс 'Мужской'
    private SelenideElement femaleSexCheckBox               = $x("//input[@id='user[sex]-1' and @name='user[sex]']");        // чекбокс 'Женский'

    // Инпуты
    private SelenideElement teacherInfoInput                = $x("//input[@name='personnel[teacher_info]']");                // 'Сведения о преподавательской деятельности'
    private SelenideElement teacherAdditionalInfoInput      = $x("//input[@name='personnel[teacher_additional_info]']");     // 'Дополнительно о преподавательской деятельности'
    private SelenideElement bornDateInput                   = $x("//input[@name='user[born_date]']");                        // 'Дата рождения'
    private SelenideElement nationalityInput                = $x("//input[@name='user[nationality_id]']");                   // 'Национальность'
    private SelenideElement educationKindInput              = $x("//input[@name='personnel[education_kind]']");              // 'Образование'
    private SelenideElement defectologicalEduInput          = $x("//input[@name='personnel[defectologist_edu]']");           // 'Дефектологическое образование'
    private SelenideElement academicDegreeInput             = $x("//input[@name='personnel[academic_degree]']");             // 'Ученая степень'
    private SelenideElement categoryInput                   = $x("//input[@name='personnel[academic_category]']");           // 'Категория'
    private SelenideElement categoryYearInput               = $x("//input[@name='personnel[category_year]']");               // 'Год подтверждения либо присвоения категории'
    private SelenideElement pedagogicalExperienceInput      = $x("//input[@name='personnel[pedagogical_experience]']");      // 'Стаж педагогической работы'
    private SelenideElement workExperienceInput             = $x("//input[@name='personnel[work_experience]']");             // 'Общий стаж работы'
    private SelenideElement iktCoursesPassedInput           = $x("//input[@name='personnel[ikt_training_passed]']");         // 'Прошел курс подготовки по ИКТ'
    private SelenideElement englishLevelInput               = $x("//input[@name='personnel[english_level]']");               // 'Уровень английского'
    private SelenideElement qualificationCoursesPassedInput = $x("//input[@name='personnel[qual_training_passed]']");        // 'Прошел курсы повышения квалификации'
    private SelenideElement positionInput                   = $x("//input[@name='personnel_movement[position]']");           // 'Должность'
    private SelenideElement mainPositionRateInput           = $x("//input[@name='personnel_movement[main_position_rate]']"); // 'Ставка основной должности'
    private SelenideElement hiringDateInput                 = $x("//input[@name='personnel_movement[hiring_date]']");        // 'Дата принятия на работу'
    private SelenideElement arrivalNumberInput              = $x("//input[@name='personnel_movement[hiring_order_number]']");// 'Номер приказа прибытия'
    private SelenideElement empContractTermInput            = $x("//input[@name='personnel_movement[emp_contract_term]']");  // 'Срок трудового договора'
    private SelenideElement employeeTypeInput               = $x("//input[@name='personnel_movement[employee_type]']");      // 'Сотрудник'

    // Validation error-message
    //Если не заполнить поля сработает валидация
    private SelenideElement emptyEducationKind              = $x("//div[contains(text(),'Поле \"Образование') and @class='s-form__error-message']");            // 'Образование'
    private SelenideElement emptyCategory                   = $x("//div[contains(text(),'Поле \"Категория') and @class='s-form__error-message']");              // 'Категория'
    private SelenideElement emptyPedagogicalExperience      = $x("//div[contains(text(),'Поле \"Стаж педагогической') and @class='s-form__error-message']");    // 'Стаж педагогической работы'
    private SelenideElement emptyWorkExperience             = $x("//div[contains(text(),'Поле \"Общий стаж работы') and @class='s-form__error-message']");      // 'Общий стаж работы'
    private SelenideElement emptyIktCoursesPassed           = $x("//div[contains(text(),'Поле \"Прошел курс подготовки') and @class='s-form__error-message']"); // 'Прошел курс подготовки по ИКТ'
    private SelenideElement emptyQualificationCoursesPassed = $x("//div[contains(text(),'Поле \"Прошел курсы повышения') and @class='s-form__error-message']"); // 'Прошел курсы повышения квалификации'
    private SelenideElement emptyPosition                   = $x("//div[contains(text(),'Поле \"Должность') and @class='s-form__error-message']");              // 'Должность'
    private SelenideElement emptyMainPositionRateInput      = $x("//div[contains(text(),'Поле \"Ставка основной') and @class='s-form__error-message']");        // 'Ставка основной должности'
    private SelenideElement emptyHiringDateInput            = $x("//div[contains(text(),'Поле \"Дата принятия') and @class='s-form__error-message']");          // 'Дата принятия на работу'
    private SelenideElement emptyArrivalNumberInput         = $x("//div[contains(text(),'Поле \"Номер приказа') and @class='s-form__error-message']");          // 'Номер приказа прибытия'
    private SelenideElement emptyEmpContractTermInput       = $x("//div[contains(text(),'Поле \"Срок трудового') and @class='s-form__error-message']");         // 'Срок трудового договора'
    private SelenideElement emptyEmployeeTypeInput          = $x("//div[contains(text(),'Поле \"Сотрудник') and @class='s-form__error-message']");              // 'Сотрудник'

}
