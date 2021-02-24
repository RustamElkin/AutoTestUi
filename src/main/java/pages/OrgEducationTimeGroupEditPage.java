package pages;// Редактирование графика занятий
//  /ru/tko/control/org-education-time-group/1056/edit

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class OrgEducationTimeGroupEditPage {

    // Тайтл
    private SelenideElement titleToPage                         = $x("//h1[contains(text(),'График занятий')]");

    // Табы на странице
    private SelenideElement backTab                             = $x("//span[contains(text(),'Назад')]/..");                                   // 'Организация'

    // Инпуты (при редактировании инпуты очищать)
    private SelenideElement nameInput                           = $x("//input[@name = 'name' and @placeholder = 'Название']");                 // 'Название'

    // Кнопка "Сохранить"
    private SelenideElement saveBtn                             = $x("//div[contains(text(),'Сохранить') and  @data-action = 'send-ajax']");   // 'Сохранить'

    // Validation growl-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyNameInput                      = $x("//div[@class = 'growl-message']");

    private SelenideElement mainPageLink                        = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public OrgEducationTimeGroupEditPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("График занятий"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
