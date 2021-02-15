// Контингент_Сведения о студенте
// Сотрудник ОУ
//  /ru/tko/control/contingent/8072

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ViewStudentsInContingentSotOUPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[text() ='Контингент']");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                    // 'Полный список'

    // Title on table / Тайтлы в таблице
    private SelenideElement contingentInformationTitleInTheTable = $x("//span[contains(text(),'Сведения о контингенте')]");
    private SelenideElement educationInformationTitleInTheTable = $x("//span[contains(text(),'Сведения об обучении')]");
    private SelenideElement progressInformationTitleInTheTable = $x("//span[contains(text(),'Сведения об успеваемости')]");
    private SelenideElement informationAboutTrainingProgramsTitleInTheTable = $x("//span[contains(text(),'Сведения о программах обучения')]");
    private SelenideElement additionalInformationTitleInTheTable = $x("//span[contains(text(),'Дополнительные сведения')]");
    private SelenideElement activityDetailsInformationTitleInTheTable = $x("//span[contains(text(),'Сведения об активности')]");
    private SelenideElement informationAboutSocialStatusTitleInTheTable = $x("//span[contains(text(),'Сведения о социальном статусе')]");


}
