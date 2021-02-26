package pages;// Дистанционное обучение_Редактирование задания
//  /ru/tko/control/assigned-homeworks/494001/edit   Если перейти на эту страницу студентом, 403

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AssignedHomeworksEditPage {

    // Тайтл
    private SelenideElement titleToPage               = $x("//h1[contains(text(),'Назначенные задания')]");

    // Табы на странице
    private SelenideElement backTab                   = $x("//span[contains(text(),'Назад')]/..");                     // 'Назад'

    // Инпуты при редактировании нужно очищать.
    private SelenideElement datePointInput            = $x("//input[@name = 'date_point' and @class = 'multiselect__input']");

    // Dropdown multiselect
    private ElementsCollection datePointList          = $$x("//label[text() = 'Дата оценки: ']/following-sibling::div//li[@class = 'multiselect__element']");

    // Кнопки
    private SelenideElement cancelBtn                 = $x("//a[contains(text(),'Отмена')]");
    private SelenideElement submitBtn                 = $x("//span[contains(text(),'Сохранить')]/parent::button");

    // validation error-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyDatePointErrorMessage= $x("//div[contains(text(),'Поле \"Дата оценки')]");

    private SelenideElement mainPageLink              = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public AssignedHomeworksEditPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Назначенные задания"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
