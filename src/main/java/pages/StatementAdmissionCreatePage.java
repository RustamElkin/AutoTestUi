package pages;// Создание приемной комиссии
//  /ru/tko/control/statements-admissions/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StatementAdmissionCreatePage {

    // Тайтл
    private SelenideElement titleToPage                      = $x("//h1[text() = 'Создание приемной комиссии']");

    // Табы на странице
    private SelenideElement listCommissionsTab               = $x("//span[contains(text(),'Список комиссий')]/..");                                                              // 'Список комиссий'
    private SelenideElement closedTab                        = $x("//span[contains(text(),'Закрытые')]/..");                                                                     // 'Закрытые'
    private SelenideElement createCommissionsTab             = $x("//span[contains(text(),'Создать комиссию')]/..");                                                             // 'Закрытые'

    // Checkbox - Тип комиссии
    private SelenideElement isCreativeCheckbox               = $x("//div[contains(@class, 'sn-checkbox__label') and text()='Творческий']/preceding-sibling::div/input");
    private SelenideElement isPpzCheckbox                    = $x("//div[contains(@class, 'sn-checkbox__label') and contains(text(),'продуктивной занятости')]/preceding-sibling::div/input");

    // Dropdowns
    private SelenideElement specialtyDropdown                = $x("//div[contains(text(),'Специальность')]/following-sibling::div//div[@class='sn-field__control']");            // 'Специальность'
    private SelenideElement qualificationDropdown            = $x("//div[contains(text(),'Квалификация')]/following-sibling::div//div[@class='sn-field__control']");             // 'Квалификация'

    private SelenideElement eduLangDropdown                  = $x("//div[contains(text(),'Язык обучения')]/following-sibling::div//div[@class='sn-field__control']");            // 'Язык обучения'
    private SelenideElement formOfTrainingDropdown           = $x("//div[contains(text(),'Форма обучения')]/following-sibling::div//div[@class='sn-field__control']");           // 'Форма обучения'
    private SelenideElement prepareTypeDropdown              = $x("//div[contains(text(),'Тип подготовки')]/following-sibling::div//div[@class='sn-field__control']");           // 'Тип подготовки'
    private SelenideElement admissionDateFromToDropdown      = $x("//div[contains(text(),'Даты начала и завершения')]/following-sibling::div//div[@class='sn-field__control']"); // 'Даты начала и завершения'

    // Checkbox
    private  SelenideElement handwriteDate                   = $x("//div[contains(text(),'Ввести дату вручную')]/..//input");                                                    // 'Ввести дату вручную'

    // Inputs
    private SelenideElement dateStartInput                   = $x("//input[@aria-label='Дата начала']");
    private SelenideElement dateEndInput                     = $x("//input[@aria-label='Дата окончания']");

    // Inputs - Всего мест
    private SelenideElement nineClassesInput                 = $x("//td[@data-table-head='Всего мест - 9 классов']//input");
    private SelenideElement elevenClassesInput               = $x("//td[@data-table-head='Всего мест - 11 классов']//input");
    private SelenideElement totalTapeInput                   = $x("//td[@data-table-head='Всего мест - ТиПО']//input");

    // Inputs - Мест по гос.заказу
    private SelenideElement govOrderPlacesNineClassesInput   = $x("//td[@data-table-head='Мест по гос.заказу - 9 классов']//input");
    private SelenideElement govOrderPlacesElevenClassesInput = $x("//td[@data-table-head='Мест по гос.заказу - 11 классов']//input");
    private SelenideElement govOrderPlacesTotalTapeInput     = $x("//td[@data-table-head='Мест по гос.заказу - ТиПО']//input");

    // Btn
    private SelenideElement saveBtn                          = $x("//div[text()='Сохранить']/ancestor::button");                                                         // кнопка "Дополнительная информация"

}
