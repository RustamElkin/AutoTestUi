// Архив
//  /ru/tko/control/annual-archive

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AnnualArchivePage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Архив')]"));
    private SelenideElement choiceYearInTable = $(By.xpath("//td[contains(text(),'2020 - 2020 учебный год')]"));
    private SelenideElement firstRowBtn = $(By.cssSelector("td.s-to-right  button"));

}
