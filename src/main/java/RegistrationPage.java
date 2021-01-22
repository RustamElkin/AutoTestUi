// Регистрация
//  /ru/tko/registrations

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Регистрация')]"));

    // Input
    private SelenideElement phoneNumberInput = $(byXpath("//div[@class=\"sn-field__label\"][contains(text(),'Номер сотового')]/following-sibling::div//input "));   // "Номер сотового телефона"

    // Checkbox
    private SelenideElement acceptCheckbox = $(byXpath("//div[contains(text(),'Я ознакомлен')]/preceding-sibling::div//input"));

    // Btn
    private SelenideElement acceptBtn = $(byXpath("//div[contains(text(),'Отправить')]/../.."));

    // Growl Если номер не валиден
    private SelenideElement doesNotExistGrowl = $(byXpath("//div[@id='growls']//div[contains(text(),'Такого номера')]"));

}
