// Мои заявки_Архив
//  /ru/shy/account/statements/archive

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AccountStatementsArchivePage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Мои заявки')]");
    private SelenideElement requestTabItem = $x("//*[@id=\"vue-container\"]//div/a[1]/span");
    private SelenideElement archiveTabItem = $x("//*[@id=\"vue-container\"]//div/a[2]/span");

}
