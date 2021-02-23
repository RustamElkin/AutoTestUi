package pages;// Архив
//  /ru/tko/control/annual-archive

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchivePage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Архив')]");
    private SelenideElement choiceYearInTable = $x("//td[contains(text(),'2020 - 2020 учебный год')]");
    private SelenideElement firstRowBtn = $("td.s-to-right  button");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public AnnualArchivePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Архив"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}
