import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// Архив_Экзамены
//  /ru/tko/control/annual-archive/modules/4/exams
public class AnnualArchiveModulesExamsPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Экзамены')]");
    private SelenideElement backBtn = $x("//span[contains(text(),'Назад')]");
    // private SelenideElement backBtn = $("//div.container-content-head  a");                                          //Если xpath будет гнать
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]");
    // private SelenideElement filteringListBtn = $(" div.row.justify-content-between.mb-10.mt-30  button");
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]");
    // private SelenideElement applyBtn = $("form div:nth-child(1) > button"));
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]");
    //private SelenideElement resetBtn = $("form div:nth-child(2) > button");
    private SelenideElement firstLookAtBtn = $x("//tbody/tr[1]/td[9]/div[1]/a[1]");

}
