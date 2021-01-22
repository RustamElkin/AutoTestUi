// Вступительный экзамен
//  /ru/tko/control/entrance-exam/339

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EntranceExamPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Вступительные экзамены')]"));

    // Табы на странице
    private SelenideElement backTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                                         // 'Назад'

    // Ссылка на просмотр приемной комиссии
    private SelenideElement viewAdmissionsOffice = $(byXpath("//td[contains(text(),'Приемная комиссия')]/..//a"));              // 'Просмотр приемной комиссии'

    // Таблица
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'ФИО')]"));                                          // 'ФИО'
    private SelenideElement statusTable = $(byXpath("//th[contains(text(),'Статус')]"));                                         // 'Статус'
    private SelenideElement creativeExamResultTable = $(byXpath("//th[contains(text(),'Результат творческого экзамена')]"));     // 'Результат творческого экзамена'


}
