// Дистанционное обучение_Редактирование онлайн лекции
//  /ru/tko/control/online-lectures/80/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class EditOnlineLecturesTemplatePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Лекции')]");

    // Input-ы при редактировании нужно очищать.
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");                                 // Инпут 'Название'
    private SelenideElement descriptionInput = $x("//label[contains(text(),'Описание')]/following-sibling::div//div[@role=\"textbox\"]");    // Инпут 'Описание'

    //Dropdown multiselect
    private SelenideElement subjectDropdown = $x("//label[contains(text(),'Предмет')]//following-sibling::div");                             // мультиселект 'Предмет'

    // список элементов из multiselect-а
    private ElementsCollection subjectMultiselectElements = $$x("//ul/li[@class='multiselect__element']");                                   // найдёт список предметов
    // далее в самом тесте .filterBy(text("...."))  или get(int) - возвращает n-ый элемент какSelenideElement, далее .click();

    // Добавление файла
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]//following-sibling::input");                                     // Кнопка "Добавить Файл"
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");
    // после нажать кнопку "Сохранить"

    // Удаление файлов
    private SelenideElement firstDeleteBtn = $x("//div/div[1]/div[@class=\"button button_type_file remove_uploaded_file\"]");
    private SelenideElement secondDeleteBtn = $x("//div/div[2]/div[@class=\"button button_type_file remove_uploaded_file\"]");
    private SelenideElement thirdDeleteBtn = $x("//div/div[3]/div[@class=\"button button_type_file remove_uploaded_file\"]");


    // Кнопка 'Сохранить'
    private SelenideElement submitBtn = $x("//span[contains(text(),' Сохранить')]/..");

    // Кнопка 'Отмена' переносит обратно в Лекции. Работает как кнопка "Назад"
    private SelenideElement cancelBtn = $x("//div[@class=\"row-sort-between-btn\"]/a[contains(text(),'Отмена')]");


}
