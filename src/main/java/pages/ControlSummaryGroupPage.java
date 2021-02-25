package pages;// Итоги группы
//  /ru/tko/control/summary/115

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ControlSummaryGroupPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Итоги группы')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public ControlSummaryGroupPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Итоги группы"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
