package pages;// Дистанционное обучение_Создание задания
//  /ru/tko/control/assigned-homeworks/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AssignedHomeworkCreatePage<cancelBtn> {

    // Тайтл
    private SelenideElement titleToPage               = $x("//h1[contains(text(),'Назначенные задания')]");

    // Инпуты
    private SelenideElement nameInput                 = $x("//input[@name = 'name' and @class = 's-form__input']");
    private SelenideElement journalInput              = $x("//input[@name = 'journal_id' and @class = 'multiselect__input']");
    private SelenideElement homeworkInput             = $x("//input[@name = 'homework_id' and @class = 'multiselect__input']");
    private SelenideElement dateEndInput              = $x("//input[@name = 'date_end' and @class = 's-form__input hasDatepicker']");
    private SelenideElement timeInput                 = $x("//input[@name = 'time_end' and @class = 's-form__input']");
    private SelenideElement datePointInput            = $x("//input[@name = 'date_point' and @class = 'multiselect__input']");

    // Dropdown multiselect
    private SelenideElement journalDropdown           = $x("//label[text() = 'Журнал: ']/following-sibling::div");
    private SelenideElement taskDropdown              = $x("//label[text() = 'Задание: ']/following-sibling::div");
    private SelenideElement datePointDropdown         = $x("//label[text() = 'Дата оценки: ']/following-sibling::div");
    private SelenideElement studentsDropdown          = $x("//label[text() = 'Студенты: ']/following-sibling::div");

    private ElementsCollection selectJournalList      = $$x("//label[text() = 'Журнал: ']/following-sibling::div//li[@class = 'multiselect__element']");
    private ElementsCollection selectStudentsList     = $$x("//label[text() = 'Студенты: ']/following-sibling::div//li[@class = 'multiselect__element']");
    private ElementsCollection selectTasksList        = $$x("//label[text() = 'Задание: ']/following-sibling::div//li[@class = 'multiselect__element']");
    private ElementsCollection datePointList          = $$x("//label[text() = 'Дата оценки: ']/following-sibling::div//li[@class = 'multiselect__element']");

    // чекбокс
    private SelenideElement selectCheckbox            = $x("//input[@id='field-input-select_all_students']");

    // Кнопки
    private SelenideElement cancelBtn                 = $x("//a[contains(text(),'Отмена')]");
    private SelenideElement submitBtn                 = $x("//span[contains(text(),'Сохранить')]/parent::button");

    // validation error-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameErrorMessage     = $x("//div[contains(text(),'Поле \"Название')]");
    private SelenideElement emptyJournalErrorMessage  = $x("//div[contains(text(),'Поле \"Журнал')]");
    private SelenideElement emptyHomeworkErrorMessage = $x("//div[contains(text(),'Поле \"Задание')]");
    private SelenideElement emptyDateEndErrorMessage  = $x("//div[contains(text(),'Поле \"Дата завершения')]");
    private SelenideElement emptyTimeErrorMessage     = $x("//div[contains(text(),'Поле \"Время')]");
    private SelenideElement emptyDatePointErrorMessage= $x("//div[contains(text(),'Поле \"Дата оценки')]");

}
