//Архив_Экзамен
//  /ru/tko/control/annual-archive/modules/4/exams/447

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ViewAnnualArchiveExamPage {

    // Тайтл
    private SelenideElement titleToPage           = $x("//h1[contains(text(),'Экзамен')]");

    // Табы на странице
    private SelenideElement backTab               = $x("//span[contains(text(),'Назад')]/..");             // 'Назад'

    // Тайтлы таблиц
    private SelenideElement numberOnTable         = $x("//h3[contains(text(),'Общие сведения')]");         // 'Общие сведения'
    private SelenideElement specialtyTable        = $x("//h3[contains(text(),'Участники')]");              // 'Участники'

    // Ссылка - Итоговая аттестация (Перейти )
    private SelenideElement goToLink              = $x("//td[contains(text(),'Итоговая аттестация')]/a");  // 'Перейти'

    // Таблица
    private SelenideElement fullNameOnTable       = $x("//th[contains(text(),'ФИО')]");                    // 'ФИО'
    private SelenideElement statusTable           = $x("//th[contains(text(),'Статус')]");                 // 'Статус'
    private SelenideElement resultsTable          = $x("//th[contains(text(),'Результат')]");              // 'Результат'

}
