package pages;// Архив_Назначенного задания
//  /ru/tko/control/ru/tko/control/annual-archive/modules/1796/assigned-homeworks/494007

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchiveModulesAssignedHomeworkPage {

    private SelenideElement task = $x("//span[contains(text(),'Задание')]");
    private SelenideElement participants = $x("//span[contains(text(),'Участники')]");

    private SelenideElement backBtn = $x("//*[@id='vue-container']/div[1]//div/a");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public AnnualArchiveModulesAssignedHomeworkPage checkElementsToPage() {
        task.shouldBe(Condition.visible).shouldHave(text("Задание"));
        participants.shouldBe(Condition.visible);
        backBtn.shouldBe(Condition.visible);
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}
