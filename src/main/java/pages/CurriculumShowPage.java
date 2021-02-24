package pages;// Просмотр учебного плана
//  /ru/tko/control/curriculum/2670/show

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class CurriculumShowPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Учебный план')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                       // 'Назад'

    // Таблица
    private SelenideElement categoryOnTable = $x("//th[contains(text(),'Категория')]");
    private SelenideElement descriptionOnTable = $x("//th[contains(text(),'Описание')]");

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $x("//a[contains(text(),'Экспортировать')]");                      // 'Экспортировать'

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public CurriculumShowPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Учебный план"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
