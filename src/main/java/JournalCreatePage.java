// Создание журнала
//  /ru/tko/control/journal/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class JournalCreatePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал')]");

    // Табы на странице
    private SelenideElement cancelTab = $x("//span[contains(text(),'Отмена')]/..");                      // 'Отмена'

    // Checkbox
    private SelenideElement modularEducationCheckBox = $x("//input[@type=\"checkbox\"]");                  // чекбокс 'Модульное обучение'

    // Инпуты
    private SelenideElement qualificationInput = $x("//div[contains(text(),'Квалификация')]/following-sibling::div//input");            // 'Квалификация'
    private SelenideElement groupInput = $x("//div[contains(text(),'Группа')]/following-sibling::div//input");                          // 'Группа'
    private SelenideElement nameInput = $x("//div[contains(text(),'Название')]/following-sibling::div//input");                         // 'Название'
    private SelenideElement subjectInput = $x("//div[contains(text(),'Предмет')]/following-sibling::div//input");                       // 'Предмет'
    private SelenideElement modulesInput = $x("//div[contains(text(),'Модули')]/following-sibling::div//input");                        // 'Модули'
    private SelenideElement teacherInput = $x("//div[contains(text(),'Преподаватель')]/following-sibling::div//input");                 // 'Преподаватель'
    private SelenideElement additionalTeachersInput = $x("//div[contains(text(),'Доп. Преподаватели')]/following-sibling::div//input"); // 'Доп. Преподаватели'
    private SelenideElement inputKTP = $x("//div[contains(text(),'КТП')]/.. //input[contains(@class,'sn-select__input')]");             // 'КТП'


    // Checkbox | Тип группы
    private SelenideElement selectAllStudents = $x("//div[contains(text(),'Выбрать всех студентов')]//preceding-sibling::div/input[@type=\"checkbox\"]");              // 'Выбрать всех студентов'
    private SelenideElement selectSubgroup = $x("//div[contains(text(),'Выбрать подгруппу')]//preceding-sibling::div/input[@type='checkbox']");                        // 'Выбрать подгруппу'

    // Dropdown
    private SelenideElement journalTypeDropdown = $x("//div[contains(text(),'Тип журнала')]/following-sibling::div/div[@class=\"sn-field__inner\"]");                  // 'Тип журнала'
    private SelenideElement qualificationDropdown = $x("//div[contains(text(),'Квалификация')]/following-sibling::div/div[@class=\"sn-field__inner\"]");               // 'Квалификация'
    private SelenideElement groupDropdown = $x("//div[contains(text(),'Группа')]/following-sibling::div/div[@class='sn-field__inner']");                               // 'Группа'
    private SelenideElement nameDropdown = $x("//div[contains(text(),'Название')]/following-sibling::div/div[@class=\"sn-field__inner\"]");                            // 'Название'
    private SelenideElement typeDropdown = $x("(//div[contains(text(),'Тип')]/following-sibling::div/div[@class=\"sn-field__inner\"])[2]");                            // 'Тип обучения'
    private SelenideElement numberOfSemestersDropdown = $x("//div[contains(text(),'Количество семестров')]/following-sibling::div/div[@class=\"sn-field__inner\"]");   // 'Количество семестров'
    private SelenideElement valuationTypeDropdown = $x("//div[contains(text(),'Вид оценки')]/following-sibling::div/div[@class=\"sn-field__inner\"]");                 // 'Вид оценки'
    private SelenideElement subjectDropdown = $x("//div[contains(text(),'Предмет')]/following-sibling::div/div[@class=\"sn-field__inner\"]");                          // 'Предмет'
    private SelenideElement modulesTypeDropdown = $x("//div[contains(text(),'Модули')]/following-sibling::div/div[@class=\"sn-field__inner\"]");                       // 'Модули'
    private SelenideElement teacherDropdown = $x("//div[contains(text(),'Преподаватель')]/following-sibling::div/div[@class=\"sn-field__inner\"]");                    // 'Преподаватель'
    private SelenideElement additionalTeachersDropdown = $x("//div[contains(text(),'Доп. Преподаватели')]/following-sibling::div/div[@class='sn-field__inner']");    // 'Доп. Преподаватели'

    // List | списки генерятся одинаково для всех дропдаунов. Получив список, фильтруем по имени или по индексу
    private ElementsCollection dropDownList = $$x("//div[@class=\"q-virtual-scroll__content\"]//div[@class='sn-item__label']");

    // Кнопка "Сохранить"
    private SelenideElement saveBtn = $x("//button[@type='button']");


}
