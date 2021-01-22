// Сменить пароль
//  /ru/tko/profile/settings/password

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SettingsPasswordPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Личный кабинет')]"));

    // Табы на странице
    private SelenideElement incomingEmailsTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                      // 'Назад'

    // Инпуты
    private SelenideElement currentPasswordInput = $(byXpath("//label[contains(text(),'Текущий пароль')]/following-sibling::input"));                // 'Текущий пароль'
    private SelenideElement newPasswordInput = $(byXpath("//label[contains(text(),'Новый пароль')]/following-sibling::input"));                      // 'Новый пароль'
    private SelenideElement repeatNewPasswordInput = $(byXpath("//label[contains(text(),'Повторите новый пароль')]/following-sibling::input"));      // 'Повторите новый пароль'

    // Кнопка 'Сохранить'
    private SelenideElement saveBtn = $(byXpath("//span[contains(text(),'Сохранить')]/.."));                            // 'Сохранить'

    // Если нажать "Сохранить" не заполнив поля, Инпут "Текущий пароль" не пройдет валидацию
    private SelenideElement currentPasswordErrorMessage = $(byXpath("//label[contains(text(),'Текущий пароль: ')]/following-sibling::div[contains(text(),'Заполните поле')]"));

    // Остальное допишу, когда пофиксим валидацию чтоб все три разом



}
