package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

// Контингент_Архив
//  /ru/tko/control/contingent/archive

public class ContingentArchivePage {

        private SelenideElement titleToPage = $x("//h1[@class='s-title-head'][contains(text(),'Результаты работы конкурсной комиссии')]");

        private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Табы на странице "Полный список"'
        private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
        private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
        private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры'
        private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   // 'Архив'

        private SelenideElement graduationGroupsTable = $x("//td[contains(text(),'Выпускные группы')]");
        private SelenideElement quittingTable = $x("//td[contains(text(),'Выбывшие')]");

        private SelenideElement viewGraduationGroupsBtn = $x("//*[@id=\"v-monitoring-list-app\"]//td[contains(text(),'Выпускные группы')]/following-sibling::td//button"); // Кнопка просмотра "Выпускные группы"
        private SelenideElement viewQuittingBtn = $x("//*[@id=\"v-monitoring-list-app\"]//td[contains(text(),'Выбывшие')]/following-sibling::td//button");                 // Кнопка просмотра "Выбывшие"

        private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


        public ContingentArchivePage checkTitleToPage() {
                titleToPage.shouldBe(Condition.visible).shouldHave(text("Результаты работы конкурсной комиссии"));
                return this;
        }

        public MainPage mainPageLink() {
                mainPageLink.shouldBe(Condition.visible).click();
                return new MainPage();
        }
}