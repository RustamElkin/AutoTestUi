// Сведения о контингенте
//  /ru/tko/control/contingent/8072

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ContingentInformationPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                    // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                             // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                       // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                          // 'Кафедры'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   //'Архив'


    // Title on table / Тайтлы в таблице
    private SelenideElement contingentInformationTitleInTheTable = $x("//span[contains(text(),'Сведения о контингенте')]");
    private SelenideElement educationInformationTitleInTheTable = $x("//span[contains(text(),'Сведения об обучении')]");
    private SelenideElement progressInformationTitleInTheTable = $x("//span[contains(text(),'Сведения об успеваемости')]");
    private SelenideElement informationAboutTrainingProgramsTitleInTheTable = $x("//span[contains(text(),'Сведения о программах обучения')]");
    private SelenideElement additionalInformationTitleInTheTable = $x("//span[contains(text(),'Дополнительные сведения')]");
    private SelenideElement activityDetailsInformationTitleInTheTable = $x("//span[contains(text(),'Сведения об активности')]");
    private SelenideElement informationAboutSocialStatusTitleInTheTable = $x("//span[contains(text(),'Сведения о социальном статусе')]");

    // Btn
    private SelenideElement additionalInformationBtn = $x("//span[contains(text(),'Дополнительная информация')]/..");                       // кнопка "Дополнительная информация"
    private SelenideElement editBtn = $x("//span[contains(text(),'Редактировать')]/..");                                                    // кнопка "Редактировать"


}
