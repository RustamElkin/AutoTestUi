// Мои заявки_Архив
//  /ru/shy/account/statements/archive

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountStatementsArchivePage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Мои заявки')]"));
    private SelenideElement requestTabItem = $(By.xpath("//*[@id=\"vue-container\"]//div/a[1]/span"));
    private SelenideElement archiveTabItem = $(By.xpath("//*[@id=\"vue-container\"]//div/a[2]/span"));

}
