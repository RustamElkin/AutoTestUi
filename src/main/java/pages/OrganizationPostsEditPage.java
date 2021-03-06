package pages;// Редактирование  поста
//  /ru/tko/organization-posts/90/edit

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class OrganizationPostsEditPage {

    // Тайтл
    private SelenideElement titleToPage                  = $x("//h1[contains(text(),'Блог')]");

    // Табы на странице
    private SelenideElement backToTab                    = $x("//span[contains(text(),'Назад')]/..");

    // Инпуты
    private SelenideElement fieldNameInput               = $x("//label[contains(text(),'Название')]/following-sibling::input[@name = 'name']");                      // 'Название'
    private SelenideElement fieldDescriptionInput        = $x("//label[contains(text(),'Описание')]/following-sibling::div//div[@aria-label = 'Редактор, main']");   // 'Описание'

    // Radio Buttons
    private ElementsCollection allowCommenting           = $$x(" //label[contains(text(),'Разрешить комментирование')]/following-sibling::div/label");

    // ErrorMessage
    private SelenideElement NameInputErrorMessage        = $x("//div[@class = 's-form__error-message'][contains(text(),'Поле \"Название')]");                        // 'Название'
    private SelenideElement DescriptionInputErrorMessage = $x("//div[@class = 's-form__error-message'][contains(text(),'Поле \"Описание')]");                        // 'Описание'

    // Кнопки
    private SelenideElement buttonSave                   = $x("button[contains(@class,'s-btn--thm-aqua')]");

    private SelenideElement mainPageLink                 = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public OrganizationPostsEditPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Блог"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
