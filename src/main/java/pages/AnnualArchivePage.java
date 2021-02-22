package pages;// Архив
//  /ru/tko/control/annual-archive

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AnnualArchivePage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Архив')]");
    private SelenideElement choiceYearInTable = $x("//td[contains(text(),'2020 - 2020 учебный год')]");
    private SelenideElement firstRowBtn = $("td.s-to-right  button");

}
