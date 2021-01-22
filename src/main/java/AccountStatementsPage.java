// Мои заявки
//  /ru/shy/account/statements

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountStatementsPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Мои заявки')]"));
    private SelenideElement requestTabItem = $(By.xpath("//*[@id=\"vue-container\"]//div/a[1]/span"));
    private SelenideElement archiveTabItem = $(By.xpath("//*[@id=\"vue-container\"]//div/a[2]/span"));
    private SelenideElement getGovServiceBtn = $(By.xpath("//div[contains(text(),'Получить государственную услугу')]"));
    private SelenideElement detailedBtn = $(By.xpath("//div[contains(text(),'Подробнее')]"));
    private SelenideElement withdrawAnApplicationBtn = $(By.xpath("//*[@id=\"v-application-list-view-app\"]//div[2]/div/button"));

}
