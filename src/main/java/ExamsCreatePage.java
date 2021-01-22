// Создание экзамена
//  /ru/tko/control/exams/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ExamsCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Экзамены')]"));

    // Инпуты

    //label[contains(text(),'Журнал')]/following-sibling::div//input
    //label[contains(text(),'Вид экзамена')]/following-sibling::div//input
    (//label[contains(text(),'Дата')]/following-sibling::input)[1]
    //label[contains(text(),'Время')]/following-sibling::span
    //label[contains(text(),'Кабинет')]/following-sibling::input

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Если выбрать вид экзамена "В форме тестирования", то добавится три инпута
    //label[contains(text(),'Группа вопросов')]/following-sibling::div//input                                           //'Группа вопросов'
    //label[contains(text(),'Время проведения тестирования')]/following-sibling::input                                  // 'Время проведения тестирования'
    //label[contains(text(),'Кол-во вопросов')]/following-sibling::input                                                // 'Кол-во вопросов'

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Если выбрать вид экзамена "По билетам", то добавится два инпута
    //label[contains(text(),'Группа билетов')]/following-sibling::div//input                                            // 'Группа билетов' \
    // и 'Время проведения тестирования' Xpath выше.

    // дропдауны со списками элементов
    //label[contains(text(),'Журнал')]/following-sibling::div//li[@class="multiselect__element"]
    //label[contains(text(),'Вид экзамена')]/following-sibling::div//li[@class="multiselect__element"]/span/span
    //label[contains(text(),'Время')]/following-sibling::select//option
    //label[contains(text(),'Группа билетов')]/following-sibling::div//li

    // в тесте искать selectSubject = $(byText())


    // Кнопки
    private SelenideElement cancelBtn= $(byXpath("//div[@class ='row-sort-between-btn']/a[contains(text(),'Отмена')]"));
    private SelenideElement saveBtn= $(byXpath("//div[@class ='row-sort-between-btn']/button[contains(text(),'Сохранить')]"));

    // Валидация не работает, ждем фиксов

}
