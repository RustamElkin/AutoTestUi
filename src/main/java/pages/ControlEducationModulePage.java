package pages;// Модули
//  /ru/tko/control/education-module

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ControlEducationModulePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Модули')]");

    // Табы на странице
    private SelenideElement backButtonTab = $x("//span[contains(text(),'Назад')]/..");                                       // 'Назад'

    // Кнопка добавить
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");

    //Фильтр Инпуты
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");               // 'Название'
    private SelenideElement indexInput = $x("//label[contains(text(),'Индекс')]/following-sibling::input");                // 'Индекс'

    //Dropdown фильтры
    private SelenideElement selectSubjectDropDownList = $x("//label[contains(text(),'Предмет')]//following-sibling::div");   // "Предмет"
    private SelenideElement selectCreatorDropDownList = $x("//label[contains(text(),'Создатель')]//following-sibling::div"); // "Создатель"

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                                //'№'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                             //'Название'
    private SelenideElement indexTable = $x("//th[contains(text(),'Индекс')]");                                              //'Индекс'
    private SelenideElement creatorTable = $x("//th[contains(text(),'Создатель')]");                                         //'Создатель'
    private SelenideElement subjectTable = $x("//th[contains(text(),'Предметы')]");                                          //'Предметы'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                       //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement editBtn = $x("//tr[1]/td[6]//a[@title='Редактировать']");                                      // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("//tr[1]/td[6]//a[@title='Удалить']");                                          // Кнопка "Удалить"
    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public ControlEducationModulePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Модули"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
