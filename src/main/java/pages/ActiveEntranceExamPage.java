package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

// Вступительные экзамены_Активные
//  /ru/tko/control/entrance-exam

public class ActiveEntranceExamPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Вступительные экзамены')]");
    private SelenideElement activeExamsTabItem = $x("//span[contains(text(),'Активные')]");
    private SelenideElement archiveTabItem = $x("//*[@id=\"vue-container\"]//div/a[2]/span");
    private SelenideElement addExamTabItem = $x("//span[contains(text(),'Добавить')]");
    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public ActiveEntranceExamPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Вступительные экзамены"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
