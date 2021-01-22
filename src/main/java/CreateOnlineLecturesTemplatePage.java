// Дистанционное обучение_Создание онлайн лекции
//  /ru/tko/control/online-lectures/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreateOnlineLecturesTemplatePage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Лекции')]"));

    // Input-ы
    private SelenideElement nameInput = $(byXpath("//label[contains(text(),'Название')]/following-sibling::input"));                                 // Инпут 'Название'
    private SelenideElement descriptionInput = $(byXpath("//label[contains(text(),'Описание: ')]/following-sibling::div//div[@role=\"textbox\"]"));   // Инпут 'Описание'

    //Dropdown multiselect
    private SelenideElement subjectDropdown = $(byXpath("//label[contains(text(),'Предмет')]//following-sibling::div"));                            // мультиселект 'Предмет'

    // список элементов из multiselect-а
    private ElementsCollection subjectMultiselectElements = $$(byXpath("//ul/li[@class='multiselect__element']"));                                    // найдёт список предметов
    // далее в самом тесте .filterBy(text("...."))  или get(int) - возвращает n-ый элемент какSelenideElement, далее .click();

    // Добавление файла
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]//following-sibling::input"));                                      // Кнопка "Добавить Файл"
    // Указать элементу путь до файла (на диске).sendKeys("file:\\C:\\Users\\Elka\\Desktop\\College\\Screenshot_2.png");
    // после нажать кнопку "Сохранить"

    // Удаление файлов
    private SelenideElement firstDeleteBtn = $(byXpath("//div/div[1]/div[@class=\"button button_type_file remove_uploaded_file\"]"));
    private SelenideElement secondDeleteBtn = $(byXpath("//div/div[2]/div[@class=\"button button_type_file remove_uploaded_file\"]"));
    private SelenideElement thirdDeleteBtn = $(byXpath("//div/div[3]/div[@class=\"button button_type_file remove_uploaded_file\"]"));

    // Кнопка 'Сохранить'
    private SelenideElement submitBtn = $(By.xpath("//span[contains(text(),' Сохранить')]/.."));

    // Кнопка 'Отмена' переносит обратно в Лекции. Работает как кнопка "Назад"
    private SelenideElement cancelBtn = $(By.xpath("//div[@class=\"row-sort-between-btn\"]/a[contains(text(),'Отмена')]"));

}
