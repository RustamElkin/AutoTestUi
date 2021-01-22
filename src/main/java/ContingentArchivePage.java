import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

// Контингент_Архив
//  /ru/tko/control/contingent/archive

public class ContingentArchivePage {

        private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Результаты работы конкурсной комиссии')]"));

        private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                    // Табы на странице "Полный список"
        private SelenideElement groupsTab = $(byXpath("//span[contains(text(),'Группы')]/.."));                             // 'Группы'
        private SelenideElement subgroupsTab = $(byXpath("//span[contains(text(),'Подгруппы')]/.."));                       // 'Подгруппы'
        private SelenideElement cathedraTab = $(byXpath("//span[contains(text(),'Кафедры')]/.."));                          // 'Кафедры'
        private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/.."));   //'Архив'

        private SelenideElement graduationGroupsTable = $(byXpath("//td[contains(text(),'Выпускные группы')]"));
        private SelenideElement quittingTable = $(byXpath("//td[contains(text(),'Выбывшие')]"));

        private SelenideElement viewGraduationGroupsBtn = $(byXpath("//*[@id=\"v-monitoring-list-app\"]//td[contains(text(),'Выпускные группы')]/following-sibling::td//button")); // Кнопка просмотра "Выпускные группы"
        private SelenideElement viewQuittingBtn = $(byXpath("//*[@id=\"v-monitoring-list-app\"]//td[contains(text(),'Выбывшие')]/following-sibling::td//button")); // Кнопка просмотра "Выбывшие"

}