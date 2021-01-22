import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

// Вступительные экзамены_Активные
//  /ru/tko/control/entrance-exam

public class ActiveEntranceExamPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Вступительные экзамены')]"));
    private SelenideElement activeExamsTabItem = $(By.xpath("//span[contains(text(),'Активные')]"));
    private SelenideElement archiveTabItem = $(By.xpath("//*[@id=\"vue-container\"]//div/a[2]/span"));
    private SelenideElement addExamTabItem = $(By.xpath("//span[contains(text(),'Добавить')]"));

}
