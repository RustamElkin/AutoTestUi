// Гос. услуги_Заявки_Архив
//  /ru/tko/control/gov-service-statement?type=archive

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GovServiceStatementArchivePage {

    // Тайтл
    private SelenideElement titleToPage     = $x("//h1[contains(text(),'Заявление')]");

    // Табы на странице
    private SelenideElement applicationTab  = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Заявки')]/..");
    private SelenideElement applicationsProcessedTab = $x("//a/span[contains(text(),'Обработанные заявки')]/..");
    private SelenideElement archiveTab      = $x("//a[@class=\"container-content-head__tab-item is-active\"]/span[contains(text(),'Архив')]/.."); // текущая страница

    // Таблица
    private SelenideElement numberTable     = $x("//th[contains(text(),'№')]");                                             // '№'
    private SelenideElement dateAddedTable  = $x("//th[contains(text(),'Дата добавления')]");                            // 'Дата добавления'
    private SelenideElement statusTable     = $x("//th[contains(text(),'Статус')]");                                        // 'Статус'
    private SelenideElement fullNameTable   = $x("//th[contains(text(),'ФИО')]");                                         // 'ФИО'
    private SelenideElement applicationsTypeTable = $x("//th[contains(text(),'Тип заявки')]");                          // 'Тип заявки'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                  // 'Операции'

    // Кнопки в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn         = $x("//tr[1]/td[@data-table-head=\"Операции\"]//a[@title=\"Посмотреть\"]");        // Кнопка "Посмотреть"

    // List of applications | список заявок
    private ElementsCollection listOfApplications = $$x("//tbody/tr");

    // Кнопки пагинации
    private SelenideElement backPaginateBtn   =$x("//a[contains(text(),'‹')]");                               //не работает на текущей странице, кнопка не активна
    private SelenideElement firstPaginateBtn  =$x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn =$x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn  =$x("//a[contains(text(),'3')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn   =$x("//a[contains(text(),'›')]");


}
