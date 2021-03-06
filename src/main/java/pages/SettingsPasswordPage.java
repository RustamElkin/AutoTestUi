package pages;// Сменить пароль
//  /ru/tko/profile/settings/password
// Остальное допишу, когда пофиксим валидацию чтоб все три разом
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class SettingsPasswordPage {

    // Тайтл
    private SelenideElement titleToPage                 = $x("//h1[contains(text(),'Личный кабинет')]");

    // Табы на странице
    private SelenideElement incomingEmailsTab           = $x("//span[contains(text(),'Назад')]/..");                                              // 'Назад'

    // Инпуты
    private SelenideElement currentPasswordInput        = $x("//label[contains(text(),'Текущий пароль')]/following-sibling::input");              // 'Текущий пароль'
    private SelenideElement newPasswordInput            = $x("//label[contains(text(),'Новый пароль')]/following-sibling::input");                // 'Новый пароль'
    private SelenideElement repeatNewPasswordInput      = $x("//label[contains(text(),'Повторите новый пароль')]/following-sibling::input");      // 'Повторите новый пароль'

    // Кнопка 'Сохранить'
    private SelenideElement saveBtn                     = $x("//span[contains(text(),'Сохранить')]/..");                                          // 'Сохранить'

    // Если нажать "Сохранить" не заполнив поля, Инпут "Текущий пароль" не пройдет валидацию
    private SelenideElement currentPasswordErrorMessage = $x("//label[contains(text(),'Текущий пароль:')]/following-sibling::div[contains(text(),'Заполните поле')]");



    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public SettingsPasswordPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Личный кабинет"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
