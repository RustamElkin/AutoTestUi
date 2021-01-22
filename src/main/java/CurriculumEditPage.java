// Редактирование учебного плана
//  /ru/tko/control/curriculum/70/edit

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CurriculumEditPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Учебный план')]"));

    // Табы на странице "Назад"
    private SelenideElement backToTab = $(byXpath("//span[contains(text(),'Назад')]/.."));

    // Таблица1
    private SelenideElement categoryOnTable = $(byXpath("//th[contains(text(),'Категория')]"));                         // 'Категория'
    private SelenideElement descriptionOnTable= $(byXpath("//th[contains(text(),'Описание')]"));                        // 'Описание'

    // Кнопка "Отправить на подписание" (открывает модалку)
    private SelenideElement sendForSigningBtn= $(byXpath("//a[contains(text(),'Отправить на подписание')]"));

    // В модалке две кнопки
    private SelenideElement cancelBtn = $(byXpath("//div[@class='row-sort-between']/a[contains(text(),'Отмена')]"));      // 'Отмена'
    private SelenideElement confirmBtn = $(byXpath("//div[@class='row-sort-between']/a[contains(text(),'Подтвердить')]"));  // 'Подтвердить'

    // Кнопка "Добавить дисциплину"
    private SelenideElement addDisciplineBtn = $(byXpath("//tr[10]//div[contains(text(),'Добавить дисциплину')]"));

    // В модалке "Добавить дисциплину" две кнопки
    private SelenideElement cancelButton = $(byXpath("//div[@class=\"s-group\"]/div[contains(text(),'Отмена')]"));      // 'Отмена'
    private SelenideElement saveButton = $(byXpath("//div[@class=\"s-group\"]/button[contains(text(),'Сохранить')]"));  // 'Сохранить'

    // Добавиви дисциплину ее можно редактировать или удалить
    private SelenideElement editButton = $(byXpath("//div[contains(text(),'Кәсіби қазақ (орыс)')]//following-sibling::div//div[@class='s-ico s-ico--thm-pencil']")); //"Редактировать"
    private SelenideElement deleteButton = $(byXpath("//div[contains(text(),'Кәсіби қазақ (орыс)')]//following-sibling::div//div[@class='s-ico s-ico--thm-pencil']")); //"Редактировать"

    // В модалке "Дисциплина" два Dropdown-а
    private SelenideElement selectParentElementDropdown = $(byXpath("//label[contains(text(),'Родительский элемент')]//following-sibling::div/div[@class='multiselect__tags']"));

    // Во втором дропдауне можно выбрать или ввести название.
    private SelenideElement selectFromTheListOrEnterNameDropdown = $(byXpath("//label[contains(text(),'Выберите из списка или введите название')]//following-sibling::div/div[@class='multiselect__tags']"));

    // В модалке "Дисциплина" два инпута
    private SelenideElement nameRuInput = $(byXpath("//div[@class=\"s-modal__body\"]//label[contains(text(),' Название RU')]/following-sibling:: input"));           // 'Название RU'
    private SelenideElement nameKzInput = $(byXpath("//div[@class='s-modal__body']//label[contains(text(),'Название KZ')]/following-sibling::input[@type='text']"));  // 'Название KZ'

    // Кнопка "Добавить" -  условные обозначения"
    private SelenideElement addLegendBtn = $(byXpath("//a[@href=\"javascript: void(0)\"]/div[contains(text(),'Добавить')]/.."));


}
