// Редактирование модуля
//  /ru/tko/control/education-module/28/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class EducationModuleEditPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Модули')]");

    // Инпуты. При редактировани надо очищать.
    private SelenideElement nameRuInput = $x("//label[contains(text(),'Название RU')]//following-sibling::input");                            // 'Название RU'
    private SelenideElement indexRuInput = $x("//label[contains(text(),'Индекс RU')]//following-sibling::input");                             // 'Индекс RU'
    private SelenideElement nameKzInput = $x("//label[contains(text(),'Название KZ')]//following-sibling::input");                            // 'Название KZ'
    private SelenideElement indexKZInput = $x("//label[contains(text(),'Индекс KZ')]//following-sibling::input");                             // 'Индекс KZ'

    // validation error-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameRuErrorMessage = $x("//label[contains(text(),'Название RU')]//following-sibling::div[contains(text(),'обязательно для заполнения')]");
    private SelenideElement emptyIndexRuErrorMessage = $x("//label[contains(text(),'Индекс RU')]//following-sibling::div[contains(text(),'обязательно для заполнения')]");
    private SelenideElement emptyNameKzErrorMessage = $x("//label[contains(text(),'Название KZ')]//following-sibling::div[contains(text(),'обязательно для заполнения')]");
    private SelenideElement emptyIndexKZErrorMessage = $x("//label[contains(text(),'Индекс KZ')]//following-sibling::div[contains(text(),'обязательно для заполнения')]");
    private SelenideElement subjectsDropdownErrorMessage = $x("//label[contains(text(),'Предметы')]//following-sibling::div[contains(text(),'обязательно для заполнения')]");

    // input and Dropdown elements (Можно вбить название предмета или выбрать из списка)
    private SelenideElement subjectsDropdown = $x("//label[contains(text(),'Предметы')]//following-sibling::div//input");                              // 'Предметы'

    // List subjectsDropdown
    private ElementsCollection headDepartmentList = $$x("//ul[@class=\"multiselect__content\"]/li[@class=\"multiselect__element\"]");                  // 'список Предметов'

    // можно фильтровать по имени и выбрать нужный.
    private SelenideElement selectHeadDepartment = $x("//ul[@class=\"multiselect__content\"]/li//span[contains(text(),'Казахский язык')]");            // выбор по имени предмета

    // Если в поле "Предмет" есть лишний элемент, его можно удалить по номеру в span[...] или по названию предмета
    // Для примера удалю по названию
    private SelenideElement removeSpecializationInput = $x("//span[@class=\"multiselect__tag\"]/span[contains(text(),'Казахская литература')]/../i");  // 'Удаление Казахская литература'
    //span[@class="multiselect__tag"][2]/i Вариант по по номеру в span[...]

    // Кнопка "Сохранить"
    private SelenideElement saveBtn = $x("//span[contains(text(),'Сохранить')]/..");

    // Кнопка "Отмена"  работает как кнопка "Назад"
    private SelenideElement cancelBtn = $x("//a[contains(text(),'Отмена')]");


}
