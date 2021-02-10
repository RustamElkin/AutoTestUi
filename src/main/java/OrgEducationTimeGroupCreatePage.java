// Добавление графика занятий
//  /ru/tko/control/org-education-time-group/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OrgEducationTimeGroupCreatePage {

    // Тайтл
    private SelenideElement titleToPage                         = $x("//h1[contains(text(),'График занятий')]");

    // Табы на странице
    private SelenideElement backTab                             = $x("//span[contains(text(),'Назад')]/..");                               // 'Организация'

    // Инпуты
    private SelenideElement nameInput                           = $x("//input[@name='name' and @placeholder='Название']");                 // 'Название'

    // Кнопка "Сохранить"
    private SelenideElement saveBtn                             = $x("//div[contains(text(),'Сохранить') and  @data-action='send-ajax']"); // 'Сохранить'

    // Validation growl-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameInput                      = $x("//div[@class='growl-message']");

}
