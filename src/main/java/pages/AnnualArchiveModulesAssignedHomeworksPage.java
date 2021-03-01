package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

// Архив_Назначенные задания
//  /ru/tko/control/annual-archive/modules/4/assigned-homeworks

public class AnnualArchiveModulesAssignedHomeworksPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Назначенные задания')]");
    private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]");
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]");
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]");
    private SelenideElement firstLookAtBtn = $x("//tbody/tr[1]/td[9]/div[1]/a[1]");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public AnnualArchiveModulesAssignedHomeworksPage checkElementsToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Назначенные задания"));
        backBtn.shouldBe(Condition.visible);
        filteringListBtn.shouldBe(Condition.visible);

        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
