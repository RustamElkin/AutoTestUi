package pages;// Просмотр графика учебного процесса
//  /ru/tko/control/curriculum-schedule-year?year=2020

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class CurriculumScheduleYear {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Учебный план')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                            // 'Назад'

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $x("//span[contains(text(),'Экспортировать')]/..");                     // 'Экспортировать'

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public CurriculumScheduleYear checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Учебный план"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
