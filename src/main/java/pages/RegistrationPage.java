package pages;// Регистрация
//  /ru/tko/registrations

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {

    // Тайтл
    private SelenideElement titleToPage       = $x("//h1[contains(text(),'Регистрация')]");

    // Input
    private SelenideElement phoneNumberInput  = $x("//div[@class=\"sn-field__label\"][contains(text(),'Номер сотового')]/following-sibling::div//input ");   // "Номер сотового телефона"

    // Checkbox
    private SelenideElement acceptCheckbox    = $x("//div[contains(text(),'Я ознакомлен')]/preceding-sibling::div//input");

    // Btn
    private SelenideElement acceptBtn         = $x("//div[contains(text(),'Отправить')]/../..");

    // Growl Если номер не валиден
    private SelenideElement doesNotExistGrowl = $x("//div[@id='growls']//div[contains(text(),'Такого номера')]");

}
