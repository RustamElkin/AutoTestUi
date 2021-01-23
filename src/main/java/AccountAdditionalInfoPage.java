import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// Профиль_Дополнительная информация
//  /ru/shy/account/additional-people-info

public class AccountAdditionalInfoPage {

    private SelenideElement submitBtn = $("button[type='submit']");
    private SelenideElement backBtn = $x("//*[@id=\"vue-container\"]/div[1]//div/a");

}
