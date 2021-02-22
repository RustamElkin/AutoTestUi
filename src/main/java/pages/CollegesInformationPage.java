package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// Информация о колледже
//  /ru/tko/college/10905/about

public class CollegesInformationPage {

    // Тайтл
    private SelenideElement titleToPage            = $x("//div[@class='s-title-head']");                             // 'Информация о колледже'

    // Кнопки
    private SelenideElement aboutOrganizationBtn   = $x("//div[text() = 'Об организации']/ancestor::button");        // 'Об организации'
    private SelenideElement descriptionBtn         = $x("//div[text() = 'Описание']/ancestor::button");              // 'Описание'
    private SelenideElement admissionConditionsBtn = $x("//div[text() = 'Условия поступления']/ancestor::button");   // 'Условия поступления'

    // Кнопки "Государственные услуги" не активны, при нажатии выходит уведомление справа
    private SelenideElement growlMessage = $x("//div[@class='growl-message']");

}
