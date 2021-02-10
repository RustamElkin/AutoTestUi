// Добавить сотрудника
//  /ru/tko/control/personnel/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PersonnelCreatePage {

    // Тайтл
    private SelenideElement titleToPage       = $x("//h1[contains(text(),'Персонал')]");

    // Табы на странице
    private SelenideElement backTab           = $x("//span[contains(text(),'Назад')]/..");                                                                      // 'Назад'

    // Кнопки
    private SelenideElement settingsBtn       = $x("//button[contains(text(),'Проверить')]");                                                                   // 'Проверить'

    // Инпуты
    private SelenideElement typeScheduleInput = $x("//input[@name='user[iin]' and @class='s-form__input']");    // 'ИИН'

    // Validation growl-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyIINInput     = $x("//div[@class='growl-message']");

}
