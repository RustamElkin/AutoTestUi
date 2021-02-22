package pages;// Мои заявки
//  /ru/shy/account/statements

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AccountStatementsPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мои заявки')]");
    private SelenideElement requestTabItem = $x("//*[@id=\"vue-container\"]//div/a[1]/span");
    private SelenideElement archiveTabItem = $x("//*[@id=\"vue-container\"]//div/a[2]/span");
    private SelenideElement getGovServiceBtn = $x("//div[contains(text(),'Получить государственную услугу')]");
    private SelenideElement detailedBtn = $x("//div[contains(text(),'Подробнее')]");
    private SelenideElement withdrawAnApplicationBtn = $x("//*[@id=\"v-application-list-view-app\"]//div[2]/div/button");

}
