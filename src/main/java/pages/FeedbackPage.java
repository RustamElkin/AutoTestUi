package pages;// Обратная связь
//  /ru/alm/feedback

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FeedbackPage {

    // Тайтл
    private SelenideElement titleToPage       = $x("(//span[text() = 'Обратная связь'])[1]");

    // Инпуты
    private SelenideElement nameInput         = $x("//input[@placeholder = 'Ваше имя']");                                 // 'Имя'
    private SelenideElement phoneInput        = $x("//input[contains(@placeholder, '+7 (___)')]");                        // 'Телефон'
    private SelenideElement emailInput        = $x("//input[@placeholder = 'Электронная почта']");                        // 'Электронная почта'
    private SelenideElement messageInput      = $x("//textarea[@placeholder='Сообщение']");                               // 'Сообщение'

    // Кнопка "Отправить"
    private SelenideElement sendBtn           = $x("//button[contains(text(),'Отправить')]");

    // growl-message
    private SelenideElement emptyNameInput    = $x("//div[@class = 'growl-message' and text() = 'Поле \"Ваше имя\" обязательно для заполнения.']");
    private SelenideElement emptyPhoneInput   = $x("//div[@class='growl-message' and text() = 'Поле \"Телефон\" обязательно для заполнения.']");
    private SelenideElement wrongPhone        = $x("//div[@class='growl-message' and text() = 'Поле \"Телефон\" имеет ошибочный формат']");
    private SelenideElement notValidEmail     = $x("//div[@class='growl-message' and text() = 'должно быть действительным электронным адресом']");
    private SelenideElement emptyMessageInput = $x("//div[@class='growl-message' and text() = 'Поле \"Сообщение\" обязательно для заполнения.']");
    private SelenideElement sentSuccessfully  = $x("//div[@class='growl-message' and contains(text(), 'Сообщение:')]");   // 'Успешно отправлено'

}
