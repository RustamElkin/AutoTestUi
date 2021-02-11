// Журнал
//  /ru/tko/control/journal/64599/show

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class JournalShowPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Журнал')]");

    // Табы на странице
    private SelenideElement openTab = $x("//span[contains(text(),'Назад')]/..");                                         // 'Назад'

    // Кнопки
    private SelenideElement toSumUpBtn = $x("//a[contains(text(),'Подвести итоги')]");                                   // кнопка 'Подвести итоги'
    private SelenideElement generateDaysForTheWeekBtn = $x("//a[contains(text(),'Сгенерировать дни на неделю')]");       // кнопка 'Сгенерировать дни на неделю'
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]");                                    // кнопка 'Экспортировать'

    // Dropdown elements | фильтровать по названию или по индексу
    private ElementsCollection SubjectList = $$x("//select[@name=\"discipline\"]/option");
    //select[@name="discipline"]/option[contains(text(),'Физика')]

    // Кнопка добавления даты в журнале
    private SelenideElement addDateBtn = $x("//span[@class='tof-grid__score-add']");

    // Модалка
    // Инпуты в модалке
    private SelenideElement typeInput = $x("//label[contains(text(),'Тип')]/following-sibling::div//input");                                                      // 'Тип'
    private SelenideElement subjectInput = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");                                               // 'Предмет'

    // Если выбрать тип, появятся инпуты "Тип оценки", "Тема урока", "Введите кол-во часов".
    private SelenideElement typeGradeInput = $x("//label[contains(text(),'Тип оценки:')]/following-sibling::div//input");                                         // 'Тип оценки:'
    private SelenideElement lessonTopicInput = $x("//label[contains(text(),'Тема урока')]/following-sibling::input");                                             // 'Тема урока'
    private SelenideElement enterTheNumberOfHoursInput = $x("//label[contains(text(),'Введите кол-во часов')]/following-sibling::input");                         //'Введите кол-во часов'

    private SelenideElement dateInput = $x("(//label[contains(text(),'Дата')]/following-sibling::input)[1]");                                                     // 'Дата'
    private SelenideElement additionalTeacherInput = $x("(//label[contains(text(),'Доп. Преподаватели')]/following-sibling::div//input)[1]");                     // 'Доп. Преподаватели'

    // Dropdown elements
    private ElementsCollection typeList = $$x("//label[contains(text(),'Тип:')][@class=\"s-form__label mb-10\"]/following-sibling::div//span/span");
    // (//label[contains(text(),'Тип:')]/following-sibling::div//span/span[contains(text(),'Учебный день')])[1]
    // (//label[contains(text(),'Тип:')]/following-sibling::div//span/span[contains(text(),'Консультация')])[1]

    private ElementsCollection subjectList = $$x("//label[contains(text(),'Предмет')][@class=\"s-form__label mb-10\"]/following-sibling::div//span/span");
    private ElementsCollection additionalTeacherList = $$x("//label[contains(text(),'Доп. Преподаватели: ')][@class='s-form__label mb-10']/following-sibling::div//span/span");
    private ElementsCollection typeGradeList = $$x("//label[contains(text(),'Тип оценки')]/following-sibling::div//span/span");                                   // Список "Тип оценки"
    private SelenideElement simpleEvaluation = $x("//label[contains(text(),'Тип оценки')]/following-sibling::div//span/span[contains(text(),'Простая оценка')]"); //'Простая оценка'

    // Кнопки в модалке
    private SelenideElement closeModalBtn = $x("//div[@data-target=\"#modal-journal-add-day\"]");                                                                 // 'Закрыть модалку'
    private SelenideElement submitBtn = $x("//div[@class=\"row-sort-between-btn\"]/button[contains(text(),'Подтвердить')]");                                      // 'Подтвердить'
    private SelenideElement cancelBtn = $x("//div[@class='row-sort-between-btn']/button[contains(text(),'Отмена')][@data-target='#modal-journal-add-day']");      // 'Отмена'

    // При добавлении дня, открывается модалка, в ней добавили чекбокс
    private SelenideElement CalendarThematicPlanCheckbox = $x("//input[@type='checkbox' and @name='byCalendarThematicPlan']");

    // Инпут в модалке - Тема из КТП
    private SelenideElement topicFromCTP = $x("//input[@class='multiselect__input' and @name='calendar_thematic_plan_theme_id']");                                 // 'Тема из КТП'


    // Список кнопок "редактирования дня", откроется модалка
    private SelenideElement editDateList = $x("//tbody/tr/td/div[contains(text(),'Кочетков Роман Дмитриевич')]/../following-sibling::td//div[@class=\"s-ico s-ico--thm-pencil\"]");

    // При редактировании дня, в модалке появляется кнопка "Удалить"
    private SelenideElement deleteBtn = $x("//div[@class='row-sort-between-btn']/button[contains(text(),'Удалить')]");                                            // 'Удалить'

}
