// Обработанные заявки на гос.услуги с внешних сервисов
//   /ru/tko/control/external-statement-services-processed

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProcessedApplicationsListFromExternalServicesPage {

    // Тайтл
    private SelenideElement titleToPage      = $x("//h1[contains(text(),'Заявки на гос.услуги с внешних сервисов')]");

    // Табы на странице
    private SelenideElement unprocessedTab   = $x("//span[text()='Необработанные']/..");                                      // 'Необработанные'
    private SelenideElement processedTab     = $x("//span[text()='Обработанные']/..");                                        // 'Обработанные'

    // Таблица
    private SelenideElement numberOnTable    = $x("//th[text() = 'Дата добавления']");                                        //'Дата добавления'
    private SelenideElement organizationTable= $x("//th[text() = 'Организация']");                                            //'Организация'
    private SelenideElement statusTable      = $x("//th[text() = 'Статус']");                                                 //'Статус'
    private SelenideElement operationsTable  = $x("//th[text() = 'Операции']");                                               //'Операции'

    // Таблица операции
    private ElementsCollection viewBtn       = $$x("//a[@class='s-btn-table' and contains(text(),'Посмотреть')]");            // Кнопка просмотра

}
