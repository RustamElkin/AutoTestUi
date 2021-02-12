// Закрытые приемные комиссии
//  /ru/tko/control/statements-admissions-closed

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class StatementsAdmissionsListClosedPage {

    // Тайтл
    private SelenideElement titleToPage            = $x("//h1[contains(text(),'Приемная комиссия')]");

    // Табы на странице
    private SelenideElement unprocessedTab         = $x("//span[text()='Список комиссий']/..");                                     // 'Список комиссий'
    private SelenideElement processedTab           = $x("//span[text()='Обработанные']/..");                                        // 'Закрытые'

    // Таблица
    private SelenideElement idRow                  = $x("//th[text() = '№']");                                                      //'№'
    private SelenideElement specializationRow      = $x("//th[text() = 'Специальность']");                                          //'Специальность'
    private SelenideElement qualificationRow       = $x("//th[text() = 'Квалификация']");                                           //'Квалификация'
    private SelenideElement formOfStudyRow         = $x("//th[text() = 'Форма обучения']");                                         //'Форма обучения'
    private SelenideElement languageEducationRow   = $x("//th[text() = 'Язык обучения']");                                          //'Язык обучения'
    private SelenideElement dateOneStarAndEndRow   = $x("//th[text() = 'Дата начала и завершения']");                               //'Дата начала и завершения'
    private SelenideElement numberOfSubmittedApplications = $x("//th[text() = 'Количество поданных / непроверенных заявлений']");   //'Количество поданных / непроверенных заявлений'
    private SelenideElement PPZRow                 = $x("//th[text() = 'ППЗ']");                                                    //'ППЗ'
    private SelenideElement operationsRow          = $x("//th[text() = 'Операции']");                                               //'Операции'

    // Таблица операции
    private ElementsCollection viewBtn             = $$x("//span[contains(@class,'s-ico--thm-eye')]/..");                           // Кнопка просмотра
    private ElementsCollection deleteBtn           = $$x("//a[@class='s-btn-table' and contains(text(),'Посмотреть')]");            // Кнопка 'Удалить'

}
