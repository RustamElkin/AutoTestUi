// Создание экзамена
//  /ru/tko/control/exams/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExamsCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Экзамены')]");

    // Инпуты
    private SelenideElement journalInput = $x("//label[contains(text(),'Журнал')]/following-sibling::div//input");                       // 'Журнал'
    private SelenideElement examTypeInput = $x("//label[contains(text(),'Вид экзамена')]/following-sibling::div//input");                // 'Вид экзамена'
    private SelenideElement dateInput = $x("(//label[contains(text(),'Дата')]/following-sibling::input)[1]");                            // 'Дата'
    private SelenideElement timeInput = $x("//label[contains(text(),'Время')]/following-sibling::span");                                 // 'Время'
    private SelenideElement cabinetInput = $x("//label[contains(text(),'Кабинет')]/following-sibling::input");                           // 'Кабинет'

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Если выбрать вид экзамена "В форме тестирования", то добавится три инпута
    private SelenideElement groupOfQuestionsInput = $x("//label[contains(text(),'Группа вопросов')]/following-sibling::div//input");     // 'Группа вопросов'
    private SelenideElement testingTimeInput = $x("//label[contains(text(),'Время проведения тестирования')]/following-sibling::input"); // 'Время проведения тестирования'
    private SelenideElement numberOfQuestionsInput = $x("//label[contains(text(),'Кол-во вопросов')]/following-sibling::input");         // 'Кол-во вопросов'

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Если выбрать вид экзамена "По билетам", то добавится два инпута
    private SelenideElement ticketGroupInput = $x("//label[contains(text(),'Группа билетов')]/following-sibling::div//input");           // 'Группа билетов'
    // 'Время проведения тестирования' Xpath выше.

    // дропдауны со списками элементов
    private SelenideElement journalDropdownList = $x("//label[contains(text(),'Журнал')]/following-sibling::div//li[@class=\"multiselect__element\"]");                   // 'Журнал'
    private SelenideElement examTypeDropdownList = $x("//label[contains(text(),'Вид экзамена')]/following-sibling::div//li[@class=\"multiselect__element\"]/span/span");  // 'Вид экзамена'
    private SelenideElement timeDropdownList = $x("//label[contains(text(),'Время')]/following-sibling::select//option");                                                 // 'Время'
    private SelenideElement ticketGroupDropdownList = $x("//label[contains(text(),'Группа билетов')]/following-sibling::div//li");                                        // 'Группа билетов'
    // в тесте искать selectSubject = $(byText())

    // Кнопки
    private SelenideElement cancelBtn = $x("//div[@class ='row-sort-between-btn']/a[contains(text(),'Отмена')]");                        // 'Отмена'
    private SelenideElement saveBtn = $x("//div[@class ='row-sort-between-btn']/button[contains(text(),'Сохранить')]");                  // 'Сохранить'

    // Валидация не работает, ждем фиксов

}
