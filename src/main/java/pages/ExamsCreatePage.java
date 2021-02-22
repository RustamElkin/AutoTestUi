package pages;// Создание экзамена
//  /ru/tko/control/exams/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ExamsCreatePage {

    // Тайтл
    private SelenideElement titleToPage             = $x("//h1[contains(text(),'Экзамены')]");

    // Инпуты
    private SelenideElement journalInput            = $x("//label[contains(text(),'Журнал')]/following-sibling::div//input");                      // 'Журнал'
    private SelenideElement examTypeInput           = $x("//label[contains(text(),'Вид экзамена')]/following-sibling::div//input");                // 'Вид экзамена'
    private SelenideElement dateInput               = $x("//label[contains(text(),'Дата')]/following-sibling::input[@name='date']");               // 'Дата'
    private SelenideElement timeInput               = $x("//span[contains(@class,'select2-search--dropdown')]/input");                             // 'Время'
    private SelenideElement cabinetInput            = $x("//label[contains(text(),'Кабинет')]/following-sibling::input");                          // 'Кабинет'

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Если выбрать чекбокс "Комплексный экзамен" поле "Предметы" пропадает.
    private SelenideElement complexCheckbox         = $x("//label[@for='field-input-is_complex' and contains(text(),'Комплексный экзамен')]/preceding-sibling::input");

    //  Если выбрать вид экзамена "В форме тестирования", то добавится три инпута
    private SelenideElement groupOfQuestionsInput   = $x("//label[contains(text(),'Группа вопросов')]/following-sibling::div//input");             // 'Группа вопросов'
    private SelenideElement testingTimeInput        = $x("//label[contains(text(),'Время проведения тестирования')]/following-sibling::input");    // 'Время проведения тестирования'
    private SelenideElement numberOfQuestionsInput  = $x("//label[contains(text(),'Кол-во вопросов')]/following-sibling::input");                  // 'Кол-во вопросов'

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Если выбрать вид экзамена "По билетам", то добавится два инпута
    private SelenideElement ticketGroupInput        = $x("//label[contains(text(),'Группа билетов')]/following-sibling::div//input");              // 'Группа билетов'
    // 'Время проведения тестирования' Xpath выше.

    // дропдауны со списками элементов
    private SelenideElement journalDropdownList     = $x("//label[contains(text(),'Журнал')]/following-sibling::div//li[@class='multiselect__element']");                   // 'Журнал'
    private SelenideElement examTypeDropdownList    = $x("//label[contains(text(),'Вид экзамена')]/following-sibling::div//li[@class='multiselect__element']/span/span");   // 'Вид экзамена'
    private SelenideElement timeDropdownList        = $x("//span[@class='select2-results']//li[@role='option']");                                                           // 'Время'
    private SelenideElement ticketGroupDropdownList = $x("//label[contains(text(),'Группа билетов')]/following-sibling::div//li");                                          // 'Группа билетов'
    // в тесте искать selectSubject = $(byText())

    // Получить список Студентов
    private ElementsCollection fullNameList         = $$x("//div[@class='candidate-list']//div[@class='candidate-item__name']");

    // Список ссылок "Посмотреть"
    private ElementsCollection linkList             = $$x("//div[@class='candidate-list']//a[contains(text(), 'Посмотреть')]");

    // Список кнопок "Убрать из списка" и добавить в список
    private ElementsCollection rejectBtns           = $$x("//div[@class='candidate-item']/input[@type='radio' and @value='0']");
    private ElementsCollection successBtns          = $$x("//div[@class='candidate-item']/input[@type='radio' and @value='1']");

    // Кнопки
    private SelenideElement cancelBtn               = $x("//div[@class ='row-sort-between-btn']/a[contains(text(),'Отмена')]");                    // 'Отмена'
    private SelenideElement saveBtn                 = $x("//div[@class ='row-sort-between-btn']/button[contains(text(),'Сохранить')]");            // 'Сохранить'


    // validation error-message -
    //Если не заполнить оба поля сработает валидация, можно это проверить в тесте.
    // Валидация не работает в поле Журнал, без предмета сохранилось(
    // если комплексный то предмет не нужен!
    private SelenideElement emptyExamTypeErrorMessage = $x("//label[contains(text(),'Вид экзамена')]/following-sibling::div[contains(text(),' Поле \"Вид экзамена')]");
    private SelenideElement emptyDateErrorMessage     = $x("//input[@name='date']/following-sibling::div[contains(text(),'Поле \"Дата')]");
    private SelenideElement emptyTimeErrorMessage     = $x("//label[contains(text(),'Время')]/following-sibling::div[contains(text(),'Поле \"Время')]");
    private SelenideElement emptyCabinetErrorMessage  = $x("//input[@name='cabinet']/following-sibling::div[contains(text(),'Поле \"Кабинет')]");



}
