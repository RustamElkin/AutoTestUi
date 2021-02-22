package pages;// Дистанционное обучение_Редактирование шаблона задания
//  /ru/tko/control/homeworks/233/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HomeworkTemplateEditPage {

    // Тайтл
    private SelenideElement titleToPage               = $x("//h1[contains(text(),'Шаблоны заданий')]");

    // Checkbox
    private SelenideElement lectureAssignmentCheckbox = $x("//input[@id = 'field-input-lecture_homework']");                                                                  // чекбокс 'Задание по лекции'
    // Если выбрать чекбокс "Задание по лекции", появиться чекбокс "С заданием"
    private SelenideElement withTaskCheckbox          = $x("//input[@id = 'field-input-with_task' and @type = 'checkbox']");

    // Инпуты
    // Если выбрать чекбокс "Задание по лекции"
    private SelenideElement disciplineInput           = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input[@name='discipline_id']");
    private SelenideElement lectureInput              = $x("//label[contains(text(),'Лекции')]/following-sibling::div//input[@name='online_education_lecture_id']");

    // Поле "Название и Тип" активно когда шаблон дз. не по лекции
    private SelenideElement nameInput                 = $x("//label[contains(text(),'Название')]/following-sibling::input");                                                // 'Название'
    private SelenideElement typeInput                 = $x("//label[contains(text(),'Тип')]/following-sibling::div//input");                                                // "Тип"
    private SelenideElement descriptionInput          = $x("//div[@class = 'ck ck-editor__main']/div");                                                                     // "Описание"
    private SelenideElement libraryInput              = $x("//label[contains(text(),'Библиотека')]/following-sibling::div//input");                                         // "Библиотека"

    // Dropdown
    private SelenideElement typeDropdown              = $x("//label[contains(text(),'Тип')]/following-sibling::div/div[@class='multiselect__tags']");                       // "Тип"
    private SelenideElement libraryDropdown           = $x("//label[contains(text(),'Библиотека')]/following-sibling::div/div[@class='multiselect__tags']");                // "Библиотека"

    // Поле тип, в нем всего один селект
    private SelenideElement typeAsDownloadSelect      = $x("(//label[contains(text(),'Тип')]/following-sibling::div//span[contains(text(),'В виде загрузки')])[1]");        // 'В виде загрузки файлов и ввода текста'
    private SelenideElement librarySelect             = $x("//label[contains(text(),'Библиотека')]/following-sibling::div//li//span[contains(text(),'forUiAutoTest')]");    // "Библиотека"

    // Кнопки
    private SelenideElement addFileBtn                = $x(" //div[contains(text(),'Добавить')]");                                                                          // 'Добавить'
    // Список файлов если их загружено больше одного, далее фильтруется о названию или по индексу

    private ElementsCollection listDeleteFileBtn      = $$x("//div/div[@class = 'button button_type_file remove_uploaded_file']");

    private SelenideElement deleteFileBtn             = $x("(//div/div[@class = 'button button_type_file remove_uploaded_file'])[1]");                                      // 'Удалить первый файл'

    // Кнопки
    private SelenideElement cancelBtn                 = $x("//div[@class = 'col-12 col-sm-auto mb-20']/a[contains(text(),'Отмена')]");
    private SelenideElement saveBtn                   = $x("(//button[@type = 'submit']/span[contains(text(),'Сохранить')]/..)[2]");

    // Валидация error message | Если не заполнить поля
    private SelenideElement emptyNameInput            = $x("//div[contains(text(),'Название\" обязательно для заполнения')]");
    private SelenideElement emptyTypeInput            = $x("//div[contains(text(),'Тип\" обязательно для заполнения')]");
    private SelenideElement emptyDescriptionInput     = $x("//div[contains(text(),'Описание\" обязательно для заполнения')]");

}
