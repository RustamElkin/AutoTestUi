// Сведения о контингенте
//  /ru/tko/control/contingent/8072

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ContingentInformationPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                    // 'Полный список'
    private SelenideElement groupsTab = $(byXpath("//span[contains(text(),'Группы')]/.."));                             // 'Группы'
    private SelenideElement subgroupsTab = $(byXpath("//span[contains(text(),'Подгруппы')]/.."));                       // 'Подгруппы'
    private SelenideElement cathedraTab = $(byXpath("//span[contains(text(),'Кафедры')]/.."));                          // 'Кафедры'
    private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/.."));   //'Архив'


    // Title on table / Тайтлы в таблице
    private SelenideElement contingentInformationTitleInTheTable = $(byXpath("//span[contains(text(),'Сведения о контингенте')]"));
    private SelenideElement educationInformationTitleInTheTable = $(byXpath("//span[contains(text(),'Сведения об обучении')]"));
    private SelenideElement progressInformationTitleInTheTable = $(byXpath("//span[contains(text(),'Сведения об успеваемости')]"));
    private SelenideElement InformationAboutTrainingProgramsTitleInTheTable = $(byXpath("//span[contains(text(),'Сведения о программах обучения')]"));
    private SelenideElement additionalInformationTitleInTheTable = $(byXpath("//span[contains(text(),'Дополнительные сведения')]"));
    private SelenideElement activityDetailsInformationTitleInTheTable = $(byXpath("//span[contains(text(),'Сведения об активности')]"));
    private SelenideElement informationAboutSocialStatusTitleInTheTable = $(byXpath("//span[contains(text(),'Сведения о социальном статусе')]"));

    // Btn
    private SelenideElement additionalInformationBtn = $(byXpath("//span[contains(text(),'Дополнительная информация')]/.."));                       // кнопка "Дополнительная информация"
    private SelenideElement editBtn = $(byXpath("//span[contains(text(),'Редактировать')]/.."));                                                    // кнопка "Редактировать"


}
